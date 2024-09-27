public class CaesarCipher implements EncyptionStrategy {

    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String data) {
        if (data == null) {
            return null;
        }
        StringBuilder encryptedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if ((Character.isLowerCase(c) && shifted > 'z') || (Character.isUpperCase(c) && shifted > 'Z')) {
                    shifted = (char) (c - (26 - shift));
                }
                encryptedData.append(shifted);
            } else {
                encryptedData.append(c);
            }
        }
        return encryptedData.toString();
    }

    @Override
    public String decrypt(String data) {
        if (data == null) {
            return null;
        }
        StringBuilder decryptedData = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (c - shift);
                if ((Character.isLowerCase(c) && shifted < 'a') || (Character.isUpperCase(c) && shifted < 'A')) {
                    shifted = (char) (c + (26 - shift));
                }
                decryptedData.append(shifted);
            } else {
                decryptedData.append(c);
            }
        }
        return decryptedData.toString();
    }
}



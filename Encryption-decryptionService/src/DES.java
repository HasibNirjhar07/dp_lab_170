import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DES implements EncyptionStrategy {

    private SecretKey secretKey;

    public DES() {
        this.secretKey = generateKey();
    }

    private SecretKey generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            keyGen.init(56);
            return keyGen.generateKey();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String encrypt(String data) {
        if (secretKey == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String decrypt(String data) {
        if (secretKey == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(decryptedBytes);
        } catch (Exception e) {
            return null;
        }
    }
}

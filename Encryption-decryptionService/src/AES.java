import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class AES implements EncyptionStrategy {

    private SecretKey secretKey;

    public AES() {
        this.secretKey = generateKey();
    }

    private SecretKey generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(256);
            return keyGen.generateKey();
        } catch (Exception e) {
            return null;
        }
    }

    private String readFromFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
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
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            return null;
        }
    }

    public String encryptFromFile(String filePath) {
        String data = readFromFile(filePath);
        if (data == null) {
            return null;
        }
        return encrypt(data);
    }

    @Override
    public String decrypt(String data) {
        if (secretKey == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(decryptedBytes);
        } catch (Exception e) {
            return null;
        }
    }

    public String decryptFromFile(String filePath) {
        String encryptedData = readFromFile(filePath);
        if (encryptedData == null) {
            return null;
        }
        return decrypt(encryptedData);
    }
}

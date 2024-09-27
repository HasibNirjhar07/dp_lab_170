public class EncryptionService {

    private  EncyptionStrategy strategy;

    public void setStrategy(EncyptionStrategy strategy) {
        this.strategy=strategy;
    }

    public String encryptData(String data) {
        if (strategy != null) {
            return strategy.encrypt(data);
        }
        return null;
    }

    public String decryptData(String data) {
        if (strategy != null) {
            return strategy.decrypt(data);
        }
        return null;
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EncryptionService encryptionService = new EncryptionService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select Encryption Algorithm:");
            System.out.println("1. AES");
            System.out.println("2. DES");
            System.out.println("3. Caesar Cipher");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    encryptionService.setStrategy(new AES());
                    System.out.println("AES encryption selected.");
                    break;
                case 2:
                    encryptionService.setStrategy(new DES());
                    System.out.println("DES encryption selected.");
                    break;
                case 3:
                    System.out.println("Enter Caesar Cipher Shift (e.g., 3):");
                    int shift = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    encryptionService.setStrategy(new CaesarCipher(shift));
                    System.out.println("Caesar Cipher with shift " + shift + " selected.");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    continue;
            }


            System.out.println("Enter the file you want to encrypt:");
            String message = scanner.nextLine();


            String encryptedMessage = encryptionService.encryptData(message);
            System.out.println("Encrypted Message: " + encryptedMessage);


            System.out.println("Do you want to decrypt the message? (yes/no)");
            String decryptChoice = scanner.nextLine();

            if (decryptChoice.equalsIgnoreCase("yes")) {
                String decryptedMessage = encryptionService.decryptData(encryptedMessage);
                System.out.println("Decrypted Message: " + decryptedMessage);
            }

            System.out.println("---------------------------------------------------");
        }
    }
}




















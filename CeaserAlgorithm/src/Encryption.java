import java.util.Scanner;

public class Encryption {

    Scanner kb = new Scanner(System.in);
    
    private String message;

    private String encMessage = "";

    private char[] alphabet = {'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b'};

    private String letters = "abcdefghijklmnopqrstuvwxyz";

    public Encryption() {
    }

    public String getMessage() {
        System.out.println("Enter your text: ");
        message = kb.nextLine();
        return message;
    }

    public void encryptMessage() {
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j)==message.charAt(i)) {
                    encMessage += alphabet[j];
                }
            }
        }
        System.out.print("Encrpypted message: ");
        System.out.println(encMessage);
    }

}
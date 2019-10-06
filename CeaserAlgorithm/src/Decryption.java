import java.util.Scanner;

public class Decryption {

    Scanner kb = new Scanner(System.in);
    
    private String message;

    private String decMessage = "";

    private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
        'u', 'v', 'w', 'x', 'y', 'z'};

    private String letters = "cdefghijklmnopqrstuvwxyzab";


    public String getMessage() {
        System.out.println("Enter your text: ");
        message = kb.nextLine();
        return message;
    }

    public void decryptMessage() {
        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(j)==message.charAt(i)) {
                    decMessage += alphabet[j];
                }
            }
        }
        System.out.print("Encrpypted message: ");
        System.out.println(decMessage);
    }
    
}
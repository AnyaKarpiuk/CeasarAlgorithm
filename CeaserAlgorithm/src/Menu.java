import java.util.Scanner;

public class Menu {
    Scanner kb = new Scanner(System.in);
    
    private int choice;
    private Encryption enc;
    private Decryption dec;
    
    public Menu() {
        enc = new Encryption();
        dec = new Decryption();
    }
    
    public void printMenu(){
        System.out.println("------------MENU------------");
        System.out.println("1.Encrypt text.");
        System.out.println("2.Decrypt text.");
        System.out.println("3. Exit.");
        System.out.println("----------------------------");
    }
    
    public int getChoice(){
        System.out.print("Enter yout choice: ");
        choice = kb.nextInt();
        return choice;
    }
    
    public void callMenu(int menuNum){
        switch(menuNum){
            case 1:
                enc.getMessage();
                enc.encryptMessage();
                break;
            case 2:
                dec.getMessage();
                dec.decryptMessage();
                break;
            case 3:
                System.exit(0);
        }
    }
}
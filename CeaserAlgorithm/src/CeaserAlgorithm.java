
public class CeaserAlgorithm {

	    public static void main(String[] args) {
	        Menu menu = new Menu();
	        do {
	            menu.printMenu();
	            menu.callMenu(menu.getChoice());
	        }while(true);
	    }
}


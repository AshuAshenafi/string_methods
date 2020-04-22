import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String text;
        int index=0;
        boolean cont = true;

        System.out.print("Enter a word: ");
        text = keyboard.nextLine();

        do{
            System.out.print("Enter a number as an index: ");
            index = keyboard.nextInt();
            if(index <0){
                System.out.println("Index can not be negative number.");
            }
            else if(index >= text.length()){
                System.out.println("Index is larger than length.");
            }
            else{
                cont = false;
            }

        }while(cont == true);

        if(index == 0){
            System.out.println("The substring at " + index + " is: " + text.charAt(index));
        }
        else{
            System.out.println("The substring from 0 to " + index + " is: " + text.substring(0,index));
        }
        keyboard.close();
    }
}

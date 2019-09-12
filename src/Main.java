import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
    Scanner key = new Scanner(System.in);
    String eliza = " ";
        boolean respose = true;
        System.out.println("Good day.");
        System.out.println("What is your problem? Enter your resposnse or q to quit: ");
        eliza = key.nextLine();

        while (respose=true)
        if (eliza.equalsIgnoreCase("q") || eliza.equalsIgnoreCase("I am feeling great.")){
            System.out.println("Thank you for your resposnse");
            respose =false;
            break;}
        else {
            System.out.println(eliza);
            System.out.println("Enter your response or Q to quit");
            eliza = key.nextLine();
            if (eliza.equalsIgnoreCase("q") || eliza.equalsIgnoreCase("quit") || eliza.equalsIgnoreCase("I am felling greate")){

                break;}
            else {
                    System.out.println(eliza);
                }



            }

        }
}


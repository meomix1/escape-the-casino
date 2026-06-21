

import java.util.Scanner;




public class main{

     // Declaring ANSI_RESET so that we can reset the color
     public static final String ANSI_RESET = "\u001B[0m";

     // Declaring the colors
     public static final String ANSI_YELLOW = "\u001B[33m";


public static void main (String [] args) {

    Scanner scnr = new Scanner(System.in);
    
    boolean moveon; // for awaiting user input
    int input; //what you should save every scnr nextint to for any decisions

    System.out.println(ANSI_YELLOW+"-----------------------------------------------------------------------------------"+ANSI_RESET);
    System.out.println("0------------------------------------------------------------------------0");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("| Please adjust your terminal to accomodate this box and the line below  |");
    System.out.println("| while cutting off the Yellow Line.    Type 1 to continue               |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("|                                                                        |");
    System.out.println("0------------------------------------------------------------------------0");
    
    moveon = false;

    while(moveon == false){
        input = scnr.nextInt();
        if (input == 1){
            moveon = true;
        }
        else{
            System.out.print ("Type 1 pls:"  );
        }
   }



   System.out.println("0------------------------------------------------------------------------0");
   System.out.println("|  (---)                                                        (---)    |");
   System.out.println("|   |||                                                          |||     |");
   System.out.println("|   |||     ┏━╸┏━┓┏━╸┏━┓┏━┓┏━╸   ╺┳╸╻ ╻┏━╸   ┏━╸┏━┓┏━┓╻┏┓╻┏━┓    |||     |");
   System.out.println("|   |||     ┣╸ ┗━┓┃  ┣━┫┣━┛┣╸     ┃ ┣━┫┣╸    ┃  ┣━┫┗━┓┃┃┗┫┃ ┃    |||     |");
   System.out.println("|   |||     ┗━╸┗━┛┗━╸╹ ╹╹  ┗━╸    ╹ ╹ ╹┗━╸   ┗━╸╹ ╹┗━┛╹╹ ╹┗━┛    |||     |");
   System.out.println("|  (___)                                                        (___)    |");
   System.out.println("|  (---)            _____  _____   _____  _____  _____                   |");
   System.out.println("|   |||            |A .  ||A .  | |A .  ||A .  ||A .  |                  |");
   System.out.println("|   |||            | /.\\ || /.\\ | | /.\\ || /.\\ || /.\\ |                  |");
   System.out.println("|   |||            |(_._)||(_._)| |(_._)||(_._)||(_._)|                  |");
   System.out.println("|   |||            |  |  ||  |  | |  |  ||  |  ||  |  |                  |");
   System.out.println("|  (___)           |____V||____V| |____V||____V||___Type 1 to continue...|");
   System.out.println("0------------------------------------------------------------------------0");
    
    
}
}

package project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        startApp();

    }

    private static void startApp(){

        Buyer buyer = new Buyer();

        while(true){

            System.out.println("""
                \nChoose a drink:
                1 - Espresso
                2 - Cappuccino
                3 - Latte
                0 - Off Coffee Machine""");
            System.out.print("Your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice){
                    case 1 -> {
                        buyer.setDrink(new Espresso());
                        buyer.makeOffer();
                    }
                    case 2 ->{
                        buyer.setDrink(new Cappuccino());
                        buyer.makeOffer();
                    }
                    case 3 -> {
                        buyer.setDrink(new Latte());
                        buyer.makeOffer();
                    }
                    case 0 -> {
                        System.out.println("Coffee Machine off.");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid value. Enter again.");
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid value. Please enter a number.");
                sc.nextLine();
            }
        }
    }
}

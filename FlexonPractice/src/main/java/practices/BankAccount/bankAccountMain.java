package main.java.practices.BankAccount;

import java.util.Scanner;

public class bankAccountMain {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        int choice;
        boolean exit = false;

        Scanner scanner = new Scanner(System.in);
        while(!exit){
            System.out.println("What do you want to do today? (1)deposit (2)withdraw (3)see account information (4)exit (please enter the number)");
            if (!scanner.hasNextInt()){
                System.out.println("Please enter valid operation code");
                scanner = new Scanner(System.in);
                continue;
            }
            choice = scanner.nextInt();
            float money;
            switch (choice){
                case 1:
                    System.out.println("How much money do you want to deposit?");
                    money = scanner.nextFloat();
                    ba.deposit(money);
                    break;
                case 2:
                    System.out.println("How much money do you want to withdraw?");
                    money = scanner.nextFloat();
                    ba.withdraw(money);
                    break;
                case 3:
                    ba.printInfo();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }


    }

}

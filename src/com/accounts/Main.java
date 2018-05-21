package com.accounts;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

   public static void write_account() {
        PrintWriter save;
		try {
			save = new PrintWriter("Dane.txt");
			Account ac = new Account();
	        ac.create_account();
	        ac.show_account();
	        save.print(ac);
	        save.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Dope");
			e.printStackTrace();
		}
        
    }

    public static void display_sp(int n) throws IOException {

    }

    public static void modify_account(int n) {

    }

    public static void delete_account(int n) {

    }

    public static void display_all() {

    }

    public static void deposit_withdraw(int n, int option) {

    }

    public static void intro() {
        System.out.print("\n\n\n\t  BANK");
        System.out.print("\n\n\tMANAGEMENT");
        System.out.print("\n\n\t  SYSTEM");
        System.out.print("\n\n\n\nMADE BY : Robur");
    }
    public static void main(String[] args) throws IOException {
        int ch;
        int num;
        intro();
        Scanner odczyt = new Scanner(System.in);
        do {
            

            System.out.print("\n\n\n\tMAIN MENU");
            System.out.print("\n\n\t01. NEW ACCOUNT");
            System.out.print("\n\n\t02. DEPOSIT AMOUNT");
            System.out.print("\n\n\t03. WITHDRAW AMOUNT");
            System.out.print("\n\n\t04. BALANCE ENQUIRY");
            System.out.print("\n\n\t05. ALL ACCOUNT HOLDER LIST");
            System.out.print("\n\n\t06. CLOSE AN ACCOUNT");
            System.out.print("\n\n\t07. MODIFY AN ACCOUNT");
            System.out.print("\n\n\t08. EXIT");
            System.out.print("\n\n\tSelect Your Option (1-8) ");
            ch = odczyt.nextInt();
            odczyt.nextLine();

            switch (ch) {
                case 1:
                    write_account();
                    break;
                case 2:
                    System.out.print("\n\n\tEnter The account No. : ");
                    num = odczyt.nextInt();
                   // deposit_withdraw(num, 1);
                    break;
                case 3:
                    System.out.print("\n\n\tEnter The account No. : ");
                    num = odczyt.nextInt();
                    //deposit_withdraw(num, 2);
                    break;
                case 4:
                    System.out.print("\n\n\tEnter The account No. : ");
                    num = odczyt.nextInt();
                    //display_sp(num);
                    break;
                case 5:
                   //display_all();
                    break;
                case 6:
                    System.out.print("\n\n\tEnter The account No. : ");
                    num = odczyt.nextInt();
                   // delete_account(num);
                    break;
                case 7:
                    System.out.print("\n\n\tEnter The account No. : ");
                    num = odczyt.nextInt();
                   // modify_account(num);
                    break;
                case 8:
                    System.out.print("\n\n\tThanks for using bank managemnt system");
                    break;
                default: System.out.print("\n");
            }
        } while (ch != 8);
        odczyt.close();
    }
}

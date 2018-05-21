package com.accounts;

import java.util.Scanner;

public class Account{
    int acno;
    String name;
    int deposit;
    String type;

    public Account() {}

    public void create_account() {
        Scanner odczyt = new Scanner(System.in);

        System.out.print("\n Enter The account No. :");
        this.acno = odczyt.nextInt();
        odczyt.nextLine();
        System.out.print("\n Enter the mname of the account holder: ");
        this.name = odczyt.nextLine();
        System.out.print("\n Enter type of the account (C/S): ");
        this.type = odczyt.nextLine();
        type = type.toUpperCase();
        System.out.print("\n Enter the initial amount(>=500 for asving and >= 1000 for current): ");
        this.deposit = odczyt.nextInt();
        odczyt.nextLine();

        System.out.print("\n\n\n Account created...");
        //odczyt.close();
    }

    public void show_account() {
        System.out.print("\nAccount No. : ");
        System.out.print(acno);
        System.out.print("\nAccount Holder Name : ");
        System.out.print(name);
        System.out.print("\nType of Account : ");
        System.out.print(type);
        System.out.print("\nBalance amount : ");
        System.out.print(deposit);
    }

    public void modify() {
        Scanner odczyt = new Scanner(System.in);
        System.out.print("\nAccount No. : " + acno);
        System.out.print("\nModify Account Holder Name : ");
        name = odczyt.nextLine();
        System.out.print("\nModify Type of Account : ");
        type = odczyt.nextLine();
        type = type.toUpperCase();
        System.out.print("\nModify Balance amount : ");
        deposit = odczyt.nextInt();
        odczyt.close();
    }

    public void dep(int x) {
        deposit += x;
    }

    public void draw(int x) {
        deposit -= x;
    }

    public void report() {
        System.out.print(acno + " " + name + " " + type + " " + deposit);
    }

    public int retacno() {
        return acno;
    }

    public int retdeposit() {
        return deposit;
    }

    public String rettype() {
        return type;
    }

}

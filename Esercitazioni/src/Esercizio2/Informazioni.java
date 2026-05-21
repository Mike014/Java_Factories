package Esercizio2;

import java.util.Scanner;

public class Informazioni
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name");
        String name = myObj.nextLine();
        System.out.println("Enter age");
        int age = myObj.nextInt();
        myObj.nextLine(); // consuma il \n residuo nel buffer
        System.out.println("Enter city");
        String city = myObj.nextLine();

        System.out.printf("Name: %s%nAge: %d%nCity: %s%n", name, age, city);
    }
}


package com.decipherzone.librarysystemsample;

import com.decipherzone.librarysystemsample.db.MongoDbOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 * com.decipherzone.librarysystemsample.Application Class To Perform several Task
 *
 * @implnote- In this menu class we have 5 choices :-
 * >>>1.Addbooks :- To add books in database
 * >>>2.DisplayBooks :- To display books from database
 * >>>3.orderBooks :- To order books from database and make seperate table for the user who ordered.
 * >>>4.returnBooks :- To return the ordered books.
 * >>>5.Exit :- To Exit From The com.decipherzone.librarysystemsample.Application.
 */

public class Application {
    public static void main(String[] args) throws IOException, SQLException {

        int choice, option;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Operation operation = new Operation();
       MongoOperation mongoOperation=new MongoOperation();
        do {
            System.out.print("Enter your choice");
            System.out.println("\n1.Use MongoDB \n2.Use MySql \n3.Exit");
            try {
                option = Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException ex) {
                option = 0;
                ex.printStackTrace();
            }

            if (option == 1) {
                do {
                    System.out.print("Enter your choice");
                    System.out.println("\n1.Add Books \n2.Display Books Currently Presents \n3.Order Books \n4.Return Books \n5.Exit");
                    try {
                        choice = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException ex) {
                        choice = 0;
                        ex.printStackTrace();
                    }

                    if (choice == 1) {
                        mongoOperation.addBook();
                    } else if (choice == 2) {
                        mongoOperation.displayBooks();
                    } else if (choice == 3) {
                        mongoOperation.orderBooks();
                    } else if (choice == 4) {
                        mongoOperation.returnBooks();
                    } else if (choice == 5) {

                    } else {
                        System.out.println("Wrong Choice");
                    }
                }
                while (choice != 5);
            } else if (option== 2) {
                do {
                    System.out.print("Enter your choice");
                    System.out.println("\n1.Add Books \n2.Display Books Currently Presents \n3.Order Books \n4.Return Books \n5.Exit");
                    try {
                        choice = Integer.parseInt(bufferedReader.readLine());
                    } catch (NumberFormatException ex) {
                        choice = 0;
                        ex.printStackTrace();
                    }

                    if (choice == 1) {
                        operation.addBook();
                    } else if (choice == 2) {
                        operation.displayBooks();
                    } else if (choice == 3) {
                        operation.orderBooks();
                    } else if (choice == 4) {
                        operation.returnBooks();
                    } else if (choice == 5) {

                    } else {
                        System.out.println("Wrong Choice");
                    }
                }
                while (choice != 5);
            } else if (option == 3) {
                System.exit(0);
            } else {
                System.out.println("Wrong Choice");
            }

        } while (option != 3);

    }
}

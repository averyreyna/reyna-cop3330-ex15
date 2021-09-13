/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your username? ");
        String inputUsername = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is your password? ");
        String inputPassword = input2.nextLine();

        String password = "abcd";

        if (inputPassword.equals(password))
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you.");
        }
    }
}
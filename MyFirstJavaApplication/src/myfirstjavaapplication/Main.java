/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myfirstjavaapplication;

import java.util.Scanner;

/**
 *
 * @author Emin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter number month");
            int month = sc.nextInt();

            switch (month) {
                case 1:
                    System.out.println("JANUARY");
                    break;
                case 2:
                    System.out.println("FEBRUARY");
                    break;
                case 3:
                    System.out.println("MARCH");
                    break;
                case 4:
                    System.out.println("APRIL");
                    break;
                case 5:
                    System.out.println("MAY");
                    break;
                case 6:
                    System.out.println("JUNE");
                    break;
                case 7:
                    System.out.println("JULY");
                    break;
                case 8:
                    System.out.println("AUGUST");
                    break;
                case 9:
                    System.out.println("SEPTEMBER");
                    break;
                case 10:
                    System.out.println("OCTOBER");
                    break;
                case 11:
                    System.out.println("NOVEMBER");
                    break;
                case 12:
                    System.out.println("DECEMBER");
                    break;
                default:
                    System.out.println("PLEASE ENTER CORRECT NUMBER");
                    System.out.println("---------------------------");
            }
        }
    }

}
    


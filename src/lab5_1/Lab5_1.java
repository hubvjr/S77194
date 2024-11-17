/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Lab5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
 int currentYear = 2024;
 String input = JOptionPane.showInputDialog("Enter the IC number");
 String yearPart = input.substring(0, 2);
 String monthPart = input.substring(2, 4);
 String datePart = input.substring(4, 6);
 int birthYear = Integer.parseInt(yearPart);
 int month = Integer.parseInt(monthPart);
 int day = Integer.parseInt(datePart);

 if (birthYear < 24) {
         birthYear += 2000;
 }else if(birthYear > 24){
     birthYear += 1900;
 }else
     System.out.println("The ic number is invalid");
 
 int age = currentYear - birthYear;
 String message = String.format("Your birth date is %02d-%02d-%d\n Age is %d", day,month,birthYear,age);
 JOptionPane.showMessageDialog(null,message);
    }
    
}

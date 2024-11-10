/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4_5;
/**
 *
 * @author ASUS
 */
import javax.swing.JOptionPane;
public class Lab4_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String distanceInput = JOptionPane.showInputDialog("Enter the distance(in Meter): ");
        int distance = Integer.parseInt(distanceInput);
        
        String hoursInput = JOptionPane.showInputDialog("Enter time(in hours)");
        int hours = Integer.parseInt(hoursInput);
        String minutesInput = JOptionPane.showInputDialog("Enter time(in minutes)");
        int minutes = Integer.parseInt(minutesInput);        
        String secondsInput = JOptionPane.showInputDialog("Enter time(in seconds)");        
        int seconds = Integer.parseInt(secondsInput); 
        
        int totalTimeInSeconds = (hours*3600) + (minutes * 60) + seconds;
        double speedMetersPerSecond = distance / totalTimeInSeconds;
        double speedKilometersPerHour = (distance / 1000.0) / (totalTimeInSeconds / 3600.0);
        double speedMilesPerHour = (distance / 1609.0) / (totalTimeInSeconds / 3600.0);
        
        JOptionPane.showMessageDialog(null, String.format("Speed:\n%.2f M/S\n%.2f KM/H\n%.2f MPH", // M/S = meters per second,
                speedMetersPerSecond,speedKilometersPerHour,speedMilesPerHour));                   // KM/H = kilometers per hour
    }                                                                                              // MPH = miles per hour
    
}

package lab_reports.labone;

import javax.swing.JOptionPane;

public class BMICalculator {

    public static void main(String[] args) {
        // Prompt for height in meters
        String heightInput = JOptionPane.showInputDialog(null, "Enter your height (in meters):");
        double height = Double.parseDouble(heightInput);

        // Prompt for weight in kilograms
        String weightInput = JOptionPane.showInputDialog(null, "Enter your weight (in kilograms):");
        double weight = Double.parseDouble(weightInput);

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine weight status based on BMI
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            weightStatus = "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display the calculated BMI and weight status
        String message = String.format("Your BMI: %.2f\nWeight Status: %s", bmi, weightStatus);
        JOptionPane.showMessageDialog(null, message);
    }
}


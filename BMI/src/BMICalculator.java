import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BMICalculator {
	private static DecimalFormat df1= new DecimalFormat("#.#");
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double height;
		double weight;
		double bmi;
		String bmivalue = null;
		String name;
		
		
		name = JOptionPane.showInputDialog("Enter your name");
		height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in M(For example 1.78)"));
		weight = Double.parseDouble(JOptionPane.showInputDialog("Enter your weight in KG"));
		
		bmi = weight / (height * height);
		
		if(bmi > 40) {
			bmivalue = "a";
		}else if(bmi <= 40 && bmi >=35 ) {
			bmivalue = "b";
		}else if(bmi <=34.9 && bmi >=30 ) {
			bmivalue = "c";
		}else if(bmi <=29.9 && bmi >=25) {
			bmivalue = "d";
		}else if(bmi <=24.9 && bmi >=18.5) {
			bmivalue = "e";
		}else if(bmi <=18.4 && bmi >=17) {
			bmivalue = "f";
		}else if(bmi <=16.9 && bmi >=16) {
			bmivalue = "g";
		}else if(bmi <=15.9) {
			bmivalue = "h";
		}
		
		switch (bmivalue) {
		case "a":
			JOptionPane.showMessageDialog(null, name + " your BMI category is obese class 3"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "b":
			JOptionPane.showMessageDialog(null, name + " your BMI category is obese class 2"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "c":
			JOptionPane.showMessageDialog(null, name + " your BMI category is obese class 1"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "d":
			JOptionPane.showMessageDialog(null, name + " your BMI category is overweight" + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "e":
			JOptionPane.showMessageDialog(null, name + " your BMI category is normal"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "f":
			JOptionPane.showMessageDialog(null, name + " your BMI category is mild thinness"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "g":
			JOptionPane.showMessageDialog(null, name + " your BMI category is moderate thinness"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		case "h":
			JOptionPane.showMessageDialog(null, name + " your BMI category is severe thinness"  + ", Your BMI value is " + df1.format(bmi) , "bmivalue",JOptionPane.INFORMATION_MESSAGE);
			break;
		}	
	}

}

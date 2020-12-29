package Visualizer;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter fprime_xcoeff: "); 
		double fprimexcoeff = scanner.nextDouble();
		System.out.print("Enter fprime_ycoeff: "); 
		double fprimeycoeff = scanner.nextDouble();
		System.out.print("Enter fprime_c: "); 
		double fprimec = scanner.nextDouble();
		System.out.print("Enter y0: "); 
		double y0 = scanner.nextDouble();
		System.out.print("Enter step: "); 
		double step = scanner.nextDouble();
		
		Calculator calc = new Calculator(fprimexcoeff, fprimeycoeff, fprimec, y0, step);
		Plotter.launch(calc.generatexVals(), calc.generatefVals());
	}

}

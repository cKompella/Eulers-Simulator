import java.util.ArrayList;
import java.util.Scanner;

public class Calculator{
	
	private ArrayList<Double> fVals;
	private ArrayList<Double> xVals;
	private double step;
	private double y0;
	private double fprime_c; 
	private double fprime_xCoeff; 
	private double fprime_yCoeff;
	public static final int ITERATIONS = 10;


	public Calculator(double fprime_xCoeff, double fprime_yCoeff, double fprime_c, double y0, double step){
		this.fVals = new ArrayList<Double>();
		this.xVals = new ArrayList<Double>();
		this.fprime_xCoeff = fprime_xCoeff;
		this.fprime_yCoeff = fprime_yCoeff; 
		this.fprime_c = fprime_c; 
		this.y0 = y0; 
		this.step = step;
	}
	//make iterations start at 1
	private double calculateFi(int iteration){
		if(iteration==0){
			return y0;
		}
		double x = step*(iteration-1);
		double y = fVals.get(iteration-1);
		double fi = y + step*(fprime_xCoeff*x + fprime_yCoeff*y + fprime_c);
		return fi;
	}
	public ArrayList<Double> generatefVals(){
		for(int i=0; i<ITERATIONS; i++){
			this.fVals.add(calculateFi(i));
		}
		return fVals;
	}

	public static void main(String[] args){
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
		System.out.println(calc.fprime_xCoeff + " "+calc.fprime_yCoeff);
		System.out.println(calc.generatefVals().toString());

	}
}


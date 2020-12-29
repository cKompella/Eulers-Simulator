package Visualizer;

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
		return this.fVals;
	}
	public ArrayList<Double> generatexVals(){
		for(int i=0; i<ITERATIONS; i++) {
			this.xVals.add(i*this.step);
		}
		return this.xVals;
	}
}


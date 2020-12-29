package Visualizer;

import java.awt.Color;
import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Random;

import graph.SimpleGraph;

public class Plotter {

	public static void launch(ArrayList<Double> xVals, ArrayList<Double>yVals){
		SimpleGraph graph = new SimpleGraph();
		populateGraph(graph, xVals, yVals);
		graph.display();	
	}
	public static void populateGraph(SimpleGraph graph, ArrayList<Double> xVals, ArrayList<Double>yVals){
		for(int i=0; i<xVals.size(); i++) {
			graph.addPoint(xVals.get(i), yVals.get(i));
			try{
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}	
}
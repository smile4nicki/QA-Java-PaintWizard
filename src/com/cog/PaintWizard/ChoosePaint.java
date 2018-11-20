package com.cog.PaintWizard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChoosePaint {

	double coveragePerTin = 0;
	double tinsRequired = 0;
//	double wastage = (tinsRequired * coveragePerTin) - walls;
	
public static void main(String[] args) {
	
	ArrayList<Paint> paints = new ArrayList<>();
	
	Paint cheapoMax = new Paint("CheapoMax", 19.99, 20, 10);
	Paint averageJoes = new Paint("AverageJoes", 17.99, 15, 11);
	Paint duluxourousPaints = new Paint("duluxourousPaints", 25.00, 10, 20);
	ChoosePaint paintChoice = new ChoosePaint();
	
//	System.out.println(Paint.getPaint());
	
	System.out.println(paintChoice.findCheapestPaint());
//	System.out.println(paintChoice.findPaintWastage());
		
//	System.out.println("Your cheapest paint choice is " + paintChoice.findCheapestPaint());
}

//iterate through leftovers to get absolute minimum
//minimum
public List<Double> findCheapestPaint() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter room size: ");
//	double cheapestPaintTin = tinsRequired * Paint.getCost(); 
	double walls = sc.nextDouble();
	return Paint.getPaint().stream()
			.peek(p -> System.out.println("This is all the paint info " + p))
			.map(p -> coveragePerTin = p.getLitres() * p.getCoverage())	
			.peek(p -> System.out.println("This is the amount of coverage for each diferent tin " + p))
			.map(p -> tinsRequired = Math.ceil(walls / coveragePerTin))
			.peek(p -> System.out.println("This shows how many tins needed " + p))
//			.filter(p -> Math.min(tinsRequired[0]) < 3)
//			.peek(p -> System.out.println("This is the last filtered tin " + p))
			.collect(Collectors.toList());
}

//wasteage
public List<Double> findPaintWastage() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter room size: ");
	double walls = sc.nextDouble();
	double wastage = (tinsRequired * coveragePerTin) - walls;
	return Paint.getPaint().stream()
			.map(p -> coveragePerTin = p.getLitres() * p.getCoverage())
			.peek(p -> System.out.println(p))
			.map(p -> tinsRequired = Math.ceil(walls / coveragePerTin))
			.peek(p -> System.out.println(p))
			.filter(p -> p < wastage)
			.collect(Collectors.toList());
			
//int coveragePerTin = Paint.paints.get(i).getLitres() * paints.getPaints().getCoverage();
//int tinsRequired = (int) Math.ceil(wallSpace / coveragePerTin);
//double wastage = (tinsRequired * coveragePerTin) - walls;
//double price = (tinsRequired * paintList.get(i).getPrice());
}
}

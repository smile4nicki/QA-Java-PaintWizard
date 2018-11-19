package com.cog.PaintWizard;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChoosePaint {
public static void main(String[] args) {
		
	Paint cheapoMax = new Paint("CheapoMax", 19.99, 20, 10);
	Paint averageJoes = new Paint("AverageJoes", 17.99, 15, 11);
	Paint duluxourousPaints = new Paint("duluxourousPaints", 25.00, 10, 20);
	ChoosePaint paintChoice = new ChoosePaint();
	
	System.out.println(paintChoice.findCheapestPaint());
	
	double tinCheapoMax = cheapoMax.getLitres() * cheapoMax.getCoverage();
	double tinAverageJoes = averageJoes.getLitres() * averageJoes.getCoverage();
	double tinDuluxourousPaints = duluxourousPaints.getLitres() * duluxourousPaints.getCoverage();
	
	
//	System.out.println(tinCheapoMax);
//	System.out.println(tinAverageJoes);
//	System.out.println(tinDuluxourousPaints);
//	System.out.println("Your cheapest paint choice is ");
}

public List<Double> findCheapestPaint() {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter room size: ");
//	String input = sc.nextLine();
	return Paint.getPaint().stream()
			.map(p -> p.getLitres() * p.getCoverage())	
			.peek(p -> System.out.println(p))
			.collect(Collectors.toList());
}
}

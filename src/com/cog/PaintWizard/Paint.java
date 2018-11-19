package com.cog.PaintWizard;

import java.util.ArrayList;

public class Paint {

	private String name;
	private double cost;
	private double litres;
	private double coverage;
	
	private static ArrayList<Paint> paints = new ArrayList<Paint>();
	
	Paint(String name, double cost, double litres, double coverage) {
		this.setName(name);
		this.setCost(cost);
		this.setLitres(litres);
		this.setCoverage(coverage);
		Paint.getPaint().add(this);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getLitres() {
		return litres;
	}
	
	public void setLitres(double litres) {
		this.litres = litres;
	}
	
	public double getCoverage() {
		return coverage;
	}
	
	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}
	public String toString() {
		return name + " " + cost + " " + litres + " " + coverage;
	}
		
	public static ArrayList<Paint> getPaint() {
		return paints;
	}
	public static void setPaint(ArrayList<Paint> people) {
		Paint.paints = paints;
	}
}

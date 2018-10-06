package org.app.robo.entity;

public class Robot {
	private String name;
	private double batteryLevel = 100; //in percentage
	private int weight;
	private double distance;
	
	public Robot(String name, double batteryLevel, int weight, double distance) {
		super();
		this.name =name;
		this.batteryLevel = batteryLevel;
		this.weight = weight;
		this.distance = distance;
	}
	
	public Robot(String name, int weight, double distance) {
		super();
		this.name = name;
		this.weight = weight;
		this.distance = distance;
	}

	enum Body{
		HEAD,CHEST,LEG
	}

	public double getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

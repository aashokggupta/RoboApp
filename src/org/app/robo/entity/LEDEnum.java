package org.app.robo.entity;

public enum LEDEnum {
	RED("red"),GREEN("green");
	
	private String colour;
	
	LEDEnum(String colour){
		this.colour = colour;
	}
}

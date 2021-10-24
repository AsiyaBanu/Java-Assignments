package com.association;

public class CarTest {

	public static void main(String[] args) {
		Honda hondaAmaze=new Honda();
		hondaAmaze.setColor("Blue");
		hondaAmaze.setSpeed(120);
		hondaAmaze.carDetails();
		hondaAmaze.hondaStartEngine();
		hondaAmaze.hondaMusicPlayer();
		
		Honda hondaJazz=new Honda();
		hondaJazz.setColor("Orange");
		hondaJazz.setSpeed(80);
		hondaJazz.carDetails();
		hondaJazz.hondaStartEngine();
	}

}

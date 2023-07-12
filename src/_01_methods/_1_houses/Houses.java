package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	Random ran = new Random();

	public void run() {
		// Check the recipe to find out what code to put here
		rob.setSpeed(50);
		rob.turn(-90);
		rob.move(300);
		rob.turn(90);
		rob.penDown();
		for (int i = 0; i < 10; i++) {
			int num = ran.nextInt(3);
			if (num == 0) {
				house("small");
			}
			if (num == 1) {
				house("medium");
			}
			if (num == 2) {
				house("large");
			}
		}
	}
	void house(String sheight) {
		int height = 0;

		if (sheight.equals("small")) {
			height = 60;
		}

		if (sheight.equals("medium")) {
			height = 120;
		}

		if (sheight.equals("large")) {
			height = 250;
		}
		rob.move(height);
if(sheight.equals("large")) {
	FlatRoof();
}
else {
	PointyRoof();
}
	
		rob.move(height);
		rob.turn(-90);
		rob.setRandomPenColor();
		rob.move(25);
		rob.turn(-90);
	}

	void FlatRoof() {
		rob.turn(90);
		rob.move(50);
		rob.turn(90);

	}

	void PointyRoof() {
	rob.turn(60);
	rob.move(25);
	rob.turn(60);
	rob.move(25);
	rob.turn(60);
		
	}

}

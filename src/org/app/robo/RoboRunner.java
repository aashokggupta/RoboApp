package org.app.robo;

import org.app.robo.business.RoboBusiness;
import org.app.robo.entity.Robot;

public class RoboRunner {
	public static void main(String args[]) {
		Robot robot1 = new Robot("First Robo",0,3.5);
		Robot robot2 = new Robot("Second Robo",3,2);
		Robot robot3 = new Robot("Third Robo",12,0);
		
		RoboBusiness roboBusiness =  new RoboBusiness();
		roboBusiness.startRobo(robot1);
		roboBusiness.startRobo(robot2);
		roboBusiness.startRobo(robot3);
		
		System.out.println(robot1.getName()+" : "+robot1.getBatteryLevel());
		System.out.println(robot2.getName()+" : "+robot2.getBatteryLevel());
		System.out.println(robot3.getName()+" : "+robot3.getBatteryLevel());
	}
}

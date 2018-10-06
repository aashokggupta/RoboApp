package org.app.robo.business;

import org.app.constants.Constants;
import org.app.robo.entity.Robot;

public class RoboBusiness {

	public void startRobo(Robot robot) {
		if(!validation(robot))
			return;
		if (robot.getDistance() != 0 && robot.getWeight() !=0) {
			robot.setBatteryLevel(batteryLevelByWeight(robot.getWeight(),robot.getBatteryLevel()));
			robot.setBatteryLevel(batteryLevelByDistance(robot.getDistance(),robot.getBatteryLevel()));
		}
		else if(robot.getDistance() != 0 && robot.getWeight() == 0)
			robot.setBatteryLevel(batteryLevelByDistance(robot.getDistance(),robot.getBatteryLevel()));
		else if(robot.getWeight() !=0 && robot.getWeight() ==0) 
			robot.setBatteryLevel(batteryLevelByWeight(robot.getWeight(),robot.getBatteryLevel()));
	}

	private boolean validation(Robot robot) {
		if(robot.getWeight()!=0 && robot.getWeight() >10) {
			System.out.println(robot.getName() +" is Overweight");
			return false;
		}
		return true;
	}

	private double batteryLevelByWeight(int weight, double batteryLevel) {
		return (batteryLevel-weight*2);
	}

	private double batteryLevelByDistance(double distance, double batteryLevel) {
		return batteryLevel - (distance*100/Constants.maxDistanceInOneCharge);
	}

}

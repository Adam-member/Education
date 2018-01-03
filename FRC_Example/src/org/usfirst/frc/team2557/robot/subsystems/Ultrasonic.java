package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Ultrasonic extends Subsystem {
	
	public void getSonarDistance(){
		RobotMap.ultra.getDistanceUnits();
	}
	
	public void interpretObjects(){
		if(RobotMap.ultra.getDistanceUnits() >= 40){
			boolean distanceValue = true;
		}
		else{
			boolean distanceValue = false;
		}
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}


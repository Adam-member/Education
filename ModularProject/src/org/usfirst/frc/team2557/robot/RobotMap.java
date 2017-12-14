package org.usfirst.frc.team2557.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static Gyro gyro;
	public static SpeedController motor1;
	public static SpeedController motor2;
	public static SpeedController motor3;
	public static SpeedController motor4;
	public static Solenoid solenoid;
	public static DoubleSolenoid doubleSolenoid;
	public static RobotDrive robotDrive1;
	
	
	public static void init(){
		gyro = new Gyro(0);
		motor1 = new SpeedController(1);
		doubleSolenoid = new DoubleSolenoid(2, 3);
		solenoid = new Solenoid(4);
		robotDrive1 = new RobotDrive(motor1, motor2, motor3, motor4);
		
		
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}

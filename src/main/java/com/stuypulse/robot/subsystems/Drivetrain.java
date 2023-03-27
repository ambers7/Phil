package com.stuypulse.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase{
    
    private final CANSparkMax[] leftMotors;
    private final CANSparkMax[] rightMotors;
    private final DifferentialDrive drivetrain;
    private double speed;
    private double angle;

    public Drivetrain(){    
        leftMotors = new CANSparkMax[] {
            new CANSparkMax(0, MotorType.kBrushless),
            new CANSparkMax(1, MotorType.kBrushless),
            new CANSparkMax(2, MotorType.kBrushless)
        };
        rightMotors = new CANSparkMax[] {
            new CANSparkMax(3, MotorType.kBrushless),
            new CANSparkMax(4, MotorType.kBrushless),
            new CANSparkMax(5, MotorType.kBrushless)
        };
        drivetrain = new DifferentialDrive(
            new MotorControllerGroup(leftMotors), 
            new MotorControllerGroup(rightMotors)
        );
    }
    public void stop() {
        drivetrain.stopMotor();
    }
    public void drive(double speed, double angle) {
        drivetrain.arcadeDrive(speed, angle);
    }
    public void periodic() {
        drive(speed, angle);
    }

}

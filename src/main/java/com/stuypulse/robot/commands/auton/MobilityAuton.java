
package com.stuypulse.robot.commands.auton;

import com.stuypulse.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class MobilityAuton extends CommandBase{
    Drivetrain drivetrain;
    public MobilityAuton() {
        drivetrain = new Drivetrain();
    }
    @Override
    public void initialize() {
        drivetrain.drive(0.5, 0);
    }
    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();
    }
    
}

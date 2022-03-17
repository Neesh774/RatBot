package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.function.DoubleSupplier;

public class TankDrive extends CommandBase {
    private final DriveTrain m_drivetrain;
    private final DoubleSupplier m_left;
    private final DoubleSupplier m_right;

    /**
     * TankDrive Command
     * takes in left and right control inputs for each motor
     * drivetrain is the subsystem to drive
     */

    public TankDrive(DoubleSupplier left, DoubleSupplier right, DriveTrain drivetrain) {
        // setting parameters to local vars
        m_drivetrain = drivetrain;
        m_left = left;
        m_right = right;

        // not quite sure what this does tbh
        addRequirements(m_drivetrain);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        m_drivetrain.drive(m_left.getAsDouble(), m_right.getAsDouble());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false; // Runs until interrupted
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        m_drivetrain.drive(0, 0);
    }
}

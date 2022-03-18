// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This is a demo program showing the use of the DifferentialDrive class. Runs
 * the motors with tank
 * steering and an Xbox controller.
 */
public class Robot extends TimedRobot {
  private final PWMSparkMax m_rightMotor1 = new PWMSparkMax(9);
  private final PWMSparkMax m_rightMotor3 = new PWMSparkMax(7);
  private final PWMSparkMax m_leftMotor2 = new PWMSparkMax(8);
  private final PWMSparkMax m_leftMotor4 = new PWMSparkMax(6);
  private final MotorControllerGroup m_rightMotor = new MotorControllerGroup(m_rightMotor1, m_rightMotor3);
  private final MotorControllerGroup m_leftMotor = new MotorControllerGroup(m_leftMotor2, m_leftMotor4);
  private final DifferentialDrive m_robotDrive = new DifferentialDrive(m_leftMotor, m_rightMotor);
  private final Joystick leftJoystick = new Joystick(0);
  private final Joystick rightJoystick = new Joystick(1);

  @Override
  public void robotInit() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
    m_rightMotor1.setInverted(true);
    m_leftMotor2.setInverted(true);
  }

  @Override
  public void teleopPeriodic() {
    // Drive with tank drive.
    // That means that the Y axis of the left stick moves the left side
    // of the robot forward and backward, and the Y axis of the right stick
    // moves the right side of the robot forward and backward.
    m_robotDrive.tankDrive(leftJoystick.getY(), rightJoystick.getY());
  }
}

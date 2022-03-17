package frc.robot.subsystems;

//might want to check any methods using this
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;
import frc.robot.Robot;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;

public class DriveTrain extends SubsystemBase {
  // not entirely sure about these two??
  VictorSP m_leftMotor = new VictorSP(1);
  VictorSP m_rightMotor = new VictorSP(2);

  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftMotor, m_rightMotor);

  /** create a new drive train subsystem */
  public DriveTrain() {
    super();
  }

  public void drive(double left, double right) {
    m_drive.tankDrive(left, right);
  }

  /** Call log method every loop. */
  @Override
  public void periodic() {

  }
}

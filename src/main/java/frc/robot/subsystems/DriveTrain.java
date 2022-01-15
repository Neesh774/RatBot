package frc.robot.subsystems;

//might want to check any methods using this
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
    //not entirely sure about these two??
    private final SpeedController m_leftMotor = new SpeedController(new PWMSparkMax(0));
    private final SpeedController m_rightMotor = new SpeedController(new PWMSparkMax(1));
}

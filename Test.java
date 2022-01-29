package frc.robot;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class Test
{
    public static SpeedController motor_ShooterMotor = new PWMVictorSPX(5); //Motor (Specify port at integer)
    public static double shooterSpeed = 1.0; //1.0 to 2.0

    public static void TestControl()
    {
        function1();
    }

    public static void function1()
    {
        
    }
}

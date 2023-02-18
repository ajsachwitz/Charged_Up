package frc.robot.Commands;



import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Subsystems.Arm;

public class rotateDown extends CommandBase{
    public final Arm arm;
    public rotateDown(Arm arm){
        this.arm = arm;
    }
    public void execute() {
        arm.armRotateDown();
    }
    public void end(boolean interrupted) {
        arm.armRotateStop();

    }
}

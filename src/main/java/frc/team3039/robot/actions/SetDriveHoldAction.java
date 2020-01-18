package frc.team3039.robot.actions;

import frc.team3039.robot.auto.actions.Action;
import frc.team3039.robot.subsystems.Drive;

public class SetDriveHoldAction implements Action {
    private Drive mDrive = Drive.getInstance();
    boolean setHold;

    public SetDriveHoldAction(boolean setHold){
        this.setHold = setHold;
    }


    @Override
    public void start() {
        if(setHold){
            mDrive.setControlMode(Drive.DriveControlMode.HOLD);
            System.out.println("CONTROL MODE = HOLD");
        }else{
            mDrive.setControlMode(Drive.DriveControlMode.JOYSTICK);
            System.out.println("CONTROL MODE = JOYSTICK");
        }
    }

    @Override
    public void update() {}

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public void done() {}

}

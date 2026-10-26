package org.firstinspires.ftc.teamcode.commands;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp

public class Intake extends OpMode{
    DcMotor armMotor;
    DcMotor intakeMotor;

    @Override
    public void init() {
        armMotor = hardwareMap.get(DcMotor.class, "armMotor");
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
        // This uses RUN_USING_ENCODER to be more accurate.   If you don't have the encoder
        // wires, you should remove these
        armMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    @Override
    public void loop(){
        telemetry.addLine("Press PovDown to lower intake");

        if(gamepad1.dpad_down) {
            armMotor.setPower(.1);
        }else {
            armMotor.setPower(0);
        }
        if(gamepad1.dpad_up) {
            armMotor.setPower(-.5);
        }else {
            armMotor.setPower(0);
            }
        if(gamepad1.b) {
            intakeMotor.setPower(-100);
        }else {
           intakeMotor.setPower(0);
        }


    }

}

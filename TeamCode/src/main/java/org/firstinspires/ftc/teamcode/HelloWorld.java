package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","World");// prints Hello:World
    }
    //Makes a loop so code can function
    @Override
    public void loop() {

    }
}

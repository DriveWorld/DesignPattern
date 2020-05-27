package com.model.adapter;

public class OpticalAdapter implements Motor {
    private OpticalMotor opticalMotor;

    public OpticalAdapter(){
        opticalMotor = new OpticalMotor();
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}

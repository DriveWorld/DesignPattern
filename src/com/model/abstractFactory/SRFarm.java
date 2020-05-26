package com.model.abstractFactory;

public class SRFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生!");
        return new A_Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成!");
        return new P_Fruits();
    }
}

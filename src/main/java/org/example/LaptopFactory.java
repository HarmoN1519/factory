package org.example;

public class LaptopFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return new Laptop();
    }

    @Override
    public boolean canUse(ComputerType computerType) {
        return computerType == ComputerType.LAPTOP;
    }
}

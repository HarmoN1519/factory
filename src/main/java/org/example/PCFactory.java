package org.example;

public class PCFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return new PC();
    }

    @Override
    public boolean canUse(ComputerType computerType) {
        return computerType == ComputerType.PC;
    }
}

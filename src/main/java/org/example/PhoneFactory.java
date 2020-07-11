package org.example;

public class PhoneFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return new Tablet();
    }

    @Override
    public boolean canUse(ComputerType computerType) {
        return true;
    }
}

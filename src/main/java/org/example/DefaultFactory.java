package org.example;

public class DefaultFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return null;
    }

    @Override
    public boolean canUse(ComputerType computerType) {
        return false;
    }
}

package org.example;

public class TabletFactory implements ComputerFactory {

    @Override
    public Computer createComputer() {
        return new Tablet();
    }

    @Override
    public boolean canUse(ComputerType computerType) {
        return computerType == ComputerType.TABLET;
    }
}

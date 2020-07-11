package org.example;

import java.util.*;

public class FactoryMethodUsage {

    private final List<ComputerFactory> factoryList = List.of(
            new PCFactory(),
            new LaptopFactory(),
            new TabletFactory(),
            new PhoneFactory());

    public Computer createComputer(ComputerType computerType) {

        return factoryList.stream()
                .filter(computerFactory -> computerFactory.canUse(computerType))
                .findFirst()
                .orElse(new DefaultFactory())
                .createComputer();
    }
}


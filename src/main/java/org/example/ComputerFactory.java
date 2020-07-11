package org.example;

public interface ComputerFactory {

    Computer createComputer ();

    boolean canUse(ComputerType computerType);

}

package org.example;

public class Tablet implements Computer {

    @Override
    public String getProcessor() {
        return "Snapdragon";
    }

    @Override
    public int getRam() {
        return 8;
    }

    @Override
    public boolean hasInternetAccess() {
        return false;
    }
}

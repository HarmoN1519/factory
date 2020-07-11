package org.example;

public class Laptop implements Computer {

    @Override
    public String getProcessor() {
        return "Intel i5";
    }

    @Override
    public int getRam() {
        return 8;
    }

    @Override
    public boolean hasInternetAccess() {
        return true;
    }
}

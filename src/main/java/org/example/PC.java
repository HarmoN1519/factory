package org.example;

public class PC implements Computer{

    @Override
    public String getProcessor() {
        return "AMD RX 3600";
    }

    @Override
    public int getRam() {
        return 16;
    }

    @Override
    public boolean hasInternetAccess() {
        return true;
    }
}

package com.example;

public class computertest {
    public static void main(String[] args) {
        
        computer basicComputer = new computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();

        
        computer gamingComputer = new computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("2TB SSD")
                .setGPU("NVIDIA RTX 4090")
                .setCoolingSystem("Liquid Cooling")
                .build();

        System.out.println("Basic Computer: " + basicComputer);
        System.out.println("Gaming Computer: " + gamingComputer);
}
}

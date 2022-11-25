package com.exercise4;

public abstract class SmartDevice {
    /**
     * DEFAULT VALUES
     */
    public static final double DEFAULT_RAM_GB = 4;
    public static final double DEFAULT_STORAGE_GB = 128;
    public static final String DEFAULT_BRAND = "Fabric";
    public static final String DEFAULT_MODEL = "00-xx-0000";
    public static final double DEFAULT_SIZE = 0.0;

    /**
     * VARIABLES
     */
    public boolean isOn;
    private double size;
    private double ram;
    private double storage;
    private String brand;
    private String model;

    /**
     * CONSTRUCTORS
     */
    public SmartDevice() {
        this(DEFAULT_SIZE, DEFAULT_RAM_GB, DEFAULT_STORAGE_GB, DEFAULT_BRAND, DEFAULT_MODEL);
    }
    public SmartDevice(double size, double ram, double storage, String brand, String model) {
        this.size = size;
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
        this.model = model;
    }

    /**
     * METHODS
     */
    public double getSize() {
        return size;
    }

    public double getRam() {
        return ram;
    }

    public double getStorage() {
        return storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void on() {
        this.isOn = true;
        System.out.println("device is on");
    }

    public void off() {
        this.isOn = false;
        System.out.println("device is off");
    }


    public void restart() {
        if (!isOn) {
            System.out.println("the device is off");
            return;
        }

        isOn = false;
        System.out.println("restarting ...");
        isOn = true;
        System.out.println("device restarted!");
    }
}

package com.techreturners.cats;

abstract class CatBehaviour implements Cat {
    boolean sleeping = false;
    private String eatingSound;
    private String setting;
    private int averageHeight;

    public CatBehaviour(String eatingSound, String setting, int averageHeight) {
        this.eatingSound = eatingSound;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    public void goToSleep() {
        sleeping = true;
    }

    public void wakeUp() {
        sleeping = false;
    }

    public boolean isAsleep() {
        return sleeping;
    }

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        return eatingSound;
    }
}

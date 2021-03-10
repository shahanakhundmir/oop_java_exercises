package com.techreturners.cats;

class LionCat extends CatBehaviour {

    int averageHeight;
    String setting;
    boolean sleeping;

    public LionCat(){
        super();
        this.averageHeight = 1100;
        this.setting = "wild";
        this.sleeping = false;
    }

    public String eat() {
        return "Roar!!!!";
    }
    public int getAverageHeight() {
        return averageHeight;
    }
    public String getSetting() {
        return setting;
    }
}
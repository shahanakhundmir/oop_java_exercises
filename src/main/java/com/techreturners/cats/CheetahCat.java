package com.techreturners.cats;

class CheetahCat extends CatBehaviour {

    int averageHeight;
    String setting;
    boolean sleeping;

    public CheetahCat(){
        super();
        this.setting = "wild";
        this.sleeping = false;
        this.averageHeight = 100;
    }

    public String eat() {
        return "Zzzzzzz";
    }
    public int getAverageHeight() {
        return averageHeight;
    }
    public String getSetting() {
        return setting;
    }
}

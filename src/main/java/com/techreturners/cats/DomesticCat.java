package com.techreturners.cats;

class DomesticCat extends CatBehaviour{

    int averageHeight;
    String setting;
    boolean sleeping;

    public DomesticCat(){
        super();
        this.averageHeight = 23;
        this.setting = "domestic";
        this.sleeping = false;
    }
    public String eat() {
        return "Purrrrrrr";
    }
    public int getAverageHeight() {
        return averageHeight;
    }
    public String getSetting() {
        return setting; 
    }

} // end of domestic cat

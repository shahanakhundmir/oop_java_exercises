package com.techreturners.cats;

interface Cat {
    public String sleeping = "Cat should be awake now";
    public String eat();
    public String isAsleep();
    //public void run();
        //public sleep()
    //run()
}

abstract class catBehaviour implements Cat{
    public void goToSleep(){
        sleeping = "Cat should be snoozing";
    }
    
}


class DomesticCat extends catBehaviour {

    int averageHeight;
    String setting;
    String sleeping;

    public DomesticCat(){
        this.averageHeight = 23;
        this.setting = "domestic";
        this.sleeping = "Cat should be awake now";
    }

    public void goToSleep(){
        this.sleeping = "Cat should be snoozing";
    }
    public void wakeUp(){
        this.sleeping = "Cat should be awake now";
    }
    public String isAsleep() {
        return sleeping;
    }
    
    public String eat() {
        return "Purrrrrrr";
    }
    public int getAverageHeight() {
        return this.averageHeight;
    }
    public String getSetting() {
        return this.setting;
    }

} // end of domestic cat


class LionCat extends catBehaviour {

    int averageHeight;
    String setting;
    String sleeping;

    public LionCat(){
        this.averageHeight = 1100;
        this.setting = "wild";
        this.sleeping = "Cat should be awake now";
    }

    public void goToSleep(){
        this.sleeping = "Cat should be snoozing";
    }
    public void wakeUp(){
        this.sleeping = "Cat should be awake now";
    }
    public String isAsleep() {
        return sleeping;
    }
    public String eat() {
        return "Roar!!!!";
    }
    public int getAverageHeight() {
        return this.averageHeight;
    }
    public String getSetting() {
        return this.setting;
    }
}

class CheetahCat extends catBehaviour {

    int averageHeight;
    String setting;
    String sleeping;

    public CheetahCat(){
        this.setting = "wild";
        this.sleeping = "Cat should be awake now";
    }
    public void goToSleep(){
        this.sleeping = "Cat should be snoozing";
    }
    public void wakeUp(){
        this.sleeping = "Cat should be awake now";
    }
    public String isAsleep() {
        return sleeping;
    }
    public String eat() {
        return "Zzzzzzz";
    }
    public int getAverageHeight() {
        return this.averageHeight;
    }
    public String getSetting() {
        return this.setting;
    }
}
  



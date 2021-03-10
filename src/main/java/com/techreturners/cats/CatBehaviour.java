package com.techreturners.cats;

abstract class CatBehaviour implements Cat{
    boolean sleeping = false;

    public void goToSleep(){
        sleeping = true;
    }
    public void wakeUp(){
        sleeping = false;
    }
    public boolean isAsleep() {
        return sleeping;
    }
}

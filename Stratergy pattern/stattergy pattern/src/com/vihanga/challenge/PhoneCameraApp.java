package com.vihanga.challenge;

import com.vihanga.challenge.behaviour.ShareBehaviour;

public abstract class PhoneCameraApp {
    protected ShareBehaviour shareBehaviour;



    public PhoneCameraApp(ShareBehaviour shareBehaviour) {
        this.shareBehaviour = shareBehaviour;
    }

    public  void setShareBehaviour(ShareBehaviour shareBehaviour){
        this.shareBehaviour = shareBehaviour;
    }
    public void performShare(){
        this.shareBehaviour.share();
    }

    protected void take(){
        System.out.println("Take the photo :) ");
    }
    protected void save(){
        System.out.println("Save the photo.....");
    }

    protected abstract void edit();


}

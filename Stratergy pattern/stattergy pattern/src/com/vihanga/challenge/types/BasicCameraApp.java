package com.vihanga.challenge.types;

import com.vihanga.challenge.PhoneCameraApp;
import com.vihanga.challenge.behaviour.ShareBehaviour;

public class BasicCameraApp extends PhoneCameraApp {
    public BasicCameraApp(ShareBehaviour shareBehaviour) {
        super(shareBehaviour);
    }

    @Override
    public void edit() {
        System.out.println("Editing from basic camera................... ");
    }
}

package com.vihanga.challenge.types;

import com.vihanga.challenge.PhoneCameraApp;
import com.vihanga.challenge.behaviour.ShareBehaviour;

public class CameraPlusApp extends PhoneCameraApp {
    public CameraPlusApp(ShareBehaviour shareBehaviour) {
        super(shareBehaviour);
    }

    @Override
    public void edit() {
        System.out.println("Editing from Camera Plus App +++");
    }
}

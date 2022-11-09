package com.vihanga.challenge;

import com.vihanga.challenge.behaviour.EmailShare;
import com.vihanga.challenge.behaviour.TextShare;
import com.vihanga.challenge.types.BasicCameraApp;
import com.vihanga.challenge.types.CameraPlusApp;

public class TestPhoneCameraApp {
    public static void main(String[] args) {
        System.out.println("This is Basic Camera");
        BasicCameraApp basicCameraApp = new BasicCameraApp(new TextShare());
        basicCameraApp.take();
        basicCameraApp.edit();
        basicCameraApp.save();
        basicCameraApp.performShare();
        System.out.println("Changing the sharing type");
        basicCameraApp.setShareBehaviour(new EmailShare());
        basicCameraApp.performShare();
        System.out.println("");

        System.out.println("This is Camera Plus");
        CameraPlusApp cameraPlusApp = new CameraPlusApp(new EmailShare());
        cameraPlusApp.take();
        cameraPlusApp.edit();
        basicCameraApp.save();
        basicCameraApp.performShare();
        System.out.println("Changing the sharing type");
        basicCameraApp.setShareBehaviour(new EmailShare());
        basicCameraApp.performShare();

    }

}

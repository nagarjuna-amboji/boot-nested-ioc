package com.abc.bean;

public class LaunchPad {

    private Rocket rocket;

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void launch() {
        System.out.println("Launch pad launched the rocket.. ");
        System.out.println(rocket.toString());
    }
}

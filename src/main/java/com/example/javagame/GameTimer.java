package com.example.javagame;

import javafx.animation.AnimationTimer;

import java.util.HashSet;
import java.util.Set;

public class GameTimer extends AnimationTimer {
    private double prevTime = 0.0;
    public Set<Scheduled> clients = new HashSet<>();

    @Override
    public void handle(long now) {
        double deltaTime = (now - prevTime) / 1_000_000_000.0;
        prevTime = now;

        for (Scheduled client : clients) {
            if (client.schedule == Schedule.PRE_UPDATE) {
                client.processFrame(deltaTime);
            }
        }

        for (Scheduled client : clients) {
            if (client.schedule == Schedule.UPDATE) {
                client.processFrame(deltaTime);
            }
        }

        for (Scheduled client : clients) {
            if (client.schedule == Schedule.POST_UPDATE) {
                client.processFrame(deltaTime);
            }
        }
    }
}

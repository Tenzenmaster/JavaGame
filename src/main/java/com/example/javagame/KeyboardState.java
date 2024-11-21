package com.example.javagame;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

import java.util.EnumMap;
import java.util.Map;

public class KeyboardState implements Scheduled {
    public Schedule schedule = Schedule.PRE_UPDATE;
    private Map<KeyCode, KeyState> keys = new EnumMap<>(KeyCode.class);

    public KeyboardState(Scene scene) {
        for (KeyCode keyCode : KeyCode.values()) {
            keys.put(keyCode, KeyState.RELEASED);
        }
    }

    public void processFrame(double deltaTime) {

    }
}

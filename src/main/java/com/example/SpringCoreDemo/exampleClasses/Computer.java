package com.example.SpringCoreDemo.exampleClasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Component
public class Computer {
    private OutputController monitor;
    private InputController keyboard;
    private InputController mouse;
    private boolean isWorking;

    @PostConstruct
    public void turnOn(){
        this.isWorking = true;
        monitor.sendStartData();
    }

    @PreDestroy
    public void turnOff(){
        this.isWorking = false;
    }

    @Autowired
    public Computer(GraphicUIController monitor,
                    @Qualifier("keyboardController") InputController keyboard,
                    @Qualifier("mouseController") InputController mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.isWorking = false;
    }

    public void readMessage() throws IOException {
        System.out.println("Enter a command");
        monitor.saveData(keyboard.readData());
    }

    public void updateUI(){
        monitor.sendData();
    }
}
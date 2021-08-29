package com.example.SpringCoreDemo.exampleClasses;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
public class GraphicUIController implements OutputController {
    @Value("${ui.backgroundColor}")
    String backgroundColor;

    @Value("${ui.greetingText}")
    String greetingText;

    Queue<String> messages = new LinkedList<>();

    @Override
    public void sendStartData() {
        System.out.println(sendBackgroundColor());
        System.out.println(sendGreetingText());
    }

    @Override
    public void sendData() {
        if (messages.size() > 0) {
            System.out.println("New message:");
            System.out.println(messages.poll());
        }
    }

    public void saveData(String data){
        messages.add(data);
    }

    public String sendBackgroundColor(){
        return "Setting color: " + backgroundColor;
    }

    public String sendGreetingText(){
        return greetingText;
    }
}

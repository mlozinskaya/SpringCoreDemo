package com.example.SpringCoreDemo.exampleClasses;

import org.springframework.stereotype.Component;

@Component
public class MouseController implements InputController {
    @Override
    public String readData() {
        return null;
    }
}

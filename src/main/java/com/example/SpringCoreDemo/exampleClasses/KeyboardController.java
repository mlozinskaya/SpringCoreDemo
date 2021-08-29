package com.example.SpringCoreDemo.exampleClasses;


import com.example.SpringCoreDemo.utils.ConsoleInput;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class KeyboardController implements InputController {
    @Override
    public String readData() throws IOException {
        return ConsoleInput.readString();
    }
}

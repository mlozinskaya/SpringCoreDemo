package com.example.SpringCoreDemo.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
    public static String readString() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            return reader.readLine();
        }
    }
}

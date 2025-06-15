package com.demo;

public class App {
    public static void main(String[] args) {
        System.out.println("SonarQube Demo Running!");
        
        // Deliberate SonarQube detectable issues
        String unusedVar = "test";  // Will flag unused variable
        if (true) return;           // Will flag always-true condition
    }
}

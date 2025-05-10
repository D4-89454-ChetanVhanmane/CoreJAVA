package com.assignment.q4;

public class q4 {
    // Enum to represent Traffic Lights with durations
    enum TrafficLight {
        RED(30),       // duration in seconds
        GREEN(45),
        YELLOW(5);

        private int duration;

        // Constructor for enum
        TrafficLight(int duration) {
            this.duration = duration;
        }

        // Getter method to access duration
        public int getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        System.out.println("Traffic Light Timings:");
        
        // Loop through enum constants
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + " : " + light.getDuration() + " seconds");
        }
    }
}

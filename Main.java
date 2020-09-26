package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Clock> clocks = new LinkedList<>();

        Clock clock1 = new Clock (13, 59, 45);
        Clock clock2 = new Clock (0, 30, 52);

        clocks.add(clock1);
        clocks.add(clock2);

        TimeFlow flow = new TimeFlow(1000);

        while(true) {
            flow.run(clocks);
        }
    }
}
package com.company;

import java.util.List;

public class TimeFlow {
    private long cycle; //milliseconds
    private long begin;
    private long elapsed;
    private long recent;

    public TimeFlow(long cycle) {
        this.cycle = cycle;
        this.begin = System.currentTimeMillis();
        this.elapsed = 0;
        this.recent = 0;
    }

    private boolean condition() {
        this.elapsed = System.currentTimeMillis() - this.begin;
        return (this.elapsed - this.recent) > this.cycle;
    }

    //overload
    public void run(Clock clock) {
        if (this.condition()) {
            System.out.println("Clock is ticking");
            clock.addSeconds(1);
            System.out.println(clock);
            this.recent = this.elapsed;
        }
    }
    public void run(List<Clock> clocks) {
        if (this.condition()) {
            System.out.println("Clock is ticking");
            for (Clock clock : clocks) {
                clock.addSeconds(1);
            }
            for (Clock clock : clocks) {
                System.out.println(clock);
            }
            this.recent = this.elapsed;
        }
    }
}

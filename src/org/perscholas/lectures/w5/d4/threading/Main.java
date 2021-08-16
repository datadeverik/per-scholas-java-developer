package org.perscholas.lectures.w5.d4.threading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Threads");
        // Concurrency is the ability to execute multiple computations at the same time
        // distribution over:
        // - multiple computers
        // - multiple processors
        // - multiple cores
        //
        // Processes
        // - execution environment made by OS
        // - has its own set of private resources
        // - communication is possible, but immensely difficult
        //
        // Threads
        // - live within a process (The JVM is a process)
        // - share resources with other threads
        // - communication is simple
        exampleOne();
    }

    private static void exampleOne() {
        long id = Thread.currentThread().getId();
        int priority = Thread.currentThread().getPriority();

        String name = Thread.currentThread().getName();

        Thread.State state = Thread.currentThread().getState();

        ThreadGroup group = Thread.currentThread().getThreadGroup();

//        Thread
        System.out.println("id= " + id + " priority= " + priority + " name= " + name + " state= " + state + " group= " + group);
    }
}

package org.example;

import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList(150000);
        TaskSolver solver = new TaskSolver();
        Executor executor = Executors.newFixedThreadPool(8);
        Thread.sleep(2000);
        long time = System.currentTimeMillis();
        arrayList.getList().forEach(taskData -> executor.execute(() -> {
            System.out.println(" \nThread: " + Thread.currentThread().getName());
            solver.solve(taskData);
        }));
        System.out.println("time" + (System.currentTimeMillis() - time));
        Thread.sleep(2000);

    }
}

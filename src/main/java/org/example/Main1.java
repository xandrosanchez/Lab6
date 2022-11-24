package org.example;

import java.util.HashMap;
import java.util.List;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList(150000);
        TaskSolver solver = new TaskSolver();

        Thread.sleep(2000);
        long time = System.currentTimeMillis();
        arrayList.getList().stream().parallel().forEach(count -> {
            System.out.println(" \nThread: " + Thread.currentThread().getName());
            solver.solve(count);
        });
        System.out.println("time" + (System.currentTimeMillis() - time));
        Thread.sleep(2000);

    }
}
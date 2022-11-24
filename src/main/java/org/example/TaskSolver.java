package org.example;

import java.util.Collection;
import java.util.HashMap;

public class TaskSolver {

    public void solve(int n){
        int currentValue = n;

        System.out.println(n + ": ");
        int multiplier = 2;
        while (currentValue > 1 && multiplier <= Math.sqrt(n)) {
            if (currentValue % multiplier == 0) {
                System.out.print(multiplier + " ");
                currentValue /= multiplier;
            } else if (multiplier == 2) {
                multiplier++;
            } else {
                multiplier += 2;
            }
        }
        if (currentValue != 1) {
            System.out.println(currentValue);
        }
    }
}

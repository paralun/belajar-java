package com.paralun.data;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class SampleForkJoinTask extends RecursiveAction {

    private List<Integer> integers;

    public SampleForkJoinTask(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    protected void compute() {
        if (integers.size() <= 10) {
            doCompute();
        } else {
            forkCompute();
        }
    }

    private void doCompute() {
        integers.forEach(value -> {
            System.out.println(Thread.currentThread().getName() + " : " + value);
        });
    }

    private void forkCompute() {
        List<Integer> list1 = this.integers.subList(0, this.integers.size() / 2);
        List<Integer> list2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

        SampleForkJoinTask task1 = new SampleForkJoinTask(list1);
        SampleForkJoinTask task2 = new SampleForkJoinTask(list2);

        ForkJoinTask.invokeAll(task1, task2);
    }
}

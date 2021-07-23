package com.paralun.data;

import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class SampleRecursiveTask extends RecursiveTask<Long> {

    private List<Integer> integers;

    public SampleRecursiveTask(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    protected Long compute() {
        if (integers.size() <= 10) {
           return doCompute();
        } else {
           return forkCompute();
        }
    }

    private Long doCompute() {
        return integers.stream().mapToLong(value -> value).peek(value -> {
            System.out.println(Thread.currentThread().getName() + " : " + value);
        }).sum();
    }

    private Long forkCompute() {
        List<Integer> list1 = this.integers.subList(0, this.integers.size() / 2);
        List<Integer> list2 = this.integers.subList(this.integers.size() / 2, this.integers.size());

        SampleRecursiveTask task1 = new SampleRecursiveTask(list1);
        SampleRecursiveTask task2 = new SampleRecursiveTask(list2);

        ForkJoinTask.invokeAll(task1, task2);
        return task1.join() + task2.join();
    }
}

package app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private final String[] fruits = new DataRepository().getData();
    private final AtomicInteger count = new AtomicInteger(0);

    public synchronized void getOutput() {
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruits) {
            sb.append(String.format("(%d) %s ", count.incrementAndGet(), fruit));
        }
        System.out.println(Thread.currentThread().getName() + ": " + sb);
    }
}
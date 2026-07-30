package aaaa.agh.current;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SnowflakeGenerator {

    private final long workerId;
    private final long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;

    private static final long CUSTOM_EPOCH =
            1735689600000L;
    public SnowflakeGenerator(long workerId,
                                long datacenterId) {
        this.workerId = workerId;
        this.datacenterId = datacenterId;
    }


    public synchronized long nextId() {
        long timestamp = System.currentTimeMillis();

        if (timestamp == lastTimestamp) {
            sequence = (sequence + 1) & 4095;

            if (sequence == 0) {
                while (timestamp <= lastTimestamp) {
                    timestamp = System.currentTimeMillis();
                }
            }
        } else {
            sequence = 0;
        }

        lastTimestamp = timestamp;

        return ((timestamp - CUSTOM_EPOCH) << 22)
                | (datacenterId << 12)
                | sequence;
    }

    public static void main(String[] args) throws InterruptedException {


        SnowflakeGenerator snowflakeGenerator = new SnowflakeGenerator(1,1);

//        for (int i =0;i<10;i++){
//
//            System.out.println(snowflakeGenerator.nextId());
//        }


        Set<Long> ids = ConcurrentHashMap.newKeySet();

        Runnable task = () -> {
            for (int i = 0; i < 10000; i++) {

                System.out.println(snowflakeGenerator.nextId());
                ids.add(snowflakeGenerator.nextId());
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Generated IDs: " + ids.size());

    }
}

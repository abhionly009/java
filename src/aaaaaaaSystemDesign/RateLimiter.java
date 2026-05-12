package aaaaaaaSystemDesign;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private final int maxRequests;
    private final long windowSizeInMillis;

    private final Map<String, Deque<Long>> clientRequests = new HashMap<>();

    public RateLimiter(int maxRequests, long windowSizeInMillis) {
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeInMillis;
    }

    public synchronized boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();

        clientRequests.putIfAbsent(clientId, new ArrayDeque<>());
        Deque<Long> timestamps = clientRequests.get(clientId);

        // Remove old timestamps (outside window)
        while (!timestamps.isEmpty() &&
                currentTime - timestamps.peekFirst() > windowSizeInMillis) {
            timestamps.pollFirst();
        }

        if (timestamps.size() < maxRequests) {
            timestamps.addLast(currentTime);
            return true;
        }

        return false;
    }
}

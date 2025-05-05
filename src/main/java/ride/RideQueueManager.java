package ride;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RideQueueManager {
    private Queue<Guest> guestQueue;

    public RideQueueManager(){
        guestQueue = new LinkedList<>();
    }

    /**
     * Adds a guest to the queue
     * @param guest the guest to add
     */
    public void addGuest(Guest guest) {
        this.guestQueue.offer(guest);
    }

    /**
     * Processes the ride for guest in queue and removes guest from the line
     * @return the processed ride, or null if the queue is empty
     */
    public Guest startRide(){
        return this.guestQueue.poll();
    }

    /**
     * Returns the number of guests in queue
     * @return the size of queue
     */
    public int getQueueSize(){
        return this.guestQueue.size();
    }
}

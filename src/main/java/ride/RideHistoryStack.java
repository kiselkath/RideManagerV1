package ride;

import java.util.Stack;

public class RideHistoryStack {
    private final Stack<Guest> saveRide;

    public RideHistoryStack() {
        this.saveRide = new Stack<>();
    }

    /**
     * push(E item) - Добавляет элемент на вершину стека
     */
    public void addRide(Guest guest) {
        this.saveRide.push(guest);
    }

    /**
     * peek() - Просто возвращает элемент с вершины без удаления
     */
    public Guest viewLastRide() {
        return this.saveRide.isEmpty() ? null : this.saveRide.peek();
    }

    /**
     * pop() - Удаляет и возвращает элемент с вершины стека (LIFO)
     */
    public Guest removeLastRider() {
        return this.saveRide.isEmpty() ? null : this.saveRide.pop();
    }
}

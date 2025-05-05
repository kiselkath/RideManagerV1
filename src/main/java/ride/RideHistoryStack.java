package ride;

import sun.jvm.hotspot.tools.JStack;

import java.util.Stack;

public class RideHistoryStack {
    private final Stack<Guest> saveRide;

    public RideHistoryStack(Stack<Guest> saveRide) {
        this.saveRide = new Stack<>();
    }

    /**
     * push(E item) - Добавляет элемент на вершину стека
     */
    public addRide(){
        return this.saveRide.add(Guest);
    }

    /**
     * peek() - Просто возвращает элемент с вершины без удаления
     */
    public viewLastRide() {
        return (this.saveRide.isEmpty()) ? null : this.saveRide.peek();

    }


    /**
     * pop() - Удаляет и возвращает элемент с вершины стека (LIFO)
     */
    public removeLastRider() {
        return (this.saveRide.isEmpty()) ? null : this.saveRide.pop();
    }


}

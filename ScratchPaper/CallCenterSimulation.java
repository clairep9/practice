package ScratchPaper;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CallCenterSimulation {
    PriorityQueue<Call> queue;

    public CallCenterSimulation() {
        this.queue = new PriorityQueue<>(new CallComparator());
    }

    @Override
    public String toString() {
        ArrayList<Call> arr = new ArrayList<>(queue);
        arr.sort(new CallComparator());
        return arr.toString();
    }

    public void enqueueCall (Call call) {
        queue.add(call);
        System.out.println("Call added");
    }

    public void dequeueCall () {
        queue.poll();
        System.out.println("Call dequeued");
    }

    public void removeSpecificCall (Call call) {
        queue.remove(call);
        System.out.println("Call removed");
    }

    public static void main(String[] args) {
        Call call1 = new Call(1, 5.2);
        Call call2 = new Call(3, 2.5);
        Call call3 = new Call(5, 0.3);
        Call call4 = new Call(2, 10.0);
        Call call5 = new Call(4, 1.8);

        CallCenterSimulation sim = new CallCenterSimulation();
        sim.enqueueCall(call1);
        sim.enqueueCall(call2);
        sim.enqueueCall(call3);
        sim.enqueueCall(call4);
        sim.enqueueCall(call5);

        sim.dequeueCall();

        System.out.println(sim);
    }

}

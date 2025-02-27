import components.queue.Queue;
import components.queue.Queue1L;

public class PoC {

    private Queue<Ticket> tickQueue;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.tickQueue = new Queue1L<>();

    }

    public PoC() {
        this.createNewRep();
    }

    // TODO: store a queue

    // TODO: add kernel methods

    private final void addTicket(Ticket t) {
        this.tickQueue.enqueue(t);

    }

    private final Ticket removeFirst() {
        Ticket t = this.tickQueue.dequeue();
        return t;
    }

    private final int numberOfTickets() {
        int size = this.tickQueue.length();
        return size;
    }

    // TODO: add secondary methods
    private Ticket getOldest() {

        return this.removeFirst();
    }

    public static void main(String[] args) {
        Ticket t = new Ticket("Broken", "NASA");
        Ticket t2 = new Ticket(t, "Lebron James");

        System.out.println(t);
        System.out.println(t2);

        PoC todo = new PoC();
        PoC inProgress = new PoC();
        PoC done = new PoC();

        inProgress.addTicket(t2);

        Ticket oldest = inProgress.getOldest();
        System.out.print(oldest);
    }

}

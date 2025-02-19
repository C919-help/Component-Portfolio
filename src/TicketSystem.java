import components.queue.Queue;

public class TicketSystem {

    private Queue<Ticket> tickQueue;
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

        TicketSystem todo = new TicketSystem();
        TicketSystem inProgress = new TicketSystem();
        TicketSystem done = new TicketSystem();

        
    }

}

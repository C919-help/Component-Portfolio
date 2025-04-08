package components.tickets;

import java.util.Comparator;

import components.queue.Queue;
import components.queue.Queue1L;

/**
 *
 *
 *
 * @convention [this must be a queue of Ticket objects]
 *
 *
 * @correspondence [this is a queue of well-formed tickets that follows FIFO]
 *
 * @author Claire Erdelyi
 */
public class TicketSystem1 extends TicketSystemSecondary {

    /*
     * Private members --------------------------------------------------------
     */

    /**
     * Representation of {@code this}.
     */
    private Queue<Ticket> rep;

    /**
     * Creator of initial representation.
     */
    private void createNewRep() {
        this.rep = new Queue1L<>();
    }

    /**
     * No-argument constructor.
     */
    public TicketSystem1() {
        this.createNewRep();
    }

    @Override
    public final void clear() {
        this.createNewRep();
    }

    @Override
    public TicketSystem newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    @Override
    public void transferFrom(TicketSystem arg0) {
        TicketSystem1 localArg = (TicketSystem1) arg0;
        this.rep = localArg.rep;
        localArg.createNewRep();
    }

    @Override
    public final void addTicket(Ticket t) {
        this.rep.enqueue(t);
    }

    @Override
    public final Ticket removeFirst() {
        Ticket removed = this.rep.dequeue();
        return removed;
    }

    @Override
    public final int numberOfTickets() {
        return this.rep.length();
    }

    @Override
    public void sortBy(Comparator<Ticket> c) {
        this.rep.sort(c);
    }

}

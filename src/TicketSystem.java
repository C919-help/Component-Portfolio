import java.util.Comparator;

public interface TicketSystem extends TicketSystemKernel {

    /**
     * Takes TicketSystem and orders it according to the comparator @c
     *
     * @param c
     *            the comparator that decides how the TicketSystem will be
     *            sorted
     * @requires |TicketSystem|>0
     * @ensures TicketSystem is ordered in the order dictated by @c
     * @updates this
     */
    void sortBy(Comparator c);

    /**
     * Returns an array of the last (numberOfTickets) tickets in the
     * TicketSystem
     *
     * @param numberOfTickets
     *            the number of tickets to be added to an array from the end of
     *            the TicketSystem
     * @return the Ticket at the front of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures array returned is composed of the latest (numberOfTickets)
     *          tickets
     */
    Ticket[] getLatest(int numberOfTickets);

    /**
     * Takes TicketSystem and returns the first Ticket in it
     *
     * @return the Ticket at the end of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket returned is the
     */
    Ticket getNewest();

    /**
     * Takes TicketSystem and returns the first Ticket in it
     *
     * @return the Ticket at the front of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket removed is at the front of TicketSystem
     */
    Ticket getHighestPriority();

    /**
     * Takes TicketSystem and returns the first Ticket in it
     *
     * @return the Ticket at the front of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket removed is at the front of TicketSystem
     */
    Ticket getMostUrgent();
}

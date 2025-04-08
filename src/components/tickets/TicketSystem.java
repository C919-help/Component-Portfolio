package components.tickets;

public interface TicketSystem extends TicketSystemKernel {

    /**
     * Returns an array of the last (numberOfTickets) Tickets in the
     * TicketSystem.
     *
     * @param numberOfTickets
     *            the number of Tickets to be added to an array from the end of
     *            the TicketSystem
     * @return an array of Tickets that are the last (numberOfTickets) Tickets
     *         in TicketSystem
     * @requires |TicketSystem|>0
     * @ensures array returned is composed of the latest (numberOfTickets)
     *          Tickets
     */
    Ticket[] getLatest(int numberOfTickets);

    /**
     * Takes TicketSystem and returns the final Ticket in it.
     *
     * @return the Ticket at the end of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket returned is the newest Ticket added
     */
    Ticket getNewest();

    /**
     * Takes TicketSystem and returns the highest priority Ticket.
     *
     * @return the Ticket at the front of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket removed is at the front of TicketSystem
     */
    Ticket getHighestPriority();

    /**
     * Takes TicketSystem and returns the Ticket at the specific position.
     *
     * @param pos
     *            position of the Ticket wanted
     * @return the Ticket at the position provided
     * @requires 0 <= pos <= |TicketSystem|
     * @ensures Ticket returned is the one at the specified position
     */
    Ticket getCertainTicket(int pos);

    /**
     * Takes TicketSystem and removes the Ticket at the specific position.
     *
     * @param pos
     *            position of the Ticket wanted
     * @return the Ticket at the position provided and removes it
     * @requires |TicketSystem|>0
     * @ensures Ticket returned and removed is one at the specified position
     */
    Ticket removeCertainTicket(int pos);
}

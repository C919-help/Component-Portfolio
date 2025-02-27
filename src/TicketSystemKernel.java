
import components.standard.Standard;

public interface TicketSystemKernel extends Standard<TicketSystem> {

    /**
     * Adds Ticket t to the TicketSystem
     *
     * @param t
     *            the Ticket to be added
     * @ensures this = #this + t
     */
    void addTicket(Ticket t);

    /**
     * Takes TicketSystem and returns the first Ticket in it
     *
     * @return the Ticket at the front of the TicketSystem
     * @requires |TicketSystem|>0
     * @ensures Ticket removed is at the front of TicketSystem
     */
    Ticket removeFirst();

    /**
     * Takes the TicketSystem and returns the number of tickets in that
     * TicketSystem
     *
     * @return the number of Tickets in the TicketSystem
     * @ensures int returned = |this|
     */
    int numberOfTickets();
}

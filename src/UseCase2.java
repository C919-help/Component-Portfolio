import components.tickets.Ticket;
import components.tickets.TicketSystem;
import components.tickets.TicketSystem1;

public class UseCase2 {

    public static void main(String[] args) {
        // make tickets and add it
        Ticket t = new Ticket("Broken", "NASA");
        Ticket finalT = new Ticket(t, "Lebron James");
        Ticket t2 = new Ticket("Help :(", "friend");
        Ticket finalT2 = new Ticket(t2, "me");
        Ticket t3 = new Ticket("Broke my ram", "old lady");
        Ticket finalT3 = new Ticket(t3, "you");

        TicketSystem ourSystem = new TicketSystem1();
        ourSystem.addTicket(finalT);

        // turns out final ticket was an accident, so we remove it
        ourSystem.removeCertainTicket(ourSystem.numberOfTickets());

    }

}

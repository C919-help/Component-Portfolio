import components.tickets.Ticket;
import components.tickets.TicketSystem;
import components.tickets.TicketSystem1;

public class UseCase1 {

    public static void main(String[] args) {
        Ticket t = new Ticket("Broken", "NASA");
        Ticket finalT = new Ticket(t, "Lebron James");
        Ticket t2 = new Ticket("Help :(", "friend");
        Ticket finalT2 = new Ticket(t2, "me");
        Ticket t3 = new Ticket("Broke my ram", "old lady");
        Ticket finalT3 = new Ticket(t3, "you");
        Ticket t4 = new Ticket("Wow you read this", "your brain");
        Ticket finalT4 = new Ticket(t4, "the shadow government");
        TicketSystem ourSystem = new TicketSystem1();
        ourSystem.addTicket(finalT);
        ourSystem.addTicket(finalT2);
        ourSystem.addTicket(finalT3);
        ourSystem.addTicket(finalT4);
        Ticket doThisNow = ourSystem.getHighestPriority();

        // ticket gets done and moves on

        // turns out final 2 tickets added are more urgent than the rest and gets
        // those done
        Ticket[] array = ourSystem.getLatest(2);

        // finally gets the last ticket to get done
        Ticket finalThing = ourSystem.removeFirst();
    }
}

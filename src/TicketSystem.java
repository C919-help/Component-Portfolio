public class TicketSystem {

    // TODO: store a queue

    // TODO: add kernel methods

    // TODO: add secondary methods

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

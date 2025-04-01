public abstract class TicketSystemSecondary implements TicketSystem {

    @Override
    public Ticket getCertainTicket(int pos) {
        Ticket special = new Ticket();
        for (int i = 0; i < this.numberOfTickets(); i++) {
            if (i == pos) {
                special = this.removeFirst();
                this.addTicket(special);
            } else {
                Ticket filler = this.removeFirst();
                this.addTicket(filler);
            }
        }
        return special;

    }

    @Override
    public Ticket[] getLatest(int numberOfTickets) {
        Ticket[] array = new Ticket[numberOfTickets];
        int iterations = this.numberOfTickets() - numberOfTickets;

        for (int i = 0; i < iterations; i++) {

            if (i != (iterations - 1)) {
                Ticket filler = this.removeFirst();
                this.addTicket(filler);

            } else {
                for (i = 0; i < numberOfTickets; i++) {
                    array[i] = this.removeFirst();
                }
            }

        }
        return array;

    }

    // CHECKSTYLE: ALLOW THIS METHOD TO BE OVERRIDDEN
    @Override
    public Ticket getNewest() {
        Ticket current = new Ticket();
        for (int i = 0; i < this.numberOfTickets(); i++) {
            Ticket filler = this.removeFirst();
            if (i == this.numberOfTickets() - 1) {
                current = this.removeFirst();
            }
            this.addTicket(filler);

        }
        return current;
    }

    @Override
    public Ticket removeCertainTicket(int pos) {
        int iterations = this.numberOfTickets();
        Ticket special = new Ticket();

        for (int i = 0; i < iterations; i++) {
            if (i == pos) {
                iterations--;
                special = this.removeFirst();
            } else {
                Ticket filler = new Ticket();
                this.addTicket(filler);
            }

        }
        return special;

    }

    @Override
    public Ticket getHighestPriority() {
        return this.removeFirst();
    }

    /**
     * Returns the description of the ticket as the toString representation I
     * think the most useful thing about a ticket that can be represented as a
     * string is the discription of the ticket.
     */
    @Override
    public String toString() {
        return this.description;
    }

    //I don't think equals and hashcode are needed because there aren't any
    //situations where there would be two of the same ticket in existance unless
    //a duplicate was made by accident. For hashcode,

}

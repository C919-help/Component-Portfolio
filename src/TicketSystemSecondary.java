public abstract class TicketSystemSecondary implements TicketSystem {

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

    public Ticket[] getLatest(int numberOfTickets) {
        Ticket[] array = new Ticket[];
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

    public Ticket removeCertainTicket(int pos) {
        int iterations = this.numberOfTickets();
        Ticket special = new Ticket();

        for (int i = 0; i < iterations; i++) {
            if (i = pos) {
                iterations--;
                special = this.removeFirst();
            } else {
                Ticket filler = new Ticket();
                this.addTicket(filler);
            }

        }
        return special;

    }

    public Ticket getHighestPriority() {
        return this.removeFirst();

    }

}

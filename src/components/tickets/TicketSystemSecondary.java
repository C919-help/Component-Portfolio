package components.tickets;

public abstract class TicketSystemSecondary implements TicketSystem {

    private void rotate(int numRotations) {
        for (int i = 0; i < numRotations; i++) {
            this.addTicket(this.removeFirst());
        }
    }

    @Override
    public Ticket getCertainTicket(int pos) {

        this.rotate(pos);

        Ticket special = this.removeFirst();
        this.addTicket(special);

        this.rotate(this.numberOfTickets() - pos - 1);

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

        for (int i = 0; i <= this.numberOfTickets(); i++) {
            this.addTicket(this.removeFirst());
        }
        Ticket newest = this.removeFirst();

        return newest;
    }

    @Override
    public Ticket removeCertainTicket(int pos) {
        for (int i = 0; i < pos; i++) {
            this.addTicket(this.removeFirst());
        }

        Ticket special = this.removeFirst();

        for (int i = pos + 1; i < this.numberOfTickets(); i++) {
            this.addTicket(this.removeFirst());
        }

        return special;

    }

    @Override
    public Ticket getHighestPriority() {
        return this.removeFirst();
    }

    /**
     * Returns the description of the ticket as the toString representation I
     * think the most useful thing about a ticketSystem to return as a string
     * would be its variable name.
     */
    @Override
    public String toString() {
        String line = "[";
        for (int i = 0; i < this.numberOfTickets(); i++) {
            Ticket myTick = this.removeFirst();
            line += myTick;
            line += ", ";
            this.addTicket(myTick);
        }
        line += "]";
        return line;
    }

    @Override
    public Boolean equals(TicketSystem obj) {
        if (obj == null) {
            return false;
        } else if (!(obj instanceof TicketSystem<Ticket>)) {
            return false;
        } else if (obj.numberOfTickets() != this.numberOfTickets()) {
            return false;
        }

        for (int i = 0; i < this.numberOfTickets(); i++) {
            Ticket mine = this.removeFirst();
            Ticket theirs = obj.removeFirst();
            if (!mine.equals(theirs)) {
                return false;
            }
            this.addTicket(mine);
            obj.addTicket(theirs);
        }
        return true;

    }

    //I don't think hashcode is needed because there is no need to generate
    //a unique identifier for a ticketSystem.

}

public record Ticket(String description, String customer, String assignee) {
    public Ticket(String description, String customer) {
        this(description, customer, null);
    }

    public Ticket(Ticket customerTicket, String assignee) {
        this(customerTicket.description(), customerTicket.customer(), assignee);
    }
}

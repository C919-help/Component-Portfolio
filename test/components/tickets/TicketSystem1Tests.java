package components.tickets;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketSystem1Tests {

    @Test
    public void testNumberOfTickets0() {
        TicketSystem t = new TicketSystem1();
        TicketSystem tRef = new TicketSystem1();
        assertEquals(tRef.numberOfTickets(), t.numberOfTickets());
        assertEquals(tRef, t);
    }

}

package components.tickets;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;

import org.junit.Test;

public class TicketSystem1Tests {

    //Kernel Methods

    @Test
    public void testAddTicket1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        assertEquals(tRef, t);
    }

    @Test
    public void testAddTicket2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        assertEquals(tRef, t);
    }

    @Test
    public void testRemoveFirst1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        Ticket exOne = t.removeFirst();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        Ticket exTwo = tRef.removeFirst();
        assertEquals(tRef, t);
        assertEquals(exOne, tick);
        assertEquals(exTwo, tick);
    }

    @Test
    public void testRemoveFirst2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        Ticket exOne = t.removeFirst();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        t.addTicket(tickTwo);
        Ticket exTwo = tRef.removeFirst();
        assertEquals(tRef, t);
        assertEquals(exOne, exTwo);
        assertEquals(exOne, tick);
        assertEquals(exTwo, tick);
    }

    @Test
    public void testNumberOfTickets0() {
        TicketSystem t = new TicketSystem1();
        TicketSystem tRef = new TicketSystem1();
        assertEquals(tRef.numberOfTickets(), t.numberOfTickets());
        assertEquals(tRef, t);
    }

    @Test
    public void testNumberOfTickets1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        assertEquals(tRef.numberOfTickets(), t.numberOfTickets());
        assertEquals(tRef, t);
    }

    @Test
    public void testNumberOfTickets2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        assertEquals(tRef.numberOfTickets(), t.numberOfTickets());
        assertEquals(tRef, t);
    }

    @Test
    public void testSortBy1(Comparator<Ticket> c) {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        t.sortBy(c);
        tRef.sortBy(c);
        assertEquals(tRef, t);
    }

    @Test
    public void testSortBy2(Comparator<Ticket> c) {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        t.sortBy(c);
        tRef.sortBy(c);
        assertEquals(tRef, t);
    }

    @Test
    public void testSortBy3(Comparator<Ticket> c) {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        t.sortBy(c);
        tRef.sortBy(c);
        assertEquals(tRef, t);
    }

    //Secondary Methods

    @Test
    public void testGetCertainTicket1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        Ticket check1 = t.getCertainTicket(0);
        Ticket check2 = tRef.getCertainTicket(0);
        assertEquals(check1, check2);
        assertEquals(check1, tick);
        assertEquals(check2, tick);
    }

    @Test
    public void testGetCertainTicket2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        Ticket check1 = t.getCertainTicket(1);
        Ticket check2 = tRef.getCertainTicket(1);
        assertEquals(check1, check2);
        assertEquals(check1, tickTwo);
        assertEquals(check2, tickTwo);
    }

    @Test
    public void testGetLatest1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        Ticket[] check1 = t.getLatest(1);
        Ticket[] check2 = tRef.getLatest(1);
        assertEquals(check1, check2);
    }

    @Test
    public void testGetLatest2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        Ticket[] check1 = t.getLatest(2);
        Ticket[] check2 = tRef.getLatest(2);
        assertEquals(check1, check2);
    }

    @Test
    public void testGetLatest3() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        Ticket[] check1 = t.getLatest(3);
        Ticket[] check2 = tRef.getLatest(3);
        assertEquals(check1, check2);
    }

    @Test
    public void testGetNewest1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        Ticket check1 = t.getNewest();
        Ticket check2 = tRef.getNewest();
        assertEquals(check1, check2);
    }

    @Test
    public void testGetNewest2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        Ticket check1 = t.getNewest();
        Ticket check2 = tRef.getNewest();
        assertEquals(check1, check2);
    }

    @Test
    public void testGetNewest3() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        Ticket check1 = t.getNewest();
        Ticket check2 = tRef.getNewest();
        assertEquals(check1, check2);
    }

    @Test
    public void testRemoveCertainTicket1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        Ticket check1 = t.removeCertainTicket(0);
        Ticket check2 = tRef.removeCertainTicket(0);
        assertEquals(check1, check2);
        assertEquals(t, tRef);
    }

    /**
     * Test removing first position with size 2
     */
    @Test
    public void testRemoveCertainTicket2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        Ticket check1 = t.removeCertainTicket(0);
        Ticket check2 = tRef.removeCertainTicket(0);
        assertEquals(check1, check2);
        assertEquals(t, tRef);
    }

    /**
     * Test removing final position with size 2
     */
    @Test
    public void testRemoveCertainTicket3() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        Ticket check1 = t.removeCertainTicket(1);
        Ticket check2 = tRef.removeCertainTicket(1);
        assertEquals(check1, check2);
        assertEquals(t, tRef);
    }

    /**
     * Test removing final position with size 3
     */
    @Test
    public void testRemoveCertainTicket4() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        Ticket tickThree = new Ticket("Request", "Tony");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        t.addTicket(tickThree);
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        tRef.addTicket(tickThree);
        Ticket check1 = t.removeCertainTicket(2);
        Ticket check2 = tRef.removeCertainTicket(2);
        assertEquals(check1, check2);
        assertEquals(t, tRef);
    }

    @Test
    public void testGetHighestPriority1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        Ticket exOne = t.removeFirst();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        Ticket exTwo = tRef.removeFirst();
        assertEquals(tRef, t);
        assertEquals(exOne, tick);
        assertEquals(exTwo, tick);
    }

    @Test
    public void testGetHighestPriority2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        Ticket exOne = t.getHighestPriority();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        t.addTicket(tickTwo);
        Ticket exTwo = tRef.getHighestPriority();
        assertEquals(tRef, t);
        assertEquals(exOne, exTwo);
        assertEquals(exOne, tick);
        assertEquals(exTwo, tick);
    }

    @Test
    public void testToString0() {
        TicketSystem t = new TicketSystem1();
        String exOne = t.toString();
        TicketSystem tRef = new TicketSystem1();
        String exTwo = tRef.toString();
        assertEquals(tRef, t);
        assertEquals(exOne, exTwo);
    }

    @Test
    public void testToString1() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        t.addTicket(tick);
        String exOne = t.toString();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        String exTwo = tRef.toString();
        assertEquals(tRef, t);
        assertEquals(exOne, exTwo);
    }

    @Test
    public void testToString2() {
        TicketSystem t = new TicketSystem1();
        Ticket tick = new Ticket("hurry", "Cindy");
        Ticket tickTwo = new Ticket("Test", "Michael");
        t.addTicket(tick);
        t.addTicket(tickTwo);
        String exOne = t.toString();
        TicketSystem tRef = new TicketSystem1();
        tRef.addTicket(tick);
        tRef.addTicket(tickTwo);
        String exTwo = tRef.toString();
        assertEquals(tRef, t);
        assertEquals(exOne, exTwo);
    }

    //Test equals??

}

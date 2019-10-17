import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaTest {
    private CinemaBooking book = new CinemaBooking();
    @Test
    public void shouldTestIsSeatBooked(){
        book.arrangeSeats();
        assertEquals(book.isSeatBooked(1,3), false);
    }

    @Test
    public void shouldTestBookSeat(){
        book.arrangeSeats();
        book.bookSeat(1,3);
        assertEquals(book.isSeatBooked(1,3), true);
        System.out.println();
        assertEquals(book.bookSeat(4,6), true);
    }
}



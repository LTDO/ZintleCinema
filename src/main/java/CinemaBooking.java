public class CinemaBooking {

    private int columns = 9;
    private int rows = 8;
//    private final double frontRow = 25;
//    private final double middleRow = 35.0;
//    private final double backRow = 31.0;

    private String[][] cinema = new String [columns][rows];

    public void arrangeSeats() {
        for (int r = 0; r < cinema.length; r++) {
            for (int s = 0; s < cinema[r].length; s++) {
                cinema[r][s] = "#";
            }
        }
    }
    boolean isSeatBooked(int row, int seat) {
        if(cinema[row][seat].equals("x")){
            System.out.println("Seat is booked");
            return true;
        }
        else if(cinema[row][seat].equals("#")){
            System.out.println("Seat is not booked");
            return false;
        }
        else
            System.out.println("All seats booked");
            return false;
    }
    boolean bookSeat(int row, int seat) {
        if (cinema[row][seat].equals("#")) {
            cinema[row][seat] = "x";
            System.out.println("Seat booked successfully");
            return true;
        }
            else if (cinema[row][seat].equals("x")){
            System.out.println("Already booked");
                return false;
            }
        System.out.println("No seats available");
            return false;
        }

//        public boolean book(int tickets, String location){

//        }

    public void show() {
        System.out.println("----Screen----");
        for (String[] strings : cinema) {
            for (int s = 0; s < strings.length; s++) {
                System.out.print(strings[s]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CinemaBooking cinemaBooking = new CinemaBooking();
        cinemaBooking.arrangeSeats();
        cinemaBooking.bookSeat(1,3);
        cinemaBooking.show();
    }
}


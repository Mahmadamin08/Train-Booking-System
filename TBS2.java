import java.util.*;

class Train {
    String trainNo;
    Map<String, Route> routes; // map route for better search of route
    ArrayList<_SLcoach> _sLcoachs;
    ArrayList<_3Acoach> _3Acoachs;
    ArrayList<_2Acoach> _2Acoachs;
    ArrayList<_1Acoach> _1Acoachs;

    Train(String tn) {
        this.trainNo = tn;
        this.routes = new HashMap<>();
        this._sLcoachs = new ArrayList<>();
        this._3Acoachs = new ArrayList<>();
        this._2Acoachs = new ArrayList<>();
        this._1Acoachs = new ArrayList<>();
    }

    public String getTrainNo() {
        return trainNo;
    }

    void addSL(_SLcoach sl) {
        this._sLcoachs.add(sl);
    }

    void add3a(_3Acoach _3a) {
        this._3Acoachs.add(_3a);
    }

    void add2a(_2Acoach _2a) {
        this._2Acoachs.add(_2a);
    }

    void add1a(_1Acoach _1a) {
        this._1Acoachs.add(_1a);
    }

    void addRoutes(String n, Route r) {
        this.routes.put(n, r);
    }

    public Map<String, Route> getRoutes() {
        return routes;
    }

    public ArrayList<_SLcoach> get_sLcoachs() {
        return _sLcoachs;
    }

    public ArrayList<_3Acoach> get_3Acoachs() {
        return _3Acoachs;
    }

    public ArrayList<_2Acoach> get_2Acoachs() {
        return _2Acoachs;
    }

    public ArrayList<_1Acoach> get_1Acoachs() {
        return _1Acoachs;
    }
}

class Route {
    String Rname;
    int dis;

    Route(String name, int dis) {
        this.Rname = name;
        this.dis = dis;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public void setRname(String rname) {
        Rname = rname;
    }

    public String getRname() {
        return Rname;
    }
}

class Coach {

    void makeSeats(ArrayList<Seat> seats, int noOfSeats) {
        for (int i = 1; i <= noOfSeats; i++) {
            Seat seat = new Seat(i, "NotReserved");
            seats.add(seat);
        }
    }
}

class _SLcoach extends Coach {
    int coachNo;
    int noOfSeats;
    ArrayList<Seat> seats;

    _SLcoach(int cn, int ns) {
        this.coachNo = cn;
        this.noOfSeats = ns;
        this.seats = new ArrayList<>();
    }

    void makeSeats() {
        for (int i = 1; i <= noOfSeats; i++) {
            Seat seat = new Seat(i, "NotReserved");
            seats.add(seat);
        }
    }

    public int getCoachNo() {
        return coachNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}

class _3Acoach extends Coach {
    int coachNo;
    int noOfSeats;
    ArrayList<Seat> seats;

    _3Acoach(int cn, int ns) {
        this.coachNo = cn;
        this.noOfSeats = ns;
        this.seats = new ArrayList<>();
    }

    void makeSeats() {
        for (int i = 1; i <= noOfSeats; i++) {
            Seat seat = new Seat(i, "NotReserved");
            seats.add(seat);
        }
    }

    public int getCoachNo() {
        return coachNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}

class _2Acoach extends Coach {
    int coachNo;
    int noOfSeats;
    ArrayList<Seat> seats;

    _2Acoach(int cn, int ns) {
        this.coachNo = cn;
        this.noOfSeats = ns;
        this.seats = new ArrayList<>();
    }

    void makeSeats() {
        for (int i = 1; i <= noOfSeats; i++) {
            Seat seat = new Seat(i, "NotReserved");
            seats.add(seat);
        }
    }

    public int getCoachNo() {
        return coachNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}

class _1Acoach extends Coach {
    int coachNo;
    int noOfSeats;
    ArrayList<Seat> seats;

    _1Acoach(int cn, int ns) {
        this.coachNo = cn;
        this.noOfSeats = ns;
        this.seats = new ArrayList<>();
    }

    void makeSeats() {
        for (int i = 1; i <= noOfSeats; i++) {
            Seat seat = new Seat(i, "NotReserved");
            seats.add(seat);
        }
    }

    public int getCoachNo() {
        return coachNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

}

class Seat {
    int seatNo;
    String reservedStatus;
    Set<String> dates;

    Seat(int seatNo, String res) {
        this.seatNo = seatNo;
        this.reservedStatus = res;
        this.dates = new HashSet<>();
    }

    public int getSeatNo() {
        return seatNo;
    }

    public String getReservedStatus() {
        return reservedStatus;
    }

    public void setReservedStatus(String reservedStatus) {
        this.reservedStatus = reservedStatus;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public Set<String> getDates() {
        return dates;
    }

    public void setDates(String str) {
        this.dates.add(str);
    }
}

public class TBS2 {

    ArrayList<Train> allTrains;
    Scanner sc = new Scanner(System.in);
    Map<String, ArrayList<Train>> dateTrains;

    int PRN = 100000001;

    TBS2() {
        this.allTrains = new ArrayList<>();
        this.dateTrains = new HashMap<>();
    }

    void AddTrainDetail(int noOfTrain) {
        for (int i = 0; i < noOfTrain; i++) {
            String[] trainDetail = sc.nextLine().split(" ");

            // create train
            Train train = new Train(trainDetail[0]);

            // Add routes of the train
            for (int j = 1; j < trainDetail.length; j++) {
                String routeDetail[] = trainDetail[j].split("-");
                Route route = new Route(routeDetail[0], Integer.parseInt(routeDetail[1]));
                train.addRoutes(routeDetail[0], route);
            }

            // Add coachs of the train
            String[] coachDetail = sc.nextLine().split(" ");
            for (int k = 1; k < coachDetail.length; k++) {
                String[] eachCoachDetail = coachDetail[k].split("-");

                char cage = eachCoachDetail[0].charAt(0);
                int coachNo = Integer.parseInt(eachCoachDetail[0].substring(1));
                int noOfSeats = Integer.parseInt(eachCoachDetail[1]);

                if (cage == 'S') {
                    _SLcoach c = new _SLcoach(coachNo, noOfSeats);
                    c.makeSeats();
                    train.addSL(c);

                } else if (cage == 'B') {
                    _3Acoach c = new _3Acoach(coachNo, noOfSeats);
                    c.makeSeats();
                    train.add3a(c);

                } else if (cage == 'A') {
                    _2Acoach c = new _2Acoach(coachNo, noOfSeats);
                    c.makeSeats();
                    train.add2a(c);

                } else if (cage == 'H') {
                    _1Acoach c = new _1Acoach(coachNo, noOfSeats);
                    c.makeSeats();
                    train.add1a(c);

                }
            }
            allTrains.add(train);
        }
    }

    int CalculateCharge(int dis, int NoOfPerson, String cate) {
        if (cate.equals("SL"))
            return 1 * dis * NoOfPerson;
        else if (cate.equals("3A"))
            return 2 * dis * NoOfPerson;
        else if (cate.equals("3A"))
            return 3 * dis * NoOfPerson;
        else
            return 4 * dis * NoOfPerson;
    }

    void BookingRequst() {
        while (true) {
            String bookingReq[] = sc.nextLine().split(" ");
            String src = bookingReq[0];
            String des = bookingReq[1];
            String date = bookingReq[2];
            String cate = bookingReq[3]; // SL,3A,2A,1A
            int noOfSeatToBook = Integer.parseInt(bookingReq[4]);

            ArrayList<Train> trains = allTrains;
            boolean isTrain = false;
            for (Train t : trains) {
                if (t.getRoutes().containsKey(src) && t.getRoutes().containsKey(des)) {
                    isTrain = true;
                    Booking(t, date, src, des, cate, noOfSeatToBook);
                }
            }
            if (!isTrain)
                System.out.println("No Trains Available");
        }
    }

    private void Booking(Train t, String date, String src, String des, String cate,
            int noOfSeatToBook) {

        int distance = t.getRoutes().get(des).getDis() - t.getRoutes().get(src).getDis();
        boolean seatsAvi = IsSeatAvailable(t, cate, noOfSeatToBook, date);
        if (seatsAvi) {
            BookSeat(t, noOfSeatToBook, cate, date);
            System.out.println(PRN + " " + CalculateCharge(distance, noOfSeatToBook, cate));
            PRN++;
        } else
            System.out.println("No Seats Available!");
    }

    void BookSeat(Train t, int noOfSeatToBook, String cate, String date) {

        if (cate.equals("SL")) {
            ArrayList<_SLcoach> sl = t.get_sLcoachs();
            for (_SLcoach sll : sl) {
                for (Seat seat : sll.getSeats()) {
                    if (!seat.getDates().contains(date) && noOfSeatToBook > 0) {
                        seat.setDates(date);
                        noOfSeatToBook--;
                    }
                }
            }
        }

        else if (cate.equals("3A")) {
            ArrayList<_3Acoach> sl = t.get_3Acoachs();
            for (_3Acoach sll : sl) {
                for (Seat seat : sll.getSeats()) {
                    if (!seat.getDates().contains(date) && noOfSeatToBook > 0) {
                        seat.setDates(date);
                        noOfSeatToBook--;
                    }
                }
            }

        } else if (cate.equals("2A")) {
            ArrayList<_2Acoach> sl = t.get_2Acoachs();
            for (_2Acoach sll : sl) {
                for (Seat seat : sll.getSeats()) {
                    if (!seat.getDates().contains(date) && noOfSeatToBook > 0) {
                        seat.setDates(date);
                        noOfSeatToBook--;
                    }
                }
            }

        } else if (cate.equals("1A")) {
            ArrayList<_1Acoach> sl = t.get_1Acoachs();
            for (_1Acoach sll : sl) {
                for (Seat seat : sll.getSeats()) {
                    if (!seat.getDates().contains(date) && noOfSeatToBook > 0) {
                        seat.setDates(date);
                        noOfSeatToBook--;
                    }
                }
            }
        }

    }

    private boolean IsSeatAvailable(Train t, String cate, int noOfSeatToBook, String date) {
        int AvailableSeatInRequestedCoach = 0;
        if (cate.equals("SL")) {
            for (_SLcoach sl : t.get_sLcoachs()) {
                for (Seat seat : sl.getSeats()) {
                    if (!seat.getDates().contains(date))
                        AvailableSeatInRequestedCoach++;
                }
            }
        } else if (cate.equals("3A")) {
            for (_3Acoach sl : t.get_3Acoachs()) {
                for (Seat seat : sl.getSeats()) {
                    if (!seat.getDates().contains(date))
                        AvailableSeatInRequestedCoach++;
                }
            }
        }
        if (cate.equals("2A")) {
            for (_2Acoach sl : t.get_2Acoachs()) {
                for (Seat seat : sl.getSeats()) {
                    if (!seat.getDates().contains(date))
                        AvailableSeatInRequestedCoach++;
                }
            }
        }
        if (cate.equals("1A")) {
            for (_1Acoach sl : t.get_1Acoachs()) {
                for (Seat seat : sl.getSeats()) {
                    if (!seat.getDates().contains(date))
                        AvailableSeatInRequestedCoach++;
                }
            }
        }
        return AvailableSeatInRequestedCoach >= noOfSeatToBook;
    }

    public static void main(String[] args) {

        TBS2 tbs = new TBS2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of Train:-");
        int noOfTrain = Integer.parseInt(sc.nextLine());

        // Add Trains Details
        tbs.AddTrainDetail(noOfTrain);

        // Booking Requests
        tbs.BookingRequst();

    }
}
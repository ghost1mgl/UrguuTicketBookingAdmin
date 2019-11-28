package modul;

public class Booking {
    int idB,idS,childNumber,adultNumber,bill;
    String bookedSeats;

    public Booking(int idB, int idS, int childNumber, int adultNumber, int bill, String bookedSeats) {
        this.idB = idB;
        this.idS = idS;
        this.childNumber = childNumber;
        this.adultNumber = adultNumber;
        this.bill = bill;
        this.bookedSeats = bookedSeats;
    }

    public int getIdB() {
        return idB;
    }

    public void setIdB(int idB) {
        this.idB = idB;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(int adultNumber) {
        this.adultNumber = adultNumber;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(String bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {

        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {

        int pps = (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        // = this.princePerSquare - compared.princePerSquare;
        if (pps > 0) {
            return pps;
        }
        int ps = pps;
        return pps * -1;
//    if(this.price()*compare.price() > 0)
//        System.out.println((this.price * this.square) - (compared.price * compared.square));
    }

    public boolean moreExpensiveThan(Apartment compared) {

        int price1 = this.princePerSquare * this.squares;
        int price2 = compared.princePerSquare * compared.squares;

        if (price1 > price2) {
            return true;

        }
        return false;

    }

}


enum TypeOfTour {SIGHTSEEING, SHOREEXCURSION, ADVENTURE, SPORTING, COMBINING}
public class Tour {


    private final String name;
    private final double price;
    private final float durationOfTour;
    private boolean isMostPopular;
    private int quantityOfBookings;
    private final String languageOfTour;
    private final TypeOfTour typeOfTour;

    public Tour(String name, double price,
                     float durationOfTour, boolean isMostPopular ,
                     int quantityOfBookings,
                     String languageOfTour, TypeOfTour typeOfTour ) {
        this.name = name;
        this.price = price;
        this.durationOfTour = durationOfTour;
        this.isMostPopular = isMostPopular;
        this.quantityOfBookings = quantityOfBookings;
        this.languageOfTour = languageOfTour;
        this.typeOfTour = typeOfTour;
    }




    public String getName (){
        return name;
    }

    public double getPrice () {
        return price;
    }

    public float getDurationOfTour  () {
        return durationOfTour;
    }

    public boolean isMostPopular() {
        return isMostPopular;
    }

    public int getQuantityOfBookings() {
        return quantityOfBookings;
    }

    public String getLanguageOfTour() {
        return languageOfTour;
    }
    public TypeOfTour getTypeOfTour () {
        return typeOfTour;
    }



    public String toString() {
        return "Name: " + getName() + "\n" +
                "Price: " + getPrice() + " euro" + "\n" +
                "Duration of Tour: " + getDurationOfTour() + " hour" + "\n" +
                "Quantity of bookings: " + getQuantityOfBookings() +  "\n" +
                "Language of Tour: " + getLanguageOfTour() +"\n"  +
                "The most popular tour: " + isMostPopular() + "\n" +
                "Type of tour: " + typeOfTour.toString() +"\n";
    }

}


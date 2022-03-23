public class Main {
    public static void main (String[]args) {
        Tour tour;

        ListOfTours chosenTour = new ListOfTours();
        tour = new Tour("Riga Old Town walking tour",6.16, 1.30f,true,377,"English",TypeOfTour.SIGHTSEEING);
        chosenTour.addTour(tour);

        tour = new Tour("Ultimate Husky dog sled ride experience in Latvia", 78.84,3.00f,false, 445,"German",TypeOfTour.SPORTING);
        chosenTour.addTour(tour);

        tour = new Tour("Delicious Food Tasting Adventure in Riga Central Market",32.35,2.30f,true,625,"Italian, English",TypeOfTour.COMBINING);
        chosenTour.addTour(tour);

        chosenTour.printListOfChosenTours();


    }


}

/*
FBLA project - tourist, 
By: Matt Uehling, Ben Kubick, Isaac Workmen
*/
import java.util.Scanner;//To scan the entered information
class Main {
  public static void main(String[] args) {
    //connecting the classes
    Attractions Attract = new Attractions();
    Comparing Compare = new Comparing(); 
    
    Scanner scan = new Scanner(System.in);//Creates the scanner

    //Variables Used
    String location="";
    String priceRange = "";
    String season = "";

    //Introducotry Statement
    System.out.println("Welcome to Elkhorn we have fantastic attractions for anything that interests you");
    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other','Any'");
    location = scan.nextLine();//stores the entered location
    if(Compare.Cities(location)==false)//If the entered location can't be recongnized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other','Any'");
    location = scan.nextLine();
    }while(Compare.Cities(location)==false);//Repeating until a city is selected
    }
    Attract.enteredLocation(location);// saves the location to the Attraction class
    Attract.testCities();//Prints out the current available cities, delete line later

     //Season
    System.out.println("Please enter a season: 'Spring', 'Summer', 'Fall', or 'Winter', 'Any'");
    season = scan.nextLine();//stores the entered season
    if(Compare.Season(season)==false)//If the entered season can't be recongnized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter a season: 'Spring', 'Summer', 'Fall', or 'Winter', 'Any'");
    season = scan.nextLine();
    }while(Compare.Season(season)==false);//Repeating until a season is selected
    }
    Attract.enteredSeason(season);// saves the Season to the Attraction class
    Attract.testSeason();


    //Guess i'll just do price
    System.out.println("Please enter the price range either : 'Free', 'Under 25' or 'Above 50', 'Any'");
    priceRange = scan.nextLine();//stores the entered price
    if(Compare.price(priceRange)==false)//If the entered price can't be recongnized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter the price range either : 'Free', 'Under 25' or 'Above 50', 'Any'");
    priceRange = scan.nextLine();
    }while(Compare.price(priceRange)==false);//Repeating until a price range is selected
    }
    Attract.enteredPrice(priceRange);// saves the price to the Attraction class
    Attract.testPrice();

   
  }
}

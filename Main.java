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
    String handicap="";
    String pubTransport = "";
    String activity = "";
    String rating = "";
    String opPreference = "";

    //Introducotry Statement
    System.out.println("Welcome to Elkhorn, Nebraska, we can help you find fantastic attractions for anything that meet your needs in our lovely state.");
    
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

    System.out.println("Please enter either: 'Inside', 'Outside', or 'Any'");
    season = scan.nextLine();//stores the entered season
    if(Compare.InsideOut(season)==false)//If the entered season can't be recongnized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter either: 'Inside', 'Outside', or 'Any'");
    season = scan.nextLine();
    }while(Compare.InsideOut(season)==false);//Repeating until a season is selected
    }
    Attract.enteredSeason(season);// saves the Season to the Attraction class

    System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any'");
    priceRange = scan.nextLine();//stores the entered price
    if(Compare.price(priceRange)==false)//If the entered price can't be recognized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any");
    priceRange = scan.nextLine();
    }while(Compare.price(priceRange)==false);//Repeating until a price range is selected
    }
    Attract.enteredPriceRange(priceRange);// saves the price to the Attraction class

    System.out.println("Would you like your desination to be handicap accessible, either: 'Yes', 'No', 'Any'");
    handicap=scan.nextLine();//stores the entered handicap preference
    if(Compare.Handi(handicap)==false)//if the entered preference is not recognized
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Would you like your desination to be handicap accessible, either: 'Yes', 'No','Any'");handicap=scan.nextLine();
      }while(Compare.Handi(handicap)==false);//repeats until a proper preference is entered
    }
    Attract.enteredHandicap(handicap);//save the preference to the Attractions class

    System.out.println("Do you need public transportation 'Yes', 'No'");
    pubTransport=scan.nextLine();//stores public transportation preference
    if(Compare.transportation(pubTransport)==false)//if the preference cannot be recognized
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you need public transportation 'Yes', 'No'");
        pubTransport=scan.nextLine();
      }while(Compare.transportation(pubTransport)==false);//repeats until a valid response is entered
    }
    Attract.enteredPTransportation(pubTransport);

    System.out.println("Do you want some physical activity 'Yes', 'No', 'Any'");
    activity=scan.nextLine();//stores entered preference for physical activity
    if(Compare.physicalActivity(activity)==false)//if the option entered is invalid
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you want some physical activity 'Yes', 'No', 'Any'");
        activity=scan.nextLine();
      }while(Compare.physicalActivity(activity)==false);//repeats until valid selection is entered
    }
    Attract.enteredPhysical(activity);

    System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', or '3'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\nOr 'Any'");
    rating=scan.nextLine();//stores entered rating preference
    if(Compare.Rate(rating)==false)//if an invalid preference is chosen
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Ratings of these places have been sorted into three categories, enter either a 1,2, or 3\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\nOr 'Any'");
        rating=scan.nextLine();
      }while(Compare.Rate(rating)==false);//repeats until valid rating preference is chosen
    }
    Attract.enteredRating(rating);
    
    System.out.println("Do you want the programmers opinion 'Yes', 'No', 'Any'");
    opPreference=scan.nextLine();//stores the entered choice as to if they would like the programmers opinion
    if(Compare.opinion(opPreference)==false)//if a valid response is not entered
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you want the programmers opinion 'Yes', 'No', 'Any''");
        opPreference=scan.nextLine();
      }while(Compare.opinion(opPreference)==false);//repeats until a valid choice is entered
    }
    Attract.enteredOpinion(opPreference);

    System.out.println("----------------");
    Attract.UltimatePrint();
  }
}

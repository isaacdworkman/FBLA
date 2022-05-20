import java.util.Scanner;//To scan the entered information
class Main {
  public static void main(String[] args) {
    //connecting the classes
    Attractions Attract = new Attractions();
    Comparing Compare = new Comparing(); 
    
    Scanner scan = new Scanner(System.in);//Creates the scanner

    //Variables Used
    String userEntered="";

    //Introducotry Statement
    System.out.println("Welcome to Elkhorn, Nebraska, we can help you find fantastic attractions for anything that meet your needs in our lovely state.");

    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other','Any'");
    userEntered = scan.nextLine();//stores the entered location
    if(Compare.testViable(userEntered, "Omaha", "Lincoln", "Fremont", "Other")==false)
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other','Any'");
    userEntered = scan.nextLine();
    }while(Compare.testViable(userEntered, "Omaha", "Lincoln", "Fremont", "Other")==false);//Repeating until a city is selected
    }
    Attract.enteredLocation(userEntered);// saves the location to the Attraction class
    System.out.println("Please enter either: 'Inside', 'Outside', or 'Any'");
    userEntered = scan.nextLine();//stores the entered season
    if(Compare.testViableShort(userEntered, "Inside", "Outside")==false)//If the entered season can't be recongnized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter either: 'Inside', 'Outside', or 'Any'");
    userEntered = scan.nextLine();
    }while(Compare.testViableShort(userEntered, "Inside", "Outside")==false);//Repeating until a season is selected
    }
    Attract.enteredInsideOrOutside(userEntered);// saves the Season to the Attraction class
    System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any'");
    userEntered = scan.nextLine();//stores the entered price
    if(Compare.testViable(userEntered, "0-5", "6-10", "10-20", "20+")==false)//If the entered price can't be recognized
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any");
    userEntered = scan.nextLine();
    }while(Compare.testViable(userEntered, "0-5", "6-10", "10-20", "20+")==false);//Repeating until a price range is selected
    }
    Attract.enteredPriceRange(userEntered);// saves the price to the Attraction class
    System.out.println("Would you like your desination to be handicap accessible, either: 'Yes', 'No', 'Any'");
    userEntered=scan.nextLine();//stores the entered handicap preference
    if(Compare.testViableShort(userEntered, "Yes", "No")==false)//if the entered preference is not recognized
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Would you like your desination to be handicap accessible, either: 'Yes', 'No','Any'");
        userEntered=scan.nextLine();
      }while(Compare.testViableShort(userEntered, "Yes", "No")==false);//repeats until a proper preference is entered
    }
    Attract.enteredHandicap(userEntered);//save the preference to the Attractions class
    System.out.println("Do you need public transportation 'Yes', 'No'");
    userEntered=scan.nextLine();//stores public transportation preference
    if(Compare.testViableShort(userEntered, "Yes", "No")==false)//if the preference cannot be recognized
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you need public transportation 'Yes', 'No'");
        userEntered=scan.nextLine();
      }while(Compare.testViableShort(userEntered, "Yes", "No")==false);//repeats until a valid response is entered
    }
    Attract.enteredPTransportation(userEntered);

    System.out.println("Do you want some physical activity 'Yes', 'No', 'Any'");
    userEntered=scan.nextLine();//stores entered preference for physical activity
    if(Compare.testViableShort(userEntered, "Yes", "No")==false)//if the option entered is invalid
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you want some physical activity 'Yes', 'No', 'Any'");
        userEntered=scan.nextLine();
      }while(Compare.testViableShort(userEntered, "Yes", "No")==false);//repeats until valid selection is entered
    }
    Attract.enteredPhysical(userEntered);
//fix numbering
    System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings");
    userEntered=scan.nextLine();//stores entered rating preference
    if(Compare.testViable(userEntered, "1", "2", "3", "4")==false)//if an invalid preference is chosen
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3', or '4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings");
        userEntered=scan.nextLine();
      }while(Compare.testViable(userEntered, "1", "2", "3", "4")==false);//repeats until valid rating preference is chosen
    }
    Attract.enteredRating(userEntered);
    System.out.println("Do you want the programmers opinion 'Yes', 'No', 'Any'");
    userEntered=scan.nextLine();//stores the entered choice as to if they would like the programmers opinion
    if(Compare.testViableShort(userEntered, "Yes", "No")==false)//if a valid response is not entered
    {
      do{
        System.out.println("Sorry your selection was not recongnized please try again");
        System.out.println("Do you want the programmers opinion 'Yes', 'No', 'Any''");
        userEntered=scan.nextLine();
      }while(Compare.testViableShort(userEntered, "Yes", "No")==false);//repeats until a valid choice is entered
    }
    Attract.enteredOpinion(userEntered);

    System.out.println("----------------");
    Attract.UltimatePrint(8);
    scan.close();
  }
}

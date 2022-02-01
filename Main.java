/*
FBLA project - tourist, 
By: Matt Uehling, Ben Kubicek, Isaac Workmen
*/
import java.util.Scanner;//To scan
class Main {
  public static void main(String[] args) {
    //Introducotry Statement
    System.out.println("Welcome to Elkhorn we have fantastic attractions for anything that interests you");
    Attractions Attract = new Attractions();//connecting the files
    Comparing Compare = new Comparing(); //connecting more files
    Scanner scan = new Scanner(System.in);//Creates the scanner
    String location="";//Creates the variable location
    System.out.println("What city do you want to search for: Omaha, Lincoln, Fremont, or other");
    location = scan.nextLine();
    if(Compare.Cities(location)==false)
    {
    do{
    System.out.println("Sorry your selection was not recongnized please try again");
    System.out.println("What city do you want to search for: Omaha, Lincoln, Fremont, or other");
    location = scan.nextLine();
    }while(Compare.Cities(location)==false);//Repeating until a city is selected
    }
    Attract.enteredLocation(location);
    Attract.testCities();

    
  }
}

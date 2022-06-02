import java.util.Scanner;//To scan the entered information
class Main {//Main class
  public static void main(String[] args) {//main method, the first method ran
    Attractions Attract = new Attractions();//Allows the Attraction class methods to be called.
    Comparing Compare = new Comparing(); //Allows the Compare class methods to be called.
    HelpPage helpPg = new HelpPage();//Allows the helpPage class methods to be called
    Scanner scan = new Scanner(System.in);//Creates the scanner so entered information.

    //Variables Used
    String userEntry;//Stores the words entered by the user
    int attributeArrayLocation;//Used to entered the Users information in the right location.

    do{
      attributeArrayLocation=1;
      Attract.reset();//Resets everything for the next runthrough in case the user wants to run it multiple times.
    System.out.println("Welcome to Elkhorn, Nebraska, we can help you find fantastic attractions for anything that meet your needs in our lovely state.");//Introductory Statement
    System.out.println("Type in HELP at anytime to be sent to the help page.");//Explanation statment so the user knows where to get help if they are confused.
//City
    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
    if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
    { 
      do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViable(userEntry, "Omaha", "Lincoln", "Fremont", "Other")==false)//calls the test viable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other city string names. If the entered doesn't equal one of the cities it runs a do-while method until a city is located.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered information doesn't equal one of the options.
    System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//Prints out the possible attributes again, in this case for the city attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
         }
    }while(Compare.testViable(userEntry, "Omaha", "Lincoln", "Fremont", "Other")==false);//Repeating until the testViable method in the compare class returns as true.
    }
    Attract.enteredData(attributeArrayLocation ,userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for the city. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
   
//Inside or Outside
    System.out.println("Would you rather have the attraction be either: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
    if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you rather have the attraction be either: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
     }
    if(Compare.testViableShort (userEntry, "Inside", "Outside")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a inside/outside attribute is accepted.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered information doesn't equal one of the options.
    System.out.println("Please enter either: 'Inside', 'Outside'");//Prints out the possible attributes again, in this case for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page.
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you rather have the attraction be either: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    }while(Compare.testViableShort (userEntry, "Inside", "Outside")==false);//Repeating until a season is selected
    }
    Attract.enteredData(attributeArrayLocation ,userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for inside or outside. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
    
//Price Range
    System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
    if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    if(Compare.testViable(userEntry, "0-5", "6-10", "10-20", "20+")==false)//calls the testViable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other price ranges. If the entered doesn't equal one of the cities it runs a do-while method until a price range is accepted.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
    System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any");//Prints out the possible attributes again, in this case for the rating attribute.
   userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page.
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
     }
    }while(Compare.testViable(userEntry, "0-5", "6-10", "10-20", "20+")==false);//Repeating until a price range is selected
    }
    Attract.enteredData(attributeArrayLocation, userEntry); //Calls the enteredData method in the Attraction class and records the Users preference for the price range. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
   
 //handicap accessible
    System.out.println("Do you require handicap access, either: 'Yes' or 'No'");//Prints off the options for the handicap accessibility attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
    if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you require handicap access, either: 'Yes' or 'No'");//Prints off the options for the handicap accessibility attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    if(Compare.testViableShort (userEntry, "Yes", "No")==false) //calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a handicap access attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you require handicap accessibility? 'Yes' or 'No'");//Prints out the possible attributes again, in this case for the handicap attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you require handicap access, either: 'Yes' or 'No'");//Prints out the possible attributes again, in this case for the handicap attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until a proper preference is entered
    }
    Attract.enteredData(attributeArrayLocation ,userEntry); //Calls the enteredData methods in the Attraction class and records the Users preference for the handicap accessibility. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
   
//Public transportation 
    System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
       System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViableShort (userEntry, "Yes", "No")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a public transportaion attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you require public transportation? 'Yes' or 'No'");//Prints out the possible attributes again, in this case for the handicap accessibility attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
       System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViableShort (userEntry, "Yes", "No")==false);//repeats until a valid response is entered
    }
    Attract.enteredData(attributeArrayLocation, userEntry); //Calls the enteredData method in the Attraction class and records the Users preference for transportation. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 

 //Physical Activity
    System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViableShort(userEntry, "Yes", "No")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a inside/outside attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints out the possible attributes again, in this case for the physcial activity attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViableShort (userEntry, "Yes", "No")==false);//repeats until valid selection is entered
    }
    Attract.enteredData(attributeArrayLocation, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for physical activity. 
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
    
 //Rating
    System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
     userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable. 
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
         }
    if(Compare.testViable (userEntry, "1", "2", "3", "4")==false)//calls the testViable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other ratings. If the entered doesn't equal one of the cities it runs a do-while method until a rating is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3', or '4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings");//Prints out the possible attributes again, in this case for the rating attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
         }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViable (userEntry, "1", "2", "3", "4")==false);//repeats until valid rating preference is chosen
    }
    Attract.enteredData(attributeArrayLocation, userEntry); //Calls the enteredData method in the Attraction class and records the Users preference for the rating.
    attributeArrayLocation++;// Adds one to the attributeArrayLocation variable so the next entered attribute doesn't accidentally replace the old attribute in the attributes array in the Attraction class. 
   
//Programmers opinion
    System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
        }
    if(Compare.testViableShort(userEntry, "Yes", "No")==false) //if a valid response is not entered
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'"); //Prints out the possible attributes again, in this case for the programmers opinion attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP")) //If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
        }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
      }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until a valid choice is entered
    }
    Attract.enteredData(attributeArrayLocation, userEntry); //Calls the enteredData method in the Attraction class and records the Users preference for the programmers opinion. 

    //Change attributes
    
    System.out.println("These are your chosen attributes");//Informs the user what the next print out is about.
    Attract.printAttributes();//Prints out the selected attributes so its easy for the user to check
    System.out.println("Is there any attributes you'd like to change? 'Yes' or 'No'");//Prompts the user to change an attribute if desired.
   userEntry = scan.nextLine();//Records what is entered by the user. 
      if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Is there any attributes you'd like to change? 'Yes' or 'No'");//Prompts the user to change an attribute if desired.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
        }
if(Compare.testViableShort(userEntry, "Yes", "No")==false)//If the user has entered something other than 'Yes' or 'No' it starts the do-while loop.
{
  do{//Repeated runs until the user has entered either a 'Yes' or a 'No'.
    System.out.println("Sorry the entered word isn't 'Yes' or 'No'.\nThese are your attributes that have been selected.");//Prints out an explanation to the user that the entered information isn't correct.
    Attract.printAttributes();//Prints out the selected attributes so its easy for the user to check what they have already entered.
    System.out.println("Is there any attributes you'd like to change? 'Yes' or 'No'");//Prompts the user to change an attribute if desired.
   userEntry = scan.nextLine();//Records what is entered by the user. 
    if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Is there any attributes you'd like to change? 'Yes' or 'No'");//Prompts the user to change an attribute if desired.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));
        }
  }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//If the user has entered either 'Yes' or 'No' correctly it will leave the do-while loop.
}
  else if(userEntry.equals("Yes"))//Calls the testViableShort method from the comparing class to see whether or no the entered code
    {
    do{//Runs until the user decides there are no more attributes the user would like to change.
      System.out.println("Which option would you like to change?" +" 'City', 'Location', 'Price range', 'Handicap accessibility', 'Public transportation', 'Physical activity', 'Rating', 'Programmers opinion'");//Prompts the user to answer which attribute they would like to change.
     userEntry = scan.nextLine();//Records the user input.
      if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Which option would you like to change?" +" 'City', 'Location', 'Price range', 'Handicap accessibility', 'Public transportation', 'Physical activity', 'Rating', 'Programmers opinion'");//Prompts the user to answer which attribute they would like to change.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));
           }
      if((userEntry.equals("City"))&& ( userEntry.equals("Location")) && ( userEntry.equals("Price range"))&& ( userEntry.equals("Handicap accessibility"))&& ( userEntry.equals("Public transportation"))&& ( userEntry.equals("Physical activity"))&& ( userEntry.equals("Rating"))&& ( userEntry.equals("Programmers opinion"))) //Very long if statement that says if the user input doesn't equal one of the attribute titles then it will start a do-while statement.
        {
      do{//Do while loop that will run until the while statement returns true as one of the attribute titles is selected.
        System.out.println("Sorry there must've been a miss type or a spelling error because the entered word(s) doesn't match one of our options. Please try again.\nWhich option would you like to change?" +" 'City', 'Location', 'Price range', 'Handicap accessibility', 'Public transportation', 'Physical activity', 'Rating', 'Programmers opinion'");//The possible attribute titles.
       userEntry = scan.nextLine();//Records the users input.
         if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
    { 
      do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Which option would you like to change?" +" 'City', 'Location', 'Price range', 'Handicap access', 'Public transportation', 'Physical activity', 'Rating', 'Programmers opinion'");//The possible attribute titles.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while((userEntry.equals("City"))&& ( userEntry.equals("Location")) && ( userEntry.equals("Price range"))&& (userEntry.equals("Handicap accessibility"))&& ( userEntry.equals("Public transportation"))&& ( userEntry.equals("Physical activity"))&& ( userEntry.equals("Rating"))&& (userEntry.equals("Programmers opinion")));//Very long if statement that says if the user input doesn't equal one of the attribute titles then it will continue to run a do-while statement.
        }
      if(userEntry.equals("City"))//If the user wants to change the city.
      {//Repition of earlier code so the city can be changed
      System.out.println("What city do you want to change it too: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
    if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
    { 
      do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViable(userEntry, "Omaha", "Lincoln", "Fremont", "Other")==false)//calls the test viable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other city string names. If the entered doesn't equal one of the cities it runs a do-while method until a city is located.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered information doesn't equal one of the options.
    System.out.println("What city do you want to change it to: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//Prints out the possible attributes again, in this case for the city attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
       if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
    { 
      do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("What city do you want to search for: 'Omaha', 'Lincoln', 'Fremont', 'Other'");//The cities where the tourist attractions come from.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    }while(Compare.testViable(userEntry, "Omaha", "Lincoln", "Fremont", "Other")==false);//Repeating until the testViable method in the compare class returns as true.
    }
    Attract.enteredData(1,userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for the city. 
      }
      if(userEntry.equals("Location"))//If the user wants to change the location.
      {
         System.out.println("Would you rather have the attraction be: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
        if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you rather have the attraction be either: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
     }
    if(Compare.testViableShort(userEntry, "Inside", "Outside")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a inside/outside attribute is accepted.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered information doesn't equal one of the options.
    System.out.println("Please enter either: 'Inside', 'Outside'");//Prints out the possible attributes again, in this case for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable and replaces the old information.
      if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you rather have the attraction be either: 'Inside', 'Outside'");//Prints off the options for the inside/outside attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
       }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
     }
    }while(Compare.testViableShort(userEntry, "Inside", "Outside")==false);//Repeating until a season is selected
    }
    Attract.enteredData(2, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for inside or outside. 
      }
      if(userEntry.equals("Price range"))//If the user wants to change the price range.
      {
         System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
        if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    if(Compare.testViable(userEntry, "0-5", "6-10", "10-20", "20+")==false)//calls the testViable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other price ranges. If the entered doesn't equal one of the cities it runs a do-while method until a price range is accepted.
    {
    do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
    System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
    System.out.println("Please enter the price range per person, either : '0-5', '6-10' , '10-20', '20+', 'Any");//Prints out the possible attributes again, in this case for the rating attribute.
   userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
      if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Please enter the price range per person, either : '0-5', '6-10', '10-20', '20+', 'Any'");//Prints off the options for the price range attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    }while(Compare.testViable(userEntry, "0-5", "6-10", "10-20", "20+")==false);//Repeating until a price range is selected
    }
    Attract.enteredData(3,userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for the price range. 
      }
      if(userEntry.equals("Handicap accessibility"))//If the user wants to change the handicap access.
      {
        System.out.println("Do you require handicap accessibility, either: 'Yes' or 'No'");//Prints off the options for the handicap accessibility attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
        if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you require handicap access, either: 'Yes' or 'No'");//Prints off the options for the handicap accessibility attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
    if(Compare.testViableShort(userEntry, "Yes", "No")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a handicap access attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you require handicap accessibility? 'Yes' or 'No'");//Prints out the possible attributes again, in this case for the handicap attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you require handicap access, either: 'Yes' or 'No'");//Prints off the options for the handicap accessibility attribute.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
      }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until a proper preference is entered
    }
        
    Attract.enteredData(4, userEntry);//Calls the enteredData methods in the Attraction class and records the Users preference for the handicap accessibility. 
        }
      if (userEntry.equals("Public transportation"))//If the user wants to change the public transportation.
      {System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
       System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViableShort(userEntry, "Yes", "No")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a public transportaion attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you require public transportation? 'Yes' or 'No'");//Prints out the possible attributes again, in this case for the handicap accessibility attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
       System.out.println("Do you require public transportation 'Yes' or 'No'"); //Prints off the options for the public transportation attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until a valid response is entered
    }
    Attract.enteredData(5, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for transportation. }
        }
      if(userEntry.equals("Physical activity"))//If the user wants to change the Physical activity.
      { System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
         if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViableShort(userEntry, "Yes", "No")==false)//calls the testViableShort method in the compare class. Compares the information entered by the user in the variable  userEntry' to the acceptable attributes. If the entered doesn't equal one of the attributes it runs a do-while method until a inside/outside attribute is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints out the possible attributes again, in this case for the physcial activity attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
         if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Do you want some physical activity 'Yes', 'No'");//Prints off the options for the physcial activity attribute.
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until valid selection is entered
    }
    Attract.enteredData(6, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for physical activity. 
        }
      if (userEntry.equals("Rating"))//If the user wants to change the rating.
      {System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
         if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
        {
       do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
         }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
    if(Compare.testViable(userEntry, "1", "2", "3", "4")==false)//calls the testViable method in the compare class. Compares the information entered by the user in the variable  userEntry' to the other ratings. If the entered doesn't equal one of the cities it runs a do-while method until a rating is accepted.
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3', or '4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings");//Prints out the possible attributes again, in this case for the rating attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
         if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
          {
       do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Ratings of these places have been sorted into three categories, enter either a '1', '2', '3','4'\n1: ratings between 4-4.4\n2: ratings between 4.5 - 4.7\n3: ratings between 4.8 - 5.0\n4: Any ratings"); //Prints off the options for the rating attributesand explains how each number correlates
         userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
         }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
      }
      }while(Compare.testViable (userEntry, "1", "2", "3", "4")==false);//repeats until valid rating preference is chosen
    }
    Attract.enteredData(7, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for the rating.
        }
      if (userEntry.equals("Programmers opinion"))//If the user wants to change if the programmers opinion is valued.
      {
       System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
   userEntry = scan.nextLine();///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while (userEntry.equals("HELP"));//Continue to run if the user continues to have questions
        }
    if(Compare.testViableShort (userEntry, "Yes", "No")==false)//if a valid response is not entered
    {
      do{//Do while loop, so until the while statement equals true it will keep running the same code inside the loop, Testing if testViable is true.
        System.out.println("Sorry your selection was not recongnized please try again");//Prints out to alert the user that the entered infromation doesn't equal one of the options.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'"); //Prints out the possible attributes again, in this case for the programmers opinion attribute.
       userEntry = scan.nextLine(); ///stores the entered location from the console into the userEntry variable and replaces the old information.
        if (userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
        System.out.println("Would you prefer the programmers opinion? 'Yes' or 'No'");//Prints off the options for the programmers opinion attribute.
       userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
        }
      }while(Compare.testViableShort(userEntry, "Yes", "No")==false);//repeats until a valid choice is entered
    }
    Attract.enteredData(8, userEntry);//Calls the enteredData method in the Attraction class and records the Users preference for the programmers opinion. 
    }
       System.out.println("These are your chosen attributes");//Tells the user about the incoming information is their attributes selected
    Attract.printAttributes();//Prints out the attributes selected
    System.out.println("Is there any other attributes you'd like to change? 'Yes' or 'No'");//Asks the user if any other attributes want to be changed.
   userEntry = scan.nextLine();//Records the users entry
      if(userEntry.equals("HELP"))//If the user needs help it sends them to the help page
       {
         do{
        helpPg.helpPage();//Calls the help page method in the HelpPage class.
         System.out.println("Is there any other attributes you'd like to change? 'Yes' or 'No'");//Asks the user if any other attributes want to be changed.
   userEntry = scan.nextLine();//stores the entered location from the console into the userEntry variable.
           }while(userEntry.equals("HELP"));//Continue to run if the user continues to have questions
       }
      if(Compare.testViableShort(userEntry, "Yes", "No")==false)
      {
        do
          {
            System.out.println("Sorry we couldn't recongnize your entry");
            System.out.println("Is there any other attributes you'd like to change? 'Yes' or 'No'");//Asks the user if any other attributes want to be changed
   userEntry = scan.nextLine();//Records the users entry
          }while(Compare.testViableShort(userEntry, "Yes", "No")==false);
      }
        }while(Compare.testViableShort(userEntry, "Yes", "No")==true && (userEntry.equals("Yes")));//If the answer is Yes then it repeats, if No then kicks out
    }

    System.out.println("----------------------------");//Used to symbolize the seperation between the entered information and the location the program puts out.
    Attract.UltimatePrint(8);//Calls the UlimatePrint statement in the attraction class. Looks for the locations with the same 8 attributes or whatever number is inside the parantheses. 
      System.out.println("\nI hope you enjoyed our travel website. If you're interested in running the program again just simply type in the word 'Run'. Have a great day, we greatly appreciate you running our code.");
        userEntry = scan.nextLine();
      }while(userEntry.equals("Run"));
    scan.close();//Closes the scanner.
      
  }
}

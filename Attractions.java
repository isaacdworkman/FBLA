import java.util.Arrays;
public class Attractions
{
  //Giant 2D array with strings, first row is the name of the attraction and the following rows are the attributes
  //First is the name, then the city its in, then the rating out of ten
  // I don't feel like doing data entry, these are the locations though
   private String locationEntered ="";
  private String[][] AttractionOptions = {
    {"Henry Doorly Zoo and Aqaurium","Omaha"},
    {"Old Market", "Omaha"},
    { "Strategic Air and Space Museum", "Ashland"},
    {"Chimney Rock Historical Site","Morrill County"},
    { "Haymarket District", "Lincoln"},
    { "Scotts Bluff National Monument"},
    { "Golden Spike Tower", "North Platte"},
    {"Indian Cave State Park",  "Shubert"},
    {"Carhenge","Alliance"},
    {"Scenic Driving Tour of the Sandhills","Grand Island"},
    {" Ride the Cowboy Trail", "Omaha"},
    {"Archway", "GrandPlatte"},
    {"Sandhill Crane Migration","Gibbon"},              
    {"Durham Museum","Omaha"},
    {"First National's Spirit of Nebraksa's Wildreness and Pioneer Courage Park","Omaha"},
    {" Joslyn Art Museum","Omaha"},
    {"Performing Arts Center","Omaha"},
    {"Lauritzen Gardens" ,"Omaha"},
    {"Omaha Children's Museum","Omaha"},
    {"Bob Kerrey Pedrestrian Bridge","Omaha"},
    {"Saint Cecilia Cathedral","Omaha"},
    {"Lewis & Clark Landing","Omaha"},
    {"Trains at Kenefick Park","Omaha"},
    {"Freedom Park Navy Musuem", "Omaha"},
    {"Lee G. Simmons Conservation Park & Wildlife Safari","Omaha"},
    {"Mormon Trail Center","Omaha"},
    { " Malcolm X House Site","Omaha"},
    {"Tour the Capitol","Lincoln"},
    {"UNL State Museum", "Lincoln"},
    {"Memorial Stadium Game","Lincoln"},
    { "Sunken Gardens","Lincoln"},
    {"Musuem of American Speed","Lincoln"},
    { "Pioneers Park Nature","Lincoln"},
    {"Sheldon Musuem of Art", "Lincoln"},
    { "Lincolns Children's Zoo","Lincoln"},
    {" Lincolns Children Museum","Lincoln"},
    {"International Quilt Study Center & Musuem","Lincoln"},
    {"Governor's Residence","Lincoln"},
    {"National Roller Skating Museum","Lincoln"},
    {"Lester F. Larsen Tractor Test and Power Museum","Lincoln"},
    {"CourtHouse and Jail Rocks","West Camp Clarke"},
    { "Toadstool Geological Park","Harrison"},
    {"Chadron State Park","Chadron"},
    {"Agate Fossil Beds National Monument", "Whistle Creek"},
    {"Snake River Ralls", "Valentine"},
    {"Coyote Hills Regional Park","Fremont"},
    {"Mission Peak Regional Preserve","Fremont"},
    {"Central Park","Fremont"},
    {"Ardenwood Historical Farm","Fremont"},
    { "Quarry Lakes Regional Recreation Area","Fremont"},
    { "Niles Canyon Railway","Fremont"},
    {"Old Mission San Jose","Fremont"}
  };

  public String toString(String k)
  {
    return " "+k;
  }
  Comparing Compare = new Comparing();
 
   public void enteredLocation(String location)
  {
    locationEntered =location;
  }
  public String toString(String k)
  {
    return " "+k;
  }
  Comparing Compare = new Comparing();
 
  public void testCities()
  {
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByCity(AttractionOptions[row][1],locationEntered)==true)
        {
          System.out.println(AttractionOptions[row][0]);
        }
    }
}

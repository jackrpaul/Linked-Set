/**
 * This class creates a road network between cities within a state. Each city is connected by 
 * @author Jack
 *version 1.0
 */
import java.util.Arrays;

public class RoadNetwork extends java.lang.Object
	{
		private int size, numberOfCities;
		private String[]cities;
		private boolean [][]connected;
		public static final int DEFAULT_SIZE = 500;
		
		/**
		 * This constructor creates a RoadNetwork object with a maximum size of 500 cities.
		 */
		public RoadNetwork()
			{
				size = DEFAULT_SIZE;
				numberOfCities = 0;
				cities = new String[size];
				connected = new boolean[size][size];
			}
		
		/**
		 * This constructor creates a RoadNetwork object with a maximum size of maxSize cities.
		 * @param maxSize the maximum number of cities this RoadNetwork object can hold
		 */
		public RoadNetwork(int maxSize)
			{
				size = maxSize;
				numberOfCities = 0;
				cities = new String[size];
				connected = new boolean[size][size];
			}
		
		/**
		 * This method adds a city to the network.
		 * @param name the name of the city
		 * @return true if the city was successfully entered by completion of the method, and false if not.
		 */
		public boolean addCity(String name)
			{
			if(numberOfCities >= size)
				{
				return false;
				}
			else
				{
				cities[numberOfCities] = name;
				numberOfCities++;
				}
			return true;
			}
		
		/**
		 * This method determines whether or not two cities are connected directly via a chain of roads.
		 * @param city1 the name of the first city
		 * @param city2 the name of the second city
		 * @return true if the cities are connected through a chain of roads, and false if not.
		 */
		public boolean areConnected(String city1, String city2)
			{
			return true;
			}
		
		/**
		 * This method determines whether or not two cities are connected directly via a road.
		 * @param city1 the name of the first city
		 * @param city2 the name of the second city
		 * @return true if the cities are directly connected via a road, and false if not.
		 */
		public boolean areDirectlyConnected(String city1, String city2)
			{
			return true;
			}
		
		/**
		 * This method connects two specified cities in the network.
		 * @param city1 the first city
		 * @param city2 the second city
		 * @return true if the two cities were connected by completion of the method, and false if not.
		 */
		public boolean connect(String city1, String city2)
			{
			if(!containsCity(city1) || !containsCity(city2))
				{
				return false;
				}
			else
				{
				connected[getIndexOf(city1)][getIndexOf(city2)] = true;
				}
			return true;
			}
		
		/**
		 * This method determines if a city is in the network or not.
		 * @param city the name of the city
		 * @return true if the city is in the network, and false if not.
		 */
		public boolean containsCity(String city)
			{
			for(int i = 0; i < cities.length; i++)
				{
				if(cities[i].equals(city))
					{
					return true;
					}
				}
			return false;
			}
		
		/**
		 * This method removes city 1 from city 2's connected city list, and removes city 2 from city 1's directly connected list, if possible.
		 * @param city1 the first city
		 * @param city2 the second city
		 */
		public void disconnect(City city1, City city2)
			{
				if(containsCity(city1.getName()) && containsCity(city2.getName()))
					{
					City temp1 = city1.getConnectedCities()[getIndexOf(city2.getName())];
					City temp2 = city2.getConnectedCities()[getIndexOf(city1.getName())];
					city1.getConnectedCities()[getIndexOf(city2.getName())] = city1.getConnectedCities()[city1.getNumOfConnectedCities() - 1];
					//temp1 = 
					}
			}
		
		/**
		 * This method returns an array of cities in the network. The array is sorted by name.
		 * @return an array of all cities in the network, sorted by name. Returns an array of length 0 if there are no cities in the network.
		 */
		public String[] getCities()
			{
			Arrays.sort(cities);
			return cities;
			}
		
		/**
		 * This method gets a count of how many cities are in the network.
		 * @return the number of cities in the network
		 */
		public int getCityCount()
			{
			return numberOfCities;
			}
		
		/**
		 * This method returns an array of cities that it is connected to. The array is sorted by name.
		 * @param name the name of the city
		 * @return an array with the cities directly connected to the specified city. Returns an array of length 0 if the specified city is not directly connected to any others.
		 */
		public String[] getDirectlyConnectedCities(String name)
			{
			return null;
			}
		
		/**
		 * This method removes a specified city from the network.
		 * @param name The name of the city to be removed.
		 */
		public void removeCity(String name)
			{
			if(containsCity(name) && cities.length > 1)
				{
				City temp = cities[cities.length - 1];
				cities[cities.length - 1] = cities[getIndexOf(name)];
				cities[getIndexOf(name)] = temp;
				}
			cities[cities.length - 1] = null;
			}
		
		/**
		 * This method returns a newline-separated list of cities. The list includes a comma-separated list of each city's directly connected cities.
		 * @Override toString() in class java.lang.Object
		 * @return a list of cities, including a comma-separated list of each city's directly connected cities.
		 */
		public String toString()
			{
			return null;
			}
		
		/**
		 * This method finds the exact location of a particular city in the cities array.
		 * @param cityName The name of the city whose index is being located.
		 * @return the array index of the specific city.
		 */
		public int getIndexOf(String cityName)
			{
			int place = 0;
			boolean found = false;
			while(!found)
				{
				if(cities[place].equals(cityName))
					{
					found = true;
					}
				place++;
				}
			return place;
			}
	}

/**
 * This class creates a City object to be used further in the RoadNetwork class.
 * @author Jack Paul
 * @version 1.0
 */

public class City
	{
		private String name;
		private City[] connectedCities;
		private int networkSize, numOfConnectedCities;
		
		/**
		 * This method creates a City object with a designated name, list of connected cities, maximum network size, and number of connected cities, which is set at 0.
		 * @param n The name of the City.
		 * @param c The list of Cities that this City is connected to.
		 * @param ne The maximum size of the road network the City is being added to.
		 */
		public City(String n, int ne)
			{
			name = n;
			networkSize = ne;
			numOfConnectedCities = 0;
			connectedCities = new City[networkSize];
			}
		
		/**
		 * Finds the name of the City.
		 * @return the name of the City.
		 */
		public String getName()
			{
				return name;
			}
		
		/**
		 * Changes the name of the City to name.
		 * @param name the new name of the City
		 */
		private void setName(String name)
			{
				this.name = name;
			}
		
		/**
		 * Finds the list of Cities this City is connected to.
		 * @return the list of Cities this City is connected to.
		 */
		public City[] getConnectedCities()
			{
				return connectedCities;
			}
		
		/**
		 * Determines how many Cities this City is connected to.
		 * @return the integer number of Cities this City is connected to.
		 */
		public int getNumOfConnectedCities()
			{
				return numOfConnectedCities;
			}
		
		/**
		 * Changes the number of Cities this City is connected to into numOfConnectedCities
		 * @param numOfConnectedCities the new integer number of Cities that this City is connected to.
		 */
		public void setNumOfConnectedCities(int numOfConnectedCities)
			{
				this.numOfConnectedCities = numOfConnectedCities;
			}
	}

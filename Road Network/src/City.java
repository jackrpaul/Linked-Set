
public class City
	{
		private String name;
		private City[] connectedCities;
		private int networkSize, numOfConnectedCities;
		public City(String n, City[] c, int ne)
			{
			name = n;
			networkSize = ne;
			numOfConnectedCities = 0;
			connectedCities = new City[networkSize];
			}
		public String getName()
			{
				return name;
			}
		private void setName(String name)
			{
				this.name = name;
			}
		public City[] getConnectedCities()
			{
				return connectedCities;
			}
		private void setConnectedCities(City[] connectedCities)
			{
				this.connectedCities = connectedCities;
			}
		public int getNumOfConnectedCities()
			{
				return numOfConnectedCities;
			}
		public void setNumOfConnectedCities(int numOfConnectedCities)
			{
				this.numOfConnectedCities = numOfConnectedCities;
			}
	}

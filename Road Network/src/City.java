
public class City
	{
		private String name;
		private String[] connectedCities;
		private int networkSize, numOfConnectedCities;
		public City(String n, String[] c, int ne, int nu)
			{
			name = n;
			numOfConnectedCities = nu;
			networkSize = ne;
			connectedCities = new String[networkSize];
			}
		private String getName()
			{
				return name;
			}
		private void setName(String name)
			{
				this.name = name;
			}
		private String[] getConnectedCities()
			{
				return connectedCities;
			}
		private void setConnectedCities(String[] connectedCities)
			{
				this.connectedCities = connectedCities;
			}
		private int getNetworkSize()
			{
				return networkSize;
			}
		private void setNetworkSize(int networkSize)
			{
				this.networkSize = networkSize;
			}
		private int getNumOfConnectedCities()
			{
				return numOfConnectedCities;
			}
		private void setNumOfConnectedCities(int numOfConnectedCities)
			{
				this.numOfConnectedCities = numOfConnectedCities;
			}
	}


public class City
	{
		private String name;
		private String[] connectedCities;
		private int networkSize, numOfConnectedCities;
		public City(String n, String[] c, int ne)
			{
			name = n;
			networkSize = ne;
			connectedCities = new String[networkSize];
			}
		public String getName()
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
	}

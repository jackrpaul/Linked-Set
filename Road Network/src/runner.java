
public class runner
	{

		public static void main(String[] args)
			{
			RoadNetwork Colorado = new RoadNetwork();
			RoadNetwork Texas = new RoadNetwork(800);
			
			Colorado.addCity("Denver");
			Texas.addCity("Dallas");
			}

	}

import java.util.*;

public class runner
	{

		public static void main(String[] args)
			{
			RoadNetwork Colorado = new RoadNetwork();
			
			System.out.println(Colorado.addCity("Denver"));
			System.out.println(Colorado.containsCity("Denver"));
			
			Colorado.addCity("Littleton");
			Colorado.addCity("Golden");
			Colorado.addCity("Parker");
			Colorado.addCity("Lakewood");
			Colorado.addCity("Boulder");
			
			System.out.println(Colorado.connect("Denver", "Littleton"));
			System.out.println(Colorado.connect("Denver", "Parker"));
			System.out.println(Colorado.connect("Denver", "Lakewood"));
			
			System.out.println(Colorado.areDirectlyConnected("Denver", "Littleton"));
			System.out.println(Colorado.areDirectlyConnected("Denver", "Golden"));
			System.out.println(Colorado.getDirectlyConnectedCities("Denver"));
			
			Colorado.disconnect("Denver", "Littleton");
			System.out.println(Colorado.areDirectlyConnected("Denver", "Littleton"));
			
			System.out.println(Colorado.getCityCount());
			System.out.println(Colorado.getCities());
			
			Colorado.removeCity("Parker");
			System.out.println(Colorado.getCityCount());
			System.out.println(Colorado.containsCity("Parker"));
			
			
			System.out.println(Colorado.getCities());
			System.out.println(Colorado.getDirectlyConnectedCities("Denver"));
			//System.out.println(Colorado.toString());
			}

	}

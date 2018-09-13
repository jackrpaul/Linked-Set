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
			
			System.out.println(Colorado.connect("Denver", "Littleton"));
			System.out.println(Colorado.areDirectlyConnected("Denver", "Littleton"));
			System.out.println(Colorado.areDirectlyConnected("Denver", "Golden"));
			
			Colorado.disconnect("Denver", "Littleton");
			System.out.println(Colorado.areDirectlyConnected("Denver", "Littleton"));
			
			System.out.println(Colorado.getCityCount());
			System.out.println(Colorado.getCities());
			
			Colorado.removeCity("Golden");
			System.out.println(Colorado.getCityCount());
			System.out.println(Colorado.containsCity("Golden"));
			
			
			}

	}

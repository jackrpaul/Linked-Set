import java.util.*;

public class runner
	{

		public static void main(String[] args)
			{
			RoadNetwork Colorado = new RoadNetwork();
			
			System.out.println(Colorado.addCity("Denver"));
			System.out.println(Colorado.containsCity("Denver"));
			Colorado.addCity("Littleton");
			System.out.println(Colorado.connect("Denver", "Littleton"));
			System.out.println();
			}

	}

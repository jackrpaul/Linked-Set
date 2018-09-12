import java.util.*;

public class runner
	{

		public static void main(String[] args)
			{
			RoadNetwork Colorado = new RoadNetwork();
			City den = new City("Denver", 500);
			City col = new City("Fort Collins", 500);
			System.out.println(Colorado.connect(den, col));
			
			}

	}

import java.util.*;
public interface CarTreeInterface {
		//This method will search for all cars in this year
		public List<String> findCarsThisYear(int year);

		//This method will search for all cars of a specific make
		public List<String> findCarsThisMake(String make);
		
		//This method will restructure the entire tree by changing how the nodes are valued
		public void resort();
		
		//returns total revenue of the dealership from buying and selling cars
		public int getTotalRevenue();
}

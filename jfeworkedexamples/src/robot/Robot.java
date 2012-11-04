/**
 * 
 */
package robot;

/**
 * @author Martin Martin
 * Calculates quickest way to travel if you travel on a road at 5 kph and off road
 * at 2 kph if your target is 10 miles north and 3 miles east. The road runs north.
 */
public class Robot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double ROAD_SPEED = 5;
		final double OFF_ROAD_SPEED = 2;
		final double DISTANCE_NORTH = 10;
		final double DISTANCE_EAST = 3;
		double distanceOnRoad;
		double distanceOffRoad;
		double timeOnRoad;
		double timeOffRoad;
		double totalTime;
		double finalTotalTime = 0;
		double finalOnRoadTime = 0;
		double finalOffRoadTime = 0;
		double finalOnRoadDistance = 0;
		double finalOffRoadDistance = 0;
		double finalTotalDistance = 0;
		
		for (int i = 1; i <= 10; i++){
			distanceOnRoad = (double)i;
			distanceOffRoad = Math.sqrt(Math.pow(DISTANCE_NORTH - distanceOnRoad, 2) + Math.pow(DISTANCE_EAST, 2));
			
			timeOnRoad = distanceOnRoad / ROAD_SPEED;
			timeOffRoad = distanceOffRoad / OFF_ROAD_SPEED;
			totalTime = timeOnRoad + timeOffRoad;
			
			if (finalTotalTime > totalTime || finalTotalTime == 0) {
				finalTotalTime = totalTime;
				finalOnRoadTime = timeOnRoad;
				finalOffRoadTime = timeOffRoad;
				finalOnRoadDistance = distanceOnRoad;
				finalOffRoadDistance = distanceOffRoad;
				finalTotalDistance = distanceOnRoad + distanceOffRoad;
			}	
		}
		
		System.out.println("Time on road: " + finalOnRoadTime + " hours");
		System.out.println("Time off road " + finalOffRoadTime + " hours");
		System.out.println("Total time " + finalTotalTime + " hours");
		System.out.println("Distance on road " + finalOnRoadDistance  + " km");
		System.out.println("Distance off road " + finalOffRoadDistance  + " km");
		System.out.println("Total distance " +finalTotalDistance  + " km");

	}

}

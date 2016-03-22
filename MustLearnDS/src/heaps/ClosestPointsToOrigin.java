package heaps;

import java.awt.Point;
import java.util.Comparator;
import java.util.PriorityQueue;

class PointDist{
	int dist;
	Point point;
}

public class ClosestPointsToOrigin {

	public static void main(String[] args) {

		Point[] points = {new Point(-2, -4), new Point(0, 0), new Point(10, 15),
                new Point(5, 6), new Point(7, 8), new Point(-10, -30)};
		
        Point[] output = findKClosest(points,  2);
        for (int i=0; i<2; i++){
            System.out.println(output[i].toString());
        }
	}
	
	public static Point[] findKClosest(Point[] points, int k){
		PriorityQueue<PointDist> closest = new PriorityQueue<PointDist>(new Comparator<PointDist>() {

			@Override
			public int compare(PointDist o1, PointDist o2) {
				return o2.dist - o1.dist;
			}
		});
				

		for(Point point : points){
			int dist = (int) Math.sqrt(Math.pow((point.getX() - 5),2) +Math.pow((point.getY() -5),2));
			
			PointDist pointDist = new PointDist();
			pointDist.dist = dist;
			pointDist.point = point;
			
			closest.add(pointDist);
			
			if(closest.size() > k){
				closest.poll();
			}
		}

		Point[] results = new Point[closest.size()];
		for(int i = 0; i < results.length; i++){
			results[i] = closest.poll().point;
		}
		return results;
	}

}




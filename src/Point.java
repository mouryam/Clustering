/**
 * Created by Mourya on 3/20/2016.
 */
import java.util.ArrayList;

public class Point {

    private ArrayList<Double> points;
    private String type = "";
    private double distanceToCentroid = 0;

    public Point(ArrayList<Double> x, String type)
    {
        this.setPoints(x);
        this.setType(type);
        this.distanceToCentroid = 0;
    }

    public void setPoints(ArrayList<Double> x) {
        this.points = x;
    }

    public double getDistanceToCentroid(){
        return distanceToCentroid;
    }

    public void setDistanceToCentroid(double distanceToCentroid) {
        this.distanceToCentroid = distanceToCentroid;
    }

    public ArrayList<Double> getPoints()  {
        return this.points;
    }

    public void setType(String x) {
        this.type = x;
    }

    public String getType()  {
        return this.type;
    }

    /**
     * Calculates the distance between two points using Euclidean distance
     * @param p a given Point
     * @param centroid to compare with a given Centroid
     * @return distance between the Point and the Centroid
     */
    protected static double distance(Point p, Point centroid) {
        double sum = 0.0;
        for(int i=0;i<p.getPoints().size();i++) {
            sum += Math.pow( (p.getPoints().get(i) - centroid.getPoints().get(i)) , 2.0 );
        }
        return Math.sqrt(sum);
    }

    public String toString() {
        int i;
        String out ="[ ";
        for (i = 0; i<points.size(); i++){
            out += ""+points.get(i)+",";
        }
        out+="]";
        out+= " "+type+"";
        return out;
    }
}

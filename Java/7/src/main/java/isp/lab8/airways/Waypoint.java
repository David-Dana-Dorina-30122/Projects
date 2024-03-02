package isp.lab8.airways;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Example waypoint class which can be extended to be used in implementation of the exercise. Add constructor, getters, setters, etc.
 */
public class Waypoint implements Serializable {
    private int index;
    private String name;
    private double latitude;
    private double longitude;
    private int altitude;
    private List<Waypoint> waypoints = new ArrayList<>();
    public Waypoint(String name, double latitude, double longitude, int altitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }

    public void removeWaypoint(Waypoint waypoint) {
        waypoints.remove(waypoint);
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

}

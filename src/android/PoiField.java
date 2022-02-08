package $appid;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class PoiField implements Serializable {
    private String id;
    private String name;
    private String building;
    private String floor;
    private String bookingType;
    private int mapId;
    private double x;
    private double y;
    private boolean bookedByMe;

    public PoiField() {
    }

    public PoiField(String id, String name, String building, String floor, String bookingType, int mapId, double x, double y, boolean bookedByMe) {
        this.id = id;
        this.name = name;
        this.building = building;
        this.floor = floor;
        this.bookingType = bookingType;
        this.mapId = mapId;
        this.x = x;
        this.y = y;
        this.bookedByMe = bookedByMe;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBuilding() {
        return building;
    }

    public String getFloor() {
        return floor;
    }

    public String getBookingType() {
        return bookingType;
    }

    public int getMapId() {
        return mapId;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isBookedByMe() {
        return bookedByMe;
    }

    public static PoiField fromJson(JSONObject o) throws JSONException {
        String id = o.getString("id");
        String name = o.getString("name");
        String building = o.getString("building");
        String floor = o.getString("floor");
        String bookingType = o.getString("bookingType");
        Integer mapId = o.getInt("mapId");
        Double x = o.getDouble("x");
        Double y = o.getDouble("y");
        Boolean bookedByMe = o.getBoolean("bookedByMe");

        return new PoiField(id, name, building, floor, bookingType, mapId, x, y, bookedByMe);
    }
}

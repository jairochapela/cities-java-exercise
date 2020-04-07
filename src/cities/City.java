package cities;

public class City {
    public String name;
    public double lat;
    public double lng;
    public int population;

    public City(String name, double lat, double lng, int population) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + ", lat=" + lat + ", lng=" + lng + ", population=" + population + '}';
    }
}
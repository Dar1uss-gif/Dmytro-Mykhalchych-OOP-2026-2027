public class Truck {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinates = new byte[0];
    private boolean isLoaded;

    public void setValues(float speed, int weight, String color, byte[] coordinates, boolean isLoaded) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
        this.isLoaded = isLoaded;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + "\n";

        if(coordinates.length > 0) {
            String infoCoordinates = "Coordinates:\n";
            for (byte el : coordinates)
                infoCoordinates += el + "\n";
            info += infoCoordinates;
        }
        return info;
    }

    public Truck(float speed, int weight, String color, boolean isLoaded) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.isLoaded = isLoaded;
        System.out.println(getValues());
    }

    public void setLoaded(boolean isLoaded) { this.isLoaded = isLoaded; }

    public void getLoaded() {
        if(isLoaded)
            System.out.println("Truck is loaded");
        else
            System.out.println("Truck is NOT loaded");
    }

    @Override 
    public void moveObject() {
        System.out.println("Object is moving");
    }

}
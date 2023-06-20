package model.profile;

public class Location {
    private Float latitud;
    private Float longitud;

    public Location(Float latitud, Float longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Location() {
    }

    public Float getLatitud() {
        return latitud;
    }

    public void setLatitud(Float latitud) {
        this.latitud = latitud;
    }

    public Float getLongitud() {
        return longitud;
    }

    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "\nLocation{" +
                "\nlatitud=" + latitud +
                ", \nlongitud=" + longitud +
                '}';
    }
}

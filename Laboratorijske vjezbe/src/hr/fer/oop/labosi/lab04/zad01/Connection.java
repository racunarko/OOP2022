package hr.fer.oop.labosi.lab04.zad01;

class Connection {

    private String address;
    private float distance;

    public Connection(String address, float distance) {
        this.address=address;
        this.distance=distance;
    }

    public String getAddress() {
        return address;
    }

    public float getDistance() {
        return distance;
    }

}

class Car {
    private String carId; //unique
    private String brand;
    private String sponsor;
    private String driver;

    public Car(String carId, String brand, String sponsor, String driver) {
        this.carId = carId;
        this.brand = brand;
        this.sponsor = sponsor;
        this.driver = driver;
    }

    public String getcarId() {
        return carId;
    }

    public void setcarId(String carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void printCar() {
        System.out.println("Car Details:\n Car ID:" + carId + "\n Car Brand: " + brand + "\n Car Sponsor: " + sponsor
                + "\n Car Driver Name:  " + driver + "\n\n");
    }

}
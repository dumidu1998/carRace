class Car {
    private String uniqueId;
    private String brand;
    private String sponsor;
    private String driver;

    public Car(String uniqueId, String brand, String sponsor, String driver) {
        this.uniqueId = uniqueId;
        this.brand = brand;
        this.sponsor = sponsor;
        this.driver = driver;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
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

}
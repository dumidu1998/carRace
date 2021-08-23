class Results {
    private String place;
    private String roundNo;
    private String carId;

    public Results(String place, String roundNo, String carId) {
        this.place = place;
        this.roundNo = roundNo;
        this.carId = carId;
    }
    public String getplace() {
        return place;
    }

    public void setplace(String place) {
        this.place = place;
    }

    public String getroundNo() {
        return roundNo;
    }

    public void setroundNo(String roundNo) {
        this.roundNo = roundNo;
    }
    public String getcarId() {
        return carId;
    }

    public void setcarId(String carId) {
        this.carId = carId;
    }

    public void printResults() {
        System.out.println("Round results:\n Place:" + place + "\n Round Number: " + roundNo + "\n Car ID: " + carId
                + "\n\n");
    }
    
}

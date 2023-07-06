package aula04;

class Car2 {
    public String make;
    public String model;
    public int year;
    public int kms;

    public Car2(String make, String model, int year, int kms) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.kms = kms;
    }

    public void drive(int distance) {
        this.kms += distance;    
    }
}


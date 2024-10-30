public class Car {
    // Fields
    String model;
    int year;

    // Default Constructor
    public Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Car car1 = new Car();
        car1.displayInfo(); // Output: Model: Unknown, Year: 0

        // Using Parameterized Constructor
        Car car2 = new Car("Toyota", 2022);
        car2.displayInfo(); // Output: Model: Toyota, Year: 2022
    }
}

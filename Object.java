import java.io.*;

// Car class implementing Cloneable and Serializable for cloning and deserialization
public class Car implements Cloneable, Serializable {
    private String color;
    private int year;

    // Constructor
    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    // Display method to show car details
    public void display() {
        System.out.println("Car color: " + color + ", Year: " + year);
    }

    // Overriding the clone method to support cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CarCreationExample {

    public static void main(String[] args) {
        // 1. Using the 'new' keyword
        Car car1 = new Car("Red", 2020);
        System.out.print("Using 'new' keyword: ");
        car1.display();

        // 2. Using Reflection
        try {
            Class<?> carClass = Class.forName("Car");
            Car car2 = (Car) carClass.getDeclaredConstructor(String.class, int.class).newInstance("Blue", 2021);
            System.out.print("Using Reflection: ");
            car2.display();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. Using Cloning
        try {
            Car car3 = (Car) car1.clone();
            System.out.print("Using Cloning: ");
            car3.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 4. Using Deserialization
        // First, serialize car1 to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.dat"))) {
            oos.writeObject(car1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Now, read the object from the file (deserialize)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.dat"))) {
            Car car4 = (Car) ois.readObject();
            System.out.print("Using Deserialization: ");
            car4.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

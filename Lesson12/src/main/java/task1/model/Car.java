package task1.model;

import task1.service.CarIsNotStarException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private double maxSpeed;
    private double price;

    public void startCar() throws CarIsNotStarException {
        int number = (int) (Math.random() * 21);
        if (number % 2 == 0) {
            throw new CarIsNotStarException("Car");
        } else {

            {
                System.out.println("Car" + " " + getBrand() + " " + "started");
            }

        }
    }
}

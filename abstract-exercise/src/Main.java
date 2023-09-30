import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(Arrays.asList(
                new Snake(),
                new BigCat(),
                new Cat(),
                new Eagle(),
                new Domestic(),
                new BigCat(),
                new Snake(),
                new Eagle(),
                new Snake(),
                new BigCat()
        ));

        for (Animal animal : animals) {
            System.out.print(animal + ", ");
        }

        System.out.println();

        animals.removeIf(animal -> animal instanceof Snake);

        for (Animal animal : animals) {
            System.out.print(animal + ", ");
        }
    }
}
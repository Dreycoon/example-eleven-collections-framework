import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        HashMap<String, Car> carsMap = new HashMap<>();
//        String cashedCarUUID = " ";
//
//        for (int i = 0; i < 100; i++) {
//            Car car = new Car(i);
//            carsMap.put(car.uuid, car);
//            if (i == 27){
//                cashedCarUUID = car.uuid;
//
//            }
//
//        }
//
//        Car cashedCar = carsMap.get(cashedCarUUID);
//        System.out.println(cashedCar.id + " " + cashedCar.uuid);

        Integer id;
        TreeMap<Car, Car> carsTreeMap = new TreeMap<>(new CarComparator());

        for (int i = 0; i < 100; i++) {
            Car car = new Car(i);
            carsTreeMap.put(car, car);

        }

        carsTreeMap.forEach((key, value) -> {
            System.out.println(value.id);
        });




    }
}
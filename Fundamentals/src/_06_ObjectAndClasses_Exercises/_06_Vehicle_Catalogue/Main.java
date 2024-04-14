package _06_ObjectAndClasses_Exercises._06_Vehicle_Catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("End")){

            //"{typeOfVehicle} {model} {color} {horsepower}"
            String typeOfVehicle = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle,model,color,horsepower);

            vehicles.add(vehicle);

            input = scanner.nextLine();
        }


        input = scanner.nextLine();

        while(!input.equals("Close the Catalogue")){

            String model = input;

            for (Vehicle vehicle:vehicles) {

                if(model.equals(vehicle.getModelOfVehicle())){
                    System.out.println(vehicle);
                }

            }


            input = scanner.nextLine();
        }

        int cars = 0;
        int trucks = 0;
        int hpCars = 0;
        int hpTrucks = 0;

        for (Vehicle vehicle:vehicles) {

            if("car".equals(vehicle.getTypeOfVehicle())){
                cars++;
                hpCars += vehicle.getHorsepowerOfVehicle();

            }else{
                trucks++;
                hpTrucks += vehicle.getHorsepowerOfVehicle();
            }

        }

        double carsAvg = (double)hpCars / cars;
        double trucksAvg = (double) hpTrucks / trucks;

        if(cars == 0){
            carsAvg = 0;
        }

        if(trucks == 0){
            trucksAvg = 0;
        }


            System.out.printf("Cars have average horsepower of: %.2f.\n", carsAvg);



            System.out.printf("Trucks have average horsepower of: %.2f.\n", trucksAvg);





    }
}

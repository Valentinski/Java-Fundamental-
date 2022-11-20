package ObjectsAndClassesExercises.VehicleCatalogue;

import ObjectsAndClassesLab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        public Vehicle (String type, String model, String color, int horsepower){

            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;

        }
        public String getType (){
            return this.type;
        }
        public String getModel (){
            return this.model;
        }
        public String getColor(){
            return  this.color;
        }
        public int getHorsepower(){
            return this.horsepower;
        }



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> catalogList = new ArrayList<>();
        List<String> dataCars = new ArrayList<>();
        List<String> dataTrucks = new ArrayList<>();
        int cars = 0;
        int trucks = 0;
        int carsHp = 0;
        int trucksHp = 0;
        String command = scanner.nextLine();
        boolean isEnd = false;
        while (!command.equals("End")){
                String type = command.split(" ")[0];
                String model = command.split(" ")[1];
                String color= command.split(" ")[2];
                int horsePowerOfVehicle = Integer.parseInt(command.split(" ")[3]);


                Vehicle vehicle = new Vehicle(type, model, color, horsePowerOfVehicle);
                catalogList.add(vehicle);
                command = scanner.nextLine();
               if(command.equals("End")){
                isEnd = true;
                break;
                }
        }//The catalogue is done, we hava all type with cars in it.
        boolean isClosed = false;
        while (!command.equals("Close the Catalogue") && isEnd){
            String searchModel = command;

            for (Vehicle item : catalogList) {

                if (item.getModel().equals(searchModel)) {
                    System.out.printf("Type: %s%n",item.getType());
                    System.out.printf("Model: %s%n",item.getModel());
                    System.out.printf("Color: %s%n",item.getColor());
                    System.out.printf("Horsepower: %s%n",item.getHorsepower());
                }
            }
            command=scanner.nextLine();
            if(command.equals("Close the Catalogue")){
                isClosed = true;
                break;
            }
        }
        for (Vehicle type : catalogList) {
            if(type.getType().equals("car")){
                cars++;
                carsHp += type.getHorsepower();
            }else if(type.getType().equals("truck")) {
                trucks++;
                trucksHp += type.getHorsepower();
            }
        }
        double averageHpCars = carsHp *1.0 / cars;
        double averageHpTrucks = trucksHp *1.0 / trucks;
        if(isClosed){
            System.out.printf("Cars have average horsepower of: %.2f.%n",averageHpCars );
            System.out.printf("Trucks have average horsepower of: %.2f.%n", averageHpTrucks);

        }
    }
}

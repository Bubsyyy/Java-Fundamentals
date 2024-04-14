package _06_ObjectAndClasses_Exercises._07_Groomin_Salon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {


    private List<Pet> data ;
    private int capacity;


    public GroomingSalon(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Pet pet){

        if(data.size() < capacity) {
            data.add(pet);
        }
    }

    public boolean remove(String name){
        for (Pet pet:this.data) {

            if(name.equals(pet.getName())){

                this.data.remove(pet);
                return true;

            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public int getCount(){

        int count = this.data.size();
        return count;

    }

    public String getStatistics() {
        String statistics = "The grooming salon has the following clients:\n";
        for (Pet pet : this.data) {
            statistics += String.format("%s %s\n", pet.getName(), pet.getOwner());
        }
        return statistics;
    }


}

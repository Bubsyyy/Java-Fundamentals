package _06_ObjectAndClasses_Exercises._07_Groomin_Salon;

public class Pet {

    private String name;
    private int age;
    private String owner;

    public Pet (String name, int age, String owner) {

        this.name = name;
        this.age = age;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("%s %d - (%s)", this.name, this.age, this.owner);
    }
}

package HW1;

public class Task1 {

    private String name;
    private  int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        if (age >= 18) {
            return "Legal age";
        } else {
            return "Under 18";
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }




}

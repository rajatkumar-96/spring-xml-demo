package domain;

public class Actor {
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    String gender;
    int age;
    public void display(){
        System.out.println(name +" "+ gender+ " "+ age);
    }
}

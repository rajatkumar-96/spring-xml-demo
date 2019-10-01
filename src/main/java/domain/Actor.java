package domain;

public class Actor {


    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String name;
    String gender;
    int age;



    public void display(){
        System.out.println(name +" "+ gender+ " "+ age);
    }
}

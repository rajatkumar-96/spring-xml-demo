package domain;

public class Actor {



    String name;
    String gender;
    int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void display(){
        System.out.println(name +" "+ gender+ " "+ age);
    }
}

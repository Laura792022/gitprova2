package es.laura;

public class Person {


    private String name;
    private String surname;

    private int age;

    public Person() {
        this.name = "<UNKNOWN>";
        this.surname = "<UNKNOWN>";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }


}

package es.laura;

/**
 *
 */
public class Person {


    private String name;
    private String surname;
    private String indirizzo;

    private int age;

    public Person() {
        this.surname = "<UNKNOWN>";
        this.name = "<UNKNOWN>";
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

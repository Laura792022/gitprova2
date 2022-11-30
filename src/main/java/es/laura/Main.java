package es.laura;

public class Main {
    public static void main(String[] args) {
        System.out.println("cambio prova3");
        Person p = new Person();
        //p.setName("Luca");
        p.setSurname("Izquierdo");
        p.setName("Laura");

        System.out.println("   Name: "+p.getName());
        System.out.println("Surname: "+p.getSurname());

        System.out.println("il nome e' lungo "+p.getName().length() + " caratteri") ;
        System.out.println("The end");

    }

}
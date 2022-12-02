package es.laura;

public class Main {
    public static void main(String[] args) {
        System.out.println("[MASTER] cambio prova 3");
        System.out.println("[MASTER] dovrei essere qui");
        Person p = new Person();
        p.setSurname("Izquierdo");
        p.setName("Luca");

        System.out.println(">   Name: "+p.getName());
        System.out.println("> Surname: "+p.getSurname());

        System.out.println("il nome e' lungo "+p.getName().length() + " caratteri") ;
        System.out.println("The end");
        System.out.println(" dovrei essere qui");

        System.out.println("-------------------------------------------");

    }

}
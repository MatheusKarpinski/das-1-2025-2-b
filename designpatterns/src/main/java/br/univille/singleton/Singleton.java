package br.univille.singleton;

public class Singleton {
    //parece com uma variável global
    private static Singleton instance;
    private String segredo;

    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }

    //ngm pode instanciar a não ser ela mesma
    private Singleton() {
        System.out.println("Singleton: Contrutor"); 

    }
    public static Singleton getInstance() {
        System.out.println("Singleton: GetInstance");
        if (instance == null) {
            System.out.println("Singleton: NEW");
            instance = new Singleton();
        }
        return instance;
    }
}

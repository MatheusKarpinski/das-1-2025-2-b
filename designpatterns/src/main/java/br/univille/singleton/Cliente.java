package br.univille.singleton;

public class Cliente { 
    public static void main(String[] args) {
        var segredo = "Palmeira tem mundial";
        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredo);
        
        //mil milhões de anos depois...
        //várias e várias linhas de código depois
        System.out.println(
            Singleton.getInstance().getSegredo()
        );
    }

}

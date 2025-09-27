package br.univille.observer;

public class Cliente {
    public static void main (String args[]){
        //publicador
        var grupoFamilia = new Publisher();

        var zezinho = new ConcreteSubscriber();
        var mariazinha = new ConcreteSubscriber();
        var tia = new ConcreteSubscriber();

        //entrou no grupo da familia
        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(mariazinha);
        grupoFamilia.subscribe(tia);

        grupoFamilia.setMainState("BOM DIA");
        //botão enviar
        grupoFamilia.notifySubscribers();
    }
}

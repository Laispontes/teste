package Aula01PooJava;

public class Poo02criandoClasseObjeto {
    public static void main (String [] args){

        Caneta c1 = new Caneta(); // (c1) criei um objeto tipo caneta // estanciei uma classe
        c1.cor = "Azul";
        c1.ponta = 0.5f; // atributo porque não tem parenteses depois
        c1.tampar();
        c1.status(); // é um método porque tem parentes depois
        c1.rabiscar();

        Caneta c2 = new Caneta();//Criando segundo objeto
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}

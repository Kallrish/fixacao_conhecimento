/*
Pacote de exercícios para fixação de conhecimento absorvido
no curso de Java.
Esta classe testa o programa ao criar uma casa, as suas portas e
verifica se as portas estão abertas ou fechadas, bem como quantas
portas estão abertas no total.
*/

package classes;

/** Testa os métodos criados na classe Porta.*/
public class TestaProg {

  /** Roda o programa de teste.*/
  public static void main(String [] args) {
    //Instancia as portas da casa
    Casa casa1 = new Casa();
    casa1.porta1 = new Porta();
    casa1.porta2 = new Porta();
    casa1.porta3 = new Porta();

    //Testa os métodos referente a porta 1
    casa1.porta1.abre();
    casa1.porta1.fecha();
    casa1.porta1.pintaPorta("amarelo");
    casa1.porta1.pintaPorta("azul");
    casa1.porta1.pintaPorta("verde");
    casa1.porta1.alteraDimensao(20, 14, 7);
    casa1.porta1.estaAberta();

    //Testa os métodos referente a porta 2
    casa1.porta2.fecha();
    casa1.porta2.abre();
    casa1.porta2.pintaPorta("rosa");
    casa1.porta2.pintaPorta("lilás");
    casa1.porta2.pintaPorta("bege");
    casa1.porta2.estaAberta();

    //Testa os métodos referente a porta 3
    casa1.porta3.fecha();
    casa1.porta3.abre();
    casa1.porta3.pintaPorta("cinza");
    casa1.porta3.estaAberta();

    //Pinta a casa
    casa1.pintaCasa("Branco");

    //Verifica quantas portas estão abertas
    casa1.quantaPortasEstaoAbertas();
  }
}

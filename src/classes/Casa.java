/*
Pacote de exercícios para fixação de conhecimento absorvido
no curso de Java.
Este programa cria uma casa, pinta, coloca 3 portas na casa, abre e fecha
as mesmas e verifica quantas portas estão abertas.
Ele vai se vincular a classe Porta criada anteriormente.
*/

package classes;

/** Cria a classe Casa, seus atributos e métodos.*/
public class Casa {
  //cria as varíaveis necessárias para casa
  String cor;
  Porta porta1;
  Porta porta2;
  Porta porta3;

  /** Pinta a casa de uma cor.*/
  void pintaCasa(String cor1) {
    this.cor = cor1;
    System.out.println("A casa foi pintada de " + this.cor + ".\n");
  }

  /** Verifica quantas portas da Casa estão abertas.*/
  void quantaPortasEstaoAbertas() {
    int qtdAbertas = 0;
    if (this.porta1.estaAberta()) {
      qtdAbertas += 1;
    }
    if (this.porta2.estaAberta()) {
      qtdAbertas += 1;
    }
    if (this.porta3.estaAberta()) {
      qtdAbertas += 1;
    }
    System.out.println("Tem " + qtdAbertas +  " portas abertas na casa agora.");
  }
}

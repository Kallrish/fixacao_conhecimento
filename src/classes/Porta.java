/*
Pacote de exercícios para fixação de conhecimento absorvido
no curso de Java.
Este programa criar uma porta. Deve ser possível pintar a
porta, alterar as suas dimensões e verificar se ela está aberta.
*/

package classes;

/** Cria uma porta, seus atributos e métodos.*/
public class Porta {
  //cria as variáveis necessárias
  boolean estado = false;
  String cor = "Branca";
  double dimensaoX = 10;
  double dimensaoY = 10;
  double dimensaoZ = 4;

  /** Abre a porta.*/
  void abre() {
    this.estado = true;
    System.out.println("A porta foi aberta!");
  }

  /** Fecha a porta.*/
  void fecha() {
    this.estado = false;
    System.out.println("A porta foi fechada!");
  }

  /** Pinta a porta de uma cor.*/
  void pintaPorta(String cp) {

    this.cor = cp;
    System.out.println("A Porta foi pintada de " + this.cor + ".");
  }

  /** Altera as dimensões da porta.*/
  void alteraDimensao(double dx, double dy, double dz) {
    this.dimensaoX = dx;
    this.dimensaoY = dy;
    this.dimensaoZ = dz;

    System.out.println("As novas medidas da porta são: \n"
                     + "Comprimento: " + this.dimensaoX + " cm.\n"
                     + "Largura: " + this.dimensaoY + " cm.\n"
                     + "Profundidade: " + this.dimensaoZ + " cm.");
  }

  /** Verifica se a porta está aberta ou fechada.*/
  boolean estaAberta() {
    String estadoAgora;
    System.out.println("Verificando portas...");
    estadoAgora = this.estado ? "aberta" : "fechada";
    System.out.println("Porta " + estadoAgora + ".\n");
    return this.estado;
  }
}

/*
Pacote de exercícios para fixação de conhecimento absorvido
no curso de Java.
Exercício simples, onde uma pessoa é criada (nasce) e é possível
que ela faça aniversário e saber qual é a idade dela em algum
momento fora do aniversário.
Esta classe é usada para "rodar" o teste do programa.
*/

package aniversario;

/** Instancia a "Pessoa" e seu aniversário.*/
public class FazAniversario {

  /** Roda o programa de teste.*/
  public static void main(String [] args) {
    //Instancia Pessoa
    Pessoa pessoa1 = new Pessoa();

    //Testa os métodos criados na classe Pessoa
    pessoa1.nascePessoa();
    pessoa1.idadeAgora();
    pessoa1.fazAniversario();
    pessoa1.fazAniversario();
    pessoa1.fazAniversario();
    pessoa1.idadeAgora();
  }
}
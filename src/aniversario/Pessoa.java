/*
Pacote de exercícios para fixação de conhecimento absorvido
no curso de Java.
Exercício simples, onde uma pessoa é criada (nasce) e é possível
que ela faça aniversário e saber qual é a idade dela em algum
momento fora do aniversário.
*/

package aniversario;

/** Cria uma pessoa, sua idade e seus métodos*/
public class Pessoa {
  //Cria variáveis e sua inicialização
  private String pessoa = " ";
  private int idade = 1;

  /** Permite a "Pessoa" fazer aniversário e aumentar sua idade.*/
  public void fazAniversario() {
    //Incremento do aniversário
    this.idade += 1;
    System.out.println("Parabéns! " + this.pessoa
                     + "fez aniversário e agora tem "
                     + this.idade + " anos!\n");
  }

  /** Retorna a idade da "Pessoa".*/
  public void idadeAgora() {
    System.out.println("Neste momento, " + this.pessoa
                     + "tem " + this.idade + " anos.\n");
  }

  /** "Cria" uma nova "Pessoa".*/
  public void nascePessoa() {
    //Atribui nome a pessoa
    this.pessoa = "Renata";
    System.out.println("\nParabéns mamãe! Sua filha nasceu"
                     + "e seu nome é: " + this.pessoa + ".\n");
  }
}

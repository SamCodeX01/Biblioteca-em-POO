
import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {//INÍCIO DA CLASSE

//ATRIBUTOS
String nome;
String endereco;
String lista_livros;
String lista_membros;

//Instância de Classes
Livro livro = new Livro();

//CONSTRUTOR
//MÉTODOS
ArrayList listarLivros = new ArrayList<>();
Scanner sc = new Scanner(System.in);

public void adicionar_livro(){
    System.out.print("Digite o nome do livro a ser adicionado: ");
    String nn = sc.nextLine();
    livro.setTitulo(nn);
    listarLivros.add(nn);
    System.out.println("Livro Adicionado!\n");
}


public void remover_livro(){
    System.out.print("Digite o nome do livro a ser removido: ");
    String remov = sc.nextLine();
    listarLivros.remove(remov);
    System.out.println("Livro " + remov + "removido!");
}

public void consultar_livros(){
    if(listarLivros.isEmpty()){
        System.out.println("Estoque de livros vazio!");
    }
    else{
        System.out.println("Listando os Livros: ");
        for(Object c: listarLivros){
            System.out.println(c);
        }
    }
} 

public void emprestar_livro(){}
public void devolver_livro(){}

//MÉTODOS GETTERS
//MÉTODOS SETTERS

}

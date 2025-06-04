
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
Usuario usuario = new Usuario();

//CONSTRUTOR
//MÉTODOS
ArrayList cadastrarLivros = new ArrayList<>(); //cadastrar-consultar-remover
ArrayList emprestimoLivros = new ArrayList<>(); //emprestar-devolver-consultar
ArrayList cadastrarUsuario = new ArrayList<>(); //cadastrar-consultar-remover

Scanner sc = new Scanner(System.in);

//1) Cadastrar Livros: \n"
public void cadastrar_livro(){
    System.out.print("Nome do livro a ser cadastrado: ");
    String nn = sc.nextLine();
    livro.setTitulo(nn);


    cadastrarLivros.add(nn);
    System.out.println("Livro: " + nn + " Cadastrado!");
}

// 2) Emprestar Livros: 
public void emprestar_livro(){
    System.out.print("Nome do livro a ser emprestado: ");
    String livroEmp = sc.nextLine();   
    emprestimoLivros.add(livroEmp);
    livro.setAutor(livroEmp);
}

// 3) Devolver livros: 
public void devolver_livro(){}


// 4) Consultar Livros: 
public void consultar_livros(){
    if(cadastrarLivros.isEmpty()){
        System.out.println("Estoque de livros vazio!");
    }
    else{
        System.out.println("Listando os Livros: ");
        for(Object c: cadastrarLivros){
            System.out.println(c);
        }
    }
} 
// 6) Cadastrar Usuário: 
// 7)Consultar Usuários: 
// 8) Remover Usuários: 


// 5) Remover Livros: 
public void remover_livro(){
    System.out.print("Digite o nome do livro a ser removido: ");
    String remov = sc.nextLine();
    cadastrarLivros.remove(remov);
    System.out.println("Livro " + remov + "removido!");
}




//MÉTODOS GETTERS
//MÉTODOS SETTERS

}

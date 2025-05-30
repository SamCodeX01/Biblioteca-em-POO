
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.alunos
 */
public class Biblioteca {//INÍCIO DA CLASSE

//ATRIBUTOS
String nome;
String endereco;
String lista_livros;
String lista_membros;

//CONSTRUTOR
//MÉTODOS
ArrayList addLivros = new ArrayList<>();

public String adicionar_livro(String nome){
    addLivros.add(nome);
    return nome;
}
//MÉTODOS GETTERS
//MÉTODOS SETTERS





public void remover_livro(){}
public void emprestar_livro(){}
public void devolver_livro(){}
public void consultar_livros(){} 
       
}


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.alunos
 */
public class Biblioteca {  
ArrayList addLivros = new ArrayList<>();
String nome;
String endereco;
String lista_livros;
String lista_membros;

public String adicionar_livro(String nome){   
    
    addLivros.add(nome);
    return nome;
}





public void remover_livro(){}
public void emprestar_livro(){}
public void devolver_livro(){}
public void consultar_livros(){} 
       
}

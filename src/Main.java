
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        System.out.print("Cadastrar nome: ");
        String cadastroNome = sc.nextLine();
        
        biblioteca.adicionar_livro(cadastroNome);
        
        //biblioteca.adicionar_livro("Samuel");
        
        
        for( Object b : biblioteca.addLivros){
            System.out.println(b);
            
        }

    }
}

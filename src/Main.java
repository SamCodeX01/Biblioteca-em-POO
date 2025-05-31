import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblio = new Biblioteca();
    
    
    while(true){
    System.out.println(""
                + "1) Cadastrar Livros: \n"
                + "2) Consultar Livros: \n"
                + "3) Remover Livros \n"
                + "4) Sair\n");
    System.out.print("Escolha uma opção: ");
    int opcao = sc.nextInt();
        
    if(opcao == 4){
        break;
    }
            switch(opcao){
                case 1:
                   biblio.adicionar_livro();
                    break;
                case 2: 
                    biblio.consultar_livros();
                    System.out.println("\n");
                    break;
                case 3:
                    biblio.remover_livro();
            }
        }
        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblio = new Biblioteca();
    
    
    while(true){
    System.out.println(""
                + "1) Cadastrar Livros: \n"
                + "2) Emprestar Livros: \n"
                + "3) Devolver livros: \n"
                + "4) Consultar Livros: \n"
                + "5) Remover Livros: \n"
                + "6) Cadastrar Usuário: \n"
                + "7)Consultar Usuários: \n"
                + "8) Remover Usuários: \n"
                + "9) Sair\n");
    System.out.print("Escolha uma opção: ");
    int opcao = sc.nextInt();
        
    if(opcao == 9){
        break;
    }
            switch(opcao){
                case 1: //1) Cadastrar Livros:
                   biblio.cadastrar_livro();
                    break;
                case 2: //2) Emprestar Livros:
                    break;
                case 3: //3) Devolver livros:
                case 4: //4) Consultar Livros:    
                    biblio.consultar_livros();
                    System.out.println("\n");
                case 5: //5) Remover Livros:    
                    biblio.remover_livro();
            }
        }
        
    }
}

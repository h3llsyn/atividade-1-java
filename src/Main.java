import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        while (true){
            System.out.println("\nDigite uma opção:\n" +
                    "1 - Cadastrar nome\n" +
                    "2 - Listar nomes cadastrados\n" +
                    "3 - Atualizar um nome existente\n" +
                    "4 - Remover um nome\n" +
                    "5 - Sair do sistema");

            String opcao = sc.nextLine();

            if (opcao.equals("1")){
                System.out.println("Digite o nome desejado para ser cadastrado");
                String nome = sc.nextLine();
                listaNomes.add(nome);
                System.out.printf("O nome '%s' foi cadastrado com sucesso\n", nome);
            }

            else if (opcao.equals("2")){
                if (listaNomes.isEmpty()){
                    System.out.println("Nenhum nome cadastrado");
                }
                else {
                    System.out.println("Nomes cadastrados:");
                    for(String nomes : listaNomes){
                        System.out.println(nomes);
                    }
                }
            }

            else if (opcao.equals("3")){
                System.out.println("Qual nome você gostaria de editar?");
                for(String nomes : listaNomes){
                    System.out.println(nomes);
                }
                String opcaoNome = sc.nextLine();
                int nomeAntigo = listaNomes.indexOf(opcaoNome);

                while (nomeAntigo == -1){
                    System.out.println("Erro, por favor digite um nome válido");
                    opcaoNome = sc.nextLine();
                    nomeAntigo = listaNomes.indexOf(opcaoNome);
                }
                System.out.println("Digite o novo nome desejado:");
                String nomeNovo = sc.nextLine();
                listaNomes.set(nomeAntigo, nomeNovo);
                System.out.println("Nome atualizado com sucesso!");
            }

            else if (opcao.equals("4")){
                System.out.println("Qual nome você gostaria de remover?");
                for(String nomes : listaNomes){
                    System.out.println(nomes);
                }
                String opcaoNome = sc.nextLine();
                int nomeEscolhido = listaNomes.indexOf(opcaoNome);

                while(nomeEscolhido == -1){
                    System.out.println("Erro, por favor digite um nome válido");
                    opcaoNome = sc.nextLine();
                    nomeEscolhido = listaNomes.indexOf(opcaoNome);
                }
                listaNomes.remove(nomeEscolhido);
                System.out.printf("O nome '%s' foi removido com sucesso\n", opcaoNome);
            }

            else if (opcao.equals("5")){
                System.out.println("Obrigada por usar nosso programa :D");
                break;
            }

            else{
                System.out.println("Erro, por favor digite uma opção válida");
            }
        }
    }
}
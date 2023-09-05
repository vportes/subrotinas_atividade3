import java.util.Scanner;

public class atividade3 {

    static Scanner teclado = new Scanner(System.in);
    static String a[] = new String[20];
    static String nome[] = new String[20];
    static int indice=0;

    public static void inserir(){
        System.out.println("Informe o jogador:");
        a[indice] = teclado.nextLine();
        indice++;
    }

    public static void mostrar(){
        int m = 0, x, indnome=0;
        boolean achou;
        for (int i = 0; i< a.length; i++) {
            if (a[i] != null) {
                //avalia um nome
                x = 0;
                //verifica os nome iguais ao nome que está sendo avaliado
                for (int j = 0; j < a.length; j++) {
                    if (a[i].equals(a[j])) {
                        x++;
                    }
                }
                if (x > m){  //encontrou um novo artilheiro
                    for (indnome = 0; indnome < nome.length; indnome++){
                        nome[indnome] = "";
                    }
                    m= x;
                    nome[0] = a[i];
                    indnome = 1;
                }else{
                    if (x == m){ //o nome avaliado tem a mesma quantidade de gols
                        achou = false;
                        for (int indaux = 0; indaux < nome.length; indaux++){
                            if (nome[indaux].equals(a[i])){
                                achou = true; //verifica se já existe
                            }
                        }
                        if (achou == false){ //se não existe insere no vetor
                            nome[indnome] = a[i];
                            indnome++;
                        }
                    }
                }
            }
        }

        System.out.print("Artilheiro: ");
        for (int i = 0; i < nome.length; i++){
            if (!nome[i].equals("")){
                System.out.print(nome[i]+", ");
            }
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9){
            System.out.println("\n1 - Inserir");
            System.out.println("2 - Artilheiro");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    inserir();
                    break;
                case 2:
                    mostrar();
                    break;
                case 9:
                    System.out.println("Fim.");
                default:
                    System.out.println("Escolha inválida.");
            }
        }
    }
}

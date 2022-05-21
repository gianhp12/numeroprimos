import java.util.ArrayList;
import java.util.List;

public class principa {
    public static void main(String[] args) {

        // aqui coloquei esse teste que o exercicio pediu, informando o 7 como parametro para a funçao. Ele retorna true, porque é um numero primo.
        boolean teste = ehPrimo(7);
        System.out.println("Deveria ser true: " + teste);

        int lista[] = {1, 2, 3, 4, 5, 11, 12, 33, 1014};
        // aqui declarei uma lista, em cima está a declaração de um vetor, mas acho a lista mais pratica rsrs.
        List listaInformaSaoPrimos = new ArrayList();

       // Aqui é um laço de repetição para percorrer o vetor lista, pra gente testar os valores com a função e salvar na lista(listaInformaSaoPrimos) os numeros primos.
        for(int i = 0; i<= 8; i++){
            System.out.println(lista[i]);

            // Aqui estou pegando os valores da lista declarada acima e executando a função ehPrimo, que está ali em baixo, que testa pra ver se o número é primo ou não.(Ele só vai pegar os valores que entrar no laço "true".
         if(ehPrimo(lista[i])){
         listaInformaSaoPrimos.add(lista[i]);
         }
        }

        // Vai imprimir os números primos que a função salvou nessa lista//
        System.out.println("Dos números informados, esses são primos:" + listaInformaSaoPrimos);
    }

   public static boolean ehPrimo(int a){
        if(a % 2 != 0){
            return true;
        }else {
            return false;
        }
   }

        }



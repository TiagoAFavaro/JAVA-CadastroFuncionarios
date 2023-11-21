import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDeNumeros
{
    public static void main(String arg[])
    {
        Scanner teclado = new Scanner(System.in);
        int valor;
        String sai = "n";
        ArrayList<Integer> Numeros = new ArrayList<>();

        while (sai.equals("n") )
        {
            System.out.println("Digite a para adicionar um numero");
            System.out.println("Digite e para exibir um numero");
            System.out.println("Digite t para exibir todos os numero");
            System.out.println("Digite x para excluir um numero");
            System.out.println("Digite s para sair");
            System.out.print("Digite uma opção: ");
            sai = teclado.next();
            if (!sai.equals("s"))
            {
                if (sai.equals("a"))
                {
                    System.out.print("Digite o numero que deseja adicionar: ");
                    valor = teclado.nextInt();
                    Numeros.add(valor);
                }
                if (sai.equals("e"))
                {
                    System.out.print("Digite o indice do numero que deseja exibir: ");
                    valor = teclado.nextInt();
                    System.out.println("Valor gravado: " + Numeros.get(valor));
                }
                if (sai.equals("t"))
                {
                    for( int i : Numeros )
                    {
                        System.out.println(i);
                    }
                }
                if (sai.equals("x"))
                {
                    System.out.print("Digite o indice do numero que deseja excluir: ");
                    valor = teclado.nextInt();
                    Numeros.remove(valor);
                    System.out.println("Valor excluido: ");
                }
                sai = "n";
            }
        }
        
        System.out.println("Quantidade de numeros adicionados: " + Numeros.size());
   
    }    
}
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDeProfessores
{
    public static void main(String arg[])
    {
        Scanner teclado = new Scanner(System.in);
        int matricula, indice;
        float salario;
        String nome, curso;
        String sai = "n";
        ArrayList<Professores> ListaProfessores = new ArrayList<>();
        
        while (sai.equals("n") )
        {
            System.out.println("Digite a para adicionar um Professor");
            System.out.println("Digite e para exibir um Professor");
            System.out.println("Digite m para alterar o salario de um Professor");
            System.out.println("Digite l para exibir os dados dos professores");
            System.out.println("Digite s para sair");
            System.out.print("Digite uma opção: ");
            sai = teclado.next();
            if (!sai.equals("s"))
            {
                if (sai.equals("a"))
                {
                   System.out.print("Digite o número da matrícula:");
                   matricula = teclado.nextInt();
                   System.out.print("Digite o nome:");
                   nome = teclado.next();
                   System.out.print("Digite o salário:");
                   salario = teclado.nextFloat();
                   System.out.print("Digite o curso:");
                   curso = teclado.next();
                   ListaProfessores.add( new Professores(nome,matricula,salario,curso));
                }
               if (sai.equals("e"))
                {
                   System.out.print("Digite a matricula do Professor que deseja alterar o salario: ");
                    matricula = teclado.nextInt(); 
                    indice = ProcuraMatricula(matricula, ListaProfessores);
                    if (indice != -1)
                    {
                         System.out.println(ListaProfessores.get(indice));
                    }
                    else
                       System.out.println("Matricula não encontrada!");
                                      
                }
                if (sai.equals("m"))
                {
                    System.out.print("Digite a matricula do Professor que deseja alterar o salario: ");
                    matricula = teclado.nextInt(); 
                    indice = ProcuraMatricula(matricula, ListaProfessores);
                    if (indice != -1)
                    {
                        System.out.print("Digite o novo salário:");
                        salario = teclado.nextFloat();            
                        ListaProfessores.get(indice).setSalario(salario);
                    }
                    else
                       System.out.println("Matricula não encontrada!");
                    
                } 
                if (sai.equals("l"))
                {
                    System.out.println("Professores cadastrados:");
                    for( Professores prof : ListaProfessores)
                    {
                        System.out.print(prof.getMatricula() + " - ");
                        System.out.println(prof.getNome());
                    }
                }
                 sai = "n";
            }
        }
        
        
    }
    
    public static int ProcuraMatricula(int matr, ArrayList<Professores> ListaProf)
    {
        int indice = -1;
        for(int i = 0; i < ListaProf.size(); i++)
        {
          if (ListaProf.get(i).getMatricula() == matr)  
             indice = i;
        }
                
        return indice;
    }
}

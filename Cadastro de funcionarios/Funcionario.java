public class Funcionario
{
    private String nome;
    private int matricula;
    private float salario;
    
    Funcionario(String nome, int matricula, float salario)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }
        Funcionario()
    {
    
    }
    
    
    void setNome(String nome)
    {
        this.nome = nome;
    }
    void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }
    void setSalario(float salario)
    {
        this.salario = salario;
    }
    
    String getNome()
    {
        return nome;
    }
    int getMatricula()
    {
        return matricula;
    }
    float getSalario()
    {
        return salario;
    }
    public String toString()
    {
        String texto = "Matricula: " + matricula;
        texto += "\nNome: " + nome;
        texto += "\nSalario: " + salario;
        return texto;
    }
    
}

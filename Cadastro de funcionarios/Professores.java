public class Professores extends Funcionario
{
      private String curso;
      
      Professores(String nome, int matricula, float salario, String curso)
      {
        super(nome, matricula, salario);
        this.curso = curso;
      }
      Professores()
      {
       
      }
      
      void setCurso(String curso)
      {
          this.curso = curso;  
      }
      String getCurso()
      {
          return curso;  
      }
      public String toString()
      {
          String texto = super.toString();
          texto += "\nCurso: " + curso;
          return texto;
      }

}

package sobrecargasobreposicao;

public class Empregado {
    private String nome;
    private String setor;
    private double salario;

    public Empregado(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString(){
        
        return "Empregado: [Nome: " + this.nome + ", Setor: "+ this.setor + ",Salario: "+ this.salario+"]";
    }
    
    
}

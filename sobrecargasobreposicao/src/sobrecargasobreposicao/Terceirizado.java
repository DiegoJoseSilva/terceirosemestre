package sobrecargasobreposicao;

public class Terceirizado extends Empregado{
    
    private String empresaResponsavel;
    private double valorHoraExtra;
    public Terceirizado(String nome, String setor, double salario) {
        super(nome, setor, salario);
    }

    public Terceirizado(String empresaResponsavel, double valorHoraExtra, String nome, String setor, double salario) {
        super(nome, setor, salario);
        this.empresaResponsavel = empresaResponsavel;
        this.valorHoraExtra = valorHoraExtra;
    }
    

    public String getEmpresaResponsavel() {
        return empresaResponsavel;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }
    
    /*
    @Override
    public String mostrarInformacoes(){
        String aux = super.mostrarInformacoes();
        aux += "\nEmpresa: "+ this.empresaResponsavel + 
                "\nHora extra: " + this.valorHoraExtra;
        return aux;
    }
    */
    
    @Override
    public String toString (){
        return super.toString() + "\nTerceirizado: [Empresa: " + this.empresaResponsavel + ", Hora Extra: "+ this.valorHoraExtra + "]"; 
        
    }
}

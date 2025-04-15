package exercicio.pkg10.pkg04;

public class Panela extends Utensilios {
    
    private String tipoTampa;
    private double capacidadeLitros;

    public Panela(String tipoTampa, double capacidadeLitros, String nome, String material, String tamanho) {
        super(nome, material, tamanho);
        this.tipoTampa = tipoTampa;
        this.capacidadeLitros = capacidadeLitros;
    }
    
    public Panela (String nome, String material, String tamanho){
        super (nome, material, tamanho);
    }
    
    public String getTipoTampa() {
        return tipoTampa;
    }

    public double getCapacidadeLitros() {
        return capacidadeLitros;
    }
    
    public void imprimePanela (){
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Tipo de tampa: " + getTipoTampa());
        System.out.println("Capacidade de litros: " + getCapacidadeLitros());
    }
    
    
    
    
    
}

package exercicio.pkg10.pkg04;

public class Eletrodomestico extends Utensilios{
    private int potencia;
    private boolean temTimer;
    private String aux;

    public Eletrodomestico (String nome, String material, String tamanho){
        super (nome, material, tamanho);
    }
    
    public Eletrodomestico(int potencia, boolean temTimer, String nome, String material, String tamanho) {
        super(nome, material, tamanho);
        this.potencia = potencia;
        this.temTimer = temTimer;
        if (temTimer == true){
            aux = "Tem timer";
        }else{
            aux= "nao tem timer";
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isTemTimer() {
        return temTimer;
    }
    
     public String getAux() {
        return aux;
    }
    
    public void imprimeEletro (){
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Potencia: " + getPotencia ());
        System.out.println("Op Timer: " + getAux ());
    }   
}

package exercicio.pkg10.pkg04;

public class Utensilios {
    private String nome;
    private String material;
    private String tamanho;
    
    public Utensilios (String nome, String material, String tamanho){
        this.nome = nome;
        this.material = material;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public String getTamanho() {
        return tamanho;
    }
    
    public void imprime (){
        System.out.println("Nome: " + getNome());
        System.out.println("Material: "+ getMaterial());
        System.out.println("Tamanho: " + getTamanho ());
    }
    
}

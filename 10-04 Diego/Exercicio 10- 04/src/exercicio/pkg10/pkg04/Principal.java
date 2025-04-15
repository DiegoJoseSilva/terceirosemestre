package exercicio.pkg10.pkg04;

public class Principal {

    public static void main(String[] args) {
        
        Utensilios u1 = new Utensilios ("Liquidificador", "Plastico", "2x1");
        u1.imprime();
        
        Panela p1 = new Panela ("Vidro transparente", 5.00, "Tramontina", "Aco", "30 centimetros");
        p1.imprimePanela();
        
        Eletrodomestico tv = new Eletrodomestico (1200 ,false, "Sansung", "Inox", "42 polegadas");
        tv.imprimeEletro();
    }
    
}

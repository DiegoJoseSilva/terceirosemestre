package sobrecargasobreposicao;

public class Principal {

    public static void main(String[] args) {
        Calcular soma1 = new Calcular ();
        soma1.somar(10, 5);
        
        Calcular soma2 = new Calcular ();
        soma2.somar(10,5,2);
        
        Calcular soma3 = new Calcular ();
        soma3.somar(1.5, 2.5);
        
        Empregado joao = new Empregado ("Joao", "TI", 800.00);
        //System.out.println("Empregado: \n" + joao.mostrarInformacoes());
        
        Terceirizado maria = new Terceirizado ("Patos Tur",120.00, "Maria", "Turismo", 900.00);
        //System.out.println("Terceirizado: \n" + maria.mostrarInformacoes());
        System.out.println("Terceirizado: \n" + maria.toString());

        
    }   
}

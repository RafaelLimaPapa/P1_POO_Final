import java.util.*;
public class Cacador extends Personagem {

    @Override
    public void realizarAcaoAleatoria() {
        Random gerador = new Random();
        int oQueFazer = gerador.nextInt(1, 4); 
        int escolherItem = gerador.nextInt(1, 6);

        switch (oQueFazer) {
            case 1:{
            cacar(escolherItem);
            break;
            }
            case 2:{
                comer(); 
                break;
            }            
            case 3:{ 
                dormir(); 
                break;
            }
    
        }
    }
    public Cacador(String nome) {
        super(nome, 10, 0, 0);
    }
}

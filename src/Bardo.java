import java.util.*;
public class Bardo extends Personagem {

    public Bardo(String nome, int energia, int fome, int sono) {
        super(nome, energia, fome, sono);
        getRepertorio().add(new Musica("Trovejou na Roca"));
    }
    @Override
    public void realizarAcaoAleatoria() {
        var gerador = new Random();
        var oQueFazer = gerador.nextInt(1,6); 
        var escolherItem = gerador.nextInt(1, 6);
        switch (oQueFazer) {
            case 1:{
                cacar(escolherItem);
                break;
            }
            case 2:{
                comer();
                break;
            }
            case 3,4,5:{
                dormir();
                break;                        
            }
        }
    }    
}

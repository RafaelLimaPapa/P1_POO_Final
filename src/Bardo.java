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
    @Override
    public void duelar(Personagem adversario){
        if (getRepertorio().size() == 0){
            System.out.println(getNome() +" nao tem musicas, impossivel duelar");
            System.out.println("**********************");
            return;
        }
        System.out.println(getNome() +" iniciou um duelo de musicas");

        var gerador = new Random();
        var sorteio = gerador.nextInt(getRepertorio().size());
        Musica mDuelo = getRepertorio().get(sorteio);
        if(adversario.getRepertorio().contains(mDuelo)){
            setEnergia(getEnergia() - 1);
            adversario.setEnergia(adversario.getEnergia() - 1);
            System.out.println("Ambos conheciam a musica");
            System.out.println("**********************");
        }
        else{
            adversario.setEnergia(adversario.getEnergia() - 1);
            adversario.getRepertorio().add(mDuelo);
            System.out.println(getNome() +" Venceu o duelo");
            System.out.println(adversario.getNome() +" Aprendeu a musica");
            System.out.println("**********************");
        }
    }
}

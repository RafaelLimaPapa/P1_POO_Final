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
    @Override
    public void duelar(Personagem adversario){
        if (getMochila().size() == 0){
            System.out.println(getNome() +" nao tem itens, impossivel duelar");
            System.out.println("**********************");
            return;
        }
        System.out.println(getNome() +" iniciou um duelo de itens");

        var gerador = new Random();
        var sorteio = gerador.nextInt(getMochila().size());
        String iDuelo = getMochila().get(sorteio);
        if(adversario.getMochila().contains(iDuelo)){
            setEnergia(getEnergia() - 1);
            adversario.setEnergia(adversario.getEnergia() - 1);
            System.out.println("Ambos possuiam o item");
            System.out.println("**********************");
        }
        else{
            getMochila().remove(sorteio);
            adversario.setEnergia(adversario.getEnergia() - 1);
            adversario.getMochila().add(iDuelo);
            System.out.println(getNome() +" Venceu o duelo");
            System.out.println(adversario.getNome() +" Ganhou o item");
            System.out.println("**********************");
        }
    }

    public Cacador(String nome) {
        super(nome, 10, 0, 0);
    }
}

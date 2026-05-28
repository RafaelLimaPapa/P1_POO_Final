import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Jogo {

    public static void main(String[] args) throws Exception {
        List<Musica> repertorio = new ArrayList<>();
        repertorio.add(new Musica("Billie Jean"));
        repertorio.add(new Musica("They Don't Care About Us"));
        repertorio.add(new Musica("Thriller"));
        repertorio.add(new Musica("Beat it"));
        repertorio.add(new Musica("Smooth Criminal"));
        repertorio.add(new Musica("We Are The World"));
        repertorio.add(new Musica("Heal The World"));
        repertorio.add(new Musica("Bad"));
        repertorio.add(new Musica("Love Never Felt So Good"));
        repertorio.add(new Musica("You Are Not Alone"));
        
        var gerador = new Random();
        var p1 = new Cacador("Jeferson");
        var p2 = new Bardo("Tico Trovador",3,8,8);
while (p1.estaVivo() || p2.estaVivo()) {
            System.out.println("\n");
            System.out.println("**********************");
            
            if(p1.estaVivo()){
                p1.realizarAcaoAleatoria();
            }else{
                System.out.println(p1.getNome() +" esta morto");
                System.out.println("**********************");
                System.out.println(p2.getNome() + " VENCEU O JOGO");
                System.out.println("**********************");
            }

            System.out.println(p1);
            System.out.println(p1.getMochila());
            System.out.println(p1.getRepertorio());
            System.out.println("**********************");

            if(p2.estaVivo()){
                p2.realizarAcaoAleatoria();
                p2.aprenderMusica((ArrayList<Musica>)repertorio);
            }else{
                System.out.println(p2.getNome() +" esta morto");
                System.out.println("**********************");
                System.out.println(p1.getNome() + " VENCEU O JOGO");
                System.out.println("**********************");
            }
            System.out.println(p2);
            System.out.println(p2.getMochila());
            System.out.println(p2.getRepertorio());
            System.out.println("**********************");

            
            if(p1.estaVivo() && p2.estaVivo()){
                var quemComeca = gerador.nextInt(1, 3);
                if(quemComeca == 1){
                    p1.duelo(p2);
                }
                else{
                    p2.duelo(p1);
                }
            }
            Thread.sleep(5000);
        }
        System.out.println();
        System.out.println("\n======FIM DE JOGO======");
        System.out.println("\n====RELATORIO FINAL====\n");
        System.out.println("Jogador " + p1.getNome());
        System.out.println("\nMochila de Itens:");
        System.out.println(p1.getMochila());
        System.out.println("\nMusicas no Repertorio:");
        System.out.println(p1.getRepertorio());
        System.out.println("\nJogador " + p2.getNome());
        System.out.println("\nMochila de Itens:");
        System.out.println(p2.getMochila());
        System.out.println("\nMusicas no Repertorio:");
        System.out.println(p2.getRepertorio());
    }
}
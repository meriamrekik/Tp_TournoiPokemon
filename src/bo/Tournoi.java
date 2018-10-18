package bo;
import java.util.ArrayList;
import java.util.Random;


public class Tournoi {
    private ArrayList<Pokemon> allPokemon;
    public Tournoi(){
        this.allPokemon=new ArrayList <>();
    }

    CriPokemon cripika = new CriPokemon("pikatchouu","pika pika","pika ready");
    Pokemon p1 = new Pokemon("pikatchou",120,150,"electric",cripika);

    CriPokemon criflam = new CriPokemon("flamiouu","flam flam","flamiou ready");
    Pokemon p2 = new Pokemon("flamiou",130,150,"fire",criflam);

    CriPokemon criotaq = new CriPokemon("otaquiin","ota ota","otaquin ready");
    Pokemon p3 = new Pokemon("otaquin",110,200,"whater",criotaq);

    CriPokemon crikata = new CriPokemon("katagamii","kata kata","katagami ready");
    Pokemon p4 = new Pokemon("katagami",120,150,"Plant",crikata);

    CriPokemon crimous = new CriPokemon("mouscotoo","mous ko","mouscoto ready");
    Pokemon p5 = new Pokemon("mouscoto",200,150,"insect",crimous);

    CriPokemon crilou = new CriPokemon("louuugarooc","louuu","lougaroc ready");
    Pokemon p6 = new Pokemon("lougaroc",250,190,"roch",crilou);

    public void addPokemon(){
        allPokemon.add(p1);
        allPokemon.add(p2);
        allPokemon.add(p3);
        allPokemon.add(p4);
        allPokemon.add(p5);
        allPokemon.add(p6);
        return ;
    }


    public void goBattel(){

        while (allPokemon.size()>1){
            Random r =new Random();
            int randomPayload = this.allPokemon.size();
            Pokemon m1=this.allPokemon.get(r.nextInt(randomPayload));
            Pokemon m2=this.allPokemon.get(r.nextInt(randomPayload));

            System.out.println(m1.getName() + " VS " + m2.getName());
            System.out.println(m1.getCri().criC + " \n" + m2.getCri().criC);

            Combat C1 = new Combat(m1,m2);
            Pokemon winner = C1.battle();
            System.out.println("the winner is "+winner.getName() + "\n");
            if (m1.getHealth()>1){

            allPokemon.remove(m2);
            }
            else{
                allPokemon.remove(m1);
            }
        }
    }


}

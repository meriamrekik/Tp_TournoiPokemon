package bo;

public class Pokemon {
    private String name;
    private int health;
    private int power;
    private CriPokemon cri;


    /**
     * Constructs the pokemon
     *
     *    name is the name of the pokemon
     *    health is an integer >= 1 but <= to 300
     *    power is and integer >= 1 but <= to 300
     *
     */
    public Pokemon(String name,int health, int power,String typeP,CriPokemon cri){
        assert health >= 1;
        assert health <= 300;
        assert power >= 1;
        assert power <= 300;

        this.name=name;
        this.health=health;
        this.power=power;
        this.cri=cri;




    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getPower(){
        return this.power;
    }

    public CriPokemon getCri(){
        return this.cri;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void setCri(CriPokemon cri) {
        this.cri = cri;
    }
}

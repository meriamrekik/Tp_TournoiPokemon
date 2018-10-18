package bo;

public class Combat {
    public Pokemon pokemon1;
    public Pokemon pokemon2;


    public Combat(Pokemon pokemon1, Pokemon pokemon2){
        this.pokemon1=pokemon1;
        this.pokemon2=pokemon2;
    }

   public Pokemon battle(){
        do{
            System.out.println(pokemon1.getName()+" begins the fight against "+pokemon2.getName());
            pokemon2.setHealth(pokemon2.getHealth() - pokemon1.getPower());

            System.out.println(pokemon1.getName() +" does "+ pokemon1.getPower() +" damage to "+
                    pokemon2.getName() +" and "+ pokemon2.getName() +" has "+ pokemon2.getHealth() +" left.");

            pokemon1.setHealth(pokemon1.getHealth() - pokemon2.getPower());

            System.out.println(pokemon2.getName() +" does "+ pokemon2.getPower() +" damage to "+
                    pokemon1.getName() +" and "+ pokemon1.getName() +" has "+ pokemon1.getHealth() +" left.");

        }
        while(pokemon1.getHealth() >= 1 || pokemon2.getHealth() >= 1);
       if (pokemon1.getHealth() >= 1) {
           System.out.println(pokemon2.getName() +" has lost the fight "+pokemon2.getCri().criP +pokemon1.getName()+"has win the fight "+pokemon1.getCri().criV);
           return pokemon1;

       }
       else {
           System.out.println(pokemon1.getName() +" has lost the fight "+pokemon1.getCri().criP +pokemon2.getName()+" has win the fight "+pokemon2.getCri().criV);
           return pokemon2;
       }


   }

}

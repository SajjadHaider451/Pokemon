public class PokemonsBattles{
    public static void main(String[] args) {

        Pikachu pikachu = new Pikachu();
        Chimchar chimchar = new Chimchar();
        Gible gible = new Gible();
        Totodile totodile = new Totodile();

        /*System.out.println("BATTLE MUSIC INTENSIFIES!!!!");

        while(pikachu.getHp() > 0 && chimchar.getHp() > 0){
            System.out.println("Pikachu attacks Chimchar");
            pikachu.thunderbolt(chimchar);
            if(chimchar.getHp() > 0){
                System.out.println("Chimchar attacks Pikachu ");
                chimchar.ember(pikachu);   
            }
            System.out.println("Chimchar's hp: " + chimchar.getHp());
            System.out.println("Pikachu's hp: " + pikachu.getHp());
            System.out.println("");
        }

        if(pikachu.getHp() <= 0){
            System.out.println("Chimchar won aginst Pikachu");
        } else {
            System.out.println("Pikachu won against Chimchar");
        }
        
        System.out.println("");
        System.out.println("ANOTHER BATTLE COMMENCES!!!!");

        while(gible.getHp() > 0 && totodile.getHp() > 0){
            System.out.println("Gible attack Totodile");
            gible.dragonBreath(totodile);
            if(totodile.getHp() > 0){
                System.out.println("Totodile attack Gible");
                totodile.aquaTail(gible);
            }
            System.out.println("Gible's hp: " + gible.getHp());
            System.out.println("Totodile's hp: " + totodile.getHp());
            System.out.println("");
        }

        if(gible.getHp() <= 0){
            System.out.println("Totodile won against Gible");
        } else{
            System.out.println("Gible won against Totodile");
        } */
        //System.out.println(pikachu.compareTo(totodile));
        
        if(pikachu.compareTo(chimchar) == 1){
            System.out.println("Pikachu is faster than Chimchar");
        } else if (pikachu.compareTo(chimchar) == 0) {
            System.out.println("Pikachu and Chimchar have the same speed");
        } else{
            System.out.println("Chimchar is faster than Pikachu");
        }
    }
}

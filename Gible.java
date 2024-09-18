public class Gible extends Pokemon{

    public Gible(){
        super(58, 70, 45, 42, 40, 45);
    }

    public Gible(int inputHp, int inputAttack, int inputDefense, int inputSpeed, int inputSpDef, int inputSpAtk){
        super(inputHp, inputAttack, inputDefense, inputSpeed, inputSpDef, inputSpAtk);
    }

    public void scratch(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void dragonBreath(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void Bite(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void dragonClaw(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }

    
}

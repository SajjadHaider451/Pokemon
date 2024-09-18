public class Chimchar extends Pokemon {
    
    public Chimchar(){
        super(44, 58, 44, 61, 58, 44);
    }

    public Chimchar(int inputHp, int inputAttack, int inputDefense, int inputSpeed, int inputSpDef, int inputSpAtk){
        super(inputHp, inputAttack, inputDefense, inputSpeed, inputSpDef, inputSpAtk);
    }

    public void flamethrower(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void flameWheel(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void ember(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void scratch(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }

    
}

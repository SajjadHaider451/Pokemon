public class Totodile extends Pokemon{

    public Totodile(){
        super(50, 65, 64, 43, 44, 48);
    }

    public Totodile(int inputHp, int inputAttack, int inputDefense, int inputSpeed, int inputSpDef, int inputSpAtk){
        super(inputHp, inputAttack, inputDefense, inputSpeed, inputSpDef, inputSpAtk);
    }

    public void waterGun(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void iceFang(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void crunch(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
    public void aquaTail(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
    }
}
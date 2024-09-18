public class Pikachu extends Pokemon{

    //This extends keyword allows for inhheritannce.
    //What is inhheritance? share the public interface of your super class.
    //This allows for a subclass super class relationship. 

     public Pikachu(){
          super(35, 55, 30, 90, 40, 50);
     }

     public Pikachu(int inputHp, int inputAttack, int inputDefense, int inputSpeed, int inputSpDef, int inputSpAtk){
          super(inputHp, inputAttack, inputDefense, inputSpeed, inputSpDef, inputSpAtk);
       }
     
     public void thunderbolt(Pokemon anyPoorPokemon){
        int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
        anyPoorPokemon.setHp(resultingLife);
     }
     public void tackle(Pokemon anyPoorPokemon){
          int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
          anyPoorPokemon.setHp(resultingLife);
     }
     public void thunder(Pokemon anyPoorPokemon){
          int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
          anyPoorPokemon.setHp(resultingLife);
     }
     public void ironTail(Pokemon anyPoorPokemon){
          int resultingLife = anyPoorPokemon.getHp() - (this.getAttack() - anyPoorPokemon.getDefense());
          anyPoorPokemon.setHp(resultingLife);
     }
     
     @Override
     public String toString(){
          return "Pikachu: " + this.getHp();
     }

}
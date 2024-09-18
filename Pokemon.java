public class Pokemon implements MoreSpeed{
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int spDef;
    private int spAtk;

    //constructor
    public Pokemon(int userHp, int userAttack, int userDefennse, int userSpeed, int userSpAtk, int userSpDef){
        hp = userHp;
        attack = userAttack;
        defense = userDefennse;
        speed = userSpeed;
        spDef = userSpDef;
        spAtk = userSpAtk;
    }
    
    public int getHp(){
        return hp;

    }
    public void setHp(int inputHp){
        hp = inputHp;
    }

    public int getAttack(){
        return attack;

    }
    public void setAttack(int inputAttack){
        attack = inputAttack;
    }
    public int getDefense(){
        return defense;

    }
    public void setDefense(int inputDefense){
        defense = inputDefense;
    }

    public int getSpeed(){
        return speed;

    }
    public void setSpeed(int inputSpeed){
        speed = inputSpeed;
    }

    public int getSpDef(){
        return spDef;

    }
    public void setSpDef(int inputSpDef){
        spDef = inputSpDef;
    }

    public int getSpAtk(){
        return spAtk;

    }
    public void setSpAtk(int inputSpAtk){
        spAtk = inputSpAtk;
    }

    public void compareStats(int userHp, int userAttack, int userDefennse, int userSpeed, int userSpAtk, int userSpDef){

    }

    //Compares speed of the pokemon
    @Override
    public int compareTo(Object obj) {
        Pokemon temp = null;

        if(obj instanceof Pokemon){
            temp = (Pokemon) obj;
        } else{
            return -1000;
        }

        if(this.getSpeed() == temp.getSpeed()){
            return 0;
        } else if (this.getSpeed() > temp.getSpeed()) {
            return 1;
        } else{
            return -1;
        }
    }

    //Compares to see if the stats of pokemon are the same. 
    @Override
    public boolean equals(Object obj){
        Pokemon temp = (Pokemon) obj;
        if(this.getAttack() == temp.getAttack() && this.getHp() == temp.getHp()  
           && this.getDefense() == temp.getDefense()){
            return true;
        } else{
            return false;
        }
    }
}
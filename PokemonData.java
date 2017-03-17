//package lab02;

/**
 * Created by jerry on 2017/3/7.
 */
public class PokemonData
{
    public PokemonData(int id, String name, String type, String move,
                                 int maxHP,  int attack,   int speed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.move = move;

        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.attack = attack;
        this.speed = speed;
    }

    private int id;
    private String name;
    private String type;
    private String move;

    private int maxHP;
    private int currentHP;
    private int attack;
    private int speed;

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public String getMove()
    {
        return move;
    }
    public int getHP()
    {
        return currentHP;
    }
    public int getATK()
    {
        return attack;
    }
    public int getSPD()
    {
        return speed;
    }
    public String getCurHP()
    {
        return currentHP + "/" + maxHP;
    }
    //
    public void getHurt(int attack)
    {
        currentHP -= attack;
        if (currentHP < 0)
            currentHP = 0;
    }
    public boolean isFainted()
    {
        return currentHP == 0 ? true : false ;
    }
    public void healHP()
    {
        currentHP = maxHP;
    }
    public void showData()
    {
        System.out.print("    id : ");
        System.out.println(id);
        System.out.print("    name : ");
        System.out.println(name);
        System.out.print("    type : ");
        System.out.println(type);
        System.out.print("    move : ");
        System.out.println(move);
        System.out.print("    HP : ");
        System.out.println(currentHP + " / " + maxHP);
        System.out.print("    ATK : ");
        System.out.println(attack);
        System.out.print("    SPD : ");
        System.out.println(speed);
    }
    //Try ctrl-N or command-N, click on Getter, you will see something useful

    //TODO implement "get function" for name
    //TODO implement "get function" for type


}

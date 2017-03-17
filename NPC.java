//package lab02.character;

/**
 * Created by jerry on 2017/3/7.
 */
public class NPC extends AbstractCharacter {
    //TODO more attributes are needed
    protected String quote;

    //TODO solve the error
    public NPC(String name, String job, String quote) {
        //TODO call super constructor
        super(name, job);
        //TODO assign attribute
        this.quote = quote;
    }
    public String getJob()
    {
        return job;
    }
    public String getName()
    {
        return name;
    }
    public void speak(){
        //TODO NPC say something...
        System.out.println("quote :");
        System.out.println("    [ " + quote + " ]");
        System.out.println();
    }
    //TODO override toString()
    //@Override
    public void showInformation()
    {
        //super.showInformation();
        System.out.print("name  : ");
        System.out.println(name);
        System.out.print("job   : ");
        System.out.println(job);
        speak();
    }
}

package movepack;
import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Rest";
        String s = "использует статусную атаку Rest";
        return s;
    }
    @Override
    protected void applySelfEffects(Pokemon var1)
    {
        Effect sleep = new Effect().turns(2);
        sleep.sleep(var1);
        Effect heal = new Effect().turns(1).stat(Stat.HP, ((int)var1.getHP() - 75) / 2);
        var1.addEffect(heal);
        //System.out.println(var1.getHP());
    }
    public Rest(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
package movepack;
import ru.ifmo.se.pokemon.*;
public class ConfuseRay extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Confuse Ray";
        String s = "использует статусную атаку Confuse Ray";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        Effect cnfs = new Effect().chance(0.33);
        if (cnfs.success())
        {
            Effect.confuse(var1);
            System.out.println(var1.toString() + " растерян.");
        }
    }
    public ConfuseRay(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
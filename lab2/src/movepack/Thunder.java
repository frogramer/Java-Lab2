package movepack;
import ru.ifmo.se.pokemon.*;
public class Thunder extends SpecialMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.getBundle("SPECIAL_ATTACK") + " Thunder";
        String s = "использует специальную атаку Thunder";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        Effect paralyzed = new Effect();
        paralyzed.chance(0.3);
        if (paralyzed.success())
        {
            Effect.paralyze(var1);
        }
    }
    public Thunder(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}

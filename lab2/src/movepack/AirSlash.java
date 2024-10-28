package movepack;
import ru.ifmo.se.pokemon.*;
public class AirSlash extends SpecialMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("ATTACK") + " Air Slash";
        String s = "использует специальную атаку Air Slash";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var2)
    {
        Effect flnch = new Effect();
        flnch.chance(0.3);
        if (flnch.success())
        {
            Effect.flinch(var2);
        }
    }
    public AirSlash(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}

package movepack;
import ru.ifmo.se.pokemon.*;
public class ThunderWave extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Thunder Wave";
        String s = "использует статусную атаку Thunder Wave";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        Effect.paralyze(var1);
    }
    public ThunderWave(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
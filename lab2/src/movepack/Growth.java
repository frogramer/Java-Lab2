package movepack;
import ru.ifmo.se.pokemon.*;
public class Growth extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Growth";
        String s = "использует статусную атаку Growth";
        return s;
    }
    @Override
    protected void applySelfEffects(Pokemon var1)
    {
        var1.setMod(Stat.SPECIAL_ATTACK, 1);
        var1.setMod(Stat.ATTACK, 1);
    }
    public Growth(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
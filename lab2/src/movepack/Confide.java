package movepack;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Confide";
        String s = "использует статусную атаку Confide";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        var1.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    public Confide(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
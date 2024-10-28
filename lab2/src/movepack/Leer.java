package movepack;
import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Leer";
        String s = "использует статусную атаку Leer";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        var1.setMod(Stat.DEFENSE, -1);
    }
    public Leer(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
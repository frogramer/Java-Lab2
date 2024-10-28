package movepack;
import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Swagger";
        String s = "использует статусную атаку Swagger";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        System.out.println(var1.toString() + " растерян.");
        var1.confuse();
        var1.setMod(Stat.ATTACK, +2);
    }
    public Swagger(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}
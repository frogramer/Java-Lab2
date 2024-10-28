package movepack;
import ru.ifmo.se.pokemon.*;
public class ShadowBall extends SpecialMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("SPECIAL_ATTACK") + " Shadow ball";
        String s = "использует специальную атаку Shadow Ball";
        return s;
    }
    @Override
    protected void applyOppEffects(Pokemon var1)
    {
        Effect spd = new Effect();
        spd.chance(0.2);
        if (spd.success())
        {
            var1.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    public ShadowBall(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}

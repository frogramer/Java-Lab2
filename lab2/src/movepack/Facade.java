package movepack;
import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove
{
    int doublepow = 1;
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("ATTACK") + " Facade";
        String s = "использует физическую атаку Facade";
        return s;
    }
    @Override
    protected void applySelfEffects(Pokemon var2)
    {
        switch(var2.getCondition())
        {
            case BURN, PARALYZE, POISON -> doublepow = 2;
            default -> doublepow = 1;
        }
    }
    public Facade(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow * doublepow;
        this.accuracy = acc;
    }
}

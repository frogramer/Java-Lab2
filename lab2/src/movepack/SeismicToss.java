package movepack;
import ru.ifmo.se.pokemon.*;
public class SeismicToss extends PhysicalMove
{
    @Override
    protected String describe()
    {
        //String s = "использует " + Messages.get("ATTACK") + " Seismic Toss";
        String s = "использует физическую атаку Seismic Toss";
        return s;
    }
    public SeismicToss(Type type, double pow, double acc)
    {
        super(type, pow, acc);
        this.type = type;
        this.power = pow;
        this.accuracy = acc;
    }
}

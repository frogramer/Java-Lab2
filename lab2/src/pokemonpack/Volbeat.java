package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.*;
public class Volbeat extends Pokemon
{
    public Volbeat(String name, int level)
    {
        super(name, level);
        addType(Type.BUG);
        setStats(65.0, 73.0, 75.0, 43.0, 85.0, 85.0);
        Move shadowball = new ShadowBall(Type.GHOST, 80.0, 100.0);
        Move facade = new Facade(Type.NORMAL, 70.0, 100.0);
        Move thunder = new Thunder(Type.ELECTRIC, 110.0, 70.0);
        Move seismictoss = new SeismicToss(Type.FIGHTING, level, 100.0);
        addMove(shadowball);
        addMove(facade);
        addMove(thunder);
        addMove(seismictoss);
    }
}

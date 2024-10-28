package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
public class Xatu extends Natu
{
    public Xatu(String name, int level)
    {
        super(name, level);
        setStats(65.0, 75.0, 70.0, 95.0, 70.0, 95.0);
        Move airslash = new AirSlash(Type.FLYING, 75.0, 95.0);
        addMove(airslash);
    }
}

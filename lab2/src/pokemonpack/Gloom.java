package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
public class Gloom extends Oddish
{
    public Gloom(String name, int level)
    {
        super(name, level);
        setStats(60.0, 65.0, 70.0, 85.0, 75.0, 40.0);
        Move growth = new Growth(Type.NORMAL, 0.0, 100.0);
        addMove(growth);
    }
}

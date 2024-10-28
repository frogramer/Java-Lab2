package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Type;
public class Vileplume extends Gloom
{
    public Vileplume(String name, int level)
    {
        super(name, level);
        setStats(75.0, 80.0, 85.0, 110.0, 90.0, 50.0);
        Move rest = new Rest(Type.PSYCHIC, 0.0, 100.0);
        addMove(rest);
    }
}

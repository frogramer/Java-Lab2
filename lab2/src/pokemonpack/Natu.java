package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.Move;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class Natu extends Pokemon
{
    public Natu(String name, int level)
    {
        super(name, level);
        Type[] types = new Type[2];
        types[0] = Type.PSYCHIC;
        types[1] = Type.FLYING;
        setType(types);
        setStats(40.0, 50.0, 45.0, 70.0, 45.0, 70.0);
        Move thunderwave = new ThunderWave(Type.ELECTRIC, 0.0, 90.0);
        Move leer = new Leer(Type.NORMAL, 0.0, 100.0);
        Move confuseray = new ConfuseRay(Type.NORMAL, 0.0, 100.0);
        addMove(confuseray);
        addMove(leer);
        addMove(thunderwave);
    }
}
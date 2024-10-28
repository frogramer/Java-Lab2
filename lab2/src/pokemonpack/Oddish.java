package pokemonpack;
import movepack.*;
import ru.ifmo.se.pokemon.*;
public class Oddish extends Pokemon
{
    public Oddish(String name, int level)
    {
        super(name, level);
        Type[] types = new Type[2];
        types[0] = Type.GRASS;
        types[1] = Type.POISON;
        setType(types);
        setStats(45.0, 50.0, 55.0, 75.0, 65.0, 30.0);
        Move confide = new Confide(Type.NORMAL, 0.0, 100.0);
        Move swagger = new Swagger(Type.NORMAL, 0.0, 85.0);
        addMove(swagger);
        addMove(confide);
    }
}
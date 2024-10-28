package laboratory2;
import ru.ifmo.se.pokemon.*;
import pokemonpack.*;
public class Main
{
    public static void main(String[] args) {
        Volbeat volbeat = new Volbeat("", 1);
        Natu natu = new Natu("", 1);
        Xatu xatu = new Xatu("", 1);
        Oddish oddish = new Oddish("", 1);
        Gloom gloom = new Gloom("", 1);
        Vileplume vileplume = new Vileplume("", 1);
        Battle b = new Battle();
        b.addAlly(volbeat);
        b.addFoe(vileplume);
        b.addAlly(xatu);
        b.addAlly(natu);
        b.addFoe(oddish);
        b.addFoe(gloom);
        b.addFoe(vileplume);
        b.go();
    }
}
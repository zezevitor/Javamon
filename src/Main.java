import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // Iniciar treinadores
        Trainer player = new Trainer("a","");
        Trainer inimigo = new Trainer("b", "");

        // Iniciar pokedex
        Pokedex pokedex = new Pokedex();

        // Pokemons aleatorios
        Random rn = new Random();
        int i = rn.nextInt(3);   
        pokedex.givePokemon(player, i);
        i = rn.nextInt(3);
        pokedex.givePokemon(inimigo, i);
        
        // Iniciar Battle
        Battle game = new Battle(player, inimigo);
        game.battle();
        
        teclado.close();
    }
}
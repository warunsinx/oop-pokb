public class AbstractBaseTrainer implements TrainerInterface {
    protected PokemonInterface pokemons;
    protected PokemonInterface currentPokemon;
    protected String name;

    public AbstractBaseTrainer(String n,PokemonInterface p){
        this.name = n;
        this.pokemons = p;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public PokemonInterface getCurrentPokemon(){
        return this.currentPokemon;
    }
    @Override 
    public boolean sendNewPokemon(){
        
    }
    @Override
    public boolean isDefeated(){

    }
    @Override
    public PokemonInterface getPokemon(int a){
        return this.pokemons;
    }
    @Override
    public int getNumAlivePokemons(){
        
    }
    
    public abstract Move selectMove(PokemonInterface){
        
    } 

}
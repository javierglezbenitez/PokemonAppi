package dacd.gonzalez.control;

import dacd.gonzalez.model.Pokemon;
import com.google.gson.Gson;
import dacd.gonzalez.model.Results;
import org.jsoup.Jsoup;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Pokemon pokemon = new Pokemon(64, "https://pokeapi.co/api/v2/berry/?offset=20&limit=20", null);
        try{
            String url = "https://pokeapi.co/api/v2/berry/";
            String jsonString = Jsoup.connect(url).ignoreContentType(true).execute().body();

            Gson gson = new Gson();
            Pokemon pokemon = gson.fromJson(jsonString, Pokemon.class);
            System.out.println("Count:" + pokemon.getCount() + "\n" +
                    "next:" + pokemon.getNext() + "\n" +
                    "Previous:" + pokemon.getPrevious());

            for (Results pokemon1: pokemon.getResults()) {
                System.out.println("Name:" + pokemon1.getName() + "\n" +
                        "Url:" + pokemon1.getUrl() );
            }




        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
package com.andre601.randomcolor;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.apache.commons.lang.ArrayUtils;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;

import java.util.Random;

public class RandomColor extends PlaceholderExpansion {

    private final Random random = new Random();
    private final String[] COLORS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private final String[] FORMATS = {"k", "l", "m", "n", "o"};

    @Override
    public String getIdentifier() {
        return "randomcolor";
    }

    @Override
    public String getAuthor() {
        return "Andre_601";
    }
    
    @Override
    public String getVersion() {
        return "1.2.0";
    }
    
    private String getRandomAll(){
        String[] all = (String[])ArrayUtils.addAll(COLORS, FORMATS);
        
        return getRandom(all);
    }

    private String getRandomColor(){
        return getRandom(COLORS);
    }

    private String getRandomFormat(){
        return getRandom(FORMATS);
    }
    
    private String getRandomCombined(){
        return getRandomColor() + getRandomFormat();
    }

    private String getRandom(String[] values){
        return ChatColor.COLOR_CHAR + values[random.nextInt(values.length)].replace("#", "x");
    }
    
    @Override
    public String onRequest(OfflinePlayer player, String identifier){
        identifier = identifier.toLowerCase();

        switch(identifier){
            case "all":
                return getRandomAll();

            case "format":
                return getRandomFormat();

            case "color":
                return getRandomColor();
            
            case "combined":
                return getRandomCombined();
        }

        if(identifier.startsWith("selected_")){
            if(identifier.equals("selected_")){
                return null;
            }

            String[] values = identifier.replace("selected_", "").split(",");

            if(values.length == 0){
                return null;
            }

            return getRandom(values);
        }

        return null;
    }
}

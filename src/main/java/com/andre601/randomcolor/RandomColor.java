package com.andre601.randomcolor;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;

import java.util.Random;

public class RandomColor extends PlaceholderExpansion {

    private Random random = new Random();
    private String[] all    = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f",
            "k", "l", "m", "n", "o"
    };
    private String[] colors = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"
    };
    private String[] format = {
            "k", "l", "m", "n", "o"
    };

    /**
     * The name of the expansion, which is also used in the placeholder.
     *
     * @return {@code randomcolor}
     */
    public String getIdentifier() {
        return "randomcolor";
    }

    /**
     * The author of the expansion.
     *
     * @return {@code Andre_601}
     */
    public String getAuthor() {
        return "Andre_601";
    }

    /**
     * The version of the expansion.
     *
     * @return {@code 1.0.0}
     */
    public String getVersion() {
        return "1.0.0";
    }

    private String getRandomAll(){
        return ChatColor.COLOR_CHAR + all[random.nextInt(all.length)];
    }

    private String getRandomColor(){
        return ChatColor.COLOR_CHAR + colors[random.nextInt(colors.length)];
    }

    private String getRandomFormat(){
        return ChatColor.COLOR_CHAR + format[random.nextInt(format.length)];
    }

    private String getRandom(String[] values){
        return ChatColor.COLOR_CHAR + values[random.nextInt(values.length)];
    }

    /**
     * This will return either a formatting/color code depending on what identifier was defined.
     *
     * @param  player
     *         The {@link OfflinePlayer player} (Not really used)
     * @param  identifier
     *         The identifier from the placeholder ({@code %name_identifier})
     *         <br>This should be one of those options:
     *         <ul>
     *             <li>{@code all} Returns a random color or formatting code. (0-9, a-f, k-o)</li>
     *             <li>{@code format} Returns a random format code (k-o)</li>
     *             <li>{@code color} Returns a random color code (0-9, a-f)</li>
     *             <li>{@code selected_<options>} Returns a random options that is provided.</li>
     *         </ul>
     *
     * @return A random color or formatting code ({@code §<0-9, a-f, k-o>}
     */
    public String onRequest(OfflinePlayer player, String identifier){

        switch(identifier.toLowerCase()){
            case "all":
                return getRandomAll();

            case "format":
                return getRandomFormat();

            case "color":
                return getRandomColor();
        }

        if(identifier.startsWith("selected_")){
            String[] values = identifier.replace("selected_", "").split(",");

            if(values.length == 0){
                return "No colors provided!";
            }

            return getRandom(values);
        }

        return null;
    }
}

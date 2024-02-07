package git.dragomordor.megamons.forge.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import git.dragomordor.megamons.forge.MegamonsMod;

import java.io.*;
import java.lang.reflect.Type;

public class ModConfig {
    // Mega Pokemon allowed
    public int numberOfMegaPokemonAllowed;

    public static class Builder {

        public static ModConfig load() {
            Gson gson = new GsonBuilder()
                    .disableHtmlEscaping()
                    .setPrettyPrinting()
                    .create();
            ModConfig config = new ModConfig();
            File configFile = new File("config/" + MegamonsMod.MODID + "/" + MegamonsMod.MODID + ".json");
            configFile.getParentFile().mkdirs();

            if (configFile.exists()) {
                try {
                    FileReader fileReader = new FileReader(configFile);
                    Type listType = new TypeToken<ModConfig>(){}.getType();
                    config = gson.fromJson(fileReader, ModConfig.class);
                    fileReader.close();

                } catch (Exception e) {
                    System.out.println("Error reading config file");
                }
            } else {
                // If the file does not exist, create it with the default values

                try {
                    // Set default values
                    config.numberOfMegaPokemonAllowed = 1;
                    // Write the entire config to the file
                    FileWriter fileWriter = new FileWriter(configFile);
                    gson.toJson(config, fileWriter);
                    fileWriter.close();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return config;
        }

        public void saveConfig() {
            File configFile = new File("config/" + MegamonsMod.MODID + "/" + MegamonsMod.MODID + ".json");

            try (FileWriter writer = new FileWriter(configFile)) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String json = gson.toJson(this);
                writer.write(json);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

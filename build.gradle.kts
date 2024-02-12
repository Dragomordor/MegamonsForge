plugins {
    id("java")
    id("dev.architectury.loom") version("1.4-SNAPSHOT")
    id("architectury-plugin") version("3.4-SNAPSHOT")
    id("org.jetbrains.kotlin.jvm") version("1.9.22")
    id("org.jetbrains.kotlin.plugin.serialization") version ("1.9.22")
}

group = "git.dragomordor.megamons"
version = "1.1.0"


architectury {
    platformSetupLoomIde()
    forge()
}


loom {
    silentMojangMappingsLicense()



    forge {
        mixinConfig("megamons.mixins.json")

        @Suppress("DEPRECATION", "removal", "UnstableApiUsage")
        dataGen {
            mod("megamons")
        }


    }

    mixin {

        defaultRefmapName.set("mixins.${project.name}.refmap.json")
    }


}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    maven("https://maven.impactdev.net/repository/development/")
    maven("https://hub.spigotmc.org/nexus/content/groups/public/")
    maven("https://thedarkcolour.github.io/KotlinForForge/")

    maven("https://repo.spongepowered.org/maven")
    // Patchouli
    maven ( "https://maven.blamejared.com" )
}

dependencies {
    minecraft("net.minecraft:minecraft:1.20.1")
    mappings(loom.officialMojangMappings())
    forge("net.minecraftforge:forge:1.20.1-47.2.0")

    modImplementation("com.cobblemon:forge:1.4.0+")
    runtimeOnly("thedarkcolour:kotlinforforge:4.10.0")

    // Apply Mixin AP
    annotationProcessor("org.spongepowered:mixin:0.8.5:processor")

    // Patchouli
    modImplementation("vazkii.patchouli:Patchouli:1.20.1-84-FORGE")


}

sourceSets {
    main {
        resources.srcDir(file("src/generated"))
    }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }

}
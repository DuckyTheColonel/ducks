import org.gradle.accessors.dm.LibrariesForLibs

// https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

plugins {
    id("ducks.paper")
    id("ducks.publish")
    id("net.minecrell.plugin-yml.bukkit")
    id("xyz.jpenilla.run-paper")
}

group = "com.github.duckythecolonel.ducks"

dependencies {
}

tasks {
    runServer {
        minecraftVersion(libs.versions.minecraft.get())
    }
}

bukkit {
    main = "com.github.duckythecolonel.ducks"
    apiVersion = libs.versions.bukkit.api.get()
    prefix = project.name
    authors = listOf("DuckyTheColonel")
}

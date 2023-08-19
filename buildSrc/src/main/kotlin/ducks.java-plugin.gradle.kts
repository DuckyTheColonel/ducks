import org.gradle.accessors.dm.LibrariesForLibs

// https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

plugins {
    id("ducks.java-common")
    id("ducks.plugin")

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

pitest {
}

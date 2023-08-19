import org.gradle.accessors.dm.LibrariesForLibs

// https://github.com/gradle/gradle/issues/15383
val libs = the<LibrariesForLibs>()

plugins {
    id("ducks.java-common")
    id("ducks.paper")
    id("ducks.publish")
}

group = "com.github.duckythecolonel.ducks"

dependencies {
}

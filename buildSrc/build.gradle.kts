plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/") // PaperMC, paperweight
}

dependencies {
    // https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    implementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin:${libs.versions.gradlepitestplugin.get()}") // Pitest
    implementation("net.minecrell:plugin-yml:${libs.versions.pluginyml.get()}") // Generates plugin.xml during build
    implementation("xyz.jpenilla:run-task:${libs.versions.runtask.get()}") // Adds runServer and runMojangMappedServer tasks for testing
}

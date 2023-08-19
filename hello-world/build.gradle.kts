import net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder

plugins {
    id("ducks.java-plugin")
}

version = "1.0.0-SNAPSHOT"
description = ""

dependencies {
}

tasks {
    jacocoTestCoverageVerification {
        violationRules {
            rule {
                limit {
                    counter = "LINE"
                    value = "COVEREDRATIO"
                    minimum = BigDecimal(0.0)
                }
            }
        }
    }
}

pitest {
    mutationThreshold.set(1)
    coverageThreshold.set(1)
}

bukkit {
    apiVersion = "1.20"
    prefix = "ducks"
    description = "Ducks plugin"
    load = PluginLoadOrder.STARTUP
    main = "com.github.duckythecolonel.ducks.helloworld.HelloWorldPlugin"
}

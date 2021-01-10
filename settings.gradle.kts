pluginManagement {
    plugins {
        kotlin("jvm") version "1.4.0"
        id("org.jetbrains.dokka") version "1.4.0"
    }
    repositories {
        gradlePluginPortal()
        jcenter()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    }
}

rootProject.name = "pixie"
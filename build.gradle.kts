plugins {
    id("org.quiltmc.loom") version "1.2.+"
    id("io.github.p03w.machete") version "1.+"
    id("org.cadixdev.licenser") version "0.6.+"
}

apply(from = "https://raw.githubusercontent.com/JamCoreModding/Gronk/quilt/publishing.gradle.kts")
apply(from = "https://raw.githubusercontent.com/JamCoreModding/Gronk/quilt/misc.gradle.kts")

val mod_version: String by project

group = "io.github.jamalam360"

version = mod_version

dependencies {
    minecraft(libs.minecraft)
    mappings(variantOf(libs.quilt.mappings) { classifier("intermediary-v2") })
    modImplementation(libs.quilt.loader)
}

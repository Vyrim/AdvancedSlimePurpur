plugins {
    `java-library`
     `maven-publish`
    signing
}

dependencies {
    api("com.flowpowered:flow-nbt:2.0.2")
    api("org.jetbrains:annotations:23.0.0")

    compileOnly("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT")
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.codemc.io/repository/nms/")
    maven("https://repo.rapture.pw/repository/maven-releases/")
    maven("https://repo.glaremasters.me/repository/concuncan/")
    maven("https://jitpack.io/")
}

java {
    withSourcesJar()
    withJavadocJar()
}
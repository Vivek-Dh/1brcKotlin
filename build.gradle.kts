plugins {
    kotlin("jvm") version "1.9.21"
}

group = "dev.vivek"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "dev.vivek.MainKt"
    }
}

kotlin {
    jvmToolchain(21)
}
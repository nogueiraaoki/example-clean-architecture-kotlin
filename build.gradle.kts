import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {

    apply(plugin="kotlin")

    dependencies {
        testImplementation(kotlin("test"))
        testImplementation("io.kotest:kotest-runner-junit5-jvm:5.4.2")
        testImplementation("io.mockk:mockk:1.12.5")

    }

    tasks.test {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}

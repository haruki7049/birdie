plugins {
    alias(libs.plugins.kotlin.jvm)
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation(libs.junit.jupiter.engine)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    mainClass = "dev.haruki7049.birdie.AppKt"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

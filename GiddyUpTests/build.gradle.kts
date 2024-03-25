
plugins {
    id("java")
}

group = "io.giddyup"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.seleniumhq.selenium:selenium-java:4.18.1")
    implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.18.1")
    testImplementation("org.testng:testng:7.9.0")
}

tasks.test {
    useJUnitPlatform()
}
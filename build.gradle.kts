plugins {
    kotlin("jvm") version "2.0.10"
    groovy
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.spockframework:spock-core:2.4-M1-groovy-4.0")
//    testImplementation("org.apache.groovy:groovy:4.0.13")
    testImplementation("org.apache.groovy:groovy:4.0.21")

    testRuntimeOnly("org.junit.platform:junit-platform-engine:1.10.0")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.0")
}

tasks.test {
    useJUnitPlatform()
}


plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("net.objecthunter:exp4j:0.4.8")
    testImplementation("junit:junit:4.13.1");
}

tasks.test {
    useJUnitPlatform()
}
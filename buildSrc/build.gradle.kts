plugins {
    kotlin("jvm") version "1.6.21"
    groovy
    java
}
buildscript{
    dependencies{
        classpath(kotlin("gradle-plugin", version = "1.6.10"))
    }
}
repositories {
    mavenCentral()
    maven {
        url = uri("https://www.jitpack.io")
    }
}
sourceSets {
    main {
        java.srcDir("src")
    }
    test {
        java.srcDir("test")
    }
}
dependencies {
    implementation(gradleApi())
}
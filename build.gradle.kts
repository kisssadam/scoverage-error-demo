plugins {
    id("scala")
    id("org.scoverage") version "7.0.1"
}

//scala {
//    zincVersion.set("1.8.0")
//}
//
scoverage {
//    scoverageVersion.set("2.0.7")
    scoverageScalaVersion.set("2.13.8")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.10")

    testImplementation("org.scalactic:scalactic_2.13:3.2.14")
    testImplementation("org.scalatest:scalatest_2.13:3.2.14")
    testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.14.0")
    testImplementation("junit:junit:4.13")
}

tasks.getByName<Test>("test") {
    useJUnit()
}

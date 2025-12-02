import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.2.21"
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0")
}

tasks {
    wrapper {
        gradleVersion = "9.2.1"
    }
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.compilerOptions {
    freeCompilerArgs.add("-Xcontext-receivers")
    freeCompilerArgs.add("-Xwhen-guards")
    freeCompilerArgs.add("-Xnon-local-break-continue")
    freeCompilerArgs.add("-Xmulti-dollar-interpolation")
}
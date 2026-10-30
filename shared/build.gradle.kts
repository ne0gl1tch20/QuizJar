plugins {
    kotlin("multiplatform")
}

kotlin {
    androidTarget()
    jvmToolchain(17)

    sourceSets {
        commonMain.dependencies {
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

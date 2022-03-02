plugins {
    id("com.android.dynamic-feature")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project(":app"))
    implementation(libs.bundles.feature.search)
    kapt(libs.dagger.compiler)

    testImplementation ("junit:junit:4.13.2")
    testImplementation ("io.mockk:mockk:1.12.2")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.4.2")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.4.2")

}
kapt {
    correctErrorTypes = true
}

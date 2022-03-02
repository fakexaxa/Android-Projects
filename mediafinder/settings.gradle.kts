pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "dagger.hilt.android.plugin") {
                useModule("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
            }
        }
    }
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "FindMyMovie"

enableFeaturePreview("VERSION_CATALOGS")

include(":app", ":feature_search")

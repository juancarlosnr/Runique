plugins {
  alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.jvm.ktor)
}

android {
    namespace = "com.runique.core.data"
}

dependencies {
    // Koin
    implementation(libs.bundles.koin)
    //Timber
    implementation(libs.timber)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}
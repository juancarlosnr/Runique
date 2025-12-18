plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.runque.auth.presentation"
}

dependencies {
    //Koin
    implementation(libs.bundles.koin)
    
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}
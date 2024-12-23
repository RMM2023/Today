plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
}

android {
    namespace = "com.portfoliormm.today"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.portfoliormm.today"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }

}

dependencies {

    implementation(libs.glide)
    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1110)
    implementation(libs.androidx.constraintlayout.v214)
    implementation(libs.androidx.activity.v180)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.espresso.core.v351)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)
    annotationProcessor(libs.compiler)
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.koin.android)

    val roomVersion = "2.6.1"
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)

}
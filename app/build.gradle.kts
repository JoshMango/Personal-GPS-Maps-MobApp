plugins {
    alias(libs.plugins.android.application)
<<<<<<< HEAD
    alias(libs.plugins.google.android.libraries.mapsplatform.secrets.gradle.plugin)
}

android {
    namespace = "ph.edu.gps_tracker"
=======
}

android {
    namespace = "com.usc.myway"
>>>>>>> 2ecd36b593617b3ad040b654e30a4677c5175695
    compileSdk {
        version = release(36)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "ph.edu.gps_tracker"
=======
        applicationId = "com.usc.myway"
>>>>>>> 2ecd36b593617b3ad040b654e30a4677c5175695
        minSdk = 24
        targetSdk = 36
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
<<<<<<< HEAD
    buildFeatures {
        viewBinding = true
    }
=======
>>>>>>> 2ecd36b593617b3ad040b654e30a4677c5175695
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
<<<<<<< HEAD
    implementation("com.google.android.gms:play-services-location:21.3.0");
    implementation("com.google.android.libraries.places:places:3.3.0");
    implementation("com.google.android.gms:play-services-maps:18.2.0");
    implementation("com.google.android.libraries.places:places:3.3.0")
=======
>>>>>>> 2ecd36b593617b3ad040b654e30a4677c5175695
}
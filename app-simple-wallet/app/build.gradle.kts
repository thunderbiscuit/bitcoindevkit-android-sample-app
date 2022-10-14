plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 31

    buildFeatures {
        viewBinding = true
        compose = true
    }

    defaultConfig {
        applicationId = "com.goldenraven.devkitwallet"
        minSdk = 26
        targetSdk = 30
        versionCode = 1
        versionName = "v0.0.1"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = true
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.1"
    }

    namespace = "com.goldenraven.devkitwallet"
}

dependencies {
    // basic android dependencies
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation ("androidx.core:core-ktx:1.6.0")
    implementation ("androidx.appcompat:appcompat:1.3.1")
    implementation ("com.google.android.material:material:1.4.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.0")

    // compose
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.compose.material:material:1.1.1")
    implementation("androidx.compose.animation:animation:1.1.1")
    implementation("androidx.compose.ui:ui-tooling:1.1.1")
    implementation("androidx.compose.runtime:runtime-livedata:1.1.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1")
    implementation("androidx.navigation:navigation-compose:2.4.1")
    implementation("androidx.compose.ui:ui:1.1.1")
    implementation("androidx.compose.material3:material3:1.0.0-alpha07")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0")
    implementation("com.google.accompanist:accompanist-navigation-animation:0.23.1")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.23.1")

    // navigation
    // implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
    // implementation("androidx.navigation:navigation-ui-ktx:2.3.5")

    // toolbar
    implementation("androidx.appcompat:appcompat:1.3.1")

    // bitcoindevkit
    implementation("org.bitcoindevkit:bdk-android:0.10.0-CBF")

    // qr codes
    implementation("com.google.zxing:core:3.4.1")

    // tests
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
}

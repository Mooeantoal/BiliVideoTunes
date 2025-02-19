plugins {
    id("com.android.application")
    id("kotlin-android")
    // The Flutter Gradle Plugin must be applied after the Android and Kotlin Gradle plugins.
    id("dev.flutter.flutter-gradle-plugin")
    id("com.google.gms.google-services")
    id("com.google.firebase.firebase-perf")
    id("com.google.firebase.crashlytics")
}


// 载入本地文件
//val keystoreProperties = Properties()
//val keystorePropertiesFile = rootProject.file("/sign/key.properties")
//if (keystorePropertiesFile.exists()) {
//    keystoreProperties.load(FileInputStream(keystorePropertiesFile))
//}


android {
    namespace = "com.imcys.bilivideotunes.bili_video_tunes"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        // TODO: Specify your own unique Application ID (https://developer.android.com/studio/build/application-id.html).
        applicationId = "com.imcys.bilivideotunes"
        // You can update the following values to match your application needs.
        // For more information, see: https://flutter.dev/to/review-gradle-config.
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    signingConfigs {
//        create("release") {
//            storeFile = file(keystoreProperties.getProperty("storeFile") ?: "defaultStoreFile")
//            storePassword = keystoreProperties.getProperty("storePassword") ?: "defaultStorePassword"
//            keyAlias = keystoreProperties.getProperty("keyAlias") ?: "defaultKeyAlias"
//            keyPassword = keystoreProperties.getProperty("keyPassword") ?: "defaultKeyPassword"
//        }
    }

    buildTypes {
        release {
            // TODO: Add your own signing config for the release build.
            // Signing with the debug keys for now, so `flutter run --release` works.
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    val exoplayerVersion = "2.19.1"
    val ultimateBarXVersion = "0.8.1"

    implementation("com.google.android.exoplayer:exoplayer-dash:$exoplayerVersion")
    // implementation("androidx.activity:activity:$activityVersion")
    // implementation("com.gitee.zackratos:UltimateBarX:$ultimateBarXVersion")
    implementation("androidx.multidex:multidex:2.0.1")
}

plugins {
    `java-library`
    `common-jvm`
    `maven-publish`
}

dependencies {
    jvmMainApi(libs.kotlinx.coroutines.core)
    jvmMainApi(libs.jcefmaven)
}
publishing {
    publications {
        create<MavenPublication>("webview") {
            groupId = "com.goldenduo.compose.desktop"
            from(components["java"])
        }
    }
}
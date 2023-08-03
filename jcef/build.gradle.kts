plugins {
    `java-library`
    `common-jvm`
    `maven-publish`
}
group = "com.goldenduo.compose.desktop"
version ="0.0.1"
dependencies {
    jvmMainApi(libs.kotlinx.coroutines.core)
    jvmMainApi(libs.jcefmaven)
}

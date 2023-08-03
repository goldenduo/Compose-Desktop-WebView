plugins {
    `java-library`
    `common-jvm`
    `maven-publish`
}
group = "com.goldenduo.compose.desktop"
dependencies {
    jvmMainApi(libs.kotlinx.coroutines.core)
    jvmMainApi(libs.jcefmaven)
}

tasks.compileKotlinJvm{
    kotlinOptions.jvmTarget="11"
}
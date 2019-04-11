# Android Image Loader
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ff361fd6661f4906bc2f582ab1a71399)](https://www.codacy.com/app/tortuvshin/slight?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=intelligo-systems/slight&amp;utm_campaign=Badge_Grade)
[![](https://jitpack.io/v/intelligo-systems/slight.svg)](https://jitpack.io/#intelligo-systems/slight)
![minSdkVersion](https://img.shields.io/badge/minSdkVersion-14-yellow.svg?style=true)
![compileSdkVersion](https://img.shields.io/badge/compileSdkVersion-28-green.svg?style=true)

Easy, sample and flexible library for loading, caching and displaying images on Android.

How to include
---

With gradle: edit your `build.gradle`:
```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile 'com.github.intelligo-systems:slight:1.1.3'
}
```

Or declare it into your `pom.xml`:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.intelligo-systems</groupId>
    <artifactId>slight</artifactId>
    <version>1.1.3</version>
</dependency>
```

How to use
---

#### Basic Usage

add the following permissions to your AndroidManifest.xml:

    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

Java
```java

@Override 
public void onCreate(Bundle savedInstanceState) {
  ...
  ImageView imageView = (ImageView) findViewById(R.id.my_image_view);
  
  ImageLoader imageLoader = new ImageLoader(context);
  
  imageLoader.DisplayImage(url, imageView);
}
```

Kotlin
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    ...
    val imageView = findViewById(R.id.my_image_view) as ImageView

    val imageLoader = ImageLoader(this)

    imageLoader.DisplayImage(url, imageView)
}
```
    

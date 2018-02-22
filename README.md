# Android Image Loader
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ac691a10e7d04e00b54bd36df47feb26)](https://www.codacy.com/app/tortuvshin/image-loader?utm_source=github.com&utm_medium=referral&utm_content=techstar-inc/image-loader&utm_campaign=badger)
[![](https://jitpack.io/v/techstar-cloud/image-loader.svg)](https://jitpack.io/#techstar-cloud/image-loader)
[![](https://jitpack.io/v/techstar-cloud/image-loader/month.svg)](https://jitpack.io/#techstar-cloud/image-loader)
![minSdkVersion](https://img.shields.io/badge/minSdkVersion-14-yellow.svg?style=true)
![compileSdkVersion](https://img.shields.io/badge/compileSdkVersion-26-green.svg?style=true)

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
    compile 'com.github.techstar-cloud:image-loader:v1.1.0'
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
    <groupId>com.github.techstar-cloud</groupId>
    <artifactId>image-loader</artifactId>
    <version>v1.1.0</version>
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
    

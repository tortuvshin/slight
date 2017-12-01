# Android Image Loader
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
    compile 'com.github.techstar-inc:image-loader:v1.0.0'
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
    <groupId>com.github.techstar-inc</groupId>
    <artifactId>image-loader</artifactId>
    <version>v1.0.0</version>
</dependency>
```

How to use
---

#### Basic Usage

add the following permissions to your AndroidManifest.xml:

    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

```js

@Override 
public void onCreate(Bundle savedInstanceState) {
  ...
  ImageView imageView = (ImageView) findViewById(R.id.my_image_view);
  
  ImageLoader imageLoader = new ImageLoader(context);
  
  imageLoader.DisplayImage(url, imageView);
}
```

    

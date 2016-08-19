# TTextView
Custom Android TextView. Define custom typeface directly in XML.

Eliminate
```java
TextView textView = (TextView) findViewById(R.id.textView1);
Typeface typeface = Typeface.createFromAsset(context.getAssets(), typefacePath);
textView.setTypeface(typeface);
```
Define typeface path (from assets folder) in XML with ```customTypeface``` attribute.
```xml
<agnamc.ci.library.TTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Atlantide Starlight"
        app:customTypeface="AtlantideStarlight.ttf"
        />
```

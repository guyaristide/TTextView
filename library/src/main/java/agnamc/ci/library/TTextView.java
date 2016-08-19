package agnamc.ci.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by AGNAMC on 8/19/2016.
 */
public class TTextView extends TextView {

    String typefacePath;

    public TTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TTextView, 0, 0);

        try {
            typefacePath = typedArray.getString(R.styleable.TTextView_customTypeface);

        } finally {
            typedArray.recycle();
        }

        if(typefacePath != null) {
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), typefacePath);
            this.setTypeface(typeface);
        }
        else{
            this.setTypeface(Typeface.MONOSPACE);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}

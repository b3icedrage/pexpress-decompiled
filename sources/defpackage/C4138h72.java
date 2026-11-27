package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: h72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4138h72 {
    public static SG a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, Resources.Theme theme, @NonNull String str, int i) {
        SG sgA;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new SG(null, null, typedValue.data);
            }
            try {
                sgA = SG.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                b0.d("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                sgA = null;
            }
            if (sgA != null) {
                return sgA;
            }
        }
        return new SG(null, null, 0);
    }

    public static boolean b(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    public static TypedArray c(@NonNull Resources resources, Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}

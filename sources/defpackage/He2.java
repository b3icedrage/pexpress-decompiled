package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class He2 {
    public static final Pe2 a;
    public static final a b;

    public static class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(He2.a.i(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            He2.a.p(view, fFloatValue);
        }
    }

    public static class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new Qe2();
        } else {
            a = new Pe2();
        }
        b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view, int i, int i2, int i3, int i4) {
        a.s(view, i, i2, i3, i4);
    }
}

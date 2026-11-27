package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: zc2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8067zc2 {
    public static DisplayMetrics a = null;
    public static int b = 50;
    public static int c = 8000;
    public static final Rect d;
    public static final Paint.FontMetrics e;
    public static final Rect f;
    public static final C6783tW g;
    public static final Rect h;
    public static final Rect i;
    public static final Paint.FontMetrics j;

    static {
        Double.longBitsToDouble(1L);
        Float.intBitsToFloat(1);
        d = new Rect();
        e = new Paint.FontMetrics();
        f = new Rect();
        g = new C6783tW(1);
        h = new Rect();
        i = new Rect();
        j = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static C3391db0 b(Paint paint, String str) {
        C3391db0 c3391db0 = (C3391db0) C3391db0.h.b();
        c3391db0.e = 0.0f;
        c3391db0.g = 0.0f;
        Rect rect = f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        c3391db0.e = rect.width();
        c3391db0.g = rect.height();
        return c3391db0;
    }

    public static float c(float f2) {
        DisplayMetrics displayMetrics = a;
        if (displayMetrics != null) {
            return f2 * displayMetrics.density;
        }
        b0.c("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f2;
    }

    public static float d(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        float fPow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2))));
        return Math.round(d2 * ((double) fPow)) / fPow;
    }
}

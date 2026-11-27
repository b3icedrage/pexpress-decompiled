package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: bZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2965bZ0 {
    public final int a;
    public final int b;
    public final int c;

    /* JADX INFO: renamed from: bZ0$a */
    public static final class a {
        public static final int e;
        public final Context a;
        public final ActivityManager b;
        public final b c;
        public final float d;

        static {
            e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.d = e;
            this.a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.b = activityManager;
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
                return;
            }
            this.d = 0.0f;
        }
    }

    /* JADX INFO: renamed from: bZ0$b */
    public static final class b {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public C2965bZ0(a aVar) {
        Context context = aVar.a;
        ActivityManager activityManager = aVar.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.c.a;
        float f = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f2 = aVar.d;
        int iRound2 = Math.round(f * f2);
        int iRound3 = Math.round(f * 2.0f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.b = iRound3;
            this.a = iRound2;
        } else {
            float f3 = i2 / (f2 + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * f2);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}

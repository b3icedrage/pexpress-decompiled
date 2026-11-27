package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7013uc {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final C1581Nb0 b = new C1581Nb0();
    public static final C1503Mb0 c = new C1503Mb0();
    public static final C4664jQ0 d = new C4664jQ0(C4664jQ0.c);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return BX.a(f2, f, f3, f);
    }

    public static float b(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        return f5 >= f4 ? f2 : a(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static int c(float f, int i, int i2) {
        return Math.round(f * (i2 - i)) + i;
    }
}

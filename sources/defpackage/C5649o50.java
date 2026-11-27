package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: o50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5649o50 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C5649o50(@NonNull Context context) {
        boolean zB = C6577sX0.b(context, R.attr.elevationOverlayEnabled, false);
        int iG = C8056za.g(context, R.attr.elevationOverlayColor, 0);
        int iG2 = C8056za.g(context, R.attr.elevationOverlayAccentColor, 0);
        int iG3 = C8056za.g(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zB;
        this.b = iG;
        this.c = iG2;
        this.d = iG3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || C4162hF.d(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iO = C8056za.o(fMin, C4162hF.d(i, 255), this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iO = C4162hF.b(C4162hF.d(i2, f), iO);
        }
        return C4162hF.d(iO, iAlpha);
    }
}

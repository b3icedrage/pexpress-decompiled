package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: e61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3503e61 {
    public final Bundle a;
    public IconCompat b;
    public final C7281vr1[] c;
    public final boolean d;
    public final boolean e;

    @Deprecated
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public C3503e61(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C7281vr1[] c7281vr1Arr, C7281vr1[] c7281vr1Arr2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null) {
            int i = iconCompat.a;
            if ((i == -1 ? IconCompat.a.c(iconCompat.b) : i) == 2) {
                this.f = iconCompat.c();
            }
        }
        this.g = C4133h61.c(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = c7281vr1Arr;
        this.d = true;
        this.e = true;
    }
}

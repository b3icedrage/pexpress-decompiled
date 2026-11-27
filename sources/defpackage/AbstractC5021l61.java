package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: l61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5021l61 {
    public C4133h61 a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    public void a(@NonNull Bundle bundle) {
        if (this.d) {
            bundle.putCharSequence("android.summaryText", this.c);
        }
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strC = c();
        if (strC != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
        }
    }

    public abstract void b(C5234m61 c5234m61);

    public abstract String c();
}

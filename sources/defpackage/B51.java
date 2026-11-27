package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class B51 extends I30<Drawable> {
    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        T t = this.d;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<Drawable> d() {
        return this.d.getClass();
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
    }
}

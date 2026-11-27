package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class H82 implements InterfaceC4765jt1<Drawable, Drawable> {
    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Drawable> a(@NonNull Drawable drawable, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new B51(drawable2);
        }
        return null;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Drawable drawable, @NonNull C4227ha1 c4227ha1) {
        return true;
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: ft1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3877ft1 implements InterfaceC4765jt1<Uri, Bitmap> {
    public final C5185lt1 a;
    public final InterfaceC0930Es b;

    public C3877ft1(C5185lt1 c5185lt1, InterfaceC0930Es interfaceC0930Es) {
        this.a = c5185lt1;
        this.b = interfaceC0930Es;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        InterfaceC3667et1 interfaceC3667et1C = this.a.c(uri, c4227ha1);
        if (interfaceC3667et1C == null) {
            return null;
        }
        return K30.a(this.b, (Drawable) ((I30) interfaceC3667et1C).get(), i, i2);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull Uri uri, @NonNull C4227ha1 c4227ha1) {
        return "android.resource".equals(uri.getScheme());
    }
}

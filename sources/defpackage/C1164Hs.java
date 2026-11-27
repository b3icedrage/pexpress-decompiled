package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1164Hs implements InterfaceC3667et1<Bitmap>, InterfaceC3518eA0 {
    public final Bitmap d;
    public final InterfaceC0930Es e;

    public C1164Hs(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull Bitmap bitmap) {
        UE.e(bitmap, "Bitmap must not be null");
        this.d = bitmap;
        UE.e(interfaceC0930Es, "BitmapPool must not be null");
        this.e = interfaceC0930Es;
    }

    public static C1164Hs e(@NonNull InterfaceC0930Es interfaceC0930Es, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new C1164Hs(interfaceC0930Es, bitmap);
    }

    @Override // defpackage.InterfaceC3518eA0
    public final void a() {
        this.d.prepareToDraw();
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
        this.e.c(this.d);
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return C6177qc2.c(this.d);
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Bitmap get() {
        return this.d;
    }
}

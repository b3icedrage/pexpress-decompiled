package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: hO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4190hO0 implements InterfaceC3667et1<BitmapDrawable>, InterfaceC3518eA0 {
    public final Resources d;
    public final InterfaceC3667et1<Bitmap> e;

    public C4190hO0(@NonNull Resources resources, @NonNull InterfaceC3667et1<Bitmap> interfaceC3667et1) {
        UE.e(resources, "Argument must not be null");
        this.d = resources;
        UE.e(interfaceC3667et1, "Argument must not be null");
        this.e = interfaceC3667et1;
    }

    @Override // defpackage.InterfaceC3518eA0
    public final void a() {
        InterfaceC3667et1<Bitmap> interfaceC3667et1 = this.e;
        if (interfaceC3667et1 instanceof InterfaceC3518eA0) {
            ((InterfaceC3518eA0) interfaceC3667et1).a();
        }
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
        this.e.b();
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.d, this.e.get());
    }
}

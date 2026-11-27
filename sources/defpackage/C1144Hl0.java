package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1144Hl0 implements InterfaceC6486s42<C0988Fl0> {
    public final InterfaceC6486s42<Bitmap> b;

    public C1144Hl0(InterfaceC6486s42<Bitmap> interfaceC6486s42) {
        UE.e(interfaceC6486s42, "Argument must not be null");
        this.b = interfaceC6486s42;
    }

    @Override // defpackage.InterfaceC6486s42
    @NonNull
    public final InterfaceC3667et1<C0988Fl0> a(@NonNull Context context, @NonNull InterfaceC3667et1<C0988Fl0> interfaceC3667et1, int i, int i2) {
        C0988Fl0 c0988Fl0 = interfaceC3667et1.get();
        InterfaceC3667et1<Bitmap> c1164Hs = new C1164Hs(a.a(context).d, c0988Fl0.d.a.l);
        InterfaceC6486s42<Bitmap> interfaceC6486s42 = this.b;
        InterfaceC3667et1<Bitmap> interfaceC3667et1A = interfaceC6486s42.a(context, c1164Hs, i, i2);
        if (!c1164Hs.equals(interfaceC3667et1A)) {
            c1164Hs.b();
        }
        c0988Fl0.d.a.c(interfaceC6486s42, interfaceC3667et1A.get());
        return interfaceC3667et1;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof C1144Hl0) {
            return this.b.equals(((C1144Hl0) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return this.b.hashCode();
    }
}

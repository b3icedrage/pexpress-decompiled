package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class L30 implements InterfaceC6486s42<Drawable> {
    public final InterfaceC6486s42<Bitmap> b;
    public final boolean c;

    public L30(InterfaceC6486s42<Bitmap> interfaceC6486s42, boolean z) {
        this.b = interfaceC6486s42;
        this.c = z;
    }

    @Override // defpackage.InterfaceC6486s42
    @NonNull
    public final InterfaceC3667et1<Drawable> a(@NonNull Context context, @NonNull InterfaceC3667et1<Drawable> interfaceC3667et1, int i, int i2) {
        InterfaceC0930Es interfaceC0930Es = a.a(context).d;
        Drawable drawable = interfaceC3667et1.get();
        C1164Hs c1164HsA = K30.a(interfaceC0930Es, drawable, i, i2);
        if (c1164HsA != null) {
            InterfaceC3667et1<Bitmap> interfaceC3667et1A = this.b.a(context, c1164HsA, i, i2);
            if (!interfaceC3667et1A.equals(c1164HsA)) {
                return new C4190hO0(context.getResources(), interfaceC3667et1A);
            }
            interfaceC3667et1A.b();
            return interfaceC3667et1;
        }
        if (!this.c) {
            return interfaceC3667et1;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof L30) {
            return this.b.equals(((L30) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return this.b.hashCode();
    }
}

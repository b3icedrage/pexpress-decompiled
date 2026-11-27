package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: Me0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1512Me0 extends AbstractC1242Is {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC3129cK0.a);

    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.AbstractC1242Is
    public final Bitmap c(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull Bitmap bitmap, int i, int i2) {
        return C7326w42.b(interfaceC0930Es, bitmap, i, i2);
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        return obj instanceof C1512Me0;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return 1572326941;
    }
}

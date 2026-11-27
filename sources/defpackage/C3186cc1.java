package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: cc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3186cc1 implements InterfaceC4765jt1<ParcelFileDescriptor, Bitmap> {
    public final C6900u30 a;

    public C3186cc1(C6900u30 c6900u30) {
        this.a = c6900u30;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        C6900u30 c6900u30 = this.a;
        return c6900u30.a(new InterfaceC7506ww0.c(parcelFileDescriptor, c6900u30.d, c6900u30.c), i, i2, c4227ha1, C6900u30.j);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull C4227ha1 c4227ha1) {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
    }
}

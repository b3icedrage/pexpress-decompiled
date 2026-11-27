package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: rs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6442rs implements InterfaceC6867tt1<Bitmap, byte[]> {
    public final Bitmap.CompressFormat d = Bitmap.CompressFormat.JPEG;
    public final int e = 100;

    @Override // defpackage.InterfaceC6867tt1
    public final InterfaceC3667et1<byte[]> a(@NonNull InterfaceC3667et1<Bitmap> interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        interfaceC3667et1.get().compress(this.d, this.e, byteArrayOutputStream);
        interfaceC3667et1.b();
        return new C2036Sw(byteArrayOutputStream.toByteArray());
    }
}

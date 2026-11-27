package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class HA0 implements InterfaceC4765jt1<InputStream, Bitmap> {
    public final C0774Cs a = new C0774Cs();

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return this.a.c(ImageDecoder.createSource(C6035pw.b(inputStream)), i, i2, c4227ha1);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull InputStream inputStream, @NonNull C4227ha1 c4227ha1) {
        return true;
    }
}

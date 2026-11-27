package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Zv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2609Zv implements InterfaceC4765jt1<ByteBuffer, Bitmap> {
    public final C0774Cs a = new C0774Cs();

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return this.a.c(ImageDecoder.createSource(byteBuffer), i, i2, c4227ha1);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4227ha1 c4227ha1) {
        return true;
    }
}

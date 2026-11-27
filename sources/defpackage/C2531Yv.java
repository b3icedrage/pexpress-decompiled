package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2531Yv implements InterfaceC4765jt1<ByteBuffer, Bitmap> {
    public final C6900u30 a;

    public C2531Yv(C6900u30 c6900u30) {
        this.a = c6900u30;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        C6900u30 c6900u30 = this.a;
        return c6900u30.a(new InterfaceC7506ww0.a(byteBuffer, c6900u30.d, c6900u30.c), i, i2, c4227ha1, C6900u30.j);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4227ha1 c4227ha1) {
        this.a.getClass();
        return true;
    }
}

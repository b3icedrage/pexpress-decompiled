package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774Cs implements InterfaceC4765jt1<ImageDecoder.Source, Bitmap> {
    public final C1008Fs a = new C1008Fs();

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ InterfaceC3667et1<Bitmap> a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return c(C8123zs.a(source), i, i2, c4227ha1);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull ImageDecoder.Source source, @NonNull C4227ha1 c4227ha1) {
        C0618As.c(source);
        return true;
    }

    public final C1164Hs c(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C4227ha1 c4227ha1) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new EV(i, i2, c4227ha1));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new C1164Hs(this.a, bitmapDecodeBitmap);
    }
}

package defpackage;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class BW1 implements InterfaceC4765jt1<InputStream, XB1> {
    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<XB1> a(@NonNull InputStream inputStream, int i, int i2, @NonNull C4227ha1 c4227ha1) throws IOException {
        try {
            return new C5073lM1(XB1.b(inputStream));
        } catch (ZB1 e) {
            throw new IOException("Cannot load SVG from stream", e);
        }
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull InputStream inputStream, @NonNull C4227ha1 c4227ha1) {
        return true;
    }
}

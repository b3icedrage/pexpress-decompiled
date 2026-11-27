package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import io.sentry.android.core.b0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class YR1 implements InterfaceC4765jt1<InputStream, C0988Fl0> {
    public final ArrayList a;
    public final C5615nw b;
    public final OU0 c;

    public YR1(ArrayList arrayList, C5615nw c5615nw, OU0 ou0) {
        this.a = arrayList;
        this.b = c5615nw;
        this.c = ou0;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<C0988Fl0> a(@NonNull InputStream inputStream, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                b0.f("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, c4227ha1);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull InputStream inputStream, @NonNull C4227ha1 c4227ha1) {
        return !((Boolean) c4227ha1.c(C1614Nl0.b)).booleanValue() && a.b(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}

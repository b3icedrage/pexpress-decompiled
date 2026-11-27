package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class XR1 implements InterfaceC4765jt1<InputStream, Bitmap> {
    public final C6900u30 a;
    public final OU0 b;

    public static class a implements C6900u30.b {
        public final C2092To1 a;
        public final D90 b;

        public a(C2092To1 c2092To1, D90 d90) {
            this.a = c2092To1;
            this.b = d90;
        }

        @Override // defpackage.C6900u30.b
        public final void a() {
            C2092To1 c2092To1 = this.a;
            synchronized (c2092To1) {
                c2092To1.g = c2092To1.d.length;
            }
        }

        @Override // defpackage.C6900u30.b
        public final void b(InterfaceC0930Es interfaceC0930Es, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.e;
            if (iOException != null) {
                if (bitmap == null) {
                    throw iOException;
                }
                interfaceC0930Es.c(bitmap);
                throw iOException;
            }
        }
    }

    public XR1(C6900u30 c6900u30, OU0 ou0) {
        this.a = c6900u30;
        this.b = ou0;
    }

    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        boolean z;
        C2092To1 c2092To1;
        D90 d90;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof C2092To1) {
            c2092To1 = (C2092To1) inputStream2;
            z = false;
        } else {
            z = true;
            c2092To1 = new C2092To1(inputStream2, this.b);
        }
        ArrayDeque arrayDeque = D90.g;
        synchronized (arrayDeque) {
            d90 = (D90) arrayDeque.poll();
        }
        if (d90 == null) {
            d90 = new D90();
        }
        D90 d91 = d90;
        d91.d = c2092To1;
        SW0 sw0 = new SW0(d91);
        a aVar = new a(c2092To1, d91);
        try {
            C6900u30 c6900u30 = this.a;
            C1164Hs c1164HsA = c6900u30.a(new InterfaceC7506ww0.b(sw0, c6900u30.d, c6900u30.c), i, i2, c4227ha1, aVar);
            d91.e = null;
            d91.d = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(d91);
            }
            return c1164HsA;
        } finally {
            d91.e = null;
            d91.d = null;
            ArrayDeque arrayDeque2 = D90.g;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(d91);
                if (z) {
                    c2092To1.release();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull InputStream inputStream, @NonNull C4227ha1 c4227ha1) {
        this.a.getClass();
        return true;
    }
}

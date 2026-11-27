package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class G82 implements InterfaceC4765jt1<Bitmap, Bitmap> {
    @Override // defpackage.InterfaceC4765jt1
    public final InterfaceC3667et1<Bitmap> a(@NonNull Bitmap bitmap, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return new a(bitmap);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ boolean b(@NonNull Bitmap bitmap, @NonNull C4227ha1 c4227ha1) {
        return true;
    }

    public static final class a implements InterfaceC3667et1<Bitmap> {
        public final Bitmap d;

        public a(@NonNull Bitmap bitmap) {
            this.d = bitmap;
        }

        @Override // defpackage.InterfaceC3667et1
        public final int c() {
            return C6177qc2.c(this.d);
        }

        @Override // defpackage.InterfaceC3667et1
        @NonNull
        public final Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // defpackage.InterfaceC3667et1
        @NonNull
        public final Bitmap get() {
            return this.d;
        }

        @Override // defpackage.InterfaceC3667et1
        public final void b() {
        }
    }
}

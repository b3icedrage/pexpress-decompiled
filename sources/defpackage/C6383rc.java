package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6383rc {
    public final ArrayList a;
    public final OU0 b;

    /* JADX INFO: renamed from: rc$a */
    public static final class a implements InterfaceC3667et1<Drawable> {
        public final AnimatedImageDrawable d;

        public a(AnimatedImageDrawable animatedImageDrawable) {
            this.d = animatedImageDrawable;
        }

        @Override // defpackage.InterfaceC3667et1
        public final void b() {
            this.d.stop();
            this.d.clearAnimationCallbacks();
        }

        @Override // defpackage.InterfaceC3667et1
        public final int c() {
            return C6177qc2.d(Bitmap.Config.ARGB_8888) * this.d.getIntrinsicHeight() * this.d.getIntrinsicWidth() * 2;
        }

        @Override // defpackage.InterfaceC3667et1
        @NonNull
        public final Class<Drawable> d() {
            return Drawable.class;
        }

        @Override // defpackage.InterfaceC3667et1
        @NonNull
        public final Drawable get() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: rc$b */
    public static final class b implements InterfaceC4765jt1<ByteBuffer, Drawable> {
        public final C6383rc a;

        public b(C6383rc c6383rc) {
            this.a = c6383rc;
        }

        @Override // defpackage.InterfaceC4765jt1
        public final InterfaceC3667et1<Drawable> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C4227ha1 c4227ha1) {
            return C6383rc.a(ImageDecoder.createSource(byteBuffer), i, i2, c4227ha1);
        }

        @Override // defpackage.InterfaceC4765jt1
        public final boolean b(@NonNull ByteBuffer byteBuffer, @NonNull C4227ha1 c4227ha1) {
            ImageHeaderParser.ImageType imageTypeC = com.bumptech.glide.load.a.c(this.a.a, byteBuffer);
            if (imageTypeC != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeC == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: rc$c */
    public static final class c implements InterfaceC4765jt1<InputStream, Drawable> {
        public final C6383rc a;

        public c(C6383rc c6383rc) {
            this.a = c6383rc;
        }

        @Override // defpackage.InterfaceC4765jt1
        public final InterfaceC3667et1<Drawable> a(@NonNull InputStream inputStream, int i, int i2, @NonNull C4227ha1 c4227ha1) {
            return C6383rc.a(ImageDecoder.createSource(C6035pw.b(inputStream)), i, i2, c4227ha1);
        }

        @Override // defpackage.InterfaceC4765jt1
        public final boolean b(@NonNull InputStream inputStream, @NonNull C4227ha1 c4227ha1) throws IOException {
            C6383rc c6383rc = this.a;
            ImageHeaderParser.ImageType imageTypeB = com.bumptech.glide.load.a.b(c6383rc.a, inputStream, c6383rc.b);
            if (imageTypeB != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeB == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    public C6383rc(ArrayList arrayList, OU0 ou0) {
        this.a = arrayList;
        this.b = ou0;
    }

    public static a a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull C4227ha1 c4227ha1) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new EV(i, i2, c4227ha1));
        if (C5121lc.b(drawableDecodeDrawable)) {
            return new a(C5334mc.a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}

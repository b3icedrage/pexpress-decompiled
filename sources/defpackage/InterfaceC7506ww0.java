package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import io.sentry.instrumentation.file.f;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: ww0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7506ww0 {

    /* JADX INFO: renamed from: ww0$b */
    public static final class b implements InterfaceC7506ww0 {
        public final com.bumptech.glide.load.data.c a;
        public final OU0 b;
        public final ArrayList c;

        public b(SW0 sw0, ArrayList arrayList, OU0 ou0) {
            UE.e(ou0, "Argument must not be null");
            this.b = ou0;
            UE.e(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.c(sw0, ou0);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final int a() {
            C2092To1 c2092To1 = this.a.a;
            c2092To1.reset();
            return com.bumptech.glide.load.a.a(this.c, c2092To1, this.b);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final Bitmap b(BitmapFactory.Options options) {
            C2092To1 c2092To1 = this.a.a;
            c2092To1.reset();
            return BitmapFactory.decodeStream(c2092To1, null, options);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final void c() {
            C2092To1 c2092To1 = this.a.a;
            synchronized (c2092To1) {
                c2092To1.g = c2092To1.d.length;
            }
        }

        @Override // defpackage.InterfaceC7506ww0
        public final ImageHeaderParser.ImageType d() {
            C2092To1 c2092To1 = this.a.a;
            c2092To1.reset();
            return com.bumptech.glide.load.a.b(this.c, c2092To1, this.b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();

    /* JADX INFO: renamed from: ww0$a */
    public static final class a implements InterfaceC7506ww0 {
        public final ByteBuffer a;
        public final ArrayList b;
        public final OU0 c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, OU0 ou0) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = ou0;
        }

        @Override // defpackage.InterfaceC7506ww0
        public final int a() {
            ByteBuffer byteBufferC = C6035pw.c(this.a);
            OU0 ou0 = this.c;
            if (byteBufferC != null) {
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iB = ((ImageHeaderParser) arrayList.get(i)).b(byteBufferC, ou0);
                        if (iB != -1) {
                            return iB;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return -1;
        }

        @Override // defpackage.InterfaceC7506ww0
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new C6035pw.a(C6035pw.c(this.a)), null, options);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.c(this.b, C6035pw.c(this.a));
        }

        @Override // defpackage.InterfaceC7506ww0
        public final void c() {
        }
    }

    /* JADX INFO: renamed from: ww0$c */
    public static final class c implements InterfaceC7506ww0 {
        public final OU0 a;
        public final ArrayList b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, OU0 ou0) {
            UE.e(ou0, "Argument must not be null");
            this.a = ou0;
            UE.e(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final int a() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            OU0 ou0 = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                C2092To1 c2092To1 = null;
                try {
                    FileDescriptor fileDescriptor = parcelFileDescriptorRewinder.c().getFileDescriptor();
                    C2092To1 c2092To2 = new C2092To1(f.a.b(new FileInputStream(fileDescriptor), fileDescriptor), ou0);
                    try {
                        int iD = imageHeaderParser.d(c2092To2, ou0);
                        c2092To2.release();
                        parcelFileDescriptorRewinder.c();
                        if (iD != -1) {
                            return iD;
                        }
                    } catch (Throwable th) {
                        th = th;
                        c2092To1 = c2092To2;
                        if (c2092To1 != null) {
                            c2092To1.release();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return -1;
        }

        @Override // defpackage.InterfaceC7506ww0
        public final Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.c().getFileDescriptor(), null, options);
        }

        @Override // defpackage.InterfaceC7506ww0
        public final ImageHeaderParser.ImageType d() throws Throwable {
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            OU0 ou0 = this.a;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = (ImageHeaderParser) arrayList.get(i);
                C2092To1 c2092To1 = null;
                try {
                    FileDescriptor fileDescriptor = parcelFileDescriptorRewinder.c().getFileDescriptor();
                    C2092To1 c2092To2 = new C2092To1(f.a.b(new FileInputStream(fileDescriptor), fileDescriptor), ou0);
                    try {
                        ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(c2092To2);
                        c2092To2.release();
                        parcelFileDescriptorRewinder.c();
                        if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeC;
                        }
                    } catch (Throwable th) {
                        th = th;
                        c2092To1 = c2092To2;
                        if (c2092To1 != null) {
                            c2092To1.release();
                        }
                        parcelFileDescriptorRewinder.c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }

        @Override // defpackage.InterfaceC7506ww0
        public final void c() {
        }
    }
}

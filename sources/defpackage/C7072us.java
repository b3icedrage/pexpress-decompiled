package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.instrumentation.file.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7072us implements InterfaceC5398mt1<Bitmap> {
    public static final Z91<Integer> e = Z91.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final Z91<Bitmap.CompressFormat> g = new Z91<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, Z91.e);
    public final OU0 d;

    public C7072us(@NonNull OU0 ou0) {
        this.d = ou0;
    }

    @Override // defpackage.InterfaceC5398mt1
    @NonNull
    public final A60 d(@NonNull C4227ha1 c4227ha1) {
        return A60.e;
    }

    @Override // defpackage.E60
    public final boolean f(@NonNull Object obj, @NonNull File file, @NonNull C4227ha1 c4227ha1) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((InterfaceC3667et1) obj).get();
        Z91<Bitmap.CompressFormat> z91 = g;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) c4227ha1.c(z91);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) c4227ha1.c(e)).intValue();
        OutputStream c2528Yu = null;
        c2528Yu = null;
        c2528Yu = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(file), file);
                    OU0 ou0 = this.d;
                    c2528Yu = fileOutputStreamB;
                    if (ou0 != null) {
                        c2528Yu = new C2528Yu(fileOutputStreamB, ou0);
                    }
                    bitmap.compress(compressFormat, iIntValue, c2528Yu);
                    c2528Yu.close();
                    try {
                        c2528Yu.close();
                    } catch (IOException unused) {
                    }
                    z = true;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException unused2) {
                Log.isLoggable("BitmapEncoder", 3);
                if (c2528Yu != null) {
                    try {
                        c2528Yu.close();
                    } catch (IOException unused3) {
                    }
                }
                z = false;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Objects.toString(compressFormat);
                C6177qc2.c(bitmap);
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(c4227ha1.c(z91));
                bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th2) {
            if (c2528Yu != null) {
                try {
                    c2528Yu.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }
}

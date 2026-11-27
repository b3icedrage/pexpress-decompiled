package defpackage;

import android.graphics.Bitmap;
import io.sentry.ILogger;
import io.sentry.android.core.ScreenshotEventProcessor;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: xG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC7578xG1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ CallableC7578xG1(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.d) {
            case 0:
                InterfaceC1560Mu0 interfaceC1560Mu0 = (InterfaceC1560Mu0) this.e;
                VG1 vg1 = (VG1) this.g;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, CG1.d));
                    try {
                        interfaceC1560Mu0.b(vg1, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                ILogger logger = ((ScreenshotEventProcessor) this.e).d.getLogger();
                Bitmap bitmap = (Bitmap) this.g;
                byte[] bArr = null;
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                            bitmap.recycle();
                            if (byteArrayOutputStream2.size() <= 0) {
                                logger.a(NG1.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream2.close();
                            } else {
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                bArr = byteArray2;
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream2.close();
                                break;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        logger.d(NG1.ERROR, "Compressing bitmap failed.", th7);
                    }
                    break;
                }
                return bArr;
        }
    }
}

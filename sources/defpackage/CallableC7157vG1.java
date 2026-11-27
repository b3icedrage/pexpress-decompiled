package defpackage;

import io.sentry.android.core.b0;
import io.sentry.instrumentation.file.j;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: vG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC7157vG1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC7157vG1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        ?? r3;
        boolean z;
        ?? r2;
        BufferedWriter bufferedWriter;
        switch (this.d) {
            case 0:
                return Integer.valueOf(((CG1.a) this.e).a().length);
            default:
                C6592sb2 c6592sb2 = (C6592sb2) this.e;
                synchronized (c6592sb2.f) {
                    try {
                        r3 = 0;
                        z = false;
                        if (c6592sb2.f.isMarked()) {
                            String reference = c6592sb2.f.getReference();
                            c6592sb2.f.set(reference, false);
                            z = true;
                            r2 = reference;
                        } else {
                            r2 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (z) {
                    File fileB = c6592sb2.a.a.b(c6592sb2.c, "user-data");
                    try {
                        try {
                            ?? xz0 = new XZ0();
                            xz0.put("userId", r2);
                            String string = xz0.toString();
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(j.a.b(new FileOutputStream(fileB), fileB), YZ0.b));
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                                r2 = bufferedWriter;
                            } catch (Exception e) {
                                e = e;
                                b0.f("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r2 = bufferedWriter;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = r2;
                            C7155vG.a(r3, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        C7155vG.a(r3, "Failed to close user metadata file.");
                        throw th;
                    }
                    C7155vG.a(r2, "Failed to close user metadata file.");
                    break;
                }
                return null;
        }
    }
}

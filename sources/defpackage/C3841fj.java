package defpackage;

import android.os.Looper;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: fj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3841fj extends G1 {
    public static volatile C3841fj f;

    @NonNull
    public static final ExecutorC3631ej g = new ExecutorC3631ej();

    @NonNull
    public final C4681jW e = new C4681jW();

    @NonNull
    public static C3841fj w() {
        if (f != null) {
            return f;
        }
        synchronized (C3841fj.class) {
            try {
                if (f == null) {
                    f = new C3841fj();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f;
    }

    public final boolean x() {
        this.e.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}

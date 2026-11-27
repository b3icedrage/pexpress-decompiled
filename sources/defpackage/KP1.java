package defpackage;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class KP1<T> extends W11<T> {
    @Override // androidx.lifecycle.LiveData
    public final T d() {
        T t = (T) super.d();
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Value in StateLiveData must not be null");
    }

    @Override // androidx.lifecycle.LiveData
    public final void k(T t) {
        if (Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            super.k(t);
        } else {
            i(t);
        }
    }
}

package defpackage;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Jf2<T> extends WeakReference<ViewDataBinding> {
    public final InterfaceC3511e81<T> a;
    public final int b;
    public LiveData c;

    public Jf2(ViewDataBinding viewDataBinding, int i, InterfaceC3511e81<T> interfaceC3511e81, ReferenceQueue<ViewDataBinding> referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.b = i;
        this.a = interfaceC3511e81;
    }

    public final boolean a() {
        boolean z;
        LiveData liveData = this.c;
        if (liveData != null) {
            this.a.a(liveData);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}

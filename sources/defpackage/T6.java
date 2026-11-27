package defpackage;

import androidx.annotation.NonNull;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class T6 {
    public final ExecutorService a;
    public final HashMap b;
    public final ReferenceQueue<W60<?>> c;
    public Q60 d;

    public static final class a extends WeakReference<W60<?>> {
        public final V60 a;
        public final boolean b;
        public InterfaceC3667et1<?> c;

        public a(@NonNull V60 v60, @NonNull W60 w60, @NonNull ReferenceQueue referenceQueue) {
            super(w60, referenceQueue);
            UE.e(v60, "Argument must not be null");
            this.a = v60;
            boolean z = w60.d;
            this.c = null;
            this.b = z;
        }
    }

    public T6() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new R6());
        this.b = new HashMap();
        this.c = new ReferenceQueue<>();
        this.a = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new S6(this));
    }

    public final synchronized void a(V60 v60, W60 w60) {
        a aVar = (a) this.b.put(v60, new a(v60, w60, this.c));
        if (aVar != null) {
            aVar.c = null;
            aVar.clear();
        }
    }

    public final void b(@NonNull a aVar) {
        InterfaceC3667et1<?> interfaceC3667et1;
        synchronized (this) {
            this.b.remove(aVar.a);
            if (aVar.b && (interfaceC3667et1 = aVar.c) != null) {
                this.d.d(aVar.a, new W60(interfaceC3667et1, true, false, aVar.a, this.d));
            }
        }
    }
}

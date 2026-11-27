package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: iD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC4368iD1 extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC7316w20 {
    public static final Object e = new Object();
    public static final Object g = new Object();
    public static final Object h = new Object();
    public static final Object i = new Object();
    public final Runnable d;

    public RunnableC4368iD1(Runnable runnable, InterfaceC7737y20 interfaceC7737y20) {
        super(3);
        this.d = runnable;
        lazySet(0, interfaceC7737y20);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == i) {
                return;
            }
            if (obj == g) {
                future.cancel(false);
                return;
            } else if (obj == h) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = i;
            if (obj6 == obj || obj6 == (obj4 = g) || obj6 == (obj5 = h)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = e) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC7737y20) obj2).a(this);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = h;
        Object obj3 = g;
        Object obj4 = e;
        Object obj5 = i;
        lazySet(2, Thread.currentThread());
        try {
            this.d.run();
        } catch (Throwable th) {
            try {
                EB1.b(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((InterfaceC7737y20) obj6).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((InterfaceC7737y20) obj7).a(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}

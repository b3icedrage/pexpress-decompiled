package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2853b1<V> implements PQ0<V> {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(AbstractC2853b1.class.getName());
    public static final a j;
    public static final Object k;
    public volatile Object d;
    public volatile d e;
    public volatile h g;

    /* JADX INFO: renamed from: b1$a */
    public static abstract class a {
        public abstract boolean a(AbstractC2853b1<?> abstractC2853b1, d dVar, d dVar2);

        public abstract boolean b(AbstractC2853b1<?> abstractC2853b1, Object obj, Object obj2);

        public abstract boolean c(AbstractC2853b1<?> abstractC2853b1, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: b1$b */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final CancellationException b;

        static {
            if (AbstractC2853b1.h) {
                d = null;
                c = null;
            } else {
                d = new b(false, null);
                c = new b(true, null);
            }
        }

        public b(boolean z, CancellationException cancellationException) {
            this.a = z;
            this.b = cancellationException;
        }
    }

    /* JADX INFO: renamed from: b1$c */
    public static final class c {
        public final Throwable a;

        /* JADX INFO: renamed from: b1$c$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z = AbstractC2853b1.h;
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: renamed from: b1$d */
    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* JADX INFO: renamed from: b1$e */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<AbstractC2853b1, h> c;
        public final AtomicReferenceFieldUpdater<AbstractC2853b1, d> d;
        public final AtomicReferenceFieldUpdater<AbstractC2853b1, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC2853b1, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC2853b1, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC2853b1, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // defpackage.AbstractC2853b1.a
        public final boolean a(AbstractC2853b1<?> abstractC2853b1, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractC2853b1, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC2853b1, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC2853b1) == dVar);
            return false;
        }

        @Override // defpackage.AbstractC2853b1.a
        public final boolean b(AbstractC2853b1<?> abstractC2853b1, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC2853b1, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC2853b1, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC2853b1) == obj);
            return false;
        }

        @Override // defpackage.AbstractC2853b1.a
        public final boolean c(AbstractC2853b1<?> abstractC2853b1, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractC2853b1, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC2853b1, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC2853b1) == hVar);
            return false;
        }

        @Override // defpackage.AbstractC2853b1.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // defpackage.AbstractC2853b1.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: b1$f */
    public static final class f<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: b1$g */
    public static final class g extends a {
        @Override // defpackage.AbstractC2853b1.a
        public final boolean a(AbstractC2853b1<?> abstractC2853b1, d dVar, d dVar2) {
            synchronized (abstractC2853b1) {
                try {
                    if (abstractC2853b1.e != dVar) {
                        return false;
                    }
                    abstractC2853b1.e = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC2853b1.a
        public final boolean b(AbstractC2853b1<?> abstractC2853b1, Object obj, Object obj2) {
            synchronized (abstractC2853b1) {
                try {
                    if (abstractC2853b1.d != obj) {
                        return false;
                    }
                    abstractC2853b1.d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC2853b1.a
        public final boolean c(AbstractC2853b1<?> abstractC2853b1, h hVar, h hVar2) {
            synchronized (abstractC2853b1) {
                try {
                    if (abstractC2853b1.g != hVar) {
                        return false;
                    }
                    abstractC2853b1.g = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC2853b1.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // defpackage.AbstractC2853b1.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* JADX INFO: renamed from: b1$h */
    public static final class h {
        public static final h c = new h();
        public volatile Thread a;
        public volatile h b;

        public h() {
            AbstractC2853b1.j.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, R51.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2853b1.class, h.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2853b1.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2853b1.class, Object.class, "d"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        j = gVar;
        if (th != null) {
            i.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        k = new Object();
    }

    public static void i(AbstractC2853b1<?> abstractC2853b1) {
        h hVar;
        d dVar;
        do {
            hVar = abstractC2853b1.g;
        } while (!j.c(abstractC2853b1, hVar, h.c));
        while (hVar != null) {
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.b;
        }
        abstractC2853b1.e();
        do {
            dVar = abstractC2853b1.e;
        } while (!j.a(abstractC2853b1, dVar, d.d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.c;
            dVar.c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.c;
            Runnable runnable = dVar2.a;
            if (runnable instanceof f) {
                ((f) runnable).getClass();
                throw null;
            }
            k(runnable, dVar2.b);
            dVar2 = dVar4;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            i.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object l(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            CancellationException cancellationException = ((b) obj).b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == k) {
            return null;
        }
        return obj;
    }

    public static Object m(AbstractC2853b1 abstractC2853b1) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC2853b1.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void b(StringBuilder sb) {
        try {
            Object objM = m(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM == this ? "this future" : String.valueOf(objM));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        b bVar;
        Object obj = this.d;
        if ((obj == null) | (obj instanceof f)) {
            if (h) {
                bVar = new b(z, new CancellationException("Future.cancel() was called."));
            } else {
                bVar = z ? b.c : b.d;
            }
            while (!j.b(this, obj, bVar)) {
                obj = this.d;
                if (!(obj instanceof f)) {
                }
            }
            i(this);
            if (!(obj instanceof f)) {
                return true;
            }
            ((f) obj).getClass();
            throw null;
        }
        return false;
    }

    @Override // defpackage.PQ0
    public final void f(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.e;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (j.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.e;
                }
            } while (dVar != dVar2);
        }
        k(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.d;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) l(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.g;
            h hVar2 = h.c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                z = true;
                while (true) {
                    a aVar = j;
                    aVar.d(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) l(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(hVar3);
                        break;
                    }
                    hVar = this.g;
                    if (hVar == hVar2) {
                    }
                }
            }
            return (V) l(this.d);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) l(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strC = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strC2 = Z0.c(strC, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z2 = (jConvert == 0 || nanos2 > 1000) ? z : false;
            if (jConvert > 0) {
                String strC3 = strC2 + jConvert + " " + lowerCase;
                if (z2) {
                    strC3 = Z0.c(strC3, ",");
                }
                strC2 = Z0.c(strC3, " ");
            }
            if (z2) {
                strC2 = strC2 + nanos2 + " nanoseconds ";
            }
            strC = Z0.c(strC2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(Z0.c(strC, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C2629a1.b(strC, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String n() {
        Object obj = this.d;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ((f) obj).getClass();
            sb.append("null");
            sb.append("]");
            return sb.toString();
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.g;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                    }
                } else if (!j.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        String strN;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strN = n();
            } catch (RuntimeException e2) {
                strN = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strN != null && !strN.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strN);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) l(obj2);
            }
            h hVar = this.g;
            h hVar2 = h.c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = j;
                    aVar.d(hVar3, hVar);
                    if (aVar.c(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.d;
                            } else {
                                o(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) l(obj);
                    }
                    hVar = this.g;
                } while (hVar != hVar2);
            }
            return (V) l(this.d);
        }
        throw new InterruptedException();
    }
}

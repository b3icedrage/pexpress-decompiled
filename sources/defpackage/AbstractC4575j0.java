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

/* JADX INFO: renamed from: j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4575j0<V> implements PQ0<V> {
    public static final boolean h = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger i = Logger.getLogger(AbstractC4575j0.class.getName());
    public static final a j;
    public static final Object k;
    public volatile Object d;
    public volatile d e;
    public volatile h g;

    /* JADX INFO: renamed from: j0$a */
    public static abstract class a {
        public abstract boolean a(AbstractC4575j0<?> abstractC4575j0, d dVar, d dVar2);

        public abstract boolean b(AbstractC4575j0<?> abstractC4575j0, Object obj, Object obj2);

        public abstract boolean c(AbstractC4575j0<?> abstractC4575j0, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: j0$b */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final CancellationException b;

        static {
            if (AbstractC4575j0.h) {
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

    /* JADX INFO: renamed from: j0$c */
    public static final class c {
        public static final c b = new c(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* JADX INFO: renamed from: j0$c$a */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z = AbstractC4575j0.h;
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: renamed from: j0$d */
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

    /* JADX INFO: renamed from: j0$e */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<AbstractC4575j0, h> c;
        public final AtomicReferenceFieldUpdater<AbstractC4575j0, d> d;
        public final AtomicReferenceFieldUpdater<AbstractC4575j0, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC4575j0, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC4575j0, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC4575j0, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // defpackage.AbstractC4575j0.a
        public final boolean a(AbstractC4575j0<?> abstractC4575j0, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<AbstractC4575j0, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4575j0, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4575j0) == dVar);
            return false;
        }

        @Override // defpackage.AbstractC4575j0.a
        public final boolean b(AbstractC4575j0<?> abstractC4575j0, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractC4575j0, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4575j0, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4575j0) == obj);
            return false;
        }

        @Override // defpackage.AbstractC4575j0.a
        public final boolean c(AbstractC4575j0<?> abstractC4575j0, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<AbstractC4575j0, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractC4575j0, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractC4575j0) == hVar);
            return false;
        }

        @Override // defpackage.AbstractC4575j0.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // defpackage.AbstractC4575j0.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: j0$f */
    public static final class f<V> implements Runnable {
        public final C6117qJ1 d;
        public final PQ0<? extends V> e;

        public f(C6117qJ1 c6117qJ1, PQ0 pq0) {
            this.d = c6117qJ1;
            this.e = pq0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.d.d != this) {
                return;
            }
            if (AbstractC4575j0.j.b(this.d, this, AbstractC4575j0.e(this.e))) {
                AbstractC4575j0.b(this.d);
            }
        }
    }

    /* JADX INFO: renamed from: j0$g */
    public static final class g extends a {
        @Override // defpackage.AbstractC4575j0.a
        public final boolean a(AbstractC4575j0<?> abstractC4575j0, d dVar, d dVar2) {
            synchronized (abstractC4575j0) {
                try {
                    if (abstractC4575j0.e != dVar) {
                        return false;
                    }
                    abstractC4575j0.e = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC4575j0.a
        public final boolean b(AbstractC4575j0<?> abstractC4575j0, Object obj, Object obj2) {
            synchronized (abstractC4575j0) {
                try {
                    if (abstractC4575j0.d != obj) {
                        return false;
                    }
                    abstractC4575j0.d = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC4575j0.a
        public final boolean c(AbstractC4575j0<?> abstractC4575j0, h hVar, h hVar2) {
            synchronized (abstractC4575j0) {
                try {
                    if (abstractC4575j0.g != hVar) {
                        return false;
                    }
                    abstractC4575j0.g = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.AbstractC4575j0.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // defpackage.AbstractC4575j0.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* JADX INFO: renamed from: j0$h */
    public static final class h {
        public static final h c = new h();
        public volatile Thread a;
        public volatile h b;

        public h() {
            AbstractC4575j0.j.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, R51.PUSH_ADDITIONAL_DATA_KEY), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4575j0.class, h.class, "g"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4575j0.class, d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractC4575j0.class, Object.class, "d"));
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

    public static void b(AbstractC4575j0<?> abstractC4575j0) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = abstractC4575j0.g;
            if (j.c(abstractC4575j0, hVar, h.c)) {
                while (hVar != null) {
                    Thread thread = hVar.a;
                    if (thread != null) {
                        hVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.b;
                }
                do {
                    dVar = abstractC4575j0.e;
                } while (!j.a(abstractC4575j0, dVar, d.d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.c;
                    dVar3.c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.c;
                    Runnable runnable = dVar2.a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        abstractC4575j0 = fVar.d;
                        if (abstractC4575j0.d == fVar) {
                            if (j.b(abstractC4575j0, fVar, e(fVar.e))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            i.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
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

    public static Object e(PQ0<?> pq0) {
        if (pq0 instanceof AbstractC4575j0) {
            Object obj = ((AbstractC4575j0) pq0).d;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (bVar.a) {
                return bVar.b != null ? new b(false, bVar.b) : b.d;
            }
            return obj;
        }
        boolean zIsCancelled = pq0.isCancelled();
        if ((!h) && zIsCancelled) {
            return b.d;
        }
        try {
            Object objG = g(pq0);
            return objG == null ? k : objG;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new b(false, e2);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + pq0, e2));
        } catch (ExecutionException e3) {
            return new c(e3.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(PQ0 pq0) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = pq0.get();
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
        return v;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
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
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (h) {
            bVar = new b(z, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z ? b.c : b.d;
        }
        AbstractC4575j0<V> abstractC4575j0 = this;
        boolean z2 = false;
        while (true) {
            if (j.b(abstractC4575j0, obj, bVar)) {
                b(abstractC4575j0);
                if (!(obj instanceof f)) {
                    break;
                }
                PQ0<? extends V> pq0 = ((f) obj).e;
                if (!(pq0 instanceof AbstractC4575j0)) {
                    pq0.cancel(z);
                    break;
                }
                abstractC4575j0 = (AbstractC4575j0) pq0;
                obj = abstractC4575j0.d;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z2 = true;
            } else {
                obj = abstractC4575j0.d;
                if (!(obj instanceof f)) {
                    return z2;
                }
            }
        }
        return true;
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
        c(runnable, executor);
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
            return (V) d(obj);
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
                                i(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.d;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(hVar3);
                        break;
                    }
                    hVar = this.g;
                    if (hVar == hVar2) {
                    }
                }
            }
            return (V) d(this.d);
        }
        z = true;
        while (nanos > 0) {
            Object obj3 = this.d;
            if ((obj3 != null ? z : false) && (!(obj3 instanceof f))) {
                return (V) d(obj3);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.d;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            PQ0<? extends V> pq0 = ((f) obj).e;
            return C5807oq.b(sb, pq0 == this ? "this future" : String.valueOf(pq0), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.d instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.d;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.d instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.d;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) d(obj2);
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
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) d(obj);
                    }
                    hVar = this.g;
                } while (hVar != hVar2);
            }
            return (V) d(this.d);
        }
        throw new InterruptedException();
    }
}

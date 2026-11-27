package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8120zr<T> extends AbstractC1363Kg0<T> {
    public static final Object[] l = new Object[0];
    public static final a[] m = new a[0];
    public static final a[] n = new a[0];
    public final AtomicReference<a<T>[]> e;
    public final Lock g;
    public final Lock h;
    public final AtomicReference<Object> i = new AtomicReference<>();
    public final AtomicReference<Throwable> j;
    public long k;

    /* JADX INFO: renamed from: zr$a */
    public static final class a<T> extends AtomicLong implements InterfaceC6779tU1, InterfaceC5352mg1 {
        public final InterfaceC1518Mg0 d;
        public final C8120zr<T> e;
        public boolean g;
        public boolean h;
        public C7247vi i;
        public boolean j;
        public volatile boolean k;
        public long l;

        public a(InterfaceC1518Mg0 interfaceC1518Mg0, C8120zr c8120zr) {
            this.d = interfaceC1518Mg0;
            this.e = c8120zr;
        }

        public final void a(long j, Object obj) {
            if (this.k) {
                return;
            }
            if (!this.j) {
                synchronized (this) {
                    try {
                        if (this.k) {
                            return;
                        }
                        if (this.l == j) {
                            return;
                        }
                        if (this.h) {
                            C7247vi c7247vi = this.i;
                            if (c7247vi == null) {
                                c7247vi = new C7247vi();
                                this.i = c7247vi;
                            }
                            c7247vi.a(obj);
                            return;
                        }
                        this.g = true;
                        this.j = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            if (this.k) {
                return;
            }
            this.k = true;
            this.e.i(this);
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            if (EnumC7620xU1.e(j)) {
                C3057c.a(this, j);
            }
        }

        @Override // defpackage.InterfaceC5352mg1
        public final boolean test(Object obj) {
            if (this.k) {
                return true;
            }
            if (obj == EnumC7754y61.d) {
                this.d.onComplete();
                return true;
            }
            if (obj instanceof EnumC7754y61.a) {
                this.d.a(((EnumC7754y61.a) obj).d);
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.d.a(new C7940z01("Could not deliver value due to lack of requests"));
                return true;
            }
            this.d.d(obj);
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public C8120zr() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.g = reentrantReadWriteLock.readLock();
        this.h = reentrantReadWriteLock.writeLock();
        this.e = new AtomicReference<>(m);
        this.j = new AtomicReference<>();
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable th) {
        C1589Ne.r(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<Throwable> atomicReference = this.j;
        while (!atomicReference.compareAndSet(null, th)) {
            if (atomicReference.get() != null) {
                EB1.b(th);
                return;
            }
        }
        EnumC7754y61.a aVar = new EnumC7754y61.a(th);
        AtomicReference<a<T>[]> atomicReference2 = this.e;
        a<T>[] andSet = atomicReference2.get();
        a<T>[] aVarArr = n;
        if (andSet != aVarArr && (andSet = atomicReference2.getAndSet(aVarArr)) != aVarArr) {
            Lock lock = this.h;
            lock.lock();
            this.k++;
            this.i.lazySet(aVar);
            lock.unlock();
        }
        for (a<T> aVar2 : andSet) {
            aVar2.a(this.k, aVar);
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(T t) {
        C1589Ne.r(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.j.get() != null) {
            return;
        }
        Lock lock = this.h;
        lock.lock();
        this.k++;
        this.i.lazySet(t);
        lock.unlock();
        for (a<T> aVar : this.e.get()) {
            aVar.a(this.k, t);
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        if (this.j.get() != null) {
            interfaceC6779tU1.cancel();
        } else {
            interfaceC6779tU1.s(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        C7247vi c7247vi;
        Object[] objArr;
        a<T> aVar = new a<>(interfaceC1518Mg0, this);
        interfaceC1518Mg0.f(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.e;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == n) {
                Throwable th = this.j.get();
                if (th == C90.a) {
                    interfaceC1518Mg0.onComplete();
                    return;
                } else {
                    interfaceC1518Mg0.a(th);
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.k) {
                        i(aVar);
                        return;
                    }
                    if (aVar.k) {
                        return;
                    }
                    synchronized (aVar) {
                        try {
                            if (aVar.k) {
                                return;
                            }
                            if (aVar.g) {
                                return;
                            }
                            C8120zr<T> c8120zr = aVar.e;
                            Lock lock = c8120zr.g;
                            lock.lock();
                            aVar.l = c8120zr.k;
                            Object obj = c8120zr.i.get();
                            lock.unlock();
                            aVar.h = obj != null;
                            aVar.g = true;
                            if (obj == null || aVar.test(obj)) {
                                return;
                            }
                            while (!aVar.k) {
                                synchronized (aVar) {
                                    try {
                                        c7247vi = aVar.i;
                                        if (c7247vi == null) {
                                            aVar.h = false;
                                            return;
                                        }
                                        aVar.i = null;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                for (Object[] objArr2 = (Object[]) c7247vi.b; objArr2 != null; objArr2 = objArr2[4]) {
                                    for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                        if (aVar.test(objArr)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    public final void i(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.e;
            a<T>[] aVarArr2 = atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = m;
            } else {
                a<T>[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                }
            }
            return;
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void onComplete() {
        AtomicReference<Throwable> atomicReference = this.j;
        C90.a aVar = C90.a;
        while (!atomicReference.compareAndSet(null, aVar)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        EnumC7754y61 enumC7754y61 = EnumC7754y61.d;
        AtomicReference<a<T>[]> atomicReference2 = this.e;
        a<T>[] andSet = atomicReference2.get();
        a<T>[] aVarArr = n;
        if (andSet != aVarArr && (andSet = atomicReference2.getAndSet(aVarArr)) != aVarArr) {
            Lock lock = this.h;
            lock.lock();
            this.k++;
            this.i.lazySet(enumC7754y61);
            lock.unlock();
        }
        for (a<T> aVar2 : andSet) {
            aVar2.a(this.k, enumC7754y61);
        }
    }
}

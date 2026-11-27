package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Uk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2158Uk1<T> extends AbstractC1363Kg0<T> {
    public static final a[] h = new a[0];
    public static final a[] i = new a[0];
    public final AtomicReference<a<T>[]> e = new AtomicReference<>(i);
    public Throwable g;

    /* JADX INFO: renamed from: Uk1$a */
    public static final class a<T> extends AtomicLong implements InterfaceC6779tU1 {
        public final InterfaceC1518Mg0 d;
        public final C2158Uk1<T> e;

        public a(InterfaceC1518Mg0 interfaceC1518Mg0, C2158Uk1 c2158Uk1) {
            this.d = interfaceC1518Mg0;
            this.e = c2158Uk1;
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.e.i(this);
            }
        }

        @Override // defpackage.InterfaceC6779tU1
        public final void s(long j) {
            long j2;
            long j3;
            if (EnumC7620xU1.e(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j3 = j2 + j;
                    }
                } while (!compareAndSet(j2, j3 >= 0 ? j3 : Long.MAX_VALUE));
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void a(Throwable th) {
        C1589Ne.r(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        AtomicReference<a<T>[]> atomicReference = this.e;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = h;
        if (aVarArr == aVarArr2) {
            EB1.b(th);
            return;
        }
        this.g = th;
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.d.a(th);
            } else {
                EB1.b(th);
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void d(T t) {
        long j;
        long j2;
        C1589Ne.r(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (a<T> aVar : this.e.get()) {
            long j3 = aVar.get();
            if (j3 != Long.MIN_VALUE) {
                InterfaceC1518Mg0 interfaceC1518Mg0 = aVar.d;
                if (j3 != 0) {
                    interfaceC1518Mg0.d(t);
                    do {
                        j = aVar.get();
                        if (j == Long.MIN_VALUE || j == Long.MAX_VALUE) {
                            break;
                        }
                        j2 = j - 1;
                        if (j2 < 0) {
                            EB1.b(new IllegalStateException(C6419rl.a("More produced than requested: ", j2)));
                            j2 = 0;
                        }
                    } while (!aVar.compareAndSet(j, j2));
                } else {
                    aVar.cancel();
                    interfaceC1518Mg0.a(new C7940z01("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // defpackage.InterfaceC6359rU1
    public final void f(InterfaceC6779tU1 interfaceC6779tU1) {
        if (this.e.get() == h) {
            interfaceC6779tU1.cancel();
        } else {
            interfaceC6779tU1.s(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        a<T> aVar = new a<>(interfaceC1518Mg0, this);
        interfaceC1518Mg0.f(aVar);
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.e;
            a<T>[] aVarArr = atomicReference.get();
            if (aVarArr == h) {
                Throwable th = this.g;
                if (th != null) {
                    interfaceC1518Mg0.a(th);
                    return;
                } else {
                    interfaceC1518Mg0.onComplete();
                    return;
                }
            }
            int length = aVarArr.length;
            a<T>[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            do {
                if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                    if (aVar.get() == Long.MIN_VALUE) {
                        i(aVar);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVarArr);
        }
    }

    public final void i(a<T> aVar) {
        a<T>[] aVarArr;
        while (true) {
            AtomicReference<a<T>[]> atomicReference = this.e;
            a<T>[] aVarArr2 = atomicReference.get();
            if (aVarArr2 == h || aVarArr2 == (aVarArr = i)) {
                return;
            }
            int length = aVarArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (aVarArr2[i2] == aVar) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 < 0) {
                return;
            }
            if (length != 1) {
                aVarArr = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr, 0, i2);
                System.arraycopy(aVarArr2, i2 + 1, aVarArr, i2, (length - i2) - 1);
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
        AtomicReference<a<T>[]> atomicReference = this.e;
        a<T>[] aVarArr = atomicReference.get();
        a<T>[] aVarArr2 = h;
        if (aVarArr == aVarArr2) {
            return;
        }
        a<T>[] andSet = atomicReference.getAndSet(aVarArr2);
        for (a<T> aVar : andSet) {
            if (aVar.get() != Long.MIN_VALUE) {
                aVar.d.onComplete();
            }
        }
    }
}

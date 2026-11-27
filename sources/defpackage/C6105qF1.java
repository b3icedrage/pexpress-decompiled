package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6105qF1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(C6105qF1.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(C6105qF1.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(C6105qF1.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(C6105qF1.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(C6105qF1.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    @NotNull
    public final VK0 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C6105qF1(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        C6524sF1 c6524sF1 = new C6524sF1(0L, null, 2);
        this.head$volatile = c6524sF1;
        this.tail$volatile = c6524sF1;
        this._availablePermits$volatile = 1 - i;
        this.a = new VK0(this, 1);
    }

    public final void c(@NotNull C4795k21.a aVar) {
        Object objD;
        long j;
        C6524sF1 c6524sF1;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Function1 function1 = this.a;
                if (andDecrement > 0) {
                    aVar.m(Unit.a, function1);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                C6524sF1 c6524sF2 = (C6524sF1) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                C5685oF1 c5685oF1 = C5685oF1.m;
                long j2 = andIncrement / ((long) C6314rF1.f);
                while (true) {
                    objD = C4994l.d(c6524sF2, j2, c5685oF1);
                    if (C6621sj.i(objD)) {
                        j = andIncrement;
                        break;
                    }
                    AbstractC7992zE1 abstractC7992zE1F = C6621sj.f(objD);
                    while (true) {
                        AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(this);
                        c6524sF1 = c6524sF2;
                        j = andIncrement;
                        if (abstractC7992zE1.g >= abstractC7992zE1F.g) {
                            break;
                        }
                        if (!abstractC7992zE1F.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7992zE1, abstractC7992zE1F)) {
                                if (!abstractC7992zE1.f()) {
                                    break;
                                }
                                abstractC7992zE1.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == abstractC7992zE1);
                        if (abstractC7992zE1F.f()) {
                            abstractC7992zE1F.e();
                        }
                        c6524sF2 = c6524sF1;
                        andIncrement = j;
                    }
                    c6524sF2 = c6524sF1;
                    andIncrement = j;
                }
                C6524sF1 c6524sF3 = (C6524sF1) C6621sj.f(objD);
                int i = (int) (j % ((long) C6314rF1.f));
                AtomicReferenceArray atomicReferenceArray = c6524sF3.i;
                do {
                    if (atomicReferenceArray.compareAndSet(i, null, aVar)) {
                        aVar.c(c6524sF3, i);
                        return;
                    }
                } while (atomicReferenceArray.get(i) == null);
                GW1 gw1 = C6314rF1.b;
                GW1 gw2 = C6314rF1.c;
                do {
                    if (atomicReferenceArray.compareAndSet(i, gw1, gw2)) {
                        aVar.m(Unit.a, function1);
                        return;
                    }
                } while (atomicReferenceArray.get(i) == gw1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    public final void d() {
        boolean zB;
        int i;
        Object objD;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            zB = true;
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            C6524sF1 c6524sF1 = (C6524sF1) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = c.getAndIncrement(this);
            long j = andIncrement2 / ((long) C6314rF1.f);
            C5895pF1 c5895pF1 = C5895pF1.m;
            while (true) {
                objD = C4994l.d(c6524sF1, j, c5895pF1);
                if (!C6621sj.i(objD)) {
                    AbstractC7992zE1 abstractC7992zE1F = C6621sj.f(objD);
                    while (true) {
                        AbstractC7992zE1 abstractC7992zE1 = (AbstractC7992zE1) atomicReferenceFieldUpdater.get(this);
                        if (abstractC7992zE1.g >= abstractC7992zE1F.g) {
                            break;
                        }
                        if (!abstractC7992zE1F.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC7992zE1, abstractC7992zE1F)) {
                                if (!abstractC7992zE1.f()) {
                                    break;
                                }
                                abstractC7992zE1.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == abstractC7992zE1);
                        if (abstractC7992zE1F.f()) {
                            abstractC7992zE1F.e();
                        }
                    }
                } else {
                    break;
                }
            }
            C6524sF1 c6524sF2 = (C6524sF1) C6621sj.f(objD);
            c6524sF2.b();
            boolean z = false;
            if (c6524sF2.g > j) {
                zB = false;
            } else {
                int i2 = (int) (andIncrement2 % ((long) C6314rF1.f));
                GW1 gw1 = C6314rF1.b;
                AtomicReferenceArray atomicReferenceArray = c6524sF2.i;
                Object andSet = atomicReferenceArray.getAndSet(i2, gw1);
                if (andSet == null) {
                    int i3 = C6314rF1.a;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            GW1 gw2 = C6314rF1.b;
                            GW1 gw3 = C6314rF1.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i2, gw2, gw3)) {
                                    z = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i2) == gw2);
                            zB = true ^ z;
                            break;
                        }
                        if (atomicReferenceArray.get(i2) == C6314rF1.c) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                } else if (andSet == C6314rF1.e) {
                    zB = false;
                } else if (andSet instanceof InterfaceC6041py) {
                    InterfaceC6041py interfaceC6041py = (InterfaceC6041py) andSet;
                    GW1 gw1B = interfaceC6041py.b(Unit.a, this.a);
                    if (gw1B != null) {
                        interfaceC6041py.s(gw1B);
                    } else {
                        zB = false;
                    }
                } else {
                    if (!(andSet instanceof InterfaceC3744fF1)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    zB = ((InterfaceC3744fF1) andSet).b(this, Unit.a);
                }
            }
        } while (!zB);
    }
}

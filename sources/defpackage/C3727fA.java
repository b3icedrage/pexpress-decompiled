package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3727fA<E> extends AbstractC7992zE1<C3727fA<E>> {

    @Nullable
    public final C2030Su<E> i;
    public final /* synthetic */ AtomicReferenceArray j;

    public C3727fA(long j, @Nullable C3727fA<E> c3727fA, @Nullable C2030Su<E> c2030Su, int i) {
        super(j, c3727fA, i);
        this.i = c2030Su;
        this.j = new AtomicReferenceArray(C2450Xu.b * 2);
    }

    @Override // defpackage.AbstractC7992zE1
    public final int g() {
        return C2450Xu.b;
    }

    @Override // defpackage.AbstractC7992zE1
    public final void h(int i, @NotNull CoroutineContext coroutineContext) {
        C2030Su<E> c2030Su;
        int i2 = C2450Xu.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.j.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof InterfaceC7449wf2;
            c2030Su = this.i;
            if (z2 || (objL instanceof C7869yf2)) {
                if (k(i, objL, z ? C2450Xu.j : C2450Xu.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        Intrinsics.checkNotNull(c2030Su);
                        c2030Su.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == C2450Xu.j || objL == C2450Xu.k) {
                    break;
                }
                if (objL != C2450Xu.g && objL != C2450Xu.f) {
                    if (objL == C2450Xu.i || objL == C2450Xu.d || objL == C2450Xu.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i, null);
        if (z) {
            Intrinsics.checkNotNull(c2030Su);
            c2030Su.getClass();
        }
    }

    public final boolean k(int i, @Nullable Object obj, @Nullable Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.j;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final Object l(int i) {
        return this.j.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            C2030Su<E> c2030Su = this.i;
            Intrinsics.checkNotNull(c2030Su);
            c2030Su.M((this.g * ((long) C2450Xu.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.j.set(i * 2, obj);
    }

    public final void o(int i, @Nullable GW1 gw1) {
        this.j.set((i * 2) + 1, gw1);
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6251qy<T> extends AbstractC5427n20<T> implements InterfaceC6041py<T>, NN, InterfaceC7449wf2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(C6251qy.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(C6251qy.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C6251qy.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @NotNull
    public final JM<T> h;

    @NotNull
    public final CoroutineContext i;

    public C6251qy(int i, @NotNull JM jm) {
        super(i);
        this.h = jm;
        this.i = jm.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = Q6.d;
    }

    public static Object C(F51 f51, Object obj, int i, Function1 function1) {
        if (obj instanceof OG) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (function1 != null || (f51 instanceof InterfaceC4778jy)) {
            return new MG(obj, f51 instanceof InterfaceC4778jy ? (InterfaceC4778jy) f51 : null, function1, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(F51 f51, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f51 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof F51)) {
                if (obj2 instanceof C7511wy) {
                    C7511wy c7511wy = (C7511wy) obj2;
                    c7511wy.getClass();
                    if (C7511wy.c.compareAndSet(c7511wy, 0, 1)) {
                        if (function1 != null) {
                            j(function1, c7511wy.a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objC = C((F51) obj2, obj, i, function1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        n();
                    }
                    o(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void B(@NotNull DN dn, T t) {
        JM<T> jm = this.h;
        C5004l20 c5004l20 = jm instanceof C5004l20 ? (C5004l20) jm : null;
        A(t, (c5004l20 != null ? c5004l20.h : null) == dn ? 4 : this.g, null);
    }

    public final GW1 D(Object obj, Function1 function1) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z = obj2 instanceof F51;
            GW1 gw1 = C3057c.d;
            if (!z) {
                boolean z2 = obj2 instanceof MG;
                return null;
            }
            Object objC = C((F51) obj2, obj, this.g, function1);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (!w()) {
                        n();
                    }
                    return gw1;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // defpackage.AbstractC5427n20
    public final void a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof F51) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof OG) {
                return;
            }
            if (!(obj2 instanceof MG)) {
                cancellationException2 = cancellationException;
                MG mg = new MG(obj2, (InterfaceC4778jy) null, (Function1) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mg)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            MG mg2 = (MG) obj2;
            if (mg2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            MG mgA = MG.a(mg2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, mgA)) {
                    InterfaceC4778jy interfaceC4778jy = mg2.b;
                    if (interfaceC4778jy != null) {
                        i(interfaceC4778jy, cancellationException);
                    }
                    Function1<Throwable, Unit> function1 = mg2.c;
                    if (function1 != null) {
                        j(function1, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // defpackage.InterfaceC6041py
    @Nullable
    public final GW1 b(Object obj, @Nullable Function1 function1) {
        return D(obj, function1);
    }

    @Override // defpackage.InterfaceC7449wf2
    public final void c(@NotNull AbstractC7992zE1<?> abstractC7992zE1, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(abstractC7992zE1);
    }

    @Override // defpackage.AbstractC5427n20
    @NotNull
    public final JM<T> d() {
        return this.h;
    }

    @Override // defpackage.AbstractC5427n20
    @Nullable
    public final Throwable e(@Nullable Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC5427n20
    public final <T> T f(@Nullable Object obj) {
        return obj instanceof MG ? (T) ((MG) obj).a : obj;
    }

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        JM<T> jm = this.h;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return this.i;
    }

    @Override // defpackage.AbstractC5427n20
    @Nullable
    public final Object h() {
        return k.get(this);
    }

    public final void i(@NotNull InterfaceC4778jy interfaceC4778jy, @Nullable Throwable th) {
        try {
            interfaceC4778jy.a(th);
        } catch (Throwable th2) {
            GN.a(new QG("Exception in invokeOnCancellation handler for " + this, th2), this.i);
        }
    }

    public final void j(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            GN.a(new QG("Exception in resume onCancellation handler for " + this, th2), this.i);
        }
    }

    public final void k(AbstractC7992zE1<?> abstractC7992zE1, Throwable th) {
        CoroutineContext coroutineContext = this.i;
        int i = j.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC7992zE1.h(i, coroutineContext);
        } catch (Throwable th2) {
            GN.a(new QG("Exception in invokeOnCancellation handler for " + this, th2), coroutineContext);
        }
    }

    public final boolean l(@Nullable Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof F51)) {
                return false;
            }
            C7511wy c7511wy = new C7511wy(this, th, (obj instanceof InterfaceC4778jy) || (obj instanceof AbstractC7992zE1));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c7511wy)) {
                    F51 f51 = (F51) obj;
                    if (f51 instanceof InterfaceC4778jy) {
                        i((InterfaceC4778jy) obj, th);
                    } else if (f51 instanceof AbstractC7992zE1) {
                        k((AbstractC7992zE1) obj, th);
                    }
                    if (!w()) {
                        n();
                    }
                    o(this.g);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // defpackage.InterfaceC6041py
    public final void m(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        A(t, this.g, function1);
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        A20 a20 = (A20) atomicReferenceFieldUpdater.get(this);
        if (a20 == null) {
            return;
        }
        a20.b();
        atomicReferenceFieldUpdater.set(this, C7960z51.d);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                JM<T> jm = this.h;
                if (!z && (jm instanceof C5004l20)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.g;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        DN dn = ((C5004l20) jm).h;
                        CoroutineContext context = ((C5004l20) jm).i.getContext();
                        if (dn.k1(context)) {
                            dn.c1(context, this);
                            return;
                        }
                        A80 a80A = EY1.a();
                        if (a80A.g >= 4294967296L) {
                            a80A.t1(this);
                            return;
                        }
                        a80A.u1(true);
                        try {
                            C5637o20.a(this, jm, true);
                            do {
                            } while (a80A.w1());
                        } catch (Throwable th) {
                            try {
                                g(th, null);
                            } finally {
                                a80A.s1(true);
                            }
                        }
                        return;
                    }
                }
                C5637o20.a(this, jm, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @NotNull
    public Throwable p(@NotNull C3956gG0 c3956gG0) {
        return c3956gG0.C();
    }

    @Nullable
    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = j;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = k.get(this);
                if (obj instanceof OG) {
                    throw ((OG) obj).a;
                }
                int i3 = this.g;
                if (i3 == 1 || i3 == 2) {
                    XF0 xf0 = (XF0) this.i.p(XF0.a.d);
                    if (xf0 != null && !xf0.g()) {
                        CancellationException cancellationExceptionC = xf0.C();
                        a(obj, cancellationExceptionC);
                        throw cancellationExceptionC;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((A20) l.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return MN.d;
    }

    public final void r() {
        A20 a20T = t();
        if (a20T == null || (k.get(this) instanceof F51)) {
            return;
        }
        a20T.b();
        l.set(this, C7960z51.d);
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        Throwable thA = C1717Ot1.a(obj);
        if (thA != null) {
            obj = new OG(thA, false);
        }
        A(obj, this.g, null);
    }

    @Override // defpackage.InterfaceC6041py
    public final void s(@NotNull Object obj) {
        o(this.g);
    }

    public final A20 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        XF0 xf0 = (XF0) this.i.p(XF0.a.d);
        if (xf0 == null) {
            return null;
        }
        A20 a20J = ED.j(xf0, true, new VB(this), 2);
        do {
            atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, a20J)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return a20J;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(C3787fU.n(this.h));
        sb.append("){");
        Object obj = k.get(this);
        if (obj instanceof F51) {
            str = "Active";
        } else {
            str = obj instanceof C7511wy ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C3787fU.f(this));
        return sb.toString();
    }

    public final void u(@NotNull Function1<? super Throwable, Unit> function1) {
        v(new InterfaceC4778jy.a(function1));
    }

    public final void v(F51 f51) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Q6) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f51)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC4778jy ? true : obj instanceof AbstractC7992zE1) {
                x(f51, obj);
                throw null;
            }
            if (obj instanceof OG) {
                OG og = (OG) obj;
                og.getClass();
                if (!OG.b.compareAndSet(og, 0, 1)) {
                    x(f51, obj);
                    throw null;
                }
                if (obj instanceof C7511wy) {
                    if (obj == null) {
                        og = null;
                    }
                    Throwable th = og != null ? og.a : null;
                    if (f51 instanceof InterfaceC4778jy) {
                        i((InterfaceC4778jy) f51, th);
                        return;
                    } else {
                        Intrinsics.c(f51, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        k((AbstractC7992zE1) f51, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof MG)) {
                if (f51 instanceof AbstractC7992zE1) {
                    return;
                }
                Intrinsics.c(f51, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                MG mg = new MG(obj, (InterfaceC4778jy) f51, (Function1) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mg)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            MG mg2 = (MG) obj;
            if (mg2.b != null) {
                x(f51, obj);
                throw null;
            }
            if (f51 instanceof AbstractC7992zE1) {
                return;
            }
            Intrinsics.c(f51, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC4778jy interfaceC4778jy = (InterfaceC4778jy) f51;
            Throwable th2 = mg2.e;
            if (th2 != null) {
                i(interfaceC4778jy, th2);
                return;
            }
            MG mgA = MG.a(mg2, interfaceC4778jy, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mgA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.g != 2) {
            return false;
        }
        JM<T> jm = this.h;
        Intrinsics.c(jm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C5004l20.l.get((C5004l20) jm) != null;
    }

    @NotNull
    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        JM<T> jm = this.h;
        Throwable th = null;
        C5004l20 c5004l20 = jm instanceof C5004l20 ? (C5004l20) jm : null;
        if (c5004l20 != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5004l20.l;
                Object obj = atomicReferenceFieldUpdater.get(c5004l20);
                GW1 gw1 = UE.d;
                if (obj != gw1) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c5004l20, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c5004l20) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c5004l20, gw1, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c5004l20) == gw1);
            }
            if (th == null) {
                return;
            }
            n();
            l(th);
        }
    }
}

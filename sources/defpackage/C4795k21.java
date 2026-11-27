package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4795k21 extends C6105qF1 implements InterfaceC4117h21 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C4795k21.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: renamed from: k21$a */
    public final class a implements InterfaceC6041py<Unit>, InterfaceC7449wf2 {

        @NotNull
        public final C6251qy<Unit> d;

        public a(C6251qy c6251qy) {
            this.d = c6251qy;
        }

        @Override // defpackage.InterfaceC6041py
        public final GW1 b(Object obj, Function1 function1) {
            C4795k21 c4795k21 = C4795k21.this;
            C4585j21 c4585j21 = new C4585j21(c4795k21, this);
            GW1 gw1D = this.d.D((Unit) obj, c4585j21);
            if (gw1D != null) {
                C4795k21.g.set(c4795k21, null);
            }
            return gw1D;
        }

        @Override // defpackage.InterfaceC7449wf2
        public final void c(@NotNull AbstractC7992zE1<?> abstractC7992zE1, int i) {
            this.d.c(abstractC7992zE1, i);
        }

        @Override // defpackage.JM
        @NotNull
        public final CoroutineContext getContext() {
            return this.d.i;
        }

        @Override // defpackage.InterfaceC6041py
        public final void m(Unit unit, Function1 function1) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4795k21.g;
            C4795k21 c4795k21 = C4795k21.this;
            atomicReferenceFieldUpdater.set(c4795k21, null);
            C4327i21 c4327i21 = new C4327i21(c4795k21, this);
            this.d.m(unit, c4327i21);
        }

        @Override // defpackage.JM
        public final void resumeWith(@NotNull Object obj) {
            this.d.resumeWith(obj);
        }

        @Override // defpackage.InterfaceC6041py
        public final void s(@NotNull Object obj) {
            this.d.s(obj);
        }
    }

    /* JADX INFO: renamed from: k21$b */
    public static final class b extends ML0 implements InterfaceC1060Gj0<InterfaceC3744fF1<?>, Object, Object, Function1<? super Throwable, ? extends Unit>> {
        public b() {
            super(3);
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Function1<? super Throwable, ? extends Unit> k(InterfaceC3744fF1<?> interfaceC3744fF1, Object obj, Object obj2) {
            return new C5005l21(C4795k21.this, obj);
        }
    }

    public C4795k21(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : ED.k;
        new b();
    }

    @Override // defpackage.InterfaceC4117h21
    @Nullable
    public final Object a(@NotNull LM frame) {
        if (e()) {
            return Unit.a;
        }
        C6251qy c6251qyJ = C3476e.j(C5885pC0.b(frame));
        try {
            c(new a(c6251qyJ));
            Object objQ = c6251qyJ.q();
            MN mn = MN.d;
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ != mn) {
                objQ = Unit.a;
            }
            return objQ == mn ? objQ : Unit.a;
        } catch (Throwable th) {
            c6251qyJ.z();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC4117h21
    public final void b(@Nullable Object obj) {
        while (Math.max(C6105qF1.f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            GW1 gw1 = ED.k;
            if (obj2 != gw1) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, gw1)) {
                        d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        int i;
        char c;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6105qF1.f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    g.set(this, null);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(C3787fU.f(this));
        sb.append("[isLocked=");
        sb.append(Math.max(C6105qF1.f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}

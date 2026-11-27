package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8135zw implements InterfaceC6245qw, InterfaceC0942Ew, InterfaceC1958Rw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;

    @NotNull
    private volatile /* synthetic */ int _availableForRead;

    @NotNull
    private volatile /* synthetic */ Object _closed;

    @NotNull
    private volatile /* synthetic */ Object _lastReadView;

    @NotNull
    private volatile /* synthetic */ long _totalBytesRead;

    @NotNull
    private volatile /* synthetic */ long _totalBytesWritten;

    @NotNull
    private volatile /* synthetic */ int channelSize;

    @NotNull
    private volatile /* synthetic */ int lastReadAvailable$delegate;

    @NotNull
    private volatile /* synthetic */ Object lastReadView$delegate;

    static {
        AtomicLongFieldUpdater.newUpdater(AbstractC8135zw.class, "_totalBytesRead");
        AtomicLongFieldUpdater.newUpdater(AbstractC8135zw.class, "_totalBytesWritten");
        AtomicIntegerFieldUpdater.newUpdater(AbstractC8135zw.class, "_availableForRead");
        AtomicIntegerFieldUpdater.newUpdater(AbstractC8135zw.class, "channelSize");
        b = AtomicReferenceFieldUpdater.newUpdater(AbstractC8135zw.class, Object.class, "_closed");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object s(AbstractC8135zw abstractC8135zw, byte[] bArr, int i, int i2, LM lm) throws Throwable {
        C7505ww c7505ww;
        if (lm instanceof C7505ww) {
            c7505ww = (C7505ww) lm;
            int i3 = c7505ww.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c7505ww.h = i3 - Integer.MIN_VALUE;
            } else {
                c7505ww = new C7505ww(abstractC8135zw, lm);
            }
        } else {
            c7505ww = new C7505ww(abstractC8135zw, lm);
        }
        Object obj = c7505ww.e;
        MN mn = MN.d;
        int i4 = c7505ww.h;
        if (i4 == 0) {
            C1795Pt1.b(obj);
            Throwable thB = abstractC8135zw.b();
            if (thB != null) {
                throw thB;
            }
            if (abstractC8135zw.q() && abstractC8135zw._availableForRead == 0) {
                return new Integer(-1);
            }
            if (i2 == 0) {
                return new Integer(0);
            }
            if (abstractC8135zw._availableForRead == 0) {
                c7505ww.d = abstractC8135zw;
                c7505ww.h = 1;
                abstractC8135zw.o(1, c7505ww);
                return mn;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC8135zw = c7505ww.d;
            C1795Pt1.b(obj);
        }
        abstractC8135zw.getClass();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object t(AbstractC8135zw abstractC8135zw, byte[] bArr, int i, LM lm) {
        C7925yw c7925yw;
        if (lm instanceof C7925yw) {
            c7925yw = (C7925yw) lm;
            int i2 = c7925yw.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7925yw.j = i2 - Integer.MIN_VALUE;
            } else {
                c7925yw = new C7925yw(abstractC8135zw, lm);
            }
        } else {
            c7925yw = new C7925yw(abstractC8135zw, lm);
        }
        Object obj = c7925yw.h;
        MN mn = MN.d;
        int i3 = c7925yw.j;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            if (i <= 0) {
                return Unit.a;
            }
            c7925yw.d = abstractC8135zw;
            c7925yw.e = bArr;
            c7925yw.g = i;
            c7925yw.j = 1;
            if (abstractC8135zw.n(1, c7925yw) == mn) {
                return mn;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c7925yw.g;
            bArr = c7925yw.e;
            abstractC8135zw = c7925yw.d;
            C1795Pt1.b(obj);
        }
        UE.v(null, bArr, Math.min(abstractC8135zw.p(), i));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void u(AbstractC8135zw abstractC8135zw, C2895bC c2895bC, LM lm) {
        C7715xw c7715xw;
        C1640Nu src;
        if (lm instanceof C7715xw) {
            c7715xw = (C7715xw) lm;
            int i = c7715xw.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7715xw.i = i - Integer.MIN_VALUE;
            } else {
                c7715xw = new C7715xw(abstractC8135zw, lm);
            }
        } else {
            c7715xw = new C7715xw(abstractC8135zw, lm);
        }
        Object obj = c7715xw.g;
        MN mn = MN.d;
        int i2 = c7715xw.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c7715xw.d = abstractC8135zw;
            c7715xw.e = c2895bC;
            c7715xw.i = 1;
            src = c2895bC;
            if (abstractC8135zw.n(1, c7715xw) == mn) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1640Nu c1640Nu = c7715xw.e;
            abstractC8135zw = c7715xw.d;
            C1795Pt1.b(obj);
            src = c1640Nu;
        }
        int i3 = src.c;
        abstractC8135zw.getClass();
        Intrinsics.checkNotNullParameter(null, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        C5189lv.n(null, 1, null);
        throw null;
    }

    @Override // defpackage.InterfaceC1958Rw
    public final boolean a(@Nullable Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C4159hE c4159hE = th == null ? C8056za.d : new C4159hE(th);
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c4159hE)) {
                th.getClass();
                throw null;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return false;
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Throwable b() {
        C4159hE c4159hE = (C4159hE) this._closed;
        if (c4159hE != null) {
            return c4159hE.a;
        }
        return null;
    }

    @Override // defpackage.InterfaceC0942Ew
    public final int d() {
        return this._availableForRead;
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object e(@NotNull C2895bC c2895bC, @NotNull LM lm) {
        return r(c2895bC, lm);
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object f(long j, @NotNull LM lm) throws Throwable {
        Throwable thB = b();
        if (thB != null) {
            throw thB;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2895bC.i;
        RU pool = C1718Ou.a;
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(pool, "pool");
        ByteBuffer byteBuffer = WY0.a;
        throw null;
    }

    @Override // defpackage.InterfaceC1958Rw
    public final void flush() {
        throw null;
    }

    @Override // defpackage.InterfaceC1958Rw
    @Nullable
    public final Object g(@NotNull byte[] bArr, int i, @NotNull LM lm) {
        return t(this, bArr, i, lm);
    }

    @Override // defpackage.InterfaceC1958Rw
    @Nullable
    public final Object h(@NotNull C2895bC c2895bC, @NotNull JM jm) {
        u(this, c2895bC, (LM) jm);
        return MN.d;
    }

    @Override // defpackage.InterfaceC0942Ew
    public final boolean i(@Nullable Throwable th) {
        if (b() == null && !q()) {
            if (th == null) {
                th = new CancellationException("Channel cancelled");
            }
            a(th);
        }
        return false;
    }

    @Override // defpackage.InterfaceC0942Ew
    @Nullable
    public final Object j(@NotNull byte[] bArr, int i, int i2, @NotNull LM lm) {
        return s(this, bArr, i, i2, lm);
    }

    @Override // defpackage.InterfaceC0942Ew
    public final boolean k() {
        C4159hE c4159hE = (C4159hE) this._closed;
        if ((c4159hE != null ? c4159hE.a : null) != null) {
            return true;
        }
        return q() && this.channelSize == 0;
    }

    @Override // defpackage.InterfaceC1958Rw
    public final boolean l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Unit m(int i, @NotNull LM lm) {
        C6454rw c6454rw;
        AbstractC8135zw abstractC8135zw;
        if (lm instanceof C6454rw) {
            c6454rw = (C6454rw) lm;
            int i2 = c6454rw.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c6454rw.i = i2 - Integer.MIN_VALUE;
            } else {
                c6454rw = new C6454rw(this, lm);
            }
        } else {
            c6454rw = new C6454rw(this, lm);
        }
        Object obj = c6454rw.g;
        MN mn = MN.d;
        int i3 = c6454rw.i;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            abstractC8135zw = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c6454rw.e;
            abstractC8135zw = c6454rw.d;
            C1795Pt1.b(obj);
        }
        if (abstractC8135zw._availableForRead >= i || abstractC8135zw.k()) {
            return Unit.a;
        }
        new C6664sw(abstractC8135zw, i);
        c6454rw.d = abstractC8135zw;
        c6454rw.e = i;
        c6454rw.i = 1;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Unit n(int i, @NotNull LM lm) {
        C6874tw c6874tw;
        AbstractC8135zw abstractC8135zw;
        if (lm instanceof C6874tw) {
            c6874tw = (C6874tw) lm;
            int i2 = c6874tw.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c6874tw.g = i2 - Integer.MIN_VALUE;
            } else {
                c6874tw = new C6874tw(this, lm);
            }
        } else {
            c6874tw = new C6874tw(this, lm);
        }
        Object obj = c6874tw.d;
        MN mn = MN.d;
        int i3 = c6874tw.g;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            abstractC8135zw = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            i = 0;
            abstractC8135zw = null;
        }
        if (abstractC8135zw.p() >= i || abstractC8135zw.q()) {
            return Unit.a;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final void o(int i, @NotNull LM lm) {
        C7084uw c7084uw;
        AbstractC8135zw abstractC8135zw;
        if (lm instanceof C7084uw) {
            c7084uw = (C7084uw) lm;
            int i2 = c7084uw.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c7084uw.h = i2 - Integer.MIN_VALUE;
            } else {
                c7084uw = new C7084uw(this, lm);
            }
        } else {
            c7084uw = new C7084uw(this, lm);
        }
        Object obj = c7084uw.e;
        MN mn = MN.d;
        int i3 = c7084uw.h;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            if (i < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c7084uw.d = this;
            c7084uw.h = 1;
            if (m(i, c7084uw) == mn) {
                return;
            } else {
                abstractC8135zw = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC8135zw = c7084uw.d;
            C1795Pt1.b(obj);
        }
        abstractC8135zw.getClass();
        throw null;
    }

    public final int p() {
        return Math.max(0, 4088 - this.channelSize);
    }

    public final boolean q() {
        return this._closed != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object r(@NotNull C2895bC c2895bC, @NotNull LM lm) throws Throwable {
        C7294vw c7294vw;
        AbstractC8135zw abstractC8135zw;
        if (lm instanceof C7294vw) {
            c7294vw = (C7294vw) lm;
            int i = c7294vw.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7294vw.h = i - Integer.MIN_VALUE;
            } else {
                c7294vw = new C7294vw(this, lm);
            }
        } else {
            c7294vw = new C7294vw(this, lm);
        }
        Object obj = c7294vw.e;
        MN mn = MN.d;
        int i2 = c7294vw.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            Throwable thB = b();
            if (thB != null) {
                throw thB;
            }
            if (q() && this._availableForRead == 0) {
                return new Integer(-1);
            }
            if (c2895bC.e - c2895bC.c == 0) {
                return new Integer(0);
            }
            if (this._availableForRead == 0) {
                c7294vw.d = this;
                c7294vw.h = 1;
                o(1, c7294vw);
                return mn;
            }
            abstractC8135zw = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC8135zw = c7294vw.d;
            C1795Pt1.b(obj);
        }
        abstractC8135zw.getClass();
        throw null;
    }
}

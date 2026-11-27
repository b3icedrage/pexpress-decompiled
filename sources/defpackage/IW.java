package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class IW {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final void a(@NotNull LM lm) {
        HW frame;
        if (lm instanceof HW) {
            frame = (HW) lm;
            int i = frame.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.e = i - Integer.MIN_VALUE;
            } else {
                frame = new HW(lm);
            }
        } else {
            frame = new HW(lm);
        }
        Object obj = frame.d;
        MN mn = MN.d;
        int i2 = frame.e;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            frame.e = 1;
            C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
            c6251qy.r();
            Object objQ = c6251qy.q();
            if (objQ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objQ == mn) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }

    @Nullable
    public static final Object b(long j, @NotNull JM<? super Unit> frame) {
        if (j <= 0) {
            return Unit.a;
        }
        C6251qy c6251qy = new C6251qy(1, C5885pC0.b(frame));
        c6251qy.r();
        if (j < Long.MAX_VALUE) {
            d(c6251qy.i).D(j, c6251qy);
        }
        Object objQ = c6251qy.q();
        MN mn = MN.d;
        if (objQ == mn) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objQ == mn ? objQ : Unit.a;
    }

    @Nullable
    public static final Object c(long j, @NotNull JM<? super Unit> jm) {
        Object objB = b(e(j), jm);
        return objB == MN.d ? objB : Unit.a;
    }

    @NotNull
    public static final GW d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element elementP = coroutineContext.p(d.f);
        GW gw = elementP instanceof GW ? (GW) elementP : null;
        return gw == null ? C4678jV.a : gw;
    }

    public static final long e(long j) {
        b.a aVar = b.e;
        boolean z = j > 0;
        if (z) {
            return b.l(b.p(j, c.h(999999L, R40.NANOSECONDS)));
        }
        if (z) {
            throw new C6489s51();
        }
        return 0L;
    }
}

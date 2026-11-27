package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class LN {
    @NotNull
    public static final EM a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.p(XF0.a.d) == null) {
            coroutineContext = coroutineContext.t(ED.b());
        }
        return new EM(coroutineContext);
    }

    @NotNull
    public static final EM b() {
        C4002gV1 c4002gV1A = C0564Aa.a();
        RV rv = C6266r20.a;
        return new EM(CoroutineContext.Element.a.c(c4002gV1A, QV0.a));
    }

    public static final void c(@NotNull KN kn, @Nullable CancellationException cancellationException) {
        XF0 xf0 = (XF0) kn.getE().p(XF0.a.d);
        if (xf0 != null) {
            xf0.l(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + kn).toString());
        }
    }

    @Nullable
    public static final <R> Object d(@NotNull Function2<? super KN, ? super JM<? super R>, ? extends Object> function2, @NotNull JM<? super R> frame) {
        ND1 nd1 = new ND1(frame, frame.getContext());
        Object objR = C3057c.r(nd1, nd1, function2);
        if (objR == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    public static final boolean e(@NotNull KN kn) {
        XF0 xf0 = (XF0) kn.getE().p(XF0.a.d);
        if (xf0 != null) {
            return xf0.g();
        }
        return true;
    }
}

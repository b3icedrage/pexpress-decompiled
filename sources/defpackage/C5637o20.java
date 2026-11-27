package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5637o20 {
    public static final void a(@NotNull C6251qy c6251qy, @NotNull JM jm, boolean z) {
        Object objF;
        Object obj = C6251qy.k.get(c6251qy);
        Throwable thE = c6251qy.e(obj);
        if (thE != null) {
            C1717Ot1.a aVar = C1717Ot1.e;
            objF = C1795Pt1.a(thE);
        } else {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objF = c6251qy.f(obj);
        }
        if (!z) {
            jm.resumeWith(objF);
            return;
        }
        Intrinsics.c(jm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C5004l20 c5004l20 = (C5004l20) jm;
        LM lm = c5004l20.i;
        CoroutineContext context = lm.getContext();
        Object objC = CY1.c(context, c5004l20.k);
        C7973z82<?> c7973z82C = objC != CY1.a ? AN.c(lm, context, objC) : null;
        try {
            lm.resumeWith(objF);
            Unit unit = Unit.a;
        } finally {
            if (c7973z82C == null || c7973z82C.t0()) {
                CY1.a(context, objC);
            }
        }
    }
}

package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5427n20<T> extends AbstractRunnableC6788tX1 {
    public int g;

    public AbstractC5427n20(int i) {
        this.g = i;
    }

    @NotNull
    public abstract JM<T> d();

    @Nullable
    public Throwable e(@Nullable Object obj) {
        OG og = obj instanceof OG ? (OG) obj : null;
        if (og != null) {
            return og.a;
        }
        return null;
    }

    public final void g(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            J90.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.checkNotNull(th);
        GN.a(new PN("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    @Nullable
    public abstract Object h();

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        XF0 xf0;
        Object objA2;
        C6998uX1 c6998uX1 = this.e;
        try {
            JM<T> jmD = d();
            Intrinsics.c(jmD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C5004l20 c5004l20 = (C5004l20) jmD;
            LM lm = c5004l20.i;
            Object obj = c5004l20.k;
            CoroutineContext context = lm.getContext();
            Object objC = CY1.c(context, obj);
            C7973z82<?> c7973z82C = objC != CY1.a ? AN.c(lm, context, objC) : null;
            try {
                CoroutineContext context2 = lm.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                if (thE == null) {
                    int i = this.g;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        xf0 = (XF0) context2.p(XF0.a.d);
                    } else {
                        xf0 = null;
                    }
                } else {
                    xf0 = null;
                }
                if (xf0 != null && !xf0.g()) {
                    CancellationException cancellationExceptionC = xf0.C();
                    a(objH, cancellationExceptionC);
                    C1717Ot1.a aVar = C1717Ot1.e;
                    lm.resumeWith(C1795Pt1.a(cancellationExceptionC));
                } else if (thE != null) {
                    C1717Ot1.a aVar2 = C1717Ot1.e;
                    lm.resumeWith(C1795Pt1.a(thE));
                } else {
                    C1717Ot1.a aVar3 = C1717Ot1.e;
                    lm.resumeWith(f(objH));
                }
                Unit unit = Unit.a;
                if (c7973z82C == null || c7973z82C.t0()) {
                    CY1.a(context, objC);
                }
                try {
                    c6998uX1.getClass();
                    objA2 = Unit.a;
                } catch (Throwable th) {
                    C1717Ot1.a aVar4 = C1717Ot1.e;
                    objA2 = C1795Pt1.a(th);
                }
                g(null, C1717Ot1.a(objA2));
            } catch (Throwable th2) {
                if (c7973z82C == null || c7973z82C.t0()) {
                    CY1.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C1717Ot1.a aVar5 = C1717Ot1.e;
                c6998uX1.getClass();
                objA = Unit.a;
            } catch (Throwable th4) {
                C1717Ot1.a aVar6 = C1717Ot1.e;
                objA = C1795Pt1.a(th4);
            }
            g(th3, C1717Ot1.a(objA));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(@Nullable Object obj) {
        return obj;
    }

    public void a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
    }
}

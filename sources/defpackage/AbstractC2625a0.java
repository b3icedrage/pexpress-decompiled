package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2625a0<T> extends C3956gG0 implements JM<T>, KN {

    @NotNull
    public final CoroutineContext g;

    public AbstractC2625a0(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            V((XF0) coroutineContext.p(XF0.a.d));
        }
        this.g = coroutineContext.t(this);
    }

    @Override // defpackage.C3956gG0
    @NotNull
    public final String H() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.C3956gG0
    public final void U(@NotNull QG qg) {
        GN.a(qg, this.g);
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.g;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.C3956gG0
    public final void k0(@Nullable Object obj) {
        if (!(obj instanceof OG)) {
            r0(obj);
        } else {
            OG og = (OG) obj;
            q0(og.a, OG.b.get(og) != 0);
        }
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        Throwable thA = C1717Ot1.a(obj);
        if (thA != null) {
            obj = new OG(thA, false);
        }
        Object objD0 = d0(obj);
        if (objD0 == C3787fU.e) {
            return;
        }
        y(objD0);
    }

    public final void s0(@NotNull ON on, AbstractC2625a0 abstractC2625a0, @NotNull Function2 function2) {
        Object objInvoke;
        int iOrdinal = on.ordinal();
        if (iOrdinal == 0) {
            C6880ty.b(function2, abstractC2625a0, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                JM jmB = C5885pC0.b(C5885pC0.a(abstractC2625a0, this, function2));
                C1717Ot1.a aVar = C1717Ot1.e;
                jmB.resumeWith(Unit.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new C6489s51();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.g;
                Object objC = CY1.c(coroutineContext, null);
                try {
                    if (function2 instanceof AbstractC7487wq) {
                        F62.e(2, function2);
                        objInvoke = function2.invoke(abstractC2625a0, this);
                    } else {
                        objInvoke = C5885pC0.c(function2, abstractC2625a0, this);
                    }
                    CY1.a(coroutineContext, objC);
                    if (objInvoke != MN.d) {
                        C1717Ot1.a aVar2 = C1717Ot1.e;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    CY1.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                C1717Ot1.a aVar3 = C1717Ot1.e;
                resumeWith(C1795Pt1.a(th2));
            }
        }
    }

    public void r0(T t) {
    }

    public void q0(@NotNull Throwable th, boolean z) {
    }
}

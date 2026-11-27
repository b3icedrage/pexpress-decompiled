package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7973z82<T> extends ND1<T> {

    @NotNull
    public final ThreadLocal<Pair<CoroutineContext, Object>> i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7973z82(@NotNull JM jm, @NotNull CoroutineContext coroutineContext) {
        A82 a82 = A82.d;
        super(jm, coroutineContext.p(a82) == null ? coroutineContext.t(a82) : coroutineContext);
        this.i = new ThreadLocal<>();
        if (jm.getContext().p(d.f) instanceof DN) {
            return;
        }
        Object objC = CY1.c(coroutineContext, null);
        CY1.a(coroutineContext, objC);
        u0(coroutineContext, objC);
    }

    public final boolean t0() {
        boolean z = this.threadLocalIsSet && this.i.get() == null;
        this.i.remove();
        return !z;
    }

    public final void u0(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.i.set(new Pair<>(coroutineContext, obj));
    }

    @Override // defpackage.ND1, defpackage.C3956gG0
    public final void y(@Nullable Object obj) {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.i.get();
            if (pair != null) {
                CY1.a(pair.d, pair.e);
            }
            this.i.remove();
        }
        Object objA = RG.a(obj);
        JM<T> jm = this.h;
        CoroutineContext context = jm.getContext();
        Object objC = CY1.c(context, null);
        C7973z82<?> c7973z82C = objC != CY1.a ? AN.c(jm, context, objC) : null;
        try {
            this.h.resumeWith(objA);
            Unit unit = Unit.a;
        } finally {
            if (c7973z82C == null || c7973z82C.t0()) {
                CY1.a(context, objC);
            }
        }
    }
}

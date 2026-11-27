package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5004l20<T> extends AbstractC5427n20<T> implements NN, JM<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(C5004l20.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    @NotNull
    public final DN h;

    @NotNull
    public final LM i;

    @Nullable
    public Object j;

    @NotNull
    public final Object k;

    public C5004l20(@NotNull DN dn, @NotNull LM lm) {
        super(-1);
        this.h = dn;
        this.i = lm;
        this.j = UE.c;
        this.k = CY1.b(lm.getContext());
    }

    @Override // defpackage.AbstractC5427n20
    public final void a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
        if (obj instanceof PG) {
            ((PG) obj).getClass();
            throw null;
        }
    }

    @Override // defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        LM lm = this.i;
        if (lm != null) {
            return lm;
        }
        return null;
    }

    @Override // defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        return this.i.getContext();
    }

    @Override // defpackage.AbstractC5427n20
    @Nullable
    public final Object h() {
        Object obj = this.j;
        this.j = UE.c;
        return obj;
    }

    @Override // defpackage.JM
    public final void resumeWith(@NotNull Object obj) {
        LM lm = this.i;
        CoroutineContext context = lm.getContext();
        Throwable thA = C1717Ot1.a(obj);
        Object og = thA == null ? obj : new OG(thA, false);
        DN dn = this.h;
        if (dn.k1(context)) {
            this.j = og;
            this.g = 0;
            dn.c1(context, this);
            return;
        }
        A80 a80A = EY1.a();
        if (a80A.g >= 4294967296L) {
            this.j = og;
            this.g = 0;
            a80A.t1(this);
            return;
        }
        a80A.u1(true);
        try {
            CoroutineContext context2 = lm.getContext();
            Object objC = CY1.c(context2, this.k);
            try {
                lm.resumeWith(obj);
                Unit unit = Unit.a;
                CY1.a(context2, objC);
                while (a80A.w1()) {
                }
            } catch (Throwable th) {
                CY1.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2, null);
            } finally {
                a80A.s1(true);
            }
        }
    }

    @NotNull
    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + C3787fU.n(this.i) + ']';
    }

    @Override // defpackage.AbstractC5427n20
    @NotNull
    public final JM<T> d() {
        return this;
    }
}

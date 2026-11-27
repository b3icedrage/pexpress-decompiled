package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Nc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1585Nc1 extends DN {

    @NotNull
    public final C4794k20 g = new C4794k20();

    @Override // defpackage.DN
    public final void c1(@NotNull CoroutineContext context, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "block");
        C4794k20 c4794k20 = this.g;
        c4794k20.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        RV rv = C6266r20.a;
        AbstractC8109zn0 abstractC8109zn0S1 = QV0.a.s1();
        if (!abstractC8109zn0S1.k1(context)) {
            if (!(c4794k20.b || !c4794k20.a)) {
                if (!c4794k20.d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                c4794k20.a();
                return;
            }
        }
        abstractC8109zn0S1.c1(context, new RunnableC4584j20(0, c4794k20, runnable));
    }

    @Override // defpackage.DN
    public final boolean k1(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RV rv = C6266r20.a;
        if (QV0.a.s1().k1(context)) {
            return true;
        }
        C4794k20 c4794k20 = this.g;
        return !(c4794k20.b || !c4794k20.a);
    }
}

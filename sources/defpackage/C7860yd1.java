package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7860yd1<TSubject, Call> {

    @NotNull
    public static final ArrayList e = new ArrayList();

    @NotNull
    public final C1277Jd1 a;

    @NotNull
    public final AbstractC1355Kd1 b;

    @NotNull
    public List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, Call>, TSubject, JM<? super Unit>, Object>> c;
    public boolean d;

    public C7860yd1() {
        throw null;
    }

    public C7860yd1(@NotNull C1277Jd1 phase, @NotNull AbstractC1355Kd1 relation) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        ArrayList interceptors = e;
        Intrinsics.c(interceptors, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        F62.b(interceptors);
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.a = phase;
        this.b = relation;
        this.c = interceptors;
        this.d = true;
        if (!interceptors.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final void a(@NotNull InterfaceC1060Gj0<? super AbstractC1121Hd1<TSubject, Call>, ? super TSubject, ? super JM<? super Unit>, ? extends Object> interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (this.d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.c);
            this.c = arrayList;
            this.d = false;
        }
        this.c.add(interceptor);
    }

    @NotNull
    public final String toString() {
        return "Phase `" + this.a.a + "`, " + this.c.size() + " handlers";
    }
}

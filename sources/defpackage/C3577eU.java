package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3577eU<TSubject, TContext> extends AbstractC1121Hd1<TSubject, TContext> {

    @NotNull
    public final List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, TContext>, TSubject, JM<? super Unit>, Object>> e;

    @NotNull
    public final CoroutineContext g;

    @NotNull
    public TSubject h;
    public int i;

    /* JADX INFO: renamed from: eU$a */
    @InterfaceC3368dU(c = "io.ktor.util.pipeline.DebugPipelineContext", f = "DebugPipelineContext.kt", l = {80}, m = "proceedLoop")
    public static final class a extends LM {
        public C3577eU d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C3577eU<TSubject, TContext> g;
        public int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3577eU<TSubject, TContext> c3577eU, JM<? super a> jm) {
            super(jm);
            this.g = c3577eU;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.e(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3577eU(@NotNull TContext context, @NotNull List<? extends InterfaceC1060Gj0<? super AbstractC1121Hd1<TSubject, TContext>, ? super TSubject, ? super JM<? super Unit>, ? extends Object>> interceptors, @NotNull TSubject subject, @NotNull CoroutineContext coroutineContext) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.e = interceptors;
        this.g = coroutineContext;
        this.h = subject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object a(@NotNull Object obj, @NotNull LM lm) {
        this.i = 0;
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.h = obj;
        return c(lm);
    }

    @Override // defpackage.AbstractC1121Hd1
    @NotNull
    public final TSubject b() {
        return this.h;
    }

    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object c(@NotNull JM<? super TSubject> jm) {
        int i = this.i;
        if (i < 0) {
            return this.h;
        }
        if (i < this.e.size()) {
            return e(jm);
        }
        this.i = -1;
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC1121Hd1
    @Nullable
    public final Object d(@NotNull JM jm, @NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.h = obj;
        return c(jm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(JM<? super TSubject> jm) {
        a aVar;
        C3577eU<TSubject, TContext> c3577eU;
        InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, TContext>, TSubject, JM<? super Unit>, Object> interfaceC1060Gj0;
        TSubject tsubject;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c3577eU = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3577eU = aVar.d;
            C1795Pt1.b(obj);
        }
        do {
            int i3 = c3577eU.i;
            if (i3 != -1) {
                List<InterfaceC1060Gj0<AbstractC1121Hd1<TSubject, TContext>, TSubject, JM<? super Unit>, Object>> list = c3577eU.e;
                if (i3 >= list.size()) {
                    c3577eU.i = -1;
                } else {
                    interfaceC1060Gj0 = list.get(i3);
                    c3577eU.i = i3 + 1;
                    Intrinsics.c(interfaceC1060Gj0, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext>, TSubject of io.ktor.util.pipeline.DebugPipelineContext, kotlin.Unit>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptor<TSubject of io.ktor.util.pipeline.DebugPipelineContext, TContext of io.ktor.util.pipeline.DebugPipelineContext> }");
                    tsubject = c3577eU.h;
                    aVar.d = c3577eU;
                    aVar.h = 1;
                }
            }
            return c3577eU.h;
        } while (interfaceC1060Gj0.k(c3577eU, tsubject, aVar) != mn);
        return mn;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.g;
    }
}

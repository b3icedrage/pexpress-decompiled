package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2897bC1<T> extends LM implements InterfaceC6606sf0<T> {

    @NotNull
    public final InterfaceC6606sf0<T> d;

    @NotNull
    public final CoroutineContext e;
    public final int g;

    @Nullable
    public CoroutineContext h;

    @Nullable
    public JM<? super Unit> i;

    /* JADX INFO: renamed from: bC1$a */
    public static final class a extends ML0 implements Function2<Integer, CoroutineContext.Element, Integer> {
        public static final a d = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, CoroutineContext.Element element) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2897bC1(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull CoroutineContext coroutineContext) {
        super(W41.d, e.d);
        this.d = interfaceC6606sf0;
        this.e = coroutineContext;
        this.g = ((Number) coroutineContext.R0(0, a.d)).intValue();
    }

    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> frame) {
        try {
            Object objJ = j(frame, t);
            MN mn = MN.d;
            if (objJ == mn) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objJ == mn ? objJ : Unit.a;
        } catch (Throwable th) {
            this.h = new C7110v30(th, frame.getContext());
            throw th;
        }
    }

    @Override // defpackage.AbstractC7487wq, defpackage.NN
    @Nullable
    public final NN getCallerFrame() {
        JM<? super Unit> jm = this.i;
        if (jm instanceof NN) {
            return (NN) jm;
        }
        return null;
    }

    @Override // defpackage.LM, defpackage.JM
    @NotNull
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.h;
        return coroutineContext == null ? e.d : coroutineContext;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable thA = C1717Ot1.a(obj);
        if (thA != null) {
            this.h = new C7110v30(thA, getContext());
        }
        JM<? super Unit> jm = this.i;
        if (jm != null) {
            jm.resumeWith(obj);
        }
        return MN.d;
    }

    public final Object j(JM<? super Unit> jm, T t) {
        CoroutineContext context = jm.getContext();
        ED.h(context);
        CoroutineContext coroutineContext = this.h;
        if (coroutineContext != context) {
            if (coroutineContext instanceof C7110v30) {
                throw new IllegalStateException(DS1.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C7110v30) coroutineContext).d + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.R0(0, new C3316dC1(this))).intValue() != this.g) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.h = context;
        }
        this.i = jm;
        C3106cC1.a aVar = C3106cC1.a;
        InterfaceC6606sf0<T> interfaceC6606sf0 = this.d;
        Intrinsics.c(interfaceC6606sf0, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        aVar.getClass();
        Object objA = interfaceC6606sf0.a(t, this);
        if (!Intrinsics.a(objA, MN.d)) {
            this.i = null;
        }
        return objA;
    }
}

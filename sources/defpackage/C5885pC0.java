package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
public class C5885pC0 {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static JM a(JM jm, @NotNull JM completion, @NotNull Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof AbstractC7487wq) {
            return ((AbstractC7487wq) function2).create(jm, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == e.d ? new C5042lC0(completion, jm, function2) : new C5255mC0(completion, context, function2, jm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> JM<T> b(@NotNull JM<? super T> jm) {
        JM<T> jm2;
        Intrinsics.checkNotNullParameter(jm, "<this>");
        LM lm = jm instanceof LM ? (LM) jm : null;
        return (lm == null || (jm2 = (JM<T>) lm.intercepted()) == null) ? jm : jm2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, T> Object c(@NotNull Function2<? super R, ? super JM<? super T>, ? extends Object> function2, R r, @NotNull JM<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        C5675oC0 c5465nC0 = context == e.d ? new C5465nC0(completion) : new C5675oC0(completion, context);
        F62.e(2, function2);
        return function2.invoke(r, c5465nC0);
    }
}

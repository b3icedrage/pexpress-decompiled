package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5255mC0 extends LM {
    public int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ JM g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5255mC0(JM jm, CoroutineContext coroutineContext, Function2 function2, JM jm2) {
        super(jm, coroutineContext);
        this.e = function2;
        this.g = jm2;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.d = 2;
            C1795Pt1.b(obj);
            return obj;
        }
        this.d = 1;
        C1795Pt1.b(obj);
        Function2 function2 = this.e;
        Intrinsics.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        F62.e(2, function2);
        return function2.invoke(this.g, this);
    }
}

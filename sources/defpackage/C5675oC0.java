package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5675oC0 extends LM {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5675oC0(JM<Object> jm, CoroutineContext coroutineContext) {
        super(jm, coroutineContext);
        Intrinsics.c(jm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C1795Pt1.b(obj);
        return obj;
    }
}

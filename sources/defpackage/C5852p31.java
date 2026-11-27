package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: p31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5852p31 implements Function0 {
    public final /* synthetic */ C6062q31 d;
    public final /* synthetic */ C2643a41.a e;

    public /* synthetic */ C5852p31(C6062q31 c6062q31, C2643a41.a aVar) {
        this.d = c6062q31;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C6062q31 c6062q31 = this.d;
        C2643a41.a aVar = this.e;
        C2643a41 c2643a41 = c6062q31.e.u;
        C2936bP1 c2936bP1 = c2643a41.b;
        if ((c2936bP1 == null || !c2936bP1.g() || aVar != c2643a41.c) && aVar != null) {
            AtomicReference<C2643a41.a> atomicReference = c2643a41.a;
            while (!atomicReference.compareAndSet(aVar, null) && atomicReference.get() == aVar) {
            }
        }
        return Unit.a;
    }
}

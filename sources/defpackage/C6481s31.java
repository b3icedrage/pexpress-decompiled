package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6481s31 extends C2784ak0 implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C6062q31 c6062q31 = (C6062q31) this.e;
        C2643a41 c2643a41 = c6062q31.e.u;
        EM scope = C3286d41.a;
        E31 awaitReady = new E31(c6062q31, null);
        F31 onNotReady = new F31(c6062q31, null);
        c2643a41.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(awaitReady, "awaitReady");
        Intrinsics.checkNotNullParameter(onNotReady, "onNotReady");
        C2643a41.a andSet = c2643a41.a.getAndSet(null);
        if (andSet == null) {
            C5189lv.k(scope, null, new D31(c6062q31, null), 3);
        } else {
            C2936bP1 c2936bP1 = c2643a41.b;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            c2643a41.c = andSet;
            c2643a41.b = C5189lv.k(scope, null, new C3076c41(c2643a41, awaitReady, andSet, onNotReady, null), 3);
        }
        return Unit.a;
    }
}

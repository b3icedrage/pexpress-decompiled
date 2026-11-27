package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4382iI0 implements Function0 {
    public final C5060lI0 d;
    public final C2720aS0 e;

    public C4382iI0(C5060lI0 c5060lI0, C2720aS0 c2720aS0) {
        this.d = c5060lI0;
        this.e = c2720aS0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5060lI0 c5060lI0 = this.d;
        T01 t01K = c5060lI0.k();
        Intrinsics.checkNotNullExpressionValue(t01K, "getBuiltInsModule(...)");
        return new C5693oI0(t01K, this.e, new C4850kI0(c5060lI0, 0));
    }
}

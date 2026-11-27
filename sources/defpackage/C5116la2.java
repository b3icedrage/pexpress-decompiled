package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: la2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5116la2 extends ML0 implements Function1<String, Unit> {
    public final /* synthetic */ C4228ha2 d;
    public final /* synthetic */ C1351Kc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5116la2(C4228ha2 c4228ha2, C1351Kc0 c1351Kc0) {
        super(1);
        this.d = c4228ha2;
        this.e = c1351Kc0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        C1351Kc0 c1351Kc0 = this.e;
        C4228ha2 c4228ha2 = this.d;
        c4228ha2.getClass();
        c4228ha2.Q(0L, new C6161qY0(c1351Kc0.f, it));
        if (Intrinsics.a(it, "filetransfer_disabled")) {
            c4228ha2.w(false);
        }
        return Unit.a;
    }
}

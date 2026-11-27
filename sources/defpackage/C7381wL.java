package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7381wL extends ML0 implements Function1<CL, Boolean> {
    public final /* synthetic */ C7801yL d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7381wL(C7801yL c7801yL) {
        super(1);
        this.d = c7801yL;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(CL cl) {
        CL state = cl;
        Intrinsics.checkNotNullParameter(state, "state");
        return Boolean.valueOf(state.b == null && !this.d.f.b());
    }
}

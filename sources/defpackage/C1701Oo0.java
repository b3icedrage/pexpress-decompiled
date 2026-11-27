package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701Oo0 extends ML0 implements Function1<C2013So0, Boolean> {
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701Oo0(long j) {
        super(1);
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C2013So0 c2013So0) {
        C2013So0 state = c2013So0;
        Intrinsics.checkNotNullParameter(state, "state");
        return Boolean.valueOf(state.c < this.d);
    }
}

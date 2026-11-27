package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class RH1 extends ML0 implements Function1 {
    public static final RH1 e = new RH1(1, 0);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RH1(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter((YC) obj, "$this$null");
                return Unit.a;
            default:
                C2013So0 state = (C2013So0) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return Boolean.valueOf(!state.b);
        }
    }
}

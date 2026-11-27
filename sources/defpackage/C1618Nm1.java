package defpackage;

import com.jivosite.sdk.model.pojo.rate.RateSettings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Nm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1618Nm1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public final /* synthetic */ RateSettings d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618Nm1(RateSettings rateSettings) {
        super(1);
        this.d = rateSettings;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        return C1774Pm1.a(state, this.d, null, 0L, 6);
    }
}

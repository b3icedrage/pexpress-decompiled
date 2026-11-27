package defpackage;

import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.trading.usecases.AddRobotBetIdUseCaseBase", f = "AddRobotBetIdUseCaseBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION, 27, 28, 35, 45, 46, RequestError.RESPONSE_CODE_FAILURE, 51}, m = "execute")
public final class V7 extends LM {
    public C2657a8 d;
    public Object e;
    public Object g;
    public long h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C2657a8 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(C2657a8 c2657a8, LM lm) {
        super(lm);
        this.k = c2657a8;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, this);
    }
}

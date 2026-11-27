package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.trading.providers.TimeSelectionsProviderImpl", f = "TimeSelectionsProviderImpl.kt", l = {RequestError.NO_DEV_KEY}, m = "getTimeSelections")
public final class C7214vZ1 extends LM {
    public C7425wZ1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7425wZ1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7214vZ1(C7425wZ1 c7425wZ1, LM lm) {
        super(lm);
        this.g = c7425wZ1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

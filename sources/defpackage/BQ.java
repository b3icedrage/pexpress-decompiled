package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.repositories.CurrencyRepositoryImpl", f = "CurrencyRepositoryImpl.kt", l = {ConnectionResult.API_DISABLED}, m = "getCurrencyRates")
public final class BQ extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ CQ e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQ(CQ cq, LM lm) {
        super(lm);
        this.e = cq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}

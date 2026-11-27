package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.CurrencyRepositoryBase", f = "CurrencyRepositoryBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "getCurrency$suspendImpl")
public final class C8026zQ extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ CQ e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8026zQ(CQ cq, LM lm) {
        super(lm);
        this.e = cq;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return CQ.c(this.e, this);
    }
}

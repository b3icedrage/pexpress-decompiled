package defpackage;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.usecases.ApplyDepositScriptUseCaseImpl", f = "ApplyDepositScriptUseCaseImpl.kt", l = {44, 45}, m = "insertRecommendedDeposit")
public final class C1916Ri extends LM {
    public WebView d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1994Si g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1916Ri(C1994Si c1994Si, LM lm) {
        super(lm);
        this.g = c1994Si;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, this);
    }
}

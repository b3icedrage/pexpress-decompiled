package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsUseCaseBase", f = "NotificationPermissionAnalyticsUseCaseBase.kt", l = {38}, m = "sendPushesDeniedEventIfNeeded")
public final class M61 extends LM {
    public L61 d;
    public W61 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ L61 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M61(L61 l61, LM lm) {
        super(lm);
        this.h = l61;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return L61.f(this.h, null, this);
    }
}

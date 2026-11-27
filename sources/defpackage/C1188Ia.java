package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {57, 58, 59}, m = "sendDataToAnalyticsRegister$suspendImpl")
public final class C1188Ia extends LM {
    public C1110Ha d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1110Ha g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188Ia(C1110Ha c1110Ha, LM lm) {
        super(lm);
        this.g = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C1110Ha.i(this.g, this);
    }
}

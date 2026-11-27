package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {174}, m = "waitForRealCurrency")
public final class C1344Ka extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C1110Ha e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344Ka(C1110Ha c1110Ha, LM lm) {
        super(lm);
        this.e = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.j(this);
    }
}

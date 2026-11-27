package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.library.registration.usecases.AnalyticsUseCaseImpl", f = "AnalyticsUseCaseImpl.kt", l = {29}, m = "getAffId")
public final class C1499Ma extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C1577Na e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1499Ma(C1577Na c1577Na, LM lm) {
        super(lm);
        this.e = c1577Na;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}

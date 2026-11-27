package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {48}, m = "sendCommonPart")
public final class C0954Fa extends LM {
    public C1110Ha d;
    public ReporterApi e;
    public EnumC5113la g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C1110Ha j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0954Fa(C1110Ha c1110Ha, LM lm) {
        super(lm);
        this.j = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(false, this);
    }
}

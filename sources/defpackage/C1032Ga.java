package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.usecases.AnalyticsUseCaseBase", f = "AnalyticsUseCaseBase.kt", l = {70, 71, 89, 93}, m = "sendDataToAmplitude")
public final class C1032Ga extends LM {
    public C1110Ha d;
    public ReporterApi e;
    public EnumC5113la g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1110Ha i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032Ga(C1110Ha c1110Ha, LM lm) {
        super(lm);
        this.i = c1110Ha;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.g(this);
    }
}

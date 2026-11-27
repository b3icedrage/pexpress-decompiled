package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.experiments.remote.custom_indicators.CustomIndicatorsExperimentProviderApi", f = "CustomIndicatorsExperimentProviderApi.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "enableFeature")
public final class C6139qR extends LM {
    public C6348rR d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6348rR g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6139qR(C6348rR c6348rR, LM lm) {
        super(lm);
        this.g = c6348rR;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}

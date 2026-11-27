package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.launchapp.usecases.LaunchAppPlatformFeaturesUseCaseImpl", f = "LaunchAppPlatformFeaturesUseCaseImpl.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "platformUniqueRequestsAllSuccess")
public final class UM0 extends LM {
    public VM0 d;
    public Function2 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ VM0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM0(VM0 vm0, LM lm) {
        super(lm);
        this.h = vm0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, this);
    }
}

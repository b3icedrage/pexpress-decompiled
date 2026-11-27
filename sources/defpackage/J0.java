package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultError;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.experiments.common.multi_variant.AbstractMultiVariantExperiment", f = "AbstractMultiVariantExperiment.kt", l = {30, UserVerificationMethods.USER_VERIFY_LOCATION, 36, 52}, m = "preloadExperimentValue$suspendImpl")
public final class J0 extends LM {
    public K0 d;
    public ResultError e;
    public /* synthetic */ Object g;
    public final /* synthetic */ K0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(K0 k0, LM lm) {
        super(lm);
        this.h = k0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return K0.f(this.h, this);
    }
}

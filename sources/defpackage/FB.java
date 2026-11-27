package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.usecases.CheckIsCaptchaRequiredUseCaseBase", f = "CheckIsCaptchaRequiredUseCaseBase.kt", l = {19}, m = "captchaRequirement$suspendImpl")
public final class FB extends LM {
    public CaptchaDestination d;
    public /* synthetic */ Object e;
    public final /* synthetic */ GB g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FB(GB gb, LM lm) {
        super(lm);
        this.g = gb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return GB.b(this.g, null, this);
    }
}

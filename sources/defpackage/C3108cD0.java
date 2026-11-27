package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.usecases.IsAmplitudeInitializedUseCaseApi", f = "IsAmplitudeInitializedUseCaseApi.kt", l = {RequestError.NO_DEV_KEY, 22}, m = "awaitFromConfig")
public final class C3108cD0 extends LM {
    public Object d;
    public C4795k21 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC3947gD0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3108cD0(AbstractC3947gD0 abstractC3947gD0, LM lm) {
        super(lm);
        this.h = abstractC3947gD0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.n(this);
    }
}

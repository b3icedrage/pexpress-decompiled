package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.appsflyer.share.attribution.RequestError;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.registration.usecase.CaptchaGateKt", f = "CaptchaGate.kt", l = {RequestError.NO_DEV_KEY, RequestError.NO_DEV_KEY}, m = "passCaptcha")
public final class C1652Ny extends LM {
    public String d;
    public CaptchaDestination e;
    public InterfaceC7931yy g;
    public Function1 h;
    public InterfaceC3220cl i;
    public InterfaceC5790ol j;
    public /* synthetic */ Object k;
    public int l;

    public C1652Ny() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return C1730Oy.b(null, null, null, null, null, null, null, this);
    }
}

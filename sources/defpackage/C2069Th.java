package defpackage;

import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.core.backend.domain.models.responseModels.CommonCaptchaDestinationsResponse;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2069Th extends AbstractC1991Sh {
    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final ResultOk b() {
        return new ResultOk(new CommonCaptchaDestinationsResponse(VE.c(new CaptchaDestination.RemindPass(0))));
    }
}

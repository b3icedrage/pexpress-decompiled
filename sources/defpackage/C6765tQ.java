package defpackage;

import com.api.core.backend.domain.models.responseModels.GetCurrencyResponse;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6765tQ extends AbstractC6555sQ {
    @Override // defpackage.InterfaceC6345rQ
    @Nullable
    public final GetCurrencyResponse j() {
        return new GetCurrencyResponse(VE.c(new GetCurrencyResponse.Currency()));
    }
}

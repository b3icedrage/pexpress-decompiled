package defpackage;

import com.api.core.backend.domain.models.requestModels.AddDealRequest;
import com.api.core.backend.domain.models.requestModels.GetCandlesToTimestampRequestApi;
import com.api.core.backend.domain.models.requestModels.MakeABetRequestApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface K22 {
    @Nullable
    Object a(@NotNull GetCandlesToTimestampRequestApi getCandlesToTimestampRequestApi, @NotNull LM lm);

    @Nullable
    C2201Uz b(@NotNull MakeABetRequestApi makeABetRequestApi);

    @Nullable
    C7532x31 c();

    @Nullable
    Object d(@NotNull AddDealRequest addDealRequest, @NotNull M32 m32);

    @Nullable
    C0658Bf0 e();
}

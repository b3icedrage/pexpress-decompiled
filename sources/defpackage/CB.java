package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CB implements BB {

    @NotNull
    public final InterfaceC1131Hh a;

    public CB(@NotNull InterfaceC1131Hh appDataRepository) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = appDataRepository;
    }

    @Override // defpackage.BB
    @Nullable
    public final EnumC3105cC0 c() {
        CommonResult<Boolean> commonResultC = this.a.c();
        return (!(commonResultC instanceof ResultOk) || ((Boolean) ((ResultOk) commonResultC).a()).booleanValue()) ? EnumC3105cC0.e : EnumC3105cC0.d;
    }
}

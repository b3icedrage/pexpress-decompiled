package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class TM1 implements SM1 {

    @NotNull
    public final InterfaceC1131Hh a;

    public TM1(@NotNull InterfaceC1131Hh appRepository) {
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        this.a = appRepository;
    }

    @Override // defpackage.SM1
    @Nullable
    public final ResultOk a() {
        return new ResultOk(Unit.a);
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface GG {
    @Nullable
    Object a(@NotNull JM<? super CommonResult<?>> jm);

    @Nullable
    Object b(@NotNull String str, @NotNull CommonError commonError, @NotNull LM lm);

    @Nullable
    Object c(@Nullable String str, long j, long j2, @NotNull LM lm);
}

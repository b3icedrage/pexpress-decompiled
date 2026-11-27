package defpackage;

import com.api.core.backend.domain.models.requestModels.CommonDuoAuthLoginRequest;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ub2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7012ub2 {
    @Nullable
    Object a(@NotNull String str, long j, @NotNull JM<? super CommonResult<Unit>> jm);

    @Nullable
    ResultOk b();

    @Nullable
    Object c(@NotNull C6732tF c6732tF, @NotNull C3929g8 c3929g8);

    @Nullable
    Object d(@NotNull XF xf, @NotNull JM<? super CommonResult<C7573xF>> jm);

    @Nullable
    Object f(@NotNull C5476nG c5476nG, @NotNull JM<? super CommonResult<C6315rG>> jm);

    @Nullable
    Object g(@NotNull C3326dG c3326dG, @NotNull JM<? super CommonResult<C6315rG>> jm);

    @Nullable
    Object h(@NotNull XF xf, @NotNull JM<? super CommonResult<C7573xF>> jm);

    @Nullable
    Object i(@NotNull JF jf, @NotNull C2713aQ c2713aQ);

    @Nullable
    Object j(@NotNull C5893pF c5893pF, @NotNull C4440ib0 c4440ib0);

    @Nullable
    Object k(@NotNull C6315rG c6315rG, @NotNull LM lm);

    @Nullable
    Object n(@NotNull AF af, @NotNull AC1 ac1);

    @Nullable
    Object p(@NotNull CommonDuoAuthLoginRequest commonDuoAuthLoginRequest, @NotNull LM lm);

    @Nullable
    Object q(@NotNull LM lm);

    @Nullable
    ResultError r();

    @Nullable
    Object s(@NotNull VF vf, @NotNull LM lm);

    @Nullable
    Object u(@NotNull C6315rG c6315rG, @NotNull JM<? super Unit> jm);

    @Nullable
    CommonResult v();

    @Nullable
    Object x(@NotNull C6735tG c6735tG, @NotNull LM lm);

    @Nullable
    Object y(@NotNull ZF zf, @NotNull LM lm);
}

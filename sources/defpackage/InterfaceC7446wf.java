package defpackage;

import com.api.core.backend.domain.models.requestModels.ConfigRequest;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7446wf {
    @Nullable
    Object a(@NotNull String str, @NotNull JM<? super Unit> jm);

    @NotNull
    CommonResult<Boolean> c();

    @Nullable
    Object d(@NotNull String str, @NotNull C1520Mh c1520Mh);

    @Nullable
    ResultError f();

    @Nullable
    C3735fC1 g();

    @Nullable
    Object h(@Nullable ConfigRequest configRequest, @NotNull C1679Oh c1679Oh);

    @Nullable
    Object i(@NotNull C1913Rh c1913Rh);
}

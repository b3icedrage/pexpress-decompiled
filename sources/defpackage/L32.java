package defpackage;

import com.api.core.backend.domain.models.abstractModels.WebSocketRequestAbstract;
import com.api.core.backend.domain.models.requestModels.CommonAddDealRequest;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface L32 {
    @Nullable
    Unit a();

    @Nullable
    Object b(@NotNull YF yf, @NotNull C6864ts1 c6864ts1);

    @Nullable
    ResultOk c();

    @Nullable
    Object d();

    @Nullable
    Object f(@NotNull LM lm);

    @Nullable
    Object g(@NotNull WebSocketRequestAbstract webSocketRequestAbstract, @NotNull LM lm);

    @Nullable
    Object h(@NotNull XP xp);

    @Nullable
    Object i();

    @Nullable
    Object j(@NotNull CommonAddDealRequest commonAddDealRequest, @NotNull Z02 z02);
}

package defpackage;

import com.api.core.backend.repositories.user.models.requests.AccountActivationRequest;
import com.api.core.backend.repositories.user.models.requests.AddUserRequest;
import com.api.core.backend.repositories.user.models.requests.ChangeChangeUserDataRequest;
import com.api.core.backend.repositories.user.models.requests.CryptoEnableRequest;
import com.api.core.backend.repositories.user.models.requests.GetUserDataRequest;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface Ya2 {
    @Nullable
    Object a(@NotNull String str, long j, @NotNull JM<? super InterfaceC1247It1<Unit>> jm);

    @Nullable
    Object b(@NotNull C6735tG c6735tG, @NotNull Eb2 eb2);

    @Nullable
    Object c(@NotNull AccountActivationRequest accountActivationRequest, @NotNull Gb2 gb2);

    @Nullable
    Object d(@NotNull AddUserRequest addUserRequest, @NotNull C7698xq0 c7698xq0, @NotNull C7433wb2.a aVar);

    @Nullable
    Object f(@NotNull C6315rG c6315rG, @NotNull LM lm);

    @Nullable
    Object g(@NotNull ChangeChangeUserDataRequest changeChangeUserDataRequest, @NotNull C7853yb2 c7853yb2);

    @Nullable
    Object h(@NotNull CryptoEnableRequest cryptoEnableRequest, @NotNull Db2 db2);

    @Nullable
    Object i(@NotNull GetUserDataRequest getUserDataRequest, @NotNull C7698xq0 c7698xq0, @NotNull Bb2.a aVar);
}

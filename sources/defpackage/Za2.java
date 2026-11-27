package defpackage;

import com.api.core.backend.repositories.user.models.requests.AccountActivationRequest;
import com.api.core.backend.repositories.user.models.requests.AddUserRequest;
import com.api.core.backend.repositories.user.models.requests.ChangeChangeUserDataRequest;
import com.api.core.backend.repositories.user.models.requests.CryptoEnableRequest;
import com.api.core.backend.repositories.user.models.requests.GetUserDataRequest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Za2 implements Ya2 {

    @NotNull
    public final InterfaceC7007ua1 a;

    public Za2(@NotNull InterfaceC7007ua1 ourSideHttpService) {
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        this.a = ourSideHttpService;
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object a(@NotNull String str, long j, @NotNull JM<? super InterfaceC1247It1<Unit>> jm) {
        return new Xa2();
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object c(@NotNull AccountActivationRequest accountActivationRequest, @NotNull Gb2 gb2) {
        return this.a.a(accountActivationRequest, gb2);
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object d(@NotNull AddUserRequest addUserRequest, @NotNull C7698xq0 c7698xq0, @NotNull C7433wb2.a aVar) {
        return this.a.b(addUserRequest, c7698xq0, aVar);
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object g(@NotNull ChangeChangeUserDataRequest changeChangeUserDataRequest, @NotNull C7853yb2 c7853yb2) {
        return this.a.i(changeChangeUserDataRequest, c7853yb2);
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object h(@NotNull CryptoEnableRequest cryptoEnableRequest, @NotNull Db2 db2) {
        return this.a.c(cryptoEnableRequest, db2);
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object i(@NotNull GetUserDataRequest getUserDataRequest, @NotNull C7698xq0 c7698xq0, @NotNull Bb2.a aVar) {
        return this.a.k(getUserDataRequest, c7698xq0, aVar);
    }
}

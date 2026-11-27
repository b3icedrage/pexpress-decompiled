package defpackage;

import com.api.core.backend.domain.models.requestModels.ConfigRequest;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7866yf implements InterfaceC7446wf, InterfaceC4833kC1 {
    public static final long d;

    @NotNull
    public static final C1078Gp0 e;
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final InterfaceC7007ua1 b;

    @NotNull
    public final C6753tM c;

    static {
        b.a aVar = b.e;
        long jG = c.g(15, R40.SECONDS);
        d = jG;
        e = new C1078Gp0(jG, jG);
    }

    public AbstractC7866yf(@NotNull InterfaceC7007ua1 ourSideHttpService, @NotNull C6753tM contextHelper, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        Intrinsics.checkNotNullParameter(contextHelper, "contextHelper");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.a = safeRequestsApi;
        this.b = ourSideHttpService;
        this.c = contextHelper;
    }

    @Override // defpackage.InterfaceC7446wf
    @Nullable
    public final Object a(@NotNull String str, @NotNull JM<? super Unit> jm) {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC7446wf
    @NotNull
    public final CommonResult<Boolean> c() {
        return new ResultOk(Boolean.valueOf(this.c.a.a()));
    }

    @Override // defpackage.InterfaceC7446wf
    @Nullable
    public final Object d(@NotNull String str, @NotNull C1520Mh c1520Mh) {
        return this.b.h(str, c1520Mh);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.e(function1, jm);
    }

    @Override // defpackage.InterfaceC7446wf
    @Nullable
    public final ResultError f() {
        return new ResultError(new CommonError.NotImplemented());
    }

    @Override // defpackage.InterfaceC7446wf
    @Nullable
    public final Object h(@Nullable ConfigRequest configRequest, @NotNull C1679Oh c1679Oh) {
        return this.a.w(new C7656xf(this, configRequest, null), c1679Oh);
    }

    @Override // defpackage.InterfaceC7446wf
    @Nullable
    public final Object i(@NotNull C1913Rh c1913Rh) {
        return this.b.d(c1913Rh);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError l(@NotNull CommonError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this.a.l(error);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError m(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        return this.a.m(errorText);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T extends HttpResponse<?>> Object o(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.o(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object t(@NotNull Function1<? super JM<? super CommonResult<? extends T>>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.t(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object w(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.w(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError z(@NotNull C6437rq0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return this.a.z(exception);
    }
}

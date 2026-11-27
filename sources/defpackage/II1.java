package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class II1 implements InterfaceC4833kC1, GI1 {
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final InterfaceC7864ye1 c;

    @NotNull
    public final InterfaceC7444we1 d;

    public II1(@NotNull InterfaceC4833kC1 safeRequestsApi, @NotNull C4923kf appDataRepository, @NotNull InterfaceC7864ye1 platformHttpService, @NotNull InterfaceC7444we1 platformHttpFullPathsProviderApi) {
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(platformHttpService, "platformHttpService");
        Intrinsics.checkNotNullParameter(platformHttpFullPathsProviderApi, "platformHttpFullPathsProviderApi");
        this.a = safeRequestsApi;
        this.b = appDataRepository;
        this.c = platformHttpService;
        this.d = platformHttpFullPathsProviderApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r8 == r1) goto L30;
     */
    @Override // defpackage.GI1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r8) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.II1.a(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.e(function1, jm);
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

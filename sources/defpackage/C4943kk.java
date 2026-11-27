package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.impl.core.backend.data_sources.AssetsDataSourceImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4943kk implements InterfaceC4833kC1 {
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final AssetsDataSourceImpl b;

    public C4943kk(@NotNull AssetsDataSourceImpl assetsDataSource, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        Intrinsics.checkNotNullParameter(assetsDataSource, "assetsDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.a = safeRequestsApi;
        this.b = assetsDataSource;
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final Object e(@NotNull Function1 function1, @NotNull JM jm) {
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
    public final Object o(@NotNull Function1 function1, @NotNull JM jm) {
        return this.a.o(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final Object t(@NotNull Function1 function1, @NotNull JM jm) {
        return this.a.t(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final Object w(@NotNull Function1 function1, @NotNull JM jm) {
        return this.a.w(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError z(@NotNull C6437rq0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return this.a.z(exception);
    }
}

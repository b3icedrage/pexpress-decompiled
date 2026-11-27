package defpackage;

import com.api.core.backend.domain.models.responseModels.KnowledgeBaseValuesResponse;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2957bW1 implements YV1, InterfaceC4833kC1 {
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final InterfaceC5313mV1 b;

    public C2957bW1(@NotNull InterfaceC5313mV1 supportDataSourceApi, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        Intrinsics.checkNotNullParameter(supportDataSourceApi, "supportDataSourceApi");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.a = safeRequestsApi;
        this.b = supportDataSourceApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.YV1
    @Nullable
    public final Object a(@NotNull String str, @NotNull LM lm) {
        ZV1 zv1;
        if (lm instanceof ZV1) {
            zv1 = (ZV1) lm;
            int i = zv1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zv1.g = i - Integer.MIN_VALUE;
            } else {
                zv1 = new ZV1(this, lm);
            }
        } else {
            zv1 = new ZV1(this, lm);
        }
        Object objO = zv1.d;
        MN mn = MN.d;
        int i2 = zv1.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C2733aW1 c2733aW1 = new C2733aW1(this, str, null);
            zv1.g = 1;
            objO = this.a.o(c2733aW1, zv1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        CommonResult commonResult = (CommonResult) objO;
        if (commonResult instanceof ResultOk) {
            return new ResultOk(((KnowledgeBaseValuesResponse) ((ResultOk) commonResult).a()).e());
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
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

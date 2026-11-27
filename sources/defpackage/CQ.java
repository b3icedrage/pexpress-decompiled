package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class CQ implements InterfaceC7816yQ, InterfaceC4833kC1 {
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final InterfaceC6345rQ b;

    @NotNull
    public final C4923kf c;

    public CQ(@NotNull InterfaceC6345rQ currencyDataSource, @NotNull InterfaceC4833kC1 safeRequestsApi, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(currencyDataSource, "currencyDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(currencyDataSource, "currencyDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.a = safeRequestsApi;
        this.b = currencyDataSource;
        this.c = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(CQ cq, LM lm) {
        C8026zQ c8026zQ;
        if (lm instanceof C8026zQ) {
            c8026zQ = (C8026zQ) lm;
            int i = c8026zQ.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8026zQ.g = i - Integer.MIN_VALUE;
            } else {
                c8026zQ = new C8026zQ(cq, lm);
            }
        } else {
            c8026zQ = new C8026zQ(cq, lm);
        }
        Object objE = c8026zQ.d;
        MN mn = MN.d;
        int i2 = c8026zQ.g;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            AQ aq = new AQ(cq, null);
            c8026zQ.g = 1;
            objE = cq.a.e(aq, c8026zQ);
            if (objE == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objE);
        }
        CommonResult commonResult = (CommonResult) objE;
        if (commonResult instanceof ResultOk) {
            KF kf = (KF) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a();
            return kf == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(kf);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7816yQ
    @Nullable
    public final Object a(@NotNull LM lm) {
        BQ bq;
        if (lm instanceof BQ) {
            bq = (BQ) lm;
            int i = bq.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq.g = i - Integer.MIN_VALUE;
            } else {
                bq = new BQ(this, lm);
            }
        } else {
            bq = new BQ(this, lm);
        }
        Object objA = bq.d;
        MN mn = MN.d;
        int i2 = bq.g;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.c.K;
            bq.g = 1;
            objA = C7236vf0.a(gp1, bq);
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
        }
        return new ResultOk(objA);
    }

    @Override // defpackage.InterfaceC7816yQ
    @Nullable
    public final Object b(@NotNull LM lm) {
        return c(this, lm);
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

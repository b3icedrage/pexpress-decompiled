package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonMinimumDeposit;
import com.api.core.backend.domain.models.responseModels.CommonRecommendedDeposit;
import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.core.backend.repositories.user.models.responses.CommonShortUserResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ib2 implements InterfaceC7012ub2, InterfaceC4833kC1 {

    @NotNull
    public final Ya2 a;

    @NotNull
    public final InterfaceC4833kC1 b;

    @NotNull
    public final C4923kf c;

    public Ib2(@NotNull Ya2 userDataSourceBase, @NotNull C3224cm authorizationDataSource, @NotNull InterfaceC4833kC1 saveRequestsApi, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(userDataSourceBase, "userDataSourceBase");
        Intrinsics.checkNotNullParameter(authorizationDataSource, "authorizationDataSource");
        Intrinsics.checkNotNullParameter(saveRequestsApi, "saveRequestsApi");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = userDataSourceBase;
        this.b = saveRequestsApi;
        this.c = appData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object A(Ib2 ib2, C6732tF c6732tF, LM lm) {
        C7222vb2 c7222vb2;
        C7698xq0 c7698xq0;
        if (lm instanceof C7222vb2) {
            c7222vb2 = (C7222vb2) lm;
            int i = c7222vb2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7222vb2.h = i - Integer.MIN_VALUE;
            } else {
                c7222vb2 = new C7222vb2(ib2, lm);
            }
        } else {
            c7222vb2 = new C7222vb2(ib2, lm);
        }
        Object objO = c7222vb2.e;
        MN mn = MN.d;
        int i2 = c7222vb2.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(14, r40), c.g(14, r40), c.g(14, r40));
            C7433wb2 c7433wb2 = new C7433wb2(c6732tF, null, c7698xq1, ib2);
            c7222vb2.d = c7698xq1;
            c7222vb2.h = 1;
            objO = ib2.b.o(c7433wb2, c7222vb2);
            if (objO == mn) {
                return mn;
            }
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c7222vb2.d;
            C1795Pt1.b(objO);
        }
        CommonResult commonResult = (CommonResult) objO;
        C5027l8.z(commonResult, c7698xq0);
        if (commonResult instanceof ResultOk) {
            return new ResultOk(((DefaultResponse) ((ResultOk) commonResult).a()).e());
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object B(Ib2 ib2, AF af, LM lm) {
        C7643xb2 c7643xb2;
        if (lm instanceof C7643xb2) {
            c7643xb2 = (C7643xb2) lm;
            int i = c7643xb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7643xb2.g = i - Integer.MIN_VALUE;
            } else {
                c7643xb2 = new C7643xb2(ib2, lm);
            }
        } else {
            c7643xb2 = new C7643xb2(ib2, lm);
        }
        Object objO = c7643xb2.d;
        MN mn = MN.d;
        int i2 = c7643xb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            C7853yb2 c7853yb2 = new C7853yb2(ib2, af, null);
            c7643xb2.g = 1;
            objO = ib2.b.o(c7853yb2, c7643xb2);
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
            return new ResultOk(((DefaultResponse) ((ResultOk) commonResult).a()).e());
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object C(Ib2 ib2, C6315rG c6315rG, LM lm) {
        C8063zb2 c8063zb2;
        if (lm instanceof C8063zb2) {
            c8063zb2 = (C8063zb2) lm;
            int i = c8063zb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8063zb2.g = i - Integer.MIN_VALUE;
            } else {
                c8063zb2 = new C8063zb2(ib2, lm);
            }
        } else {
            c8063zb2 = new C8063zb2(ib2, lm);
        }
        Object objF = c8063zb2.d;
        MN mn = MN.d;
        int i2 = c8063zb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            Ya2 ya2 = ib2.a;
            c8063zb2.g = 1;
            objF = ya2.f(c6315rG, c8063zb2);
            if (objF == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objF);
        }
        CommonResult commonResult = (CommonResult) objF;
        if (commonResult instanceof ResultOk) {
            C6945uG c6945uG = (C6945uG) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a();
            return c6945uG == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c6945uG);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object D(Ib2 ib2, ZF zf, LM lm) {
        Ab2 ab2;
        Ib2 ib3;
        C7698xq0 c7698xq0;
        if (lm instanceof Ab2) {
            ab2 = (Ab2) lm;
            int i = ab2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ab2.i = i - Integer.MIN_VALUE;
            } else {
                ab2 = new Ab2(ib2, lm);
            }
        } else {
            ab2 = new Ab2(ib2, lm);
        }
        Object objO = ab2.g;
        MN mn = MN.d;
        int i2 = ab2.i;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(14, r40), c.g(14, r40), c.g(14, r40));
            Bb2 bb2 = new Bb2(zf, null, c7698xq1, ib2);
            ab2.d = ib2;
            ab2.e = c7698xq1;
            ab2.i = 1;
            objO = ib2.b.o(bb2, ab2);
            if (objO == mn) {
                return mn;
            }
            ib3 = ib2;
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = ab2.e;
            ib3 = ab2.d;
            C1795Pt1.b(objO);
        }
        CommonResult resultError = (CommonResult) objO;
        C5027l8.z(resultError, c7698xq0);
        if (resultError instanceof ResultOk) {
            C6106qG c6106qGE = ((CommonShortUserResponse) ((ResultOk) resultError).a()).e();
            resultError = c6106qGE == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c6106qGE);
        } else if (!(resultError instanceof ResultError)) {
            throw new C6489s51();
        }
        ib3.getClass();
        Intrinsics.checkNotNullParameter(resultError, "<this>");
        boolean z = resultError instanceof ResultOk;
        C4923kf c4923kf = ib3.c;
        if (z) {
            c4923kf.c.setValue(((ResultOk) resultError).a());
            Boolean bool = Boolean.TRUE;
            GP1 gp1 = c4923kf.d;
            gp1.getClass();
            gp1.m(null, bool);
            return resultError;
        }
        if (!(resultError instanceof ResultError)) {
            throw new C6489s51();
        }
        if (((ResultError) resultError).getError() instanceof CommonError.UserNotInDatabase) {
            GP1 gp2 = c4923kf.d;
            Boolean bool2 = Boolean.FALSE;
            gp2.getClass();
            gp2.m(null, bool2);
        }
        return resultError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object E(Ib2 ib2, JF jf, LM lm) {
        Cb2 cb2;
        if (lm instanceof Cb2) {
            cb2 = (Cb2) lm;
            int i = cb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cb2.g = i - Integer.MIN_VALUE;
            } else {
                cb2 = new Cb2(ib2, lm);
            }
        } else {
            cb2 = new Cb2(ib2, lm);
        }
        Object objO = cb2.d;
        MN mn = MN.d;
        int i2 = cb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            Db2 db2 = new Db2(ib2, jf, null);
            cb2.g = 1;
            objO = ib2.b.o(db2, cb2);
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
            return new ResultOk(((DefaultResponse) ((ResultOk) commonResult).a()).e());
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object F(Ib2 ib2, C5893pF c5893pF, LM lm) {
        Fb2 fb2;
        if (lm instanceof Fb2) {
            fb2 = (Fb2) lm;
            int i = fb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb2.g = i - Integer.MIN_VALUE;
            } else {
                fb2 = new Fb2(ib2, lm);
            }
        } else {
            fb2 = new Fb2(ib2, lm);
        }
        Object objO = fb2.d;
        MN mn = MN.d;
        int i2 = fb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            Gb2 gb2 = new Gb2(ib2, c5893pF, null);
            fb2.g = 1;
            objO = ib2.b.o(gb2, fb2);
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
            return new ResultOk(((DefaultResponse) ((ResultOk) commonResult).a()).e());
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object a(@NotNull String str, long j, @NotNull JM<? super CommonResult<Unit>> jm) {
        return this.b.e(new Hb2(this, str, j, null), jm);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final ResultOk b() {
        return new ResultOk(new CommonMinimumDeposit(PW0.c()));
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object c(@NotNull C6732tF c6732tF, @NotNull C3929g8 c3929g8) {
        return A(this, c6732tF, c3929g8);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.e(function1, jm);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object i(@NotNull JF jf, @NotNull C2713aQ c2713aQ) {
        return E(this, jf, c2713aQ);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object j(@NotNull C5893pF c5893pF, @NotNull C4440ib0 c4440ib0) {
        return F(this, c5893pF, c4440ib0);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object k(@NotNull C6315rG c6315rG, @NotNull LM lm) {
        return C(this, c6315rG, lm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError l(@NotNull CommonError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return this.b.l(error);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError m(@NotNull String errorText) {
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        return this.b.m(errorText);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object n(@NotNull AF af, @NotNull AC1 ac1) {
        return B(this, af, ac1);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T extends HttpResponse<?>> Object o(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.o(function1, jm);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final ResultError r() {
        return new ResultError(new CommonError.OtherError(null, 0, 3, null));
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object t(@NotNull Function1<? super JM<? super CommonResult<? extends T>>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.t(function1, jm);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final CommonResult v() {
        FF ff = (FF) this.c.b.getValue();
        Map<String, Integer> map = ff != null ? ff.y : null;
        return map != null ? new ResultOk(new CommonRecommendedDeposit(map)) : new ResultError(new CommonError.NotImplemented());
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object w(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.w(function1, jm);
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object x(@NotNull C6735tG c6735tG, @NotNull LM lm) {
        Object objE = this.b.e(new Eb2(this, c6735tG, null), lm);
        return objE == MN.d ? objE : Unit.a;
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object y(@NotNull ZF zf, @NotNull LM lm) {
        return D(this, zf, lm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError z(@NotNull C6437rq0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return this.b.z(exception);
    }
}

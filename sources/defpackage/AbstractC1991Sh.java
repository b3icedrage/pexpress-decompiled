package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonCheckIfCountryAvailableResponse;
import com.api.core.backend.domain.models.responseModels.ConfigResponse;
import com.api.core.backend.domain.models.responseModels.CountriesLocalizedResponse;
import com.api.core.backend.domain.models.responseModels.GetVPNResponse;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.appsflyer.sdk_base.referrer.Payload;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1991Sh implements InterfaceC1131Hh, InterfaceC4833kC1 {
    public final /* synthetic */ InterfaceC4833kC1 a;

    @NotNull
    public final InterfaceC7446wf b;

    public AbstractC1991Sh(@NotNull InterfaceC7446wf appDataSource, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        Intrinsics.checkNotNullParameter(appDataSource, "appDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.a = safeRequestsApi;
        this.b = appDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object k(AbstractC1991Sh abstractC1991Sh, String str, LM lm) {
        C1209Ih c1209Ih;
        if (lm instanceof C1209Ih) {
            c1209Ih = (C1209Ih) lm;
            int i = c1209Ih.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1209Ih.g = i - Integer.MIN_VALUE;
            } else {
                c1209Ih = new C1209Ih(abstractC1991Sh, lm);
            }
        } else {
            c1209Ih = new C1209Ih(abstractC1991Sh, lm);
        }
        Object obj = c1209Ih.d;
        MN mn = MN.d;
        int i2 = c1209Ih.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C1287Jh c1287Jh = new C1287Jh(abstractC1991Sh, str, null);
            c1209Ih.g = 1;
            if (abstractC1991Sh.a.e(c1287Jh, c1209Ih) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C0857Dt1.a aVar = new C0857Dt1.a();
        aVar.c = HttpPlatformResponse.MAX_MESSAGE_LENGTH;
        Intrinsics.checkNotNullParameter(Payload.RESPONSE_OK, "message");
        aVar.d = Payload.RESPONSE_OK;
        EnumC1298Jk1 protocol = EnumC1298Jk1.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        aVar.b = protocol;
        C4543is1.a aVar2 = new C4543is1.a();
        aVar2.h("http://localhost/");
        C4543is1 request = aVar2.b();
        Intrinsics.checkNotNullParameter(request, "request");
        aVar.a = request;
        C0935Et1 c0935Et1A = C0935Et1.a(null, aVar.a());
        Intrinsics.checkNotNullExpressionValue(c0935Et1A, "success(...)");
        return new ResultOk(c0935Et1A);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object n(AbstractC1991Sh abstractC1991Sh, LM lm) {
        C1365Kh c1365Kh;
        if (lm instanceof C1365Kh) {
            c1365Kh = (C1365Kh) lm;
            int i = c1365Kh.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1365Kh.g = i - Integer.MIN_VALUE;
            } else {
                c1365Kh = new C1365Kh(abstractC1991Sh, lm);
            }
        } else {
            c1365Kh = new C1365Kh(abstractC1991Sh, lm);
        }
        Object objF = c1365Kh.d;
        Object obj = MN.d;
        int i2 = c1365Kh.g;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            InterfaceC7446wf interfaceC7446wf = abstractC1991Sh.b;
            c1365Kh.g = 1;
            objF = interfaceC7446wf.f();
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objF);
        }
        CommonResult commonResult = (CommonResult) objF;
        if (commonResult instanceof ResultOk) {
            return new ResultOk(Boolean.valueOf(((CommonCheckIfCountryAvailableResponse) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a()).getIsCountryAvailable()));
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object p(AbstractC1991Sh abstractC1991Sh, String str, LM lm) {
        C1443Lh c1443Lh;
        if (lm instanceof C1443Lh) {
            c1443Lh = (C1443Lh) lm;
            int i = c1443Lh.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1443Lh.g = i - Integer.MIN_VALUE;
            } else {
                c1443Lh = new C1443Lh(abstractC1991Sh, lm);
            }
        } else {
            c1443Lh = new C1443Lh(abstractC1991Sh, lm);
        }
        Object objE = c1443Lh.d;
        MN mn = MN.d;
        int i2 = c1443Lh.g;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            C1520Mh c1520Mh = new C1520Mh(abstractC1991Sh, str, null);
            c1443Lh.g = 1;
            objE = abstractC1991Sh.a.e(c1520Mh, c1443Lh);
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
            CountriesLocalizedResponse.Countries result = ((CountriesLocalizedResponse) ((ResultOk) commonResult).a()).getResult();
            HF hfA = result != null ? result.a() : null;
            return hfA == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(hfA);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object q(AbstractC1991Sh abstractC1991Sh, GF gf, LM lm) {
        C1601Nh c1601Nh;
        if (lm instanceof C1601Nh) {
            c1601Nh = (C1601Nh) lm;
            int i = c1601Nh.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1601Nh.g = i - Integer.MIN_VALUE;
            } else {
                c1601Nh = new C1601Nh(abstractC1991Sh, lm);
            }
        } else {
            c1601Nh = new C1601Nh(abstractC1991Sh, lm);
        }
        Object objT = c1601Nh.d;
        MN mn = MN.d;
        int i2 = c1601Nh.g;
        if (i2 == 0) {
            C1795Pt1.b(objT);
            C1679Oh c1679Oh = new C1679Oh(abstractC1991Sh, gf, null);
            c1601Nh.g = 1;
            objT = abstractC1991Sh.a.t(c1679Oh, c1601Nh);
            if (objT == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objT);
        }
        CommonResult commonResult = (CommonResult) objT;
        if (commonResult instanceof ResultOk) {
            FF ffF = ((ConfigResponse) ((ResultOk) commonResult).a()).f();
            return ffF == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(ffF);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object r(AbstractC1991Sh abstractC1991Sh, LM lm) {
        C1835Qh c1835Qh;
        if (lm instanceof C1835Qh) {
            c1835Qh = (C1835Qh) lm;
            int i = c1835Qh.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1835Qh.g = i - Integer.MIN_VALUE;
            } else {
                c1835Qh = new C1835Qh(abstractC1991Sh, lm);
            }
        } else {
            c1835Qh = new C1835Qh(abstractC1991Sh, lm);
        }
        Object objE = c1835Qh.d;
        MN mn = MN.d;
        int i2 = c1835Qh.g;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            C1913Rh c1913Rh = new C1913Rh(abstractC1991Sh, null);
            c1835Qh.g = 1;
            objE = abstractC1991Sh.a.e(c1913Rh, c1835Qh);
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
            C7365wG c7365wGE = ((GetVPNResponse) ((ResultOk) commonResult).a()).e();
            return c7365wGE == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c7365wGE);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object a(@NotNull String str, @NotNull JM<? super CommonResult<C0935Et1<Void>>> jm) {
        return k(this, str, (LM) jm);
    }

    @Override // defpackage.InterfaceC1131Hh
    @NotNull
    public final CommonResult<Boolean> c() {
        return this.b.c();
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object d(@NotNull C6968uN1 c6968uN1) {
        return n(this, c6968uN1);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.a.e(function1, jm);
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object f(@NotNull C5349mf2 c5349mf2) {
        return r(this, c5349mf2);
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Unit g() {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object h(@NotNull C4479il0 c4479il0) {
        return this.a.e(new C1757Ph(this, null), c4479il0);
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object i(@NotNull GF gf, @NotNull C2001Sk0 c2001Sk0) {
        return q(this, gf, c2001Sk0);
    }

    @Override // defpackage.InterfaceC1131Hh
    @Nullable
    public final Object j(@NotNull String str, @NotNull C3559eO c3559eO) {
        return p(this, str, c3559eO);
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

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.core.backend.repositories.user.models.requests.ForgotPasswordRequest;
import com.api.core.backend.repositories.user.models.requests.LoginDuoAuthRequest;
import com.api.core.backend.repositories.user.models.requests.LoginRequest;
import com.api.core.backend.repositories.user.models.requests.RegisterRequest;
import com.api.core.backend.repositories.user.models.responses.CommonLoginResponse;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.responseModels.AuthorizationResponseImpl;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.d;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3224cm extends AbstractC2003Sl {

    @NotNull
    public final InterfaceC7864ye1 c;

    @NotNull
    public final InterfaceC7444we1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224cm(@NotNull InterfaceC7007ua1 ourSideHttpService, @NotNull InterfaceC7864ye1 platformHttpService, @NotNull InterfaceC4833kC1 safeRequestsApi, @NotNull InterfaceC7444we1 fullPathsProvider) {
        super(ourSideHttpService, safeRequestsApi);
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        Intrinsics.checkNotNullParameter(platformHttpService, "platformHttpService");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        Intrinsics.checkNotNullParameter(fullPathsProvider, "fullPathsProvider");
        this.c = platformHttpService;
        this.d = fullPathsProvider;
    }

    public static final C2042Sy a(C3224cm c3224cm, String str, String flow) {
        C2042Sy c2042Sy;
        C1988Sg c1988Sg;
        c3224cm.getClass();
        if (str == null || !StringsKt.D(str, '{')) {
            if (str == null) {
                str = "";
            }
            c2042Sy = new C2042Sy(str, "", null);
        } else {
            Map mapC = (Map) new Gson().e(str, TypeToken.get((Type) Map.class));
            if (mapC == null) {
                mapC = PW0.c();
            }
            Object obj = mapC.get("appRecaptchaToken");
            String str2 = obj instanceof String ? (String) obj : null;
            if (str2 == null) {
                str2 = "";
            }
            Object obj2 = mapC.get("gRecaptchaResponse");
            String str3 = obj2 instanceof String ? (String) obj2 : null;
            String str4 = str3 != null ? str3 : "";
            Object obj3 = mapC.get("appRecaptchaError");
            c2042Sy = new C2042Sy(str2, str4, obj3 instanceof String ? (String) obj3 : null);
        }
        Intrinsics.checkNotNullParameter(flow, "flow");
        ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
        Intrinsics.checkNotNullParameter(flow, "flow");
        InterfaceC3220cl interfaceC3220cl = C3430dl.b.get(flow);
        String str5 = c2042Sy.c;
        if (interfaceC3220cl != null) {
            interfaceC3220cl.b("captcha.tokens", c2042Sy.a());
            if (str5 != null) {
                interfaceC3220cl.b("captcha.v3_error", KS1.B(100, str5));
            }
        }
        if (!c2042Sy.a().equals("v2+v3") && (c1988Sg = U0.O) != null) {
            c1988Sg.l("auth", "captcha.token_incomplete", EnumC0936Eu.e, PW0.e(new Pair("flow", flow), new Pair("tokens", c2042Sy.a()), new Pair("v3_error", str5)));
        }
        return c2042Sy;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0087  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:59:0x0136  */
    public static final AuthorizationResponseImpl b(C3224cm c3224cm, C0935Et1 c0935Et1, C7698xq0 recorder) throws UnsupportedEncodingException {
        Pair pair;
        Pair pair2;
        String strX;
        String strX2;
        String strY;
        c3224cm.getClass();
        AuthorizationResponseImpl authorizationResponseImpl = (AuthorizationResponseImpl) c0935Et1.b;
        C0857Dt1 response = c0935Et1.a;
        if (!response.g() || authorizationResponseImpl == null) {
            throw new C6437rq0(c0935Et1);
        }
        if (Intrinsics.a(authorizationResponseImpl.getSuccess(), Boolean.TRUE)) {
            Intrinsics.checkNotNullExpressionValue(response, "raw(...)");
            String rUrl = authorizationResponseImpl.getRUrl();
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(recorder, "recorder");
            List listP = JH1.p(FH1.e(response, new LA(1)));
            Iterator it = CollectionsKt.i0(listP).iterator();
            do {
                C1414Kx0 c1414Kx0 = (C1414Kx0) it;
                if (!c1414Kx0.d.hasNext()) {
                    pair = null;
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
                C0857Dt1 c0857Dt1 = (C0857Dt1) indexedValue.b;
                c0857Dt1.getClass();
                Intrinsics.checkNotNullParameter("set-cookie", AppMeasurementSdk.ConditionalUserProperty.NAME);
                Iterator<T> it2 = c0857Dt1.j.h("set-cookie").iterator();
                do {
                    if (!it2.hasNext()) {
                        strY = null;
                        break;
                    }
                    String str = (String) it2.next();
                    if (d.o(str, "ci_session=", false)) {
                        String strDecode = URLDecoder.decode(str, Charsets.UTF_8.name());
                        Intrinsics.checkNotNull(strDecode);
                        strY = StringsKt.Y(StringsKt.V(strDecode, "s:32:\"", ""), "\";");
                        if (strY.length() == 0) {
                            strY = null;
                        }
                    } else {
                        strY = null;
                    }
                } while (strY == null);
                if (strY != null) {
                    pair = new Pair(indexedValue.a == 0 ? "final" : "redirect_hop", strY);
                } else {
                    pair = null;
                }
            } while (pair == null);
            if (pair == null) {
                Iterator it3 = listP.iterator();
                do {
                    if (!it3.hasNext()) {
                        pair2 = null;
                        break;
                    }
                    C0857Dt1 c0857Dt2 = (C0857Dt1) it3.next();
                    String strF = C0857Dt1.f(c0857Dt2, "Location");
                    if (strF != null) {
                        strX2 = StringsKt.X(StringsKt.V(strF, "token=", ""), '&');
                        if (strX2.length() == 0) {
                            strX2 = null;
                        }
                        if (strX2 == null) {
                            strX = StringsKt.X(StringsKt.V(c0857Dt2.d.a.i, "token=", ""), '&');
                            if (strX.length() == 0) {
                                strX2 = null;
                            } else {
                                strX2 = strX;
                            }
                        }
                    } else {
                        strX = StringsKt.X(StringsKt.V(c0857Dt2.d.a.i, "token=", ""), '&');
                        if (strX.length() == 0) {
                            strX2 = null;
                        } else {
                            strX2 = strX;
                        }
                    }
                    pair2 = strX2 != null ? new Pair("redirect_url", strX2) : null;
                } while (pair2 == null);
                if (pair2 == null) {
                    if (rUrl != null) {
                        String strX3 = StringsKt.X(StringsKt.V(rUrl, "token=", ""), '&');
                        if (strX3.length() == 0) {
                            strX3 = null;
                        }
                        if (strX3 != null) {
                            pair = new Pair("body_redirect_url", strX3);
                        } else {
                            pair = null;
                        }
                    } else {
                        pair = null;
                    }
                    if (pair == null) {
                        pair = new Pair(DevicePublicKeyStringDef.NONE, null);
                    }
                } else {
                    pair = pair2;
                }
            }
            String str2 = (String) pair.d;
            String str3 = (String) pair.e;
            recorder.b(str2, "session_source");
            authorizationResponseImpl.e(str3);
        }
        return authorizationResponseImpl;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull ForgotPasswordRequest forgotPasswordRequest, @NotNull LM lm) {
        C2081Tl c2081Tl;
        C7698xq0 c7698xq0;
        if (lm instanceof C2081Tl) {
            c2081Tl = (C2081Tl) lm;
            int i = c2081Tl.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2081Tl.h = i - Integer.MIN_VALUE;
            } else {
                c2081Tl = new C2081Tl(this, lm);
            }
        } else {
            c2081Tl = new C2081Tl(this, lm);
        }
        Object objE = c2081Tl.e;
        MN mn = MN.d;
        int i2 = c2081Tl.h;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(15, r40), c.g(30, r40), c.g(40, r40));
            C2159Ul c2159Ul = new C2159Ul(this, forgotPasswordRequest, c7698xq1, null);
            c2081Tl.d = c7698xq1;
            c2081Tl.h = 1;
            objE = this.a.e(c2159Ul, c2081Tl);
            if (objE == mn) {
                return mn;
            }
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c2081Tl.d;
            C1795Pt1.b(objE);
        }
        CommonResult commonResult = (CommonResult) objE;
        C5027l8.z(commonResult, c7698xq0);
        return commonResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object d(@NotNull LoginDuoAuthRequest loginDuoAuthRequest, @NotNull LM lm) {
        C2237Vl c2237Vl;
        C7698xq0 c7698xq0;
        if (lm instanceof C2237Vl) {
            c2237Vl = (C2237Vl) lm;
            int i = c2237Vl.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2237Vl.h = i - Integer.MIN_VALUE;
            } else {
                c2237Vl = new C2237Vl(this, lm);
            }
        } else {
            c2237Vl = new C2237Vl(this, lm);
        }
        Object objE = c2237Vl.e;
        MN mn = MN.d;
        int i2 = c2237Vl.h;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(15, r40), c.g(30, r40), c.g(40, r40));
            C2319Wl c2319Wl = new C2319Wl(this, loginDuoAuthRequest, c7698xq1, null);
            c2237Vl.d = c7698xq1;
            c2237Vl.h = 1;
            objE = this.a.e(c2319Wl, c2237Vl);
            if (objE == mn) {
                return mn;
            }
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c2237Vl.d;
            C1795Pt1.b(objE);
        }
        CommonResult commonResult = (CommonResult) objE;
        C5027l8.z(commonResult, c7698xq0);
        if (!(commonResult instanceof ResultOk)) {
            if (commonResult instanceof ResultError) {
                return commonResult;
            }
            throw new C6489s51();
        }
        AuthorizationResponseImpl authorizationResponseImpl = (AuthorizationResponseImpl) ((ResultOk) commonResult).a();
        if (authorizationResponseImpl.a().a.length() != 0) {
            return new ResultOk(authorizationResponseImpl);
        }
        ResultError resultError = new ResultError(new CommonError.SessionMissing());
        C5027l8.z(resultError, c7698xq0);
        return resultError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(@NotNull LoginRequest loginRequest, @NotNull LM lm) {
        C2423Xl c2423Xl;
        C7698xq0 c7698xq0;
        if (lm instanceof C2423Xl) {
            c2423Xl = (C2423Xl) lm;
            int i = c2423Xl.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2423Xl.h = i - Integer.MIN_VALUE;
            } else {
                c2423Xl = new C2423Xl(this, lm);
            }
        } else {
            c2423Xl = new C2423Xl(this, lm);
        }
        Object objE = c2423Xl.e;
        MN mn = MN.d;
        int i2 = c2423Xl.h;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(15, r40), c.g(30, r40), c.g(40, r40));
            C2501Yl c2501Yl = new C2501Yl(this, null, c7698xq1, loginRequest);
            c2423Xl.d = c7698xq1;
            c2423Xl.h = 1;
            objE = this.a.e(c2501Yl, c2423Xl);
            if (objE == mn) {
                return mn;
            }
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c2423Xl.d;
            C1795Pt1.b(objE);
        }
        CommonResult commonResult = (CommonResult) objE;
        C5027l8.z(commonResult, c7698xq0);
        if (!(commonResult instanceof ResultOk)) {
            if (commonResult instanceof ResultError) {
                return commonResult;
            }
            throw new C6489s51();
        }
        CommonLoginResponse commonLoginResponseG = ((AuthorizationResponseImpl) ((ResultOk) commonResult).a()).g();
        String ssid = commonLoginResponseG.getSsid();
        if ((ssid != null && ssid.length() != 0) || commonLoginResponseG.getMethod() != null) {
            return new ResultOk(commonLoginResponseG);
        }
        ResultError resultError = new ResultError(new CommonError.SessionMissing());
        C5027l8.z(resultError, c7698xq0);
        return resultError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull RegisterRequest registerRequest, @NotNull LM lm) {
        C2579Zl c2579Zl;
        C7698xq0 c7698xq0;
        if (lm instanceof C2579Zl) {
            c2579Zl = (C2579Zl) lm;
            int i = c2579Zl.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2579Zl.h = i - Integer.MIN_VALUE;
            } else {
                c2579Zl = new C2579Zl(this, lm);
            }
        } else {
            c2579Zl = new C2579Zl(this, lm);
        }
        Object objE = c2579Zl.e;
        MN mn = MN.d;
        int i2 = c2579Zl.h;
        if (i2 == 0) {
            C1795Pt1.b(objE);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(15, r40), c.g(30, r40), c.g(40, r40));
            C2791am c2791am = new C2791am(this, null, c7698xq1, registerRequest);
            c2579Zl.d = c7698xq1;
            c2579Zl.h = 1;
            objE = this.a.e(c2791am, c2579Zl);
            if (objE == mn) {
                return mn;
            }
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c2579Zl.d;
            C1795Pt1.b(objE);
        }
        CommonResult commonResult = (CommonResult) objE;
        C5027l8.z(commonResult, c7698xq0);
        return commonResult;
    }
}

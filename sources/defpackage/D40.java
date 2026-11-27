package defpackage;

import com.api.core.backend.domain.models.requestModels.CommonDuoAuthLoginRequest;
import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class D40 implements C40 {

    @NotNull
    public final C4966kq1 a;

    @NotNull
    public final InterfaceC1767Pk0 b;

    @NotNull
    public final InterfaceC7012ub2 c;

    @NotNull
    public final C4923kf d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DuoAuthType.values().length];
            try {
                iArr[DuoAuthType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DuoAuthType.GOOGLE_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DuoAuthType.FB_MESSENGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DuoAuthType.SMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DuoAuthType.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DuoAuthType.PUSH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.DuoAuthRequestUseCaseBase", f = "DuoAuthRequestUseCaseBase.kt", l = {RequestError.NETWORK_FAILURE, 49, 53, 53, 62, 72, 72, 84, ModuleDescriptor.MODULE_VERSION}, m = "requestLoginDuoAuth$suspendImpl")
    public static final class b extends LM {
        public Object d;
        public Object e;
        public Object g;
        public C3027bp1 h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return D40.b(D40.this, this);
        }
    }

    public D40(@NotNull C4966kq1 registerAndLoginParams, @NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull InterfaceC7012ub2 userRepository, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = registerAndLoginParams;
        this.b = getCodeIfNeededFromDuoAuthUseCase;
        this.c = userRepository;
        this.d = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0288  */
    /* JADX WARN: Code duplicated, block: B:104:0x0292  */
    /* JADX WARN: Code duplicated, block: B:106:0x0299  */
    /* JADX WARN: Code duplicated, block: B:107:0x029c  */
    /* JADX WARN: Code duplicated, block: B:109:0x02af  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e8 A[PHI: r0 r4
      0x02e8: PHI (r0v43 com.api.core.backend.domain.models.resultModels.CommonResult) = 
      (r0v37 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r0v37 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r0v45 com.api.core.backend.domain.models.resultModels.CommonResult)
     binds: [B:113:0x02b9, B:115:0x02e5, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]
      0x02e8: PHI (r4v60 D40) = (r4v54 D40), (r4v54 D40), (r4v63 D40) binds: [B:113:0x02b9, B:115:0x02e5, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x02fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0300  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:39:0x012a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0130  */
    /* JADX WARN: Code duplicated, block: B:43:0x0136  */
    /* JADX WARN: Code duplicated, block: B:47:0x015d  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0205  */
    /* JADX WARN: Code duplicated, block: B:85:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x0246  */
    /* JADX WARN: Code duplicated, block: B:98:0x025f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object b(D40 d40, JM<? super CommonResult<?>> jm) throws Throwable {
        b bVar;
        InterfaceC3220cl interfaceC3220cl;
        Object obj;
        DuoAuthType type;
        C3027bp1 c3027bp1;
        Object objC;
        D40 d41;
        C3027bp1 c3027bp2;
        T t;
        C3027bp1 c3027bp3;
        ResultError resultErrorR;
        D40 d42;
        C3027bp1 c3027bp4;
        Object obj2;
        DuoAuthType duoAuthType;
        InterfaceC3220cl interfaceC3220cl2;
        InterfaceC5790ol interfaceC5790olD;
        InterfaceC5790ol interfaceC5790ol;
        ResultError resultErrorR2;
        Object obj3;
        CommonResult commonResult;
        Object objC2;
        DuoAuthType duoAuthType2;
        InterfaceC3220cl interfaceC3220cl3;
        D40 d43;
        Object objP;
        D40 d44;
        InterfaceC5790ol interfaceC5790olD2;
        InterfaceC5790ol interfaceC5790ol2;
        Object objP2;
        Object obj4;
        T t2;
        Object obj5;
        InterfaceC3220cl interfaceC3220cl4;
        CommonResult commonResult2;
        String str;
        InterfaceC1767Pk0 interfaceC1767Pk0;
        DuoAuthType duoAuthType3;
        D40 d45 = d40;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.l = i - Integer.MIN_VALUE;
            } else {
                bVar = d45.new b(jm);
            }
        } else {
            bVar = d45.new b(jm);
        }
        Object obj6 = bVar.j;
        MN mn = MN.d;
        switch (bVar.l) {
            case 0:
                C1795Pt1.b(obj6);
                ConcurrentHashMap<String, InterfaceC3220cl> concurrentHashMap = C3430dl.a;
                Intrinsics.checkNotNullParameter("login", "flow");
                InterfaceC3220cl interfaceC3220cl5 = C3430dl.b.get("login");
                InterfaceC5910pK1<DuoAuthType> interfaceC5910pK1B = d45.b.b();
                bVar.d = d45;
                bVar.e = interfaceC3220cl5;
                bVar.l = 1;
                Object objO = C4466ii.o(interfaceC5910pK1B, bVar);
                if (objO != mn) {
                    interfaceC3220cl = interfaceC3220cl5;
                    obj = objO;
                    type = (DuoAuthType) obj;
                    if (interfaceC3220cl != null) {
                        String lowerCase = type.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        interfaceC3220cl.b("duo_auth.type", lowerCase);
                    }
                    c3027bp1 = new C3027bp1();
                    c3027bp1.d = "";
                    switch (a.a[type.ordinal()]) {
                        case 1:
                            if (interfaceC3220cl != null) {
                                interfaceC3220cl.b("duo_auth.outcome", "not_required");
                            }
                            return new ResultOk(Unit.a);
                        case 2:
                        case 3:
                            bVar.d = d45;
                            bVar.e = interfaceC3220cl;
                            bVar.g = type;
                            bVar.h = c3027bp1;
                            bVar.i = c3027bp1;
                            bVar.l = 2;
                            objC = d45.c(interfaceC3220cl, bVar);
                            if (objC != mn) {
                                d41 = d45;
                                c3027bp2 = c3027bp1;
                                t = objC;
                                c3027bp3 = c3027bp2;
                                c3027bp2.d = t;
                                duoAuthType2 = type;
                                interfaceC3220cl3 = interfaceC3220cl;
                                d43 = d41;
                                if (((CharSequence) c3027bp3.d).length() == 0) {
                                    if (interfaceC3220cl3 != null) {
                                        interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                    }
                                    return new ResultError(new CommonError.DuoAuthCanceled());
                                }
                                if (interfaceC3220cl3 != null) {
                                    interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                    try {
                                        InterfaceC7012ub2 interfaceC7012ub2 = d43.c;
                                        C4966kq1 c4966kq1 = d43.a;
                                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1.d, duoAuthType2, c4966kq1.a, c4966kq1.b);
                                        bVar.d = d43;
                                        bVar.e = interfaceC3220cl3;
                                        bVar.g = interfaceC5790olD2;
                                        bVar.h = null;
                                        bVar.i = null;
                                        bVar.l = 7;
                                        objP2 = interfaceC7012ub2.p(commonDuoAuthLoginRequest, bVar);
                                        if (objP2 != mn) {
                                            interfaceC5790ol2 = interfaceC5790olD2;
                                            obj4 = objP2;
                                            CommonResult commonResult3 = (CommonResult) obj4;
                                            interfaceC5790ol2.a(commonResult3 instanceof ResultOk);
                                            interfaceC3220cl4 = interfaceC3220cl3;
                                            commonResult2 = commonResult3;
                                            d44 = d43;
                                            if (interfaceC3220cl4 != null) {
                                                d44.getClass();
                                                if (!(commonResult2 instanceof ResultError)) {
                                                    str = "passed";
                                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                    str = "wrong_code";
                                                } else {
                                                    str = "verify_failed";
                                                }
                                                interfaceC3220cl4.b("duo_auth.outcome", str);
                                            }
                                            if (commonResult2 instanceof ResultOk) {
                                                C6315rG c6315rG = (C6315rG) ((ResultOk) commonResult2).a();
                                                bVar.d = d44;
                                                bVar.e = commonResult2;
                                                bVar.g = null;
                                                bVar.l = 8;
                                                d44.d.f.setValue(c6315rG);
                                                String str2 = c6315rG.a;
                                                C4966kq1 c4966kq2 = d44.a;
                                                c4966kq2.getClass();
                                                Intrinsics.checkNotNullParameter(str2, "<set-?>");
                                                c4966kq2.c = str2;
                                                if (Unit.a != mn) {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            } else {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        interfaceC5790ol2 = interfaceC5790olD2;
                                        interfaceC5790ol2.a(false);
                                        throw th;
                                    }
                                } else {
                                    InterfaceC7012ub2 interfaceC7012ub3 = d43.c;
                                    C4966kq1 c4966kq3 = d43.a;
                                    CommonDuoAuthLoginRequest commonDuoAuthLoginRequest2 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq3.d, duoAuthType2, c4966kq3.a, c4966kq3.b);
                                    bVar.d = d43;
                                    bVar.e = interfaceC3220cl3;
                                    bVar.g = null;
                                    bVar.h = null;
                                    bVar.i = null;
                                    bVar.l = 6;
                                    objP = interfaceC7012ub3.p(commonDuoAuthLoginRequest2, bVar);
                                    if (objP != mn) {
                                        d44 = d43;
                                        obj5 = objP;
                                        CommonResult commonResult4 = (CommonResult) obj5;
                                        interfaceC3220cl4 = interfaceC3220cl3;
                                        commonResult2 = commonResult4;
                                        if (interfaceC3220cl4 != null) {
                                            d44.getClass();
                                            if (!(commonResult2 instanceof ResultError)) {
                                                str = "passed";
                                            } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                str = "wrong_code";
                                            } else {
                                                str = "verify_failed";
                                            }
                                            interfaceC3220cl4.b("duo_auth.outcome", str);
                                        }
                                        if (commonResult2 instanceof ResultOk) {
                                            C6315rG c6315rG2 = (C6315rG) ((ResultOk) commonResult2).a();
                                            bVar.d = d44;
                                            bVar.e = commonResult2;
                                            bVar.g = null;
                                            bVar.l = 8;
                                            d44.d.f.setValue(c6315rG2);
                                            String str3 = c6315rG2.a;
                                            C4966kq1 c4966kq4 = d44.a;
                                            c4966kq4.getClass();
                                            Intrinsics.checkNotNullParameter(str3, "<set-?>");
                                            c4966kq4.c = str3;
                                            if (Unit.a != mn) {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        } else {
                                            interfaceC1767Pk0 = d44.b;
                                            duoAuthType3 = DuoAuthType.NONE;
                                            bVar.d = commonResult2;
                                            bVar.e = null;
                                            bVar.g = null;
                                            bVar.l = 9;
                                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                return commonResult2;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        case 4:
                        case 5:
                        case 6:
                            if (interfaceC3220cl != null) {
                                interfaceC5790olD = interfaceC3220cl.d("duo_auth.send");
                                try {
                                    InterfaceC7012ub2 interfaceC7012ub4 = d45.c;
                                    String token = d45.a.d;
                                    Intrinsics.checkNotNullParameter(token, "token");
                                    Intrinsics.checkNotNullParameter(type, "type");
                                    bVar.d = d45;
                                    bVar.e = interfaceC3220cl;
                                    bVar.g = type;
                                    bVar.h = c3027bp1;
                                    bVar.i = interfaceC5790olD;
                                    bVar.l = 4;
                                    resultErrorR2 = interfaceC7012ub4.r();
                                    if (resultErrorR2 != mn) {
                                        d41 = d45;
                                        c3027bp4 = c3027bp1;
                                        obj3 = resultErrorR2;
                                        interfaceC5790ol = interfaceC5790olD;
                                        commonResult = (CommonResult) obj3;
                                        interfaceC5790ol.a(commonResult instanceof ResultOk);
                                        if (commonResult instanceof ResultError) {
                                            if (interfaceC3220cl != null) {
                                                interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                                            }
                                            return commonResult;
                                        }
                                        if (commonResult instanceof ResultOk) {
                                            throw new C6489s51();
                                        }
                                        C6315rG result = (C6315rG) ((ResultOk) commonResult).a();
                                        d41.getClass();
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        bVar.d = d41;
                                        bVar.e = interfaceC3220cl;
                                        bVar.g = type;
                                        bVar.h = c3027bp4;
                                        bVar.i = c3027bp4;
                                        bVar.l = 5;
                                        objC2 = d41.c(interfaceC3220cl, bVar);
                                        if (objC2 != mn) {
                                            c3027bp3 = c3027bp4;
                                            t2 = objC2;
                                            c3027bp4.d = t2;
                                            duoAuthType2 = type;
                                            interfaceC3220cl3 = interfaceC3220cl;
                                            d43 = d41;
                                            if (((CharSequence) c3027bp3.d).length() == 0) {
                                                if (interfaceC3220cl3 != null) {
                                                    interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                                }
                                                return new ResultError(new CommonError.DuoAuthCanceled());
                                            }
                                            if (interfaceC3220cl3 != null) {
                                                interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                                InterfaceC7012ub2 interfaceC7012ub5 = d43.c;
                                                C4966kq1 c4966kq5 = d43.a;
                                                CommonDuoAuthLoginRequest commonDuoAuthLoginRequest3 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq5.d, duoAuthType2, c4966kq5.a, c4966kq5.b);
                                                bVar.d = d43;
                                                bVar.e = interfaceC3220cl3;
                                                bVar.g = interfaceC5790olD2;
                                                bVar.h = null;
                                                bVar.i = null;
                                                bVar.l = 7;
                                                objP2 = interfaceC7012ub5.p(commonDuoAuthLoginRequest3, bVar);
                                                if (objP2 != mn) {
                                                    interfaceC5790ol2 = interfaceC5790olD2;
                                                    obj4 = objP2;
                                                    CommonResult commonResult5 = (CommonResult) obj4;
                                                    interfaceC5790ol2.a(commonResult5 instanceof ResultOk);
                                                    interfaceC3220cl4 = interfaceC3220cl3;
                                                    commonResult2 = commonResult5;
                                                    d44 = d43;
                                                    if (interfaceC3220cl4 != null) {
                                                        d44.getClass();
                                                        if (!(commonResult2 instanceof ResultError)) {
                                                            str = "passed";
                                                        } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                            str = "wrong_code";
                                                        } else {
                                                            str = "verify_failed";
                                                        }
                                                        interfaceC3220cl4.b("duo_auth.outcome", str);
                                                    }
                                                    if (commonResult2 instanceof ResultOk) {
                                                        C6315rG c6315rG3 = (C6315rG) ((ResultOk) commonResult2).a();
                                                        bVar.d = d44;
                                                        bVar.e = commonResult2;
                                                        bVar.g = null;
                                                        bVar.l = 8;
                                                        d44.d.f.setValue(c6315rG3);
                                                        String str4 = c6315rG3.a;
                                                        C4966kq1 c4966kq6 = d44.a;
                                                        c4966kq6.getClass();
                                                        Intrinsics.checkNotNullParameter(str4, "<set-?>");
                                                        c4966kq6.c = str4;
                                                        if (Unit.a != mn) {
                                                            interfaceC1767Pk0 = d44.b;
                                                            duoAuthType3 = DuoAuthType.NONE;
                                                            bVar.d = commonResult2;
                                                            bVar.e = null;
                                                            bVar.g = null;
                                                            bVar.l = 9;
                                                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                                return commonResult2;
                                                            }
                                                        }
                                                    } else {
                                                        interfaceC1767Pk0 = d44.b;
                                                        duoAuthType3 = DuoAuthType.NONE;
                                                        bVar.d = commonResult2;
                                                        bVar.e = null;
                                                        bVar.g = null;
                                                        bVar.l = 9;
                                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                            return commonResult2;
                                                        }
                                                    }
                                                }
                                            } else {
                                                InterfaceC7012ub2 interfaceC7012ub6 = d43.c;
                                                C4966kq1 c4966kq7 = d43.a;
                                                CommonDuoAuthLoginRequest commonDuoAuthLoginRequest4 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq7.d, duoAuthType2, c4966kq7.a, c4966kq7.b);
                                                bVar.d = d43;
                                                bVar.e = interfaceC3220cl3;
                                                bVar.g = null;
                                                bVar.h = null;
                                                bVar.i = null;
                                                bVar.l = 6;
                                                objP = interfaceC7012ub6.p(commonDuoAuthLoginRequest4, bVar);
                                                if (objP != mn) {
                                                    d44 = d43;
                                                    obj5 = objP;
                                                    CommonResult commonResult6 = (CommonResult) obj5;
                                                    interfaceC3220cl4 = interfaceC3220cl3;
                                                    commonResult2 = commonResult6;
                                                    if (interfaceC3220cl4 != null) {
                                                        d44.getClass();
                                                        if (!(commonResult2 instanceof ResultError)) {
                                                            str = "passed";
                                                        } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                            str = "wrong_code";
                                                        } else {
                                                            str = "verify_failed";
                                                        }
                                                        interfaceC3220cl4.b("duo_auth.outcome", str);
                                                    }
                                                    if (commonResult2 instanceof ResultOk) {
                                                        C6315rG c6315rG4 = (C6315rG) ((ResultOk) commonResult2).a();
                                                        bVar.d = d44;
                                                        bVar.e = commonResult2;
                                                        bVar.g = null;
                                                        bVar.l = 8;
                                                        d44.d.f.setValue(c6315rG4);
                                                        String str5 = c6315rG4.a;
                                                        C4966kq1 c4966kq8 = d44.a;
                                                        c4966kq8.getClass();
                                                        Intrinsics.checkNotNullParameter(str5, "<set-?>");
                                                        c4966kq8.c = str5;
                                                        if (Unit.a != mn) {
                                                            interfaceC1767Pk0 = d44.b;
                                                            duoAuthType3 = DuoAuthType.NONE;
                                                            bVar.d = commonResult2;
                                                            bVar.e = null;
                                                            bVar.g = null;
                                                            bVar.l = 9;
                                                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                                return commonResult2;
                                                            }
                                                        }
                                                    } else {
                                                        interfaceC1767Pk0 = d44.b;
                                                        duoAuthType3 = DuoAuthType.NONE;
                                                        bVar.d = commonResult2;
                                                        bVar.e = null;
                                                        bVar.g = null;
                                                        bVar.l = 9;
                                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                            return commonResult2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC5790ol = interfaceC5790olD;
                                    interfaceC5790ol.a(false);
                                    throw th;
                                }
                            } else {
                                InterfaceC7012ub2 interfaceC7012ub7 = d45.c;
                                String token2 = d45.a.d;
                                Intrinsics.checkNotNullParameter(token2, "token");
                                Intrinsics.checkNotNullParameter(type, "type");
                                bVar.d = d45;
                                bVar.e = interfaceC3220cl;
                                bVar.g = type;
                                bVar.h = c3027bp1;
                                bVar.l = 3;
                                resultErrorR = interfaceC7012ub7.r();
                                if (resultErrorR != mn) {
                                    InterfaceC3220cl interfaceC3220cl6 = interfaceC3220cl;
                                    d42 = d45;
                                    c3027bp4 = c3027bp1;
                                    obj2 = resultErrorR;
                                    duoAuthType = type;
                                    interfaceC3220cl2 = interfaceC3220cl6;
                                    commonResult = (CommonResult) obj2;
                                    d41 = d42;
                                    interfaceC3220cl = interfaceC3220cl2;
                                    type = duoAuthType;
                                    if (commonResult instanceof ResultError) {
                                        if (interfaceC3220cl != null) {
                                            interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                                        }
                                        return commonResult;
                                    }
                                    if (commonResult instanceof ResultOk) {
                                        throw new C6489s51();
                                    }
                                    C6315rG result2 = (C6315rG) ((ResultOk) commonResult).a();
                                    d41.getClass();
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    bVar.d = d41;
                                    bVar.e = interfaceC3220cl;
                                    bVar.g = type;
                                    bVar.h = c3027bp4;
                                    bVar.i = c3027bp4;
                                    bVar.l = 5;
                                    objC2 = d41.c(interfaceC3220cl, bVar);
                                    if (objC2 != mn) {
                                        c3027bp3 = c3027bp4;
                                        t2 = objC2;
                                        c3027bp4.d = t2;
                                        duoAuthType2 = type;
                                        interfaceC3220cl3 = interfaceC3220cl;
                                        d43 = d41;
                                        if (((CharSequence) c3027bp3.d).length() == 0) {
                                            if (interfaceC3220cl3 != null) {
                                                interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                            }
                                            return new ResultError(new CommonError.DuoAuthCanceled());
                                        }
                                        if (interfaceC3220cl3 != null) {
                                            interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                            InterfaceC7012ub2 interfaceC7012ub8 = d43.c;
                                            C4966kq1 c4966kq9 = d43.a;
                                            CommonDuoAuthLoginRequest commonDuoAuthLoginRequest5 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq9.d, duoAuthType2, c4966kq9.a, c4966kq9.b);
                                            bVar.d = d43;
                                            bVar.e = interfaceC3220cl3;
                                            bVar.g = interfaceC5790olD2;
                                            bVar.h = null;
                                            bVar.i = null;
                                            bVar.l = 7;
                                            objP2 = interfaceC7012ub8.p(commonDuoAuthLoginRequest5, bVar);
                                            if (objP2 != mn) {
                                                interfaceC5790ol2 = interfaceC5790olD2;
                                                obj4 = objP2;
                                                CommonResult commonResult7 = (CommonResult) obj4;
                                                interfaceC5790ol2.a(commonResult7 instanceof ResultOk);
                                                interfaceC3220cl4 = interfaceC3220cl3;
                                                commonResult2 = commonResult7;
                                                d44 = d43;
                                                if (interfaceC3220cl4 != null) {
                                                    d44.getClass();
                                                    if (!(commonResult2 instanceof ResultError)) {
                                                        str = "passed";
                                                    } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                        str = "wrong_code";
                                                    } else {
                                                        str = "verify_failed";
                                                    }
                                                    interfaceC3220cl4.b("duo_auth.outcome", str);
                                                }
                                                if (commonResult2 instanceof ResultOk) {
                                                    C6315rG c6315rG5 = (C6315rG) ((ResultOk) commonResult2).a();
                                                    bVar.d = d44;
                                                    bVar.e = commonResult2;
                                                    bVar.g = null;
                                                    bVar.l = 8;
                                                    d44.d.f.setValue(c6315rG5);
                                                    String str6 = c6315rG5.a;
                                                    C4966kq1 c4966kq10 = d44.a;
                                                    c4966kq10.getClass();
                                                    Intrinsics.checkNotNullParameter(str6, "<set-?>");
                                                    c4966kq10.c = str6;
                                                    if (Unit.a != mn) {
                                                        interfaceC1767Pk0 = d44.b;
                                                        duoAuthType3 = DuoAuthType.NONE;
                                                        bVar.d = commonResult2;
                                                        bVar.e = null;
                                                        bVar.g = null;
                                                        bVar.l = 9;
                                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                            return commonResult2;
                                                        }
                                                    }
                                                } else {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            }
                                        } else {
                                            InterfaceC7012ub2 interfaceC7012ub9 = d43.c;
                                            C4966kq1 c4966kq11 = d43.a;
                                            CommonDuoAuthLoginRequest commonDuoAuthLoginRequest6 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq11.d, duoAuthType2, c4966kq11.a, c4966kq11.b);
                                            bVar.d = d43;
                                            bVar.e = interfaceC3220cl3;
                                            bVar.g = null;
                                            bVar.h = null;
                                            bVar.i = null;
                                            bVar.l = 6;
                                            objP = interfaceC7012ub9.p(commonDuoAuthLoginRequest6, bVar);
                                            if (objP != mn) {
                                                d44 = d43;
                                                obj5 = objP;
                                                CommonResult commonResult8 = (CommonResult) obj5;
                                                interfaceC3220cl4 = interfaceC3220cl3;
                                                commonResult2 = commonResult8;
                                                if (interfaceC3220cl4 != null) {
                                                    d44.getClass();
                                                    if (!(commonResult2 instanceof ResultError)) {
                                                        str = "passed";
                                                    } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                        str = "wrong_code";
                                                    } else {
                                                        str = "verify_failed";
                                                    }
                                                    interfaceC3220cl4.b("duo_auth.outcome", str);
                                                }
                                                if (commonResult2 instanceof ResultOk) {
                                                    C6315rG c6315rG6 = (C6315rG) ((ResultOk) commonResult2).a();
                                                    bVar.d = d44;
                                                    bVar.e = commonResult2;
                                                    bVar.g = null;
                                                    bVar.l = 8;
                                                    d44.d.f.setValue(c6315rG6);
                                                    String str7 = c6315rG6.a;
                                                    C4966kq1 c4966kq12 = d44.a;
                                                    c4966kq12.getClass();
                                                    Intrinsics.checkNotNullParameter(str7, "<set-?>");
                                                    c4966kq12.c = str7;
                                                    if (Unit.a != mn) {
                                                        interfaceC1767Pk0 = d44.b;
                                                        duoAuthType3 = DuoAuthType.NONE;
                                                        bVar.d = commonResult2;
                                                        bVar.e = null;
                                                        bVar.g = null;
                                                        bVar.l = 9;
                                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                            return commonResult2;
                                                        }
                                                    }
                                                } else {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        default:
                            throw new C6489s51();
                    }
                }
                return mn;
            case 1:
                InterfaceC3220cl interfaceC3220cl7 = (InterfaceC3220cl) bVar.e;
                D40 d46 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                interfaceC3220cl = interfaceC3220cl7;
                d45 = d46;
                obj = obj6;
                type = (DuoAuthType) obj;
                if (interfaceC3220cl != null) {
                    String lowerCase2 = type.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    interfaceC3220cl.b("duo_auth.type", lowerCase2);
                }
                c3027bp1 = new C3027bp1();
                c3027bp1.d = "";
                switch (a.a[type.ordinal()]) {
                    case 1:
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("duo_auth.outcome", "not_required");
                        }
                        return new ResultOk(Unit.a);
                    case 2:
                    case 3:
                        bVar.d = d45;
                        bVar.e = interfaceC3220cl;
                        bVar.g = type;
                        bVar.h = c3027bp1;
                        bVar.i = c3027bp1;
                        bVar.l = 2;
                        objC = d45.c(interfaceC3220cl, bVar);
                        if (objC != mn) {
                            d41 = d45;
                            c3027bp2 = c3027bp1;
                            t = objC;
                            c3027bp3 = c3027bp2;
                            c3027bp2.d = t;
                            duoAuthType2 = type;
                            interfaceC3220cl3 = interfaceC3220cl;
                            d43 = d41;
                            if (((CharSequence) c3027bp3.d).length() == 0) {
                                if (interfaceC3220cl3 != null) {
                                    interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                }
                                return new ResultError(new CommonError.DuoAuthCanceled());
                            }
                            if (interfaceC3220cl3 != null) {
                                interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                InterfaceC7012ub2 interfaceC7012ub10 = d43.c;
                                C4966kq1 c4966kq13 = d43.a;
                                CommonDuoAuthLoginRequest commonDuoAuthLoginRequest7 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq13.d, duoAuthType2, c4966kq13.a, c4966kq13.b);
                                bVar.d = d43;
                                bVar.e = interfaceC3220cl3;
                                bVar.g = interfaceC5790olD2;
                                bVar.h = null;
                                bVar.i = null;
                                bVar.l = 7;
                                objP2 = interfaceC7012ub10.p(commonDuoAuthLoginRequest7, bVar);
                                if (objP2 != mn) {
                                    interfaceC5790ol2 = interfaceC5790olD2;
                                    obj4 = objP2;
                                    CommonResult commonResult9 = (CommonResult) obj4;
                                    interfaceC5790ol2.a(commonResult9 instanceof ResultOk);
                                    interfaceC3220cl4 = interfaceC3220cl3;
                                    commonResult2 = commonResult9;
                                    d44 = d43;
                                    if (interfaceC3220cl4 != null) {
                                        d44.getClass();
                                        if (!(commonResult2 instanceof ResultError)) {
                                            str = "passed";
                                        } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                            str = "wrong_code";
                                        } else {
                                            str = "verify_failed";
                                        }
                                        interfaceC3220cl4.b("duo_auth.outcome", str);
                                    }
                                    if (commonResult2 instanceof ResultOk) {
                                        C6315rG c6315rG7 = (C6315rG) ((ResultOk) commonResult2).a();
                                        bVar.d = d44;
                                        bVar.e = commonResult2;
                                        bVar.g = null;
                                        bVar.l = 8;
                                        d44.d.f.setValue(c6315rG7);
                                        String str8 = c6315rG7.a;
                                        C4966kq1 c4966kq14 = d44.a;
                                        c4966kq14.getClass();
                                        Intrinsics.checkNotNullParameter(str8, "<set-?>");
                                        c4966kq14.c = str8;
                                        if (Unit.a != mn) {
                                            interfaceC1767Pk0 = d44.b;
                                            duoAuthType3 = DuoAuthType.NONE;
                                            bVar.d = commonResult2;
                                            bVar.e = null;
                                            bVar.g = null;
                                            bVar.l = 9;
                                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                return commonResult2;
                                            }
                                        }
                                    } else {
                                        interfaceC1767Pk0 = d44.b;
                                        duoAuthType3 = DuoAuthType.NONE;
                                        bVar.d = commonResult2;
                                        bVar.e = null;
                                        bVar.g = null;
                                        bVar.l = 9;
                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                            return commonResult2;
                                        }
                                    }
                                }
                            } else {
                                InterfaceC7012ub2 interfaceC7012ub11 = d43.c;
                                C4966kq1 c4966kq15 = d43.a;
                                CommonDuoAuthLoginRequest commonDuoAuthLoginRequest8 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq15.d, duoAuthType2, c4966kq15.a, c4966kq15.b);
                                bVar.d = d43;
                                bVar.e = interfaceC3220cl3;
                                bVar.g = null;
                                bVar.h = null;
                                bVar.i = null;
                                bVar.l = 6;
                                objP = interfaceC7012ub11.p(commonDuoAuthLoginRequest8, bVar);
                                if (objP != mn) {
                                    d44 = d43;
                                    obj5 = objP;
                                    CommonResult commonResult10 = (CommonResult) obj5;
                                    interfaceC3220cl4 = interfaceC3220cl3;
                                    commonResult2 = commonResult10;
                                    if (interfaceC3220cl4 != null) {
                                        d44.getClass();
                                        if (!(commonResult2 instanceof ResultError)) {
                                            str = "passed";
                                        } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                            str = "wrong_code";
                                        } else {
                                            str = "verify_failed";
                                        }
                                        interfaceC3220cl4.b("duo_auth.outcome", str);
                                    }
                                    if (commonResult2 instanceof ResultOk) {
                                        C6315rG c6315rG8 = (C6315rG) ((ResultOk) commonResult2).a();
                                        bVar.d = d44;
                                        bVar.e = commonResult2;
                                        bVar.g = null;
                                        bVar.l = 8;
                                        d44.d.f.setValue(c6315rG8);
                                        String str9 = c6315rG8.a;
                                        C4966kq1 c4966kq16 = d44.a;
                                        c4966kq16.getClass();
                                        Intrinsics.checkNotNullParameter(str9, "<set-?>");
                                        c4966kq16.c = str9;
                                        if (Unit.a != mn) {
                                            interfaceC1767Pk0 = d44.b;
                                            duoAuthType3 = DuoAuthType.NONE;
                                            bVar.d = commonResult2;
                                            bVar.e = null;
                                            bVar.g = null;
                                            bVar.l = 9;
                                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                return commonResult2;
                                            }
                                        }
                                    } else {
                                        interfaceC1767Pk0 = d44.b;
                                        duoAuthType3 = DuoAuthType.NONE;
                                        bVar.d = commonResult2;
                                        bVar.e = null;
                                        bVar.g = null;
                                        bVar.l = 9;
                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                            return commonResult2;
                                        }
                                    }
                                }
                            }
                        }
                        return mn;
                    case 4:
                    case 5:
                    case 6:
                        if (interfaceC3220cl != null) {
                            interfaceC5790olD = interfaceC3220cl.d("duo_auth.send");
                            InterfaceC7012ub2 interfaceC7012ub12 = d45.c;
                            String token3 = d45.a.d;
                            Intrinsics.checkNotNullParameter(token3, "token");
                            Intrinsics.checkNotNullParameter(type, "type");
                            bVar.d = d45;
                            bVar.e = interfaceC3220cl;
                            bVar.g = type;
                            bVar.h = c3027bp1;
                            bVar.i = interfaceC5790olD;
                            bVar.l = 4;
                            resultErrorR2 = interfaceC7012ub12.r();
                            if (resultErrorR2 != mn) {
                                d41 = d45;
                                c3027bp4 = c3027bp1;
                                obj3 = resultErrorR2;
                                interfaceC5790ol = interfaceC5790olD;
                                commonResult = (CommonResult) obj3;
                                interfaceC5790ol.a(commonResult instanceof ResultOk);
                                if (commonResult instanceof ResultError) {
                                    if (interfaceC3220cl != null) {
                                        interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                                    }
                                    return commonResult;
                                }
                                if (commonResult instanceof ResultOk) {
                                    throw new C6489s51();
                                }
                                C6315rG result3 = (C6315rG) ((ResultOk) commonResult).a();
                                d41.getClass();
                                Intrinsics.checkNotNullParameter(result3, "result");
                                bVar.d = d41;
                                bVar.e = interfaceC3220cl;
                                bVar.g = type;
                                bVar.h = c3027bp4;
                                bVar.i = c3027bp4;
                                bVar.l = 5;
                                objC2 = d41.c(interfaceC3220cl, bVar);
                                if (objC2 != mn) {
                                    c3027bp3 = c3027bp4;
                                    t2 = objC2;
                                    c3027bp4.d = t2;
                                    duoAuthType2 = type;
                                    interfaceC3220cl3 = interfaceC3220cl;
                                    d43 = d41;
                                    if (((CharSequence) c3027bp3.d).length() == 0) {
                                        if (interfaceC3220cl3 != null) {
                                            interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                        }
                                        return new ResultError(new CommonError.DuoAuthCanceled());
                                    }
                                    if (interfaceC3220cl3 != null) {
                                        interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                        InterfaceC7012ub2 interfaceC7012ub13 = d43.c;
                                        C4966kq1 c4966kq17 = d43.a;
                                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest9 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq17.d, duoAuthType2, c4966kq17.a, c4966kq17.b);
                                        bVar.d = d43;
                                        bVar.e = interfaceC3220cl3;
                                        bVar.g = interfaceC5790olD2;
                                        bVar.h = null;
                                        bVar.i = null;
                                        bVar.l = 7;
                                        objP2 = interfaceC7012ub13.p(commonDuoAuthLoginRequest9, bVar);
                                        if (objP2 != mn) {
                                            interfaceC5790ol2 = interfaceC5790olD2;
                                            obj4 = objP2;
                                            CommonResult commonResult11 = (CommonResult) obj4;
                                            interfaceC5790ol2.a(commonResult11 instanceof ResultOk);
                                            interfaceC3220cl4 = interfaceC3220cl3;
                                            commonResult2 = commonResult11;
                                            d44 = d43;
                                            if (interfaceC3220cl4 != null) {
                                                d44.getClass();
                                                if (!(commonResult2 instanceof ResultError)) {
                                                    str = "passed";
                                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                    str = "wrong_code";
                                                } else {
                                                    str = "verify_failed";
                                                }
                                                interfaceC3220cl4.b("duo_auth.outcome", str);
                                            }
                                            if (commonResult2 instanceof ResultOk) {
                                                C6315rG c6315rG9 = (C6315rG) ((ResultOk) commonResult2).a();
                                                bVar.d = d44;
                                                bVar.e = commonResult2;
                                                bVar.g = null;
                                                bVar.l = 8;
                                                d44.d.f.setValue(c6315rG9);
                                                String str10 = c6315rG9.a;
                                                C4966kq1 c4966kq18 = d44.a;
                                                c4966kq18.getClass();
                                                Intrinsics.checkNotNullParameter(str10, "<set-?>");
                                                c4966kq18.c = str10;
                                                if (Unit.a != mn) {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            } else {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        }
                                    } else {
                                        InterfaceC7012ub2 interfaceC7012ub14 = d43.c;
                                        C4966kq1 c4966kq19 = d43.a;
                                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest10 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq19.d, duoAuthType2, c4966kq19.a, c4966kq19.b);
                                        bVar.d = d43;
                                        bVar.e = interfaceC3220cl3;
                                        bVar.g = null;
                                        bVar.h = null;
                                        bVar.i = null;
                                        bVar.l = 6;
                                        objP = interfaceC7012ub14.p(commonDuoAuthLoginRequest10, bVar);
                                        if (objP != mn) {
                                            d44 = d43;
                                            obj5 = objP;
                                            CommonResult commonResult12 = (CommonResult) obj5;
                                            interfaceC3220cl4 = interfaceC3220cl3;
                                            commonResult2 = commonResult12;
                                            if (interfaceC3220cl4 != null) {
                                                d44.getClass();
                                                if (!(commonResult2 instanceof ResultError)) {
                                                    str = "passed";
                                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                    str = "wrong_code";
                                                } else {
                                                    str = "verify_failed";
                                                }
                                                interfaceC3220cl4.b("duo_auth.outcome", str);
                                            }
                                            if (commonResult2 instanceof ResultOk) {
                                                C6315rG c6315rG10 = (C6315rG) ((ResultOk) commonResult2).a();
                                                bVar.d = d44;
                                                bVar.e = commonResult2;
                                                bVar.g = null;
                                                bVar.l = 8;
                                                d44.d.f.setValue(c6315rG10);
                                                String str11 = c6315rG10.a;
                                                C4966kq1 c4966kq110 = d44.a;
                                                c4966kq110.getClass();
                                                Intrinsics.checkNotNullParameter(str11, "<set-?>");
                                                c4966kq110.c = str11;
                                                if (Unit.a != mn) {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            } else {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            InterfaceC7012ub2 interfaceC7012ub15 = d45.c;
                            String token4 = d45.a.d;
                            Intrinsics.checkNotNullParameter(token4, "token");
                            Intrinsics.checkNotNullParameter(type, "type");
                            bVar.d = d45;
                            bVar.e = interfaceC3220cl;
                            bVar.g = type;
                            bVar.h = c3027bp1;
                            bVar.l = 3;
                            resultErrorR = interfaceC7012ub15.r();
                            if (resultErrorR != mn) {
                                InterfaceC3220cl interfaceC3220cl8 = interfaceC3220cl;
                                d42 = d45;
                                c3027bp4 = c3027bp1;
                                obj2 = resultErrorR;
                                duoAuthType = type;
                                interfaceC3220cl2 = interfaceC3220cl8;
                                commonResult = (CommonResult) obj2;
                                d41 = d42;
                                interfaceC3220cl = interfaceC3220cl2;
                                type = duoAuthType;
                                if (commonResult instanceof ResultError) {
                                    if (interfaceC3220cl != null) {
                                        interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                                    }
                                    return commonResult;
                                }
                                if (commonResult instanceof ResultOk) {
                                    throw new C6489s51();
                                }
                                C6315rG result4 = (C6315rG) ((ResultOk) commonResult).a();
                                d41.getClass();
                                Intrinsics.checkNotNullParameter(result4, "result");
                                bVar.d = d41;
                                bVar.e = interfaceC3220cl;
                                bVar.g = type;
                                bVar.h = c3027bp4;
                                bVar.i = c3027bp4;
                                bVar.l = 5;
                                objC2 = d41.c(interfaceC3220cl, bVar);
                                if (objC2 != mn) {
                                    c3027bp3 = c3027bp4;
                                    t2 = objC2;
                                    c3027bp4.d = t2;
                                    duoAuthType2 = type;
                                    interfaceC3220cl3 = interfaceC3220cl;
                                    d43 = d41;
                                    if (((CharSequence) c3027bp3.d).length() == 0) {
                                        if (interfaceC3220cl3 != null) {
                                            interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                                        }
                                        return new ResultError(new CommonError.DuoAuthCanceled());
                                    }
                                    if (interfaceC3220cl3 != null) {
                                        interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                                        InterfaceC7012ub2 interfaceC7012ub16 = d43.c;
                                        C4966kq1 c4966kq111 = d43.a;
                                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest11 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq111.d, duoAuthType2, c4966kq111.a, c4966kq111.b);
                                        bVar.d = d43;
                                        bVar.e = interfaceC3220cl3;
                                        bVar.g = interfaceC5790olD2;
                                        bVar.h = null;
                                        bVar.i = null;
                                        bVar.l = 7;
                                        objP2 = interfaceC7012ub16.p(commonDuoAuthLoginRequest11, bVar);
                                        if (objP2 != mn) {
                                            interfaceC5790ol2 = interfaceC5790olD2;
                                            obj4 = objP2;
                                            CommonResult commonResult13 = (CommonResult) obj4;
                                            interfaceC5790ol2.a(commonResult13 instanceof ResultOk);
                                            interfaceC3220cl4 = interfaceC3220cl3;
                                            commonResult2 = commonResult13;
                                            d44 = d43;
                                            if (interfaceC3220cl4 != null) {
                                                d44.getClass();
                                                if (!(commonResult2 instanceof ResultError)) {
                                                    str = "passed";
                                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                    str = "wrong_code";
                                                } else {
                                                    str = "verify_failed";
                                                }
                                                interfaceC3220cl4.b("duo_auth.outcome", str);
                                            }
                                            if (commonResult2 instanceof ResultOk) {
                                                C6315rG c6315rG11 = (C6315rG) ((ResultOk) commonResult2).a();
                                                bVar.d = d44;
                                                bVar.e = commonResult2;
                                                bVar.g = null;
                                                bVar.l = 8;
                                                d44.d.f.setValue(c6315rG11);
                                                String str12 = c6315rG11.a;
                                                C4966kq1 c4966kq112 = d44.a;
                                                c4966kq112.getClass();
                                                Intrinsics.checkNotNullParameter(str12, "<set-?>");
                                                c4966kq112.c = str12;
                                                if (Unit.a != mn) {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            } else {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        }
                                    } else {
                                        InterfaceC7012ub2 interfaceC7012ub17 = d43.c;
                                        C4966kq1 c4966kq113 = d43.a;
                                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest12 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq113.d, duoAuthType2, c4966kq113.a, c4966kq113.b);
                                        bVar.d = d43;
                                        bVar.e = interfaceC3220cl3;
                                        bVar.g = null;
                                        bVar.h = null;
                                        bVar.i = null;
                                        bVar.l = 6;
                                        objP = interfaceC7012ub17.p(commonDuoAuthLoginRequest12, bVar);
                                        if (objP != mn) {
                                            d44 = d43;
                                            obj5 = objP;
                                            CommonResult commonResult14 = (CommonResult) obj5;
                                            interfaceC3220cl4 = interfaceC3220cl3;
                                            commonResult2 = commonResult14;
                                            if (interfaceC3220cl4 != null) {
                                                d44.getClass();
                                                if (!(commonResult2 instanceof ResultError)) {
                                                    str = "passed";
                                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                                    str = "wrong_code";
                                                } else {
                                                    str = "verify_failed";
                                                }
                                                interfaceC3220cl4.b("duo_auth.outcome", str);
                                            }
                                            if (commonResult2 instanceof ResultOk) {
                                                C6315rG c6315rG12 = (C6315rG) ((ResultOk) commonResult2).a();
                                                bVar.d = d44;
                                                bVar.e = commonResult2;
                                                bVar.g = null;
                                                bVar.l = 8;
                                                d44.d.f.setValue(c6315rG12);
                                                String str13 = c6315rG12.a;
                                                C4966kq1 c4966kq114 = d44.a;
                                                c4966kq114.getClass();
                                                Intrinsics.checkNotNullParameter(str13, "<set-?>");
                                                c4966kq114.c = str13;
                                                if (Unit.a != mn) {
                                                    interfaceC1767Pk0 = d44.b;
                                                    duoAuthType3 = DuoAuthType.NONE;
                                                    bVar.d = commonResult2;
                                                    bVar.e = null;
                                                    bVar.g = null;
                                                    bVar.l = 9;
                                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                        return commonResult2;
                                                    }
                                                }
                                            } else {
                                                interfaceC1767Pk0 = d44.b;
                                                duoAuthType3 = DuoAuthType.NONE;
                                                bVar.d = commonResult2;
                                                bVar.e = null;
                                                bVar.g = null;
                                                bVar.l = 9;
                                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                                    return commonResult2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return mn;
                    default:
                        throw new C6489s51();
                }
            case 2:
                c3027bp2 = (C3027bp1) bVar.i;
                c3027bp3 = bVar.h;
                type = (DuoAuthType) bVar.g;
                interfaceC3220cl = (InterfaceC3220cl) bVar.e;
                d41 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                t = obj6;
                c3027bp2.d = t;
                duoAuthType2 = type;
                interfaceC3220cl3 = interfaceC3220cl;
                d43 = d41;
                if (((CharSequence) c3027bp3.d).length() == 0) {
                    if (interfaceC3220cl3 != null) {
                        interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                    }
                    return new ResultError(new CommonError.DuoAuthCanceled());
                }
                if (interfaceC3220cl3 != null) {
                    interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                    InterfaceC7012ub2 interfaceC7012ub18 = d43.c;
                    C4966kq1 c4966kq115 = d43.a;
                    CommonDuoAuthLoginRequest commonDuoAuthLoginRequest13 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq115.d, duoAuthType2, c4966kq115.a, c4966kq115.b);
                    bVar.d = d43;
                    bVar.e = interfaceC3220cl3;
                    bVar.g = interfaceC5790olD2;
                    bVar.h = null;
                    bVar.i = null;
                    bVar.l = 7;
                    objP2 = interfaceC7012ub18.p(commonDuoAuthLoginRequest13, bVar);
                    if (objP2 != mn) {
                        interfaceC5790ol2 = interfaceC5790olD2;
                        obj4 = objP2;
                        CommonResult commonResult15 = (CommonResult) obj4;
                        interfaceC5790ol2.a(commonResult15 instanceof ResultOk);
                        interfaceC3220cl4 = interfaceC3220cl3;
                        commonResult2 = commonResult15;
                        d44 = d43;
                        if (interfaceC3220cl4 != null) {
                            d44.getClass();
                            if (!(commonResult2 instanceof ResultError)) {
                                str = "passed";
                            } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                str = "wrong_code";
                            } else {
                                str = "verify_failed";
                            }
                            interfaceC3220cl4.b("duo_auth.outcome", str);
                        }
                        if (commonResult2 instanceof ResultOk) {
                            C6315rG c6315rG13 = (C6315rG) ((ResultOk) commonResult2).a();
                            bVar.d = d44;
                            bVar.e = commonResult2;
                            bVar.g = null;
                            bVar.l = 8;
                            d44.d.f.setValue(c6315rG13);
                            String str14 = c6315rG13.a;
                            C4966kq1 c4966kq116 = d44.a;
                            c4966kq116.getClass();
                            Intrinsics.checkNotNullParameter(str14, "<set-?>");
                            c4966kq116.c = str14;
                            if (Unit.a != mn) {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        } else {
                            interfaceC1767Pk0 = d44.b;
                            duoAuthType3 = DuoAuthType.NONE;
                            bVar.d = commonResult2;
                            bVar.e = null;
                            bVar.g = null;
                            bVar.l = 9;
                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                return commonResult2;
                            }
                        }
                    }
                } else {
                    InterfaceC7012ub2 interfaceC7012ub19 = d43.c;
                    C4966kq1 c4966kq117 = d43.a;
                    CommonDuoAuthLoginRequest commonDuoAuthLoginRequest14 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq117.d, duoAuthType2, c4966kq117.a, c4966kq117.b);
                    bVar.d = d43;
                    bVar.e = interfaceC3220cl3;
                    bVar.g = null;
                    bVar.h = null;
                    bVar.i = null;
                    bVar.l = 6;
                    objP = interfaceC7012ub19.p(commonDuoAuthLoginRequest14, bVar);
                    if (objP != mn) {
                        d44 = d43;
                        obj5 = objP;
                        CommonResult commonResult16 = (CommonResult) obj5;
                        interfaceC3220cl4 = interfaceC3220cl3;
                        commonResult2 = commonResult16;
                        if (interfaceC3220cl4 != null) {
                            d44.getClass();
                            if (!(commonResult2 instanceof ResultError)) {
                                str = "passed";
                            } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                str = "wrong_code";
                            } else {
                                str = "verify_failed";
                            }
                            interfaceC3220cl4.b("duo_auth.outcome", str);
                        }
                        if (commonResult2 instanceof ResultOk) {
                            C6315rG c6315rG14 = (C6315rG) ((ResultOk) commonResult2).a();
                            bVar.d = d44;
                            bVar.e = commonResult2;
                            bVar.g = null;
                            bVar.l = 8;
                            d44.d.f.setValue(c6315rG14);
                            String str15 = c6315rG14.a;
                            C4966kq1 c4966kq118 = d44.a;
                            c4966kq118.getClass();
                            Intrinsics.checkNotNullParameter(str15, "<set-?>");
                            c4966kq118.c = str15;
                            if (Unit.a != mn) {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        } else {
                            interfaceC1767Pk0 = d44.b;
                            duoAuthType3 = DuoAuthType.NONE;
                            bVar.d = commonResult2;
                            bVar.e = null;
                            bVar.g = null;
                            bVar.l = 9;
                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                return commonResult2;
                            }
                        }
                    }
                }
                return mn;
            case 3:
                c3027bp4 = bVar.h;
                duoAuthType = (DuoAuthType) bVar.g;
                interfaceC3220cl2 = (InterfaceC3220cl) bVar.e;
                d42 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                obj2 = obj6;
                commonResult = (CommonResult) obj2;
                d41 = d42;
                interfaceC3220cl = interfaceC3220cl2;
                type = duoAuthType;
                if (commonResult instanceof ResultError) {
                    if (interfaceC3220cl != null) {
                        interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                    }
                    return commonResult;
                }
                if (commonResult instanceof ResultOk) {
                    throw new C6489s51();
                }
                C6315rG result5 = (C6315rG) ((ResultOk) commonResult).a();
                d41.getClass();
                Intrinsics.checkNotNullParameter(result5, "result");
                bVar.d = d41;
                bVar.e = interfaceC3220cl;
                bVar.g = type;
                bVar.h = c3027bp4;
                bVar.i = c3027bp4;
                bVar.l = 5;
                objC2 = d41.c(interfaceC3220cl, bVar);
                if (objC2 != mn) {
                    c3027bp3 = c3027bp4;
                    t2 = objC2;
                    c3027bp4.d = t2;
                    duoAuthType2 = type;
                    interfaceC3220cl3 = interfaceC3220cl;
                    d43 = d41;
                    if (((CharSequence) c3027bp3.d).length() == 0) {
                        if (interfaceC3220cl3 != null) {
                            interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                        }
                        return new ResultError(new CommonError.DuoAuthCanceled());
                    }
                    if (interfaceC3220cl3 != null) {
                        interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                        InterfaceC7012ub2 interfaceC7012ub110 = d43.c;
                        C4966kq1 c4966kq119 = d43.a;
                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest15 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq119.d, duoAuthType2, c4966kq119.a, c4966kq119.b);
                        bVar.d = d43;
                        bVar.e = interfaceC3220cl3;
                        bVar.g = interfaceC5790olD2;
                        bVar.h = null;
                        bVar.i = null;
                        bVar.l = 7;
                        objP2 = interfaceC7012ub110.p(commonDuoAuthLoginRequest15, bVar);
                        if (objP2 != mn) {
                            interfaceC5790ol2 = interfaceC5790olD2;
                            obj4 = objP2;
                            CommonResult commonResult17 = (CommonResult) obj4;
                            interfaceC5790ol2.a(commonResult17 instanceof ResultOk);
                            interfaceC3220cl4 = interfaceC3220cl3;
                            commonResult2 = commonResult17;
                            d44 = d43;
                            if (interfaceC3220cl4 != null) {
                                d44.getClass();
                                if (!(commonResult2 instanceof ResultError)) {
                                    str = "passed";
                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                    str = "wrong_code";
                                } else {
                                    str = "verify_failed";
                                }
                                interfaceC3220cl4.b("duo_auth.outcome", str);
                            }
                            if (commonResult2 instanceof ResultOk) {
                                C6315rG c6315rG15 = (C6315rG) ((ResultOk) commonResult2).a();
                                bVar.d = d44;
                                bVar.e = commonResult2;
                                bVar.g = null;
                                bVar.l = 8;
                                d44.d.f.setValue(c6315rG15);
                                String str16 = c6315rG15.a;
                                C4966kq1 c4966kq1110 = d44.a;
                                c4966kq1110.getClass();
                                Intrinsics.checkNotNullParameter(str16, "<set-?>");
                                c4966kq1110.c = str16;
                                if (Unit.a != mn) {
                                    interfaceC1767Pk0 = d44.b;
                                    duoAuthType3 = DuoAuthType.NONE;
                                    bVar.d = commonResult2;
                                    bVar.e = null;
                                    bVar.g = null;
                                    bVar.l = 9;
                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                        return commonResult2;
                                    }
                                }
                            } else {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        }
                    } else {
                        InterfaceC7012ub2 interfaceC7012ub111 = d43.c;
                        C4966kq1 c4966kq1111 = d43.a;
                        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest16 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1111.d, duoAuthType2, c4966kq1111.a, c4966kq1111.b);
                        bVar.d = d43;
                        bVar.e = interfaceC3220cl3;
                        bVar.g = null;
                        bVar.h = null;
                        bVar.i = null;
                        bVar.l = 6;
                        objP = interfaceC7012ub111.p(commonDuoAuthLoginRequest16, bVar);
                        if (objP != mn) {
                            d44 = d43;
                            obj5 = objP;
                            CommonResult commonResult18 = (CommonResult) obj5;
                            interfaceC3220cl4 = interfaceC3220cl3;
                            commonResult2 = commonResult18;
                            if (interfaceC3220cl4 != null) {
                                d44.getClass();
                                if (!(commonResult2 instanceof ResultError)) {
                                    str = "passed";
                                } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                    str = "wrong_code";
                                } else {
                                    str = "verify_failed";
                                }
                                interfaceC3220cl4.b("duo_auth.outcome", str);
                            }
                            if (commonResult2 instanceof ResultOk) {
                                C6315rG c6315rG16 = (C6315rG) ((ResultOk) commonResult2).a();
                                bVar.d = d44;
                                bVar.e = commonResult2;
                                bVar.g = null;
                                bVar.l = 8;
                                d44.d.f.setValue(c6315rG16);
                                String str17 = c6315rG16.a;
                                C4966kq1 c4966kq1112 = d44.a;
                                c4966kq1112.getClass();
                                Intrinsics.checkNotNullParameter(str17, "<set-?>");
                                c4966kq1112.c = str17;
                                if (Unit.a != mn) {
                                    interfaceC1767Pk0 = d44.b;
                                    duoAuthType3 = DuoAuthType.NONE;
                                    bVar.d = commonResult2;
                                    bVar.e = null;
                                    bVar.g = null;
                                    bVar.l = 9;
                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                        return commonResult2;
                                    }
                                }
                            } else {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        }
                    }
                }
                return mn;
            case 4:
                interfaceC5790ol = (InterfaceC5790ol) bVar.i;
                c3027bp4 = bVar.h;
                type = (DuoAuthType) bVar.g;
                interfaceC3220cl = (InterfaceC3220cl) bVar.e;
                d41 = (D40) bVar.d;
                try {
                    C1795Pt1.b(obj6);
                    obj3 = obj6;
                    commonResult = (CommonResult) obj3;
                    interfaceC5790ol.a(commonResult instanceof ResultOk);
                    if (commonResult instanceof ResultError) {
                        if (interfaceC3220cl != null) {
                            interfaceC3220cl.b("duo_auth.outcome", "send_failed");
                        }
                        return commonResult;
                    }
                    if (commonResult instanceof ResultOk) {
                        throw new C6489s51();
                    }
                    C6315rG result6 = (C6315rG) ((ResultOk) commonResult).a();
                    d41.getClass();
                    Intrinsics.checkNotNullParameter(result6, "result");
                    bVar.d = d41;
                    bVar.e = interfaceC3220cl;
                    bVar.g = type;
                    bVar.h = c3027bp4;
                    bVar.i = c3027bp4;
                    bVar.l = 5;
                    objC2 = d41.c(interfaceC3220cl, bVar);
                    if (objC2 != mn) {
                        c3027bp3 = c3027bp4;
                        t2 = objC2;
                        c3027bp4.d = t2;
                        duoAuthType2 = type;
                        interfaceC3220cl3 = interfaceC3220cl;
                        d43 = d41;
                        if (((CharSequence) c3027bp3.d).length() == 0) {
                            if (interfaceC3220cl3 != null) {
                                interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                            }
                            return new ResultError(new CommonError.DuoAuthCanceled());
                        }
                        if (interfaceC3220cl3 != null) {
                            interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                            InterfaceC7012ub2 interfaceC7012ub112 = d43.c;
                            C4966kq1 c4966kq1113 = d43.a;
                            CommonDuoAuthLoginRequest commonDuoAuthLoginRequest17 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1113.d, duoAuthType2, c4966kq1113.a, c4966kq1113.b);
                            bVar.d = d43;
                            bVar.e = interfaceC3220cl3;
                            bVar.g = interfaceC5790olD2;
                            bVar.h = null;
                            bVar.i = null;
                            bVar.l = 7;
                            objP2 = interfaceC7012ub112.p(commonDuoAuthLoginRequest17, bVar);
                            if (objP2 != mn) {
                                interfaceC5790ol2 = interfaceC5790olD2;
                                obj4 = objP2;
                                CommonResult commonResult19 = (CommonResult) obj4;
                                interfaceC5790ol2.a(commonResult19 instanceof ResultOk);
                                interfaceC3220cl4 = interfaceC3220cl3;
                                commonResult2 = commonResult19;
                                d44 = d43;
                                if (interfaceC3220cl4 != null) {
                                    d44.getClass();
                                    if (!(commonResult2 instanceof ResultError)) {
                                        str = "passed";
                                    } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                        str = "wrong_code";
                                    } else {
                                        str = "verify_failed";
                                    }
                                    interfaceC3220cl4.b("duo_auth.outcome", str);
                                }
                                if (commonResult2 instanceof ResultOk) {
                                    C6315rG c6315rG17 = (C6315rG) ((ResultOk) commonResult2).a();
                                    bVar.d = d44;
                                    bVar.e = commonResult2;
                                    bVar.g = null;
                                    bVar.l = 8;
                                    d44.d.f.setValue(c6315rG17);
                                    String str18 = c6315rG17.a;
                                    C4966kq1 c4966kq1114 = d44.a;
                                    c4966kq1114.getClass();
                                    Intrinsics.checkNotNullParameter(str18, "<set-?>");
                                    c4966kq1114.c = str18;
                                    if (Unit.a != mn) {
                                        interfaceC1767Pk0 = d44.b;
                                        duoAuthType3 = DuoAuthType.NONE;
                                        bVar.d = commonResult2;
                                        bVar.e = null;
                                        bVar.g = null;
                                        bVar.l = 9;
                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                            return commonResult2;
                                        }
                                    }
                                } else {
                                    interfaceC1767Pk0 = d44.b;
                                    duoAuthType3 = DuoAuthType.NONE;
                                    bVar.d = commonResult2;
                                    bVar.e = null;
                                    bVar.g = null;
                                    bVar.l = 9;
                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                        return commonResult2;
                                    }
                                }
                            }
                        } else {
                            InterfaceC7012ub2 interfaceC7012ub113 = d43.c;
                            C4966kq1 c4966kq1115 = d43.a;
                            CommonDuoAuthLoginRequest commonDuoAuthLoginRequest18 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1115.d, duoAuthType2, c4966kq1115.a, c4966kq1115.b);
                            bVar.d = d43;
                            bVar.e = interfaceC3220cl3;
                            bVar.g = null;
                            bVar.h = null;
                            bVar.i = null;
                            bVar.l = 6;
                            objP = interfaceC7012ub113.p(commonDuoAuthLoginRequest18, bVar);
                            if (objP != mn) {
                                d44 = d43;
                                obj5 = objP;
                                CommonResult commonResult110 = (CommonResult) obj5;
                                interfaceC3220cl4 = interfaceC3220cl3;
                                commonResult2 = commonResult110;
                                if (interfaceC3220cl4 != null) {
                                    d44.getClass();
                                    if (!(commonResult2 instanceof ResultError)) {
                                        str = "passed";
                                    } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                        str = "wrong_code";
                                    } else {
                                        str = "verify_failed";
                                    }
                                    interfaceC3220cl4.b("duo_auth.outcome", str);
                                }
                                if (commonResult2 instanceof ResultOk) {
                                    C6315rG c6315rG18 = (C6315rG) ((ResultOk) commonResult2).a();
                                    bVar.d = d44;
                                    bVar.e = commonResult2;
                                    bVar.g = null;
                                    bVar.l = 8;
                                    d44.d.f.setValue(c6315rG18);
                                    String str19 = c6315rG18.a;
                                    C4966kq1 c4966kq1116 = d44.a;
                                    c4966kq1116.getClass();
                                    Intrinsics.checkNotNullParameter(str19, "<set-?>");
                                    c4966kq1116.c = str19;
                                    if (Unit.a != mn) {
                                        interfaceC1767Pk0 = d44.b;
                                        duoAuthType3 = DuoAuthType.NONE;
                                        bVar.d = commonResult2;
                                        bVar.e = null;
                                        bVar.g = null;
                                        bVar.l = 9;
                                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                            return commonResult2;
                                        }
                                    }
                                } else {
                                    interfaceC1767Pk0 = d44.b;
                                    duoAuthType3 = DuoAuthType.NONE;
                                    bVar.d = commonResult2;
                                    bVar.e = null;
                                    bVar.g = null;
                                    bVar.l = 9;
                                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                        return commonResult2;
                                    }
                                }
                            }
                        }
                    }
                    return mn;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC5790ol.a(false);
                    throw th;
                }
            case 5:
                c3027bp4 = (C3027bp1) bVar.i;
                c3027bp3 = bVar.h;
                type = (DuoAuthType) bVar.g;
                interfaceC3220cl = (InterfaceC3220cl) bVar.e;
                d41 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                t2 = obj6;
                c3027bp4.d = t2;
                duoAuthType2 = type;
                interfaceC3220cl3 = interfaceC3220cl;
                d43 = d41;
                if (((CharSequence) c3027bp3.d).length() == 0) {
                    if (interfaceC3220cl3 != null) {
                        interfaceC3220cl3.b("duo_auth.outcome", "canceled");
                    }
                    return new ResultError(new CommonError.DuoAuthCanceled());
                }
                if (interfaceC3220cl3 != null) {
                    interfaceC5790olD2 = interfaceC3220cl3.d("duo_auth.verify");
                    InterfaceC7012ub2 interfaceC7012ub114 = d43.c;
                    C4966kq1 c4966kq1117 = d43.a;
                    CommonDuoAuthLoginRequest commonDuoAuthLoginRequest19 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1117.d, duoAuthType2, c4966kq1117.a, c4966kq1117.b);
                    bVar.d = d43;
                    bVar.e = interfaceC3220cl3;
                    bVar.g = interfaceC5790olD2;
                    bVar.h = null;
                    bVar.i = null;
                    bVar.l = 7;
                    objP2 = interfaceC7012ub114.p(commonDuoAuthLoginRequest19, bVar);
                    if (objP2 != mn) {
                        interfaceC5790ol2 = interfaceC5790olD2;
                        obj4 = objP2;
                        CommonResult commonResult111 = (CommonResult) obj4;
                        interfaceC5790ol2.a(commonResult111 instanceof ResultOk);
                        interfaceC3220cl4 = interfaceC3220cl3;
                        commonResult2 = commonResult111;
                        d44 = d43;
                        if (interfaceC3220cl4 != null) {
                            d44.getClass();
                            if (!(commonResult2 instanceof ResultError)) {
                                str = "passed";
                            } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                str = "wrong_code";
                            } else {
                                str = "verify_failed";
                            }
                            interfaceC3220cl4.b("duo_auth.outcome", str);
                        }
                        if (commonResult2 instanceof ResultOk) {
                            C6315rG c6315rG19 = (C6315rG) ((ResultOk) commonResult2).a();
                            bVar.d = d44;
                            bVar.e = commonResult2;
                            bVar.g = null;
                            bVar.l = 8;
                            d44.d.f.setValue(c6315rG19);
                            String str110 = c6315rG19.a;
                            C4966kq1 c4966kq1118 = d44.a;
                            c4966kq1118.getClass();
                            Intrinsics.checkNotNullParameter(str110, "<set-?>");
                            c4966kq1118.c = str110;
                            if (Unit.a != mn) {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        } else {
                            interfaceC1767Pk0 = d44.b;
                            duoAuthType3 = DuoAuthType.NONE;
                            bVar.d = commonResult2;
                            bVar.e = null;
                            bVar.g = null;
                            bVar.l = 9;
                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                return commonResult2;
                            }
                        }
                    }
                } else {
                    InterfaceC7012ub2 interfaceC7012ub115 = d43.c;
                    C4966kq1 c4966kq1119 = d43.a;
                    CommonDuoAuthLoginRequest commonDuoAuthLoginRequest110 = new CommonDuoAuthLoginRequest((String) c3027bp3.d, c4966kq1119.d, duoAuthType2, c4966kq1119.a, c4966kq1119.b);
                    bVar.d = d43;
                    bVar.e = interfaceC3220cl3;
                    bVar.g = null;
                    bVar.h = null;
                    bVar.i = null;
                    bVar.l = 6;
                    objP = interfaceC7012ub115.p(commonDuoAuthLoginRequest110, bVar);
                    if (objP != mn) {
                        d44 = d43;
                        obj5 = objP;
                        CommonResult commonResult112 = (CommonResult) obj5;
                        interfaceC3220cl4 = interfaceC3220cl3;
                        commonResult2 = commonResult112;
                        if (interfaceC3220cl4 != null) {
                            d44.getClass();
                            if (!(commonResult2 instanceof ResultError)) {
                                str = "passed";
                            } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                                str = "wrong_code";
                            } else {
                                str = "verify_failed";
                            }
                            interfaceC3220cl4.b("duo_auth.outcome", str);
                        }
                        if (commonResult2 instanceof ResultOk) {
                            C6315rG c6315rG110 = (C6315rG) ((ResultOk) commonResult2).a();
                            bVar.d = d44;
                            bVar.e = commonResult2;
                            bVar.g = null;
                            bVar.l = 8;
                            d44.d.f.setValue(c6315rG110);
                            String str111 = c6315rG110.a;
                            C4966kq1 c4966kq11110 = d44.a;
                            c4966kq11110.getClass();
                            Intrinsics.checkNotNullParameter(str111, "<set-?>");
                            c4966kq11110.c = str111;
                            if (Unit.a != mn) {
                                interfaceC1767Pk0 = d44.b;
                                duoAuthType3 = DuoAuthType.NONE;
                                bVar.d = commonResult2;
                                bVar.e = null;
                                bVar.g = null;
                                bVar.l = 9;
                                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                    return commonResult2;
                                }
                            }
                        } else {
                            interfaceC1767Pk0 = d44.b;
                            duoAuthType3 = DuoAuthType.NONE;
                            bVar.d = commonResult2;
                            bVar.e = null;
                            bVar.g = null;
                            bVar.l = 9;
                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                return commonResult2;
                            }
                        }
                    }
                }
                return mn;
            case 6:
                interfaceC3220cl3 = (InterfaceC3220cl) bVar.e;
                d44 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                obj5 = obj6;
                CommonResult commonResult113 = (CommonResult) obj5;
                interfaceC3220cl4 = interfaceC3220cl3;
                commonResult2 = commonResult113;
                if (interfaceC3220cl4 != null) {
                    d44.getClass();
                    if (!(commonResult2 instanceof ResultError)) {
                        str = "passed";
                    } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                        str = "wrong_code";
                    } else {
                        str = "verify_failed";
                    }
                    interfaceC3220cl4.b("duo_auth.outcome", str);
                }
                if (commonResult2 instanceof ResultOk) {
                    C6315rG c6315rG111 = (C6315rG) ((ResultOk) commonResult2).a();
                    bVar.d = d44;
                    bVar.e = commonResult2;
                    bVar.g = null;
                    bVar.l = 8;
                    d44.d.f.setValue(c6315rG111);
                    String str112 = c6315rG111.a;
                    C4966kq1 c4966kq11111 = d44.a;
                    c4966kq11111.getClass();
                    Intrinsics.checkNotNullParameter(str112, "<set-?>");
                    c4966kq11111.c = str112;
                    if (Unit.a != mn) {
                        interfaceC1767Pk0 = d44.b;
                        duoAuthType3 = DuoAuthType.NONE;
                        bVar.d = commonResult2;
                        bVar.e = null;
                        bVar.g = null;
                        bVar.l = 9;
                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                            return commonResult2;
                        }
                    }
                } else {
                    interfaceC1767Pk0 = d44.b;
                    duoAuthType3 = DuoAuthType.NONE;
                    bVar.d = commonResult2;
                    bVar.e = null;
                    bVar.g = null;
                    bVar.l = 9;
                    if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                        return commonResult2;
                    }
                }
                return mn;
            case 7:
                interfaceC5790ol2 = (InterfaceC5790ol) bVar.g;
                interfaceC3220cl3 = (InterfaceC3220cl) bVar.e;
                d43 = (D40) bVar.d;
                try {
                    C1795Pt1.b(obj6);
                    obj4 = obj6;
                    CommonResult commonResult114 = (CommonResult) obj4;
                    interfaceC5790ol2.a(commonResult114 instanceof ResultOk);
                    interfaceC3220cl4 = interfaceC3220cl3;
                    commonResult2 = commonResult114;
                    d44 = d43;
                    if (interfaceC3220cl4 != null) {
                        d44.getClass();
                        if (!(commonResult2 instanceof ResultError)) {
                            str = "passed";
                        } else if (((ResultError) commonResult2).getError().getCode() == CommonError.Codes.IncorrectAuthCode.getValue()) {
                            str = "wrong_code";
                        } else {
                            str = "verify_failed";
                        }
                        interfaceC3220cl4.b("duo_auth.outcome", str);
                    }
                    if (commonResult2 instanceof ResultOk) {
                        C6315rG c6315rG112 = (C6315rG) ((ResultOk) commonResult2).a();
                        bVar.d = d44;
                        bVar.e = commonResult2;
                        bVar.g = null;
                        bVar.l = 8;
                        d44.d.f.setValue(c6315rG112);
                        String str113 = c6315rG112.a;
                        C4966kq1 c4966kq11112 = d44.a;
                        c4966kq11112.getClass();
                        Intrinsics.checkNotNullParameter(str113, "<set-?>");
                        c4966kq11112.c = str113;
                        if (Unit.a != mn) {
                            interfaceC1767Pk0 = d44.b;
                            duoAuthType3 = DuoAuthType.NONE;
                            bVar.d = commonResult2;
                            bVar.e = null;
                            bVar.g = null;
                            bVar.l = 9;
                            if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                                return commonResult2;
                            }
                        }
                    } else {
                        interfaceC1767Pk0 = d44.b;
                        duoAuthType3 = DuoAuthType.NONE;
                        bVar.d = commonResult2;
                        bVar.e = null;
                        bVar.g = null;
                        bVar.l = 9;
                        if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                            return commonResult2;
                        }
                    }
                    return mn;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC5790ol2.a(false);
                    throw th;
                }
            case 8:
                commonResult2 = (CommonResult) bVar.e;
                d44 = (D40) bVar.d;
                C1795Pt1.b(obj6);
                interfaceC1767Pk0 = d44.b;
                duoAuthType3 = DuoAuthType.NONE;
                bVar.d = commonResult2;
                bVar.e = null;
                bVar.g = null;
                bVar.l = 9;
                if (interfaceC1767Pk0.e(duoAuthType3, bVar) == mn) {
                    return mn;
                }
                return commonResult2;
            case 9:
                CommonResult commonResult20 = (CommonResult) bVar.d;
                C1795Pt1.b(obj6);
                return commonResult20;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // defpackage.C40
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [cl] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ol] */
    /* JADX WARN: Type inference failed for: r7v4, types: [ol] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.InterfaceC3220cl r7, defpackage.LM r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.E40
            if (r0 == 0) goto L13
            r0 = r8
            E40 r0 = (defpackage.E40) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            E40 r0 = new E40
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            ol r7 = r0.d
            defpackage.C1795Pt1.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L60
        L2d:
            r8 = move-exception
            goto L6d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.C1795Pt1.b(r8)
            goto L7e
        L3b:
            defpackage.C1795Pt1.b(r8)
            if (r7 == 0) goto L47
            java.lang.String r8 = "duo_auth.outcome"
            java.lang.String r2 = "waiting_code"
            r7.b(r8, r2)
        L47:
            Pk0 r8 = r6.b
            if (r7 == 0) goto L71
            java.lang.String r2 = "duo_auth.wait_code"
            ol r7 = r7.d(r2)
            Nn1 r8 = r8.c()     // Catch: java.lang.Throwable -> L2d
            r0.d = r7     // Catch: java.lang.Throwable -> L2d
            r0.h = r4     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L60
            goto L7d
        L60:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L2d
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L2d
            if (r0 <= 0) goto L69
            r3 = r5
        L69:
            r7.a(r3)
            return r8
        L6d:
            r7.a(r3)
            throw r8
        L71:
            Nn1 r7 = r8.c()
            r0.h = r5
            java.lang.Object r8 = defpackage.C4466ii.o(r7, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.String r8 = (java.lang.String) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.D40.c(cl, LM):java.lang.Object");
    }
}

package defpackage;

import com.api.core.backend.domain.models.requestModels.CommonDuoAuthLoginRequest;
import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.api.core.backend.domain.models.responseModels.CommonDuoAuthLoginResponse;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.core.backend.repositories.user.models.requests.ForgotPasswordRequest;
import com.api.core.backend.repositories.user.models.requests.LoginDuoAuthRequest;
import com.api.core.backend.repositories.user.models.requests.LoginRequest;
import com.api.core.backend.repositories.user.models.responses.CommonLoginResponse;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Kb2 extends Ib2 {

    @NotNull
    public final C3224cm d;

    @NotNull
    public final C4923kf e;

    @NotNull
    public final K22 f;

    @NotNull
    public final KW1 g;

    @InterfaceC3368dU(c = "com.impl.core.backend.repositories.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {109}, m = "getDemoBalance")
    public static final class a extends LM {
        public Kb2 d;
        public /* synthetic */ Object e;
        public int h;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return Kb2.this.h(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.impl.core.backend.repositories.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {113}, m = "getRealBalance")
    public static final class b extends LM {
        public Kb2 d;
        public /* synthetic */ Object e;
        public int h;

        public b(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return Kb2.this.d(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.impl.core.backend.repositories.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "login")
    public static final class c extends LM {
        public Kb2 d;
        public /* synthetic */ Object e;
        public int h;

        public c(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return Kb2.this.g(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.impl.core.backend.repositories.UserRepositoryImpl", f = "UserRepositoryImpl.kt", l = {102}, m = "registerUser")
    public static final class d extends LM {
        public /* synthetic */ Object d;
        public int g;

        public d(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.g |= Integer.MIN_VALUE;
            return Kb2.this.f(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kb2(@NotNull Ya2 userDataSourceApi, @NotNull C3224cm authorizationDataSource, @NotNull InterfaceC4833kC1 safeRequestsApi, @NotNull C4923kf appDataRepository, @NotNull K22 tradingDataSource) {
        super(userDataSourceApi, authorizationDataSource, safeRequestsApi, appDataRepository);
        Intrinsics.checkNotNullParameter(userDataSourceApi, "userDataSourceApi");
        Intrinsics.checkNotNullParameter(authorizationDataSource, "authorizationDataSource");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(tradingDataSource, "tradingDataSource");
        this.d = authorizationDataSource;
        this.e = appDataRepository;
        this.f = tradingDataSource;
        this.g = XO0.b(new C4927kg(userDataSourceApi, 8));
    }

    public final void G(CommonResult<C7573xF> commonResult, boolean z) {
        Object value;
        C6945uG c6945uGA;
        if (commonResult instanceof ResultOk) {
            GP1 gp1 = this.e.k;
            do {
                value = gp1.getValue();
                C6945uG c6945uG = (C6945uG) value;
                if (c6945uG != null) {
                    c6945uGA = C6945uG.a(c6945uG, null, null, null, 0.0d, 0.0d, 0L, 0L, 262143);
                    if (z) {
                        c6945uGA.j = ((C7573xF) ((ResultOk) commonResult).a()).a;
                    } else {
                        c6945uGA.k = ((C7573xF) ((ResultOk) commonResult).a()).a;
                    }
                } else {
                    c6945uGA = null;
                }
            } while (!gp1.d(value, c6945uGA));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object d(@NotNull XF xf, @NotNull JM<? super CommonResult<C7573xF>> jm) {
        b bVar;
        Kb2 kb2;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.h = i - Integer.MIN_VALUE;
            } else {
                bVar = new b((LM) jm);
            }
        } else {
            bVar = new b((LM) jm);
        }
        Object objW = bVar.e;
        MN mn = MN.d;
        int i2 = bVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objW);
            C2750ab2 c2750ab2 = (C2750ab2) this.g.getValue();
            bVar.d = this;
            bVar.h = 1;
            c2750ab2.getClass();
            objW = c2750ab2.b.w(new C3812fb2(c2750ab2, xf, null), bVar);
            if (objW == mn) {
                return mn;
            }
            kb2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kb2 = bVar.d;
            C1795Pt1.b(objW);
        }
        CommonResult<C7573xF> resultError = (CommonResult) objW;
        if (resultError instanceof ResultOk) {
            C7573xF c7573xF = (C7573xF) ((InterfaceC1247It1) ((ResultOk) resultError).a()).a();
            resultError = c7573xF == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c7573xF);
        } else if (!(resultError instanceof ResultError)) {
            throw new C6489s51();
        }
        kb2.G(resultError, true);
        return resultError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object f(@NotNull C5476nG common, @NotNull JM<? super CommonResult<C6315rG>> jm) {
        d dVar;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i = dVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.g = i - Integer.MIN_VALUE;
            } else {
                dVar = new d((LM) jm);
            }
        } else {
            dVar = new d((LM) jm);
        }
        Object objG = dVar.d;
        MN mn = MN.d;
        int i2 = dVar.g;
        if (i2 == 0) {
            C1795Pt1.b(objG);
            com.api.core.backend.repositories.user.models.requests.RegisterRequest.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(common, "common");
            com.api.core.backend.repositories.user.models.requests.RegisterRequest registerRequest = new com.api.core.backend.repositories.user.models.requests.RegisterRequest(0);
            registerRequest.h(common.a);
            registerRequest.j(common.b);
            registerRequest.i(common.c);
            registerRequest.f();
            registerRequest.g();
            registerRequest.k(common.e);
            String str = common.d;
            registerRequest.c(str);
            registerRequest.l();
            registerRequest.e(common.f);
            registerRequest.d(str);
            dVar.g = 1;
            objG = this.d.g(registerRequest, dVar);
            if (objG == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objG);
        }
        CommonResult commonResult = (CommonResult) objG;
        if (commonResult instanceof ResultOk) {
            C6315rG c6315rG = (C6315rG) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a();
            return c6315rG == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c6315rG);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object g(@NotNull C3326dG common, @NotNull JM<? super CommonResult<C6315rG>> jm) {
        c cVar;
        Kb2 kb2;
        DuoAuthType duoAuthType;
        String token;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.h = i - Integer.MIN_VALUE;
            } else {
                cVar = new c((LM) jm);
            }
        } else {
            cVar = new c((LM) jm);
        }
        Object objF = cVar.e;
        MN mn = MN.d;
        int i2 = cVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            LoginRequest.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(common, "common");
            LoginRequest loginRequest = new LoginRequest(0);
            loginRequest.c(common.a);
            loginRequest.d(common.b);
            loginRequest.e(common.c);
            cVar.d = this;
            cVar.h = 1;
            objF = this.d.f(loginRequest, cVar);
            if (objF == mn) {
                return mn;
            }
            kb2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kb2 = cVar.d;
            C1795Pt1.b(objF);
        }
        CommonResult commonResult = (CommonResult) objF;
        CommonLoginResponse commonLoginResponse = (CommonLoginResponse) CommonResultKt.b(commonResult);
        String ssid = commonLoginResponse != null ? commonLoginResponse.getSsid() : null;
        if ((ssid != null && ssid.length() != 0) || (commonResult instanceof ResultError)) {
            if (commonResult instanceof ResultOk) {
                return new ResultOk(((CommonLoginResponse) ((ResultOk) commonResult).a()).a());
            }
            if (commonResult instanceof ResultError) {
                return commonResult;
            }
            throw new C6489s51();
        }
        String method = commonLoginResponse != null ? commonLoginResponse.getMethod() : null;
        if (method != null) {
            switch (method.hashCode()) {
                case -1895967796:
                    if (method.equals("Google Authenticator")) {
                        duoAuthType = DuoAuthType.GOOGLE_AUTH;
                        token = commonLoginResponse.getToken();
                        if (token == null) {
                            token = "";
                        }
                        return new ResultError(new CommonError.DuoAuthLogin(new CommonDuoAuthLoginResponse(token, duoAuthType)));
                    }
                    break;
                case 114009:
                    if (method.equals("sms")) {
                        duoAuthType = DuoAuthType.SMS;
                        token = commonLoginResponse.getToken();
                        if (token == null) {
                            token = "";
                        }
                        return new ResultError(new CommonError.DuoAuthLogin(new CommonDuoAuthLoginResponse(token, duoAuthType)));
                    }
                    break;
                case 3452698:
                    if (method.equals("push")) {
                        duoAuthType = DuoAuthType.PUSH;
                        token = commonLoginResponse.getToken();
                        if (token == null) {
                            token = "";
                        }
                        return new ResultError(new CommonError.DuoAuthLogin(new CommonDuoAuthLoginResponse(token, duoAuthType)));
                    }
                    break;
                case 96619420:
                    if (method.equals("email")) {
                        duoAuthType = DuoAuthType.EMAIL;
                        token = commonLoginResponse.getToken();
                        if (token == null) {
                            token = "";
                        }
                        return new ResultError(new CommonError.DuoAuthLogin(new CommonDuoAuthLoginResponse(token, duoAuthType)));
                    }
                    break;
            }
        }
        return kb2.m("login, unknown duo-auth method: " + (commonLoginResponse != null ? commonLoginResponse.getMethod() : null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object h(@NotNull XF xf, @NotNull JM<? super CommonResult<C7573xF>> jm) {
        a aVar;
        Kb2 kb2;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object objW = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objW);
            C2750ab2 c2750ab2 = (C2750ab2) this.g.getValue();
            aVar.d = this;
            aVar.h = 1;
            c2750ab2.getClass();
            objW = c2750ab2.b.w(new C3602eb2(c2750ab2, xf, null), aVar);
            if (objW == mn) {
                return mn;
            }
            kb2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kb2 = aVar.d;
            C1795Pt1.b(objW);
        }
        CommonResult<C7573xF> resultError = (CommonResult) objW;
        if (resultError instanceof ResultOk) {
            C7573xF c7573xF = (C7573xF) ((InterfaceC1247It1) ((ResultOk) resultError).a()).a();
            resultError = c7573xF == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c7573xF);
        } else if (!(resultError instanceof ResultError)) {
            throw new C6489s51();
        }
        kb2.G(resultError, false);
        return resultError;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object p(@NotNull CommonDuoAuthLoginRequest common, @NotNull LM lm) {
        Lb2 lb2;
        if (lm instanceof Lb2) {
            lb2 = (Lb2) lm;
            int i = lb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lb2.g = i - Integer.MIN_VALUE;
            } else {
                lb2 = new Lb2(this, lm);
            }
        } else {
            lb2 = new Lb2(this, lm);
        }
        Object objD = lb2.d;
        MN mn = MN.d;
        int i2 = lb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objD);
            LoginDuoAuthRequest.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(common, "common");
            LoginDuoAuthRequest loginDuoAuthRequest = new LoginDuoAuthRequest(common.getToken(), common.getCode(), common.getEmail(), common.getPassword());
            lb2.g = 1;
            objD = this.d.d(loginDuoAuthRequest, lb2);
            if (objD == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objD);
        }
        CommonResult commonResult = (CommonResult) objD;
        if (commonResult instanceof ResultOk) {
            C6315rG c6315rG = (C6315rG) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a();
            return c6315rG == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(c6315rG);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object q(@NotNull LM lm) {
        Nb2 nb2;
        if (lm instanceof Nb2) {
            nb2 = (Nb2) lm;
            int i = nb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                nb2.g = i - Integer.MIN_VALUE;
            } else {
                nb2 = new Nb2(this, lm);
            }
        } else {
            nb2 = new Nb2(this, lm);
        }
        Object objJ = nb2.d;
        MN mn = MN.d;
        int i2 = nb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objJ);
            C2750ab2 c2750ab2 = (C2750ab2) this.g.getValue();
            nb2.g = 1;
            objJ = c2750ab2.j(nb2);
            if (objJ == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objJ);
        }
        return C2182Us1.a(new C6403rh((InterfaceC6396rf0) objJ, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object s(@NotNull VF common, @NotNull LM lm) {
        Jb2 jb2;
        if (lm instanceof Jb2) {
            jb2 = (Jb2) lm;
            int i = jb2.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                jb2.g = i - Integer.MIN_VALUE;
            } else {
                jb2 = new Jb2(this, lm);
            }
        } else {
            jb2 = new Jb2(this, lm);
        }
        Object objC = jb2.d;
        MN mn = MN.d;
        int i2 = jb2.g;
        if (i2 == 0) {
            C1795Pt1.b(objC);
            ForgotPasswordRequest.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(common, "common");
            ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(common.a, common.b);
            jb2.g = 1;
            objC = this.d.c(forgotPasswordRequest, jb2);
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objC);
        }
        CommonResult commonResult = (CommonResult) objC;
        if (commonResult instanceof ResultOk) {
            WF wf = (WF) ((InterfaceC1247It1) ((ResultOk) commonResult).a()).a();
            return wf == null ? new ResultError(new CommonError.OtherError(null, 0, 3, null)) : new ResultOk(wf);
        }
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        throw new C6489s51();
    }

    @Override // defpackage.InterfaceC7012ub2
    @Nullable
    public final Object u(@NotNull C6315rG c6315rG, @NotNull JM<? super Unit> jm) {
        C3224cm c3224cm = this.d;
        c3224cm.getClass();
        Object objE = c3224cm.a.e(new C3015bm(c3224cm, c6315rG, null), jm);
        MN mn = MN.d;
        if (objE != mn) {
            objE = Unit.a;
        }
        return objE == mn ? objE : Unit.a;
    }
}

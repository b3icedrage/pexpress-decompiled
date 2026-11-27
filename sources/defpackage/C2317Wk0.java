package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2317Wk0 implements InterfaceC1923Rk0, InterfaceC3448dq1 {

    @NotNull
    public final InterfaceC1131Hh a;

    @NotNull
    public final C4923kf b;

    @NotNull
    public final AbstractC5045lD0 c;

    @NotNull
    public final AbstractC5468nD0 d;

    @NotNull
    public final AbstractC3947gD0 e;

    @NotNull
    public final InterfaceC3541eI f;

    /* JADX INFO: renamed from: Wk0$a */
    @InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.GetConfigUseCaseBase", f = "GetConfigUseCaseBase.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, UserVerificationMethods.USER_VERIFY_LOCATION}, m = "refreshConfig")
    public static final class a extends LM {
        public C2317Wk0 d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C2317Wk0.this.b(this);
        }
    }

    public C2317Wk0(@NotNull InterfaceC1131Hh appRepository, @NotNull C4923kf appDataRepository, @NotNull AbstractC5045lD0 isShowUseCaseApi, @NotNull AbstractC5468nD0 isStubShownUseCase, @NotNull AbstractC3947gD0 isAmplitudeInitializedUseCaseApi, @NotNull InterfaceC3541eI configBuilder) {
        Intrinsics.checkNotNullParameter(appRepository, "appRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        Intrinsics.checkNotNullParameter(isStubShownUseCase, "isStubShownUseCase");
        Intrinsics.checkNotNullParameter(isAmplitudeInitializedUseCaseApi, "isAmplitudeInitializedUseCaseApi");
        Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
        this.a = appRepository;
        this.b = appDataRepository;
        this.c = isShowUseCaseApi;
        this.d = isStubShownUseCase;
        this.e = isAmplitudeInitializedUseCaseApi;
        this.f = configBuilder;
    }

    @Override // defpackage.InterfaceC1923Rk0
    @Nullable
    public final Object a(@NotNull GF gf, @NotNull C7561xB c7561xB) {
        FF ff = (FF) this.b.b.getValue();
        return ff != null ? new ResultOk(ff) : c(gf, c7561xB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3448dq1
    @Nullable
    public final Object b(@NotNull JM<? super CommonResult<FF>> jm) {
        a aVar;
        C2317Wk0 c2317Wk0;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objA = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            aVar.d = this;
            aVar.h = 1;
            objA = this.f.a(aVar);
            if (objA != mn) {
                c2317Wk0 = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objA);
            return objA;
        }
        c2317Wk0 = aVar.d;
        C1795Pt1.b(objA);
        aVar.d = null;
        aVar.h = 2;
        Object objC = c2317Wk0.c((GF) objA, aVar);
        return objC == mn ? mn : objC;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[PHI: r2 r11
      0x00a6: PHI (r2v3 Wk0) = (r2v2 Wk0), (r2v2 Wk0), (r2v8 Wk0) binds: [B:28:0x008a, B:30:0x00a3, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r11v3 com.api.core.backend.domain.models.resultModels.CommonResult) = 
      (r11v2 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r11v2 com.api.core.backend.domain.models.resultModels.CommonResult)
      (r11v8 com.api.core.backend.domain.models.resultModels.CommonResult)
     binds: [B:28:0x008a, B:30:0x00a3, B:19:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(GF gf, LM lm) {
        C2001Sk0 c2001Sk0;
        C2317Wk0 c2317Wk0;
        CommonResult commonResult;
        AbstractC5468nD0 abstractC5468nD0;
        C2157Uk0 c2157Uk0;
        AbstractC3947gD0 abstractC3947gD0;
        C2235Vk0 c2235Vk0;
        if (lm instanceof C2001Sk0) {
            c2001Sk0 = (C2001Sk0) lm;
            int i = c2001Sk0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2001Sk0.i = i - Integer.MIN_VALUE;
            } else {
                c2001Sk0 = new C2001Sk0(this, lm);
            }
        } else {
            c2001Sk0 = new C2001Sk0(this, lm);
        }
        Object objI = c2001Sk0.g;
        MN mn = MN.d;
        int i2 = c2001Sk0.i;
        if (i2 == 0) {
            C1795Pt1.b(objI);
            c2001Sk0.d = this;
            c2001Sk0.i = 1;
            objI = this.a.i(gf, c2001Sk0);
            if (objI != mn) {
                c2317Wk0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            C2317Wk0 c2317Wk1 = (C2317Wk0) c2001Sk0.d;
            C1795Pt1.b(objI);
            c2317Wk0 = c2317Wk1;
        } else if (i2 == 2) {
            commonResult = c2001Sk0.e;
            c2317Wk0 = (C2317Wk0) c2001Sk0.d;
            C1795Pt1.b(objI);
            if (!((FF) ((ResultOk) commonResult).a()).c) {
                abstractC5468nD0 = c2317Wk0.d;
                c2157Uk0 = new C2157Uk0(1, null);
                c2001Sk0.d = c2317Wk0;
                c2001Sk0.e = commonResult;
                c2001Sk0.i = 3;
                if (abstractC5468nD0.m(c2157Uk0, c2001Sk0) != mn) {
                }
                return mn;
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CommonResult commonResult2 = (CommonResult) c2001Sk0.d;
                C1795Pt1.b(objI);
                return commonResult2;
            }
            commonResult = c2001Sk0.e;
            c2317Wk0 = (C2317Wk0) c2001Sk0.d;
            C1795Pt1.b(objI);
        }
        if (((FF) ((ResultOk) commonResult).a()).I) {
            abstractC3947gD0 = c2317Wk0.e;
            c2235Vk0 = new C2235Vk0(commonResult, null);
            c2001Sk0.d = commonResult;
            c2001Sk0.e = null;
            c2001Sk0.i = 4;
            abstractC3947gD0.getClass();
            if (AbstractC3947gD0.o(abstractC3947gD0, c2235Vk0, c2001Sk0) == mn) {
                return mn;
            }
        }
        return commonResult;
        commonResult = (CommonResult) objI;
        if (commonResult instanceof ResultOk) {
            ResultOk resultOk = (ResultOk) commonResult;
            c2317Wk0.b.b.setValue(resultOk.a());
            if (((FF) resultOk.a()).a) {
                C2079Tk0 c2079Tk0 = new C2079Tk0((ResultOk) commonResult, null);
                c2001Sk0.d = c2317Wk0;
                c2001Sk0.e = commonResult;
                c2001Sk0.i = 2;
                AbstractC5045lD0 abstractC5045lD0 = c2317Wk0.c;
                abstractC5045lD0.getClass();
                if (AbstractC5045lD0.o(abstractC5045lD0, c2079Tk0, c2001Sk0) != mn) {
                    if (!((FF) ((ResultOk) commonResult).a()).c) {
                        abstractC5468nD0 = c2317Wk0.d;
                        c2157Uk0 = new C2157Uk0(1, null);
                        c2001Sk0.d = c2317Wk0;
                        c2001Sk0.e = commonResult;
                        c2001Sk0.i = 3;
                        if (abstractC5468nD0.m(c2157Uk0, c2001Sk0) != mn) {
                        }
                    }
                    if (((FF) ((ResultOk) commonResult).a()).I) {
                        abstractC3947gD0 = c2317Wk0.e;
                        c2235Vk0 = new C2235Vk0(commonResult, null);
                        c2001Sk0.d = commonResult;
                        c2001Sk0.e = null;
                        c2001Sk0.i = 4;
                        abstractC3947gD0.getClass();
                        if (AbstractC3947gD0.o(abstractC3947gD0, c2235Vk0, c2001Sk0) == mn) {
                        }
                    }
                }
            } else {
                if (!((FF) ((ResultOk) commonResult).a()).c) {
                    abstractC5468nD0 = c2317Wk0.d;
                    c2157Uk0 = new C2157Uk0(1, null);
                    c2001Sk0.d = c2317Wk0;
                    c2001Sk0.e = commonResult;
                    c2001Sk0.i = 3;
                    if (abstractC5468nD0.m(c2157Uk0, c2001Sk0) != mn) {
                    }
                }
                if (((FF) ((ResultOk) commonResult).a()).I) {
                    abstractC3947gD0 = c2317Wk0.e;
                    c2235Vk0 = new C2235Vk0(commonResult, null);
                    c2001Sk0.d = commonResult;
                    c2001Sk0.e = null;
                    c2001Sk0.i = 4;
                    abstractC3947gD0.getClass();
                    if (AbstractC3947gD0.o(abstractC3947gD0, c2235Vk0, c2001Sk0) == mn) {
                    }
                }
            }
            return mn;
        }
        return commonResult;
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.impl.core.backend.modelsResponse.BalancesChangesResponse;
import com.impl.core.backend.responseModels.AppData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ab2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2750ab2 extends Za2 implements InterfaceC4833kC1 {
    public final /* synthetic */ InterfaceC4833kC1 b;

    @NotNull
    public final C4923kf c;

    @NotNull
    public final NX d;

    @NotNull
    public final InterfaceC7864ye1 e;

    @NotNull
    public final InterfaceC7444we1 f;

    @NotNull
    public final Vg2 g;

    @NotNull
    public final C3836fh2 h;

    @NotNull
    public final Object i;

    @NotNull
    public final Object j;

    /* JADX INFO: renamed from: ab2$a */
    public interface a {

        /* JADX INFO: renamed from: ab2$a$a, reason: collision with other inner class name */
        public static final class C0216a implements a {

            @NotNull
            public final AppData a;

            public C0216a(@NotNull AppData appData) {
                Intrinsics.checkNotNullParameter(appData, "appData");
                this.a = appData;
            }
        }

        /* JADX INFO: renamed from: ab2$a$b */
        public static final class b implements a {

            @NotNull
            public final CommonError a;

            public b(@NotNull CommonError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.a = error;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2750ab2(@NotNull InterfaceC7007ua1 ourSideHttpService, @NotNull C4923kf appData, @NotNull NX depositHistoryCookiesUseCase, @NotNull InterfaceC7864ye1 platformHttpService, @NotNull InterfaceC7444we1 platformHttpFullPathsProviderApi, @NotNull Vg2 executor, @NotNull C3836fh2 executor2, @NotNull InterfaceC4833kC1 safeRequestsApi) {
        super(ourSideHttpService);
        Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(depositHistoryCookiesUseCase, "depositHistoryCookiesUseCase");
        Intrinsics.checkNotNullParameter(platformHttpService, "platformHttpService");
        Intrinsics.checkNotNullParameter(platformHttpFullPathsProviderApi, "platformHttpFullPathsProviderApi");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(executor2, "executor2");
        Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
        this.b = safeRequestsApi;
        this.c = appData;
        this.d = depositHistoryCookiesUseCase;
        this.e = platformHttpService;
        this.f = platformHttpFullPathsProviderApi;
        this.g = executor;
        this.h = executor2;
        EnumC4403iP0 enumC4403iP0 = EnumC4403iP0.d;
        this.i = XO0.a(enumC4403iP0, new O4(this, 9));
        this.j = XO0.a(enumC4403iP0, new P4(this, 10));
    }

    @Override // defpackage.Ya2
    @Nullable
    public final Object b(@NotNull C6735tG c6735tG, @NotNull Eb2 eb2) {
        Object objB = this.e.b(this.f.e(), c6735tG.b, c6735tG.a, eb2);
        return objB == MN.d ? objB : Unit.a;
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.e(function1, jm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.Ya2
    @Nullable
    public final Object f(@NotNull C6315rG c6315rG, @NotNull LM lm) {
        C3183cb2 c3183cb2;
        C2750ab2 c2750ab2;
        C7698xq0 c7698xq0;
        if (lm instanceof C3183cb2) {
            c3183cb2 = (C3183cb2) lm;
            int i = c3183cb2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3183cb2.i = i - Integer.MIN_VALUE;
            } else {
                c3183cb2 = new C3183cb2(this, lm);
            }
        } else {
            c3183cb2 = new C3183cb2(this, lm);
        }
        Object objW = c3183cb2.g;
        MN mn = MN.d;
        int i2 = c3183cb2.i;
        if (i2 == 0) {
            C1795Pt1.b(objW);
            b.a aVar = b.e;
            R40 r40 = R40.SECONDS;
            C7698xq0 c7698xq1 = new C7698xq0(c.g(15, r40), c.g(30, r40), c.g(40, r40));
            C3393db2 c3393db2 = new C3393db2(c6315rG, null, c7698xq1, this);
            c3183cb2.d = this;
            c3183cb2.e = c7698xq1;
            c3183cb2.i = 1;
            objW = this.b.w(c3393db2, c3183cb2);
            if (objW == mn) {
                return mn;
            }
            c2750ab2 = this;
            c7698xq0 = c7698xq1;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7698xq0 = c3183cb2.e;
            c2750ab2 = c3183cb2.d;
            C1795Pt1.b(objW);
        }
        CommonResult commonResult = (CommonResult) objW;
        C5027l8.z(commonResult, c7698xq0);
        if (commonResult instanceof ResultError) {
            return commonResult;
        }
        if (!(commonResult instanceof ResultOk)) {
            throw new C6489s51();
        }
        a aVar2 = (a) ((ResultOk) commonResult).a();
        if (aVar2 instanceof a.b) {
            ResultError resultError = new ResultError(((a.b) aVar2).a);
            C5027l8.z(resultError, c7698xq0);
            return resultError;
        }
        if (!(aVar2 instanceof a.C0216a)) {
            throw new C6489s51();
        }
        GP1 gp1 = c2750ab2.c.K;
        a.C0216a c0216a = (a.C0216a) aVar2;
        NF nfB = c0216a.a.b();
        gp1.getClass();
        gp1.m(null, nfB);
        return new ResultOk(c0216a.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v5, types: [fO0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [fO0, java.lang.Object] */
    @Nullable
    public final Object j(@NotNull LM lm) {
        C4022gb2 c4022gb2;
        C2750ab2 c2750ab2;
        if (lm instanceof C4022gb2) {
            c4022gb2 = (C4022gb2) lm;
            int i = c4022gb2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4022gb2.h = i - Integer.MIN_VALUE;
            } else {
                c4022gb2 = new C4022gb2(this, lm);
            }
        } else {
            c4022gb2 = new C4022gb2(this, lm);
        }
        Object obj = c4022gb2.e;
        MN mn = MN.d;
        int i2 = c4022gb2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = this.c.h;
            C4232hb2 c4232hb2 = new C4232hb2(2, null);
            c4022gb2.d = this;
            c4022gb2.h = 1;
            if (C4466ii.p(gp1, c4232hb2, c4022gb2) == mn) {
                return mn;
            }
            c2750ab2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2750ab2 = c4022gb2.d;
            C1795Pt1.b(obj);
        }
        InterfaceC5125ld demoWs = (InterfaceC5125ld) c2750ab2.i.getValue();
        InterfaceC5125ld realWs = (InterfaceC5125ld) c2750ab2.j.getValue();
        Intrinsics.checkNotNullParameter(demoWs, "demoWs");
        Intrinsics.checkNotNullParameter(realWs, "realWs");
        C3735fC1 c3735fC1B = C7683xl2.b(BalancesChangesResponse.NAME, new TypeToken<BalancesChangesResponse>() { // from class: com.impl.core.backend.data_sources.UserDataSourceImplKt$balancesChanges$$inlined$getRightMessages$1
        }, demoWs.d());
        TypeToken<BalancesChangesResponse> typeToken = new TypeToken<BalancesChangesResponse>() { // from class: com.impl.core.backend.data_sources.UserDataSourceImplKt$balancesChanges$$inlined$getRightMessages$2
        };
        InterfaceC6396rf0<JsonElement> interfaceC6396rf0D = realWs.d();
        if (interfaceC6396rf0D == null) {
            interfaceC6396rf0D = C5020l60.d;
        }
        return new C4250hg0(C4466ii.x(c3735fC1B, C7683xl2.b(BalancesChangesResponse.NAME, typeToken, interfaceC6396rf0D)), 1);
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

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T extends HttpResponse<?>> Object o(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.o(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object t(@NotNull Function1<? super JM<? super CommonResult<? extends T>>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.t(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object w(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return this.b.w(function1, jm);
    }

    @Override // defpackage.InterfaceC4833kC1
    @NotNull
    public final ResultError z(@NotNull C6437rq0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return this.b.z(exception);
    }
}

package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class US0 implements TS0 {

    @NotNull
    public final C5176lq1 a;

    @NotNull
    public final InterfaceC1767Pk0 b;

    @NotNull
    public final InterfaceC7012ub2 c;

    @NotNull
    public final C4923kf d;

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.LoginRequestUseCaseBase", f = "LoginRequestUseCaseBase.kt", l = {30, 34, RequestError.NO_DEV_KEY}, m = "requestLogin$suspendImpl")
    public static final class a extends LM {
        public US0 d;
        public ResultOk e;
        public /* synthetic */ Object g;
        public int i;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return US0.b(US0.this, this);
        }
    }

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.LoginRequestUseCaseBase$requestLogin$response$1", f = "LoginRequestUseCaseBase.kt", l = {30}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function1<JM<? super CommonResult<? extends C6315rG>>, Object> {
        public int d;
        public final /* synthetic */ C3326dG g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3326dG c3326dG, JM<? super b> jm) {
            super(1, jm);
            this.g = c3326dG;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return US0.this.new b(this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super CommonResult<? extends C6315rG>> jm) {
            return ((b) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            InterfaceC7012ub2 interfaceC7012ub2 = US0.this.c;
            this.d = 1;
            Object objG = interfaceC7012ub2.g(this.g, this);
            return objG == mn ? mn : objG;
        }
    }

    public US0(@NotNull C5176lq1 registerAndLoginParams, @NotNull InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase, @NotNull InterfaceC7012ub2 userRepository, @NotNull C4923kf appDataRepository) {
        Intrinsics.checkNotNullParameter(registerAndLoginParams, "registerAndLoginParams");
        Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.a = registerAndLoginParams;
        this.b = getCodeIfNeededFromDuoAuthUseCase;
        this.c = userRepository;
        this.d = appDataRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (r12.b.e(r13, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.US0 r12, defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r13) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.US0.b(US0, JM):java.lang.Object");
    }

    @Override // defpackage.TS0
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }
}

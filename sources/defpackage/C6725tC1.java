package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.PlatformErrorApi;
import com.api.core.backend.domain.models.resultModels.ResultError;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import com.impl.core.backend.abstractModels.http.PlatformHttpError;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tC1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6725tC1 extends AbstractC6305rC1 {
    public static final /* synthetic */ int f = 0;

    @NotNull
    public final KW1 e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: tC1$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.helpers.SafeRequestsImpl$httpWithErrorPlatform$2", f = "SafeRequestsImpl.kt", l = {60}, m = "invokeSuspend")
    public static final class a<T> extends AW1 implements Function1<JM<? super CommonResult<? extends T>>, Object> {
        public int d;
        public final /* synthetic */ Function1<JM<? super T>, Object> e;
        public final /* synthetic */ C6725tC1 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super JM<? super T>, ? extends Object> function1, C6725tC1 c6725tC1, JM<? super a> jm) {
            super(1, jm);
            this.e = function1;
            this.g = c6725tC1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((a) create((JM) obj)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                obj = this.e.invoke(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            if (!(obj instanceof HttpPlatformResponse)) {
                return new ResultOk(obj);
            }
            HttpPlatformResponse httpPlatformResponse = (HttpPlatformResponse) obj;
            if (Intrinsics.a(httpPlatformResponse.getSuccess(), Boolean.TRUE)) {
                return new ResultOk(obj);
            }
            PlatformHttpError platformHttpErrorC = httpPlatformResponse.c();
            C1988Sg c1988Sg = U0.O;
            if (c1988Sg != null) {
                c1988Sg.l("http", "po.business_error", EnumC0936Eu.e, PW0.e(new Pair("code", platformHttpErrorC.getCode()), new Pair("field", platformHttpErrorC.getField()), new Pair("message", platformHttpErrorC.getMessage())));
            }
            int i2 = C6725tC1.f;
            ResultError resultErrorC = this.g.c(platformHttpErrorC);
            C2304Wg c2304Wg = U0.T;
            if (c2304Wg != null) {
                c2304Wg.invoke(UF.c(resultErrorC.getError()));
            }
            return resultErrorC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6725tC1(@NotNull Set<PlatformErrorApi> platformErrors) {
        super(platformErrors);
        Intrinsics.checkNotNullParameter(platformErrors, "platformErrors");
        this.e = XO0.b(new C6515sC1());
    }

    public final ResultError c(PlatformHttpError platformHttpError) {
        if (platformHttpError.getCode() != null) {
            return a(platformHttpError.getCode(), platformHttpError.getCode());
        }
        if (Intrinsics.a(platformHttpError.getField(), "email")) {
            return new ResultError(CommonError.Companion.b(CommonError.INSTANCE, CommonError.Codes.InvalidEmail.getValue(), null, platformHttpError.getMessage(), 2));
        }
        String message = platformHttpError.getMessage();
        if (message == null) {
            message = "";
        }
        return a(message, "UnexpectedError");
    }

    @Override // defpackage.InterfaceC4833kC1
    @Nullable
    public final <T> Object e(@NotNull Function1<? super JM<? super T>, ? extends Object> function1, @NotNull JM<? super CommonResult<? extends T>> jm) {
        return InterfaceC4833kC1.a.b(jm, this, new a(function1, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r4.getMessage() != null) goto L24;
     */
    @Override // defpackage.InterfaceC4833kC1
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.api.core.backend.domain.models.resultModels.ResultError z(@org.jetbrains.annotations.NotNull defpackage.C6437rq0 r13) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6725tC1.z(rq0):com.api.core.backend.domain.models.resultModels.ResultError");
    }
}

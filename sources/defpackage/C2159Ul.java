package defpackage;

import com.api.core.backend.repositories.user.models.requests.ForgotPasswordRequest;
import com.impl.core.backend.modelsResponse.RecoverPasswordResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$forgotPassword$2", f = "AuthorizationDataSourceImpl.kt", l = {119}, m = "invokeSuspend")
public final class C2159Ul extends AW1 implements Function1<JM<? super RecoverPasswordResponse>, Object> {
    public int d;
    public final /* synthetic */ C3224cm e;
    public final /* synthetic */ ForgotPasswordRequest g;
    public final /* synthetic */ C7698xq0 h;

    /* JADX INFO: renamed from: Ul$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$forgotPassword$2$1", f = "AuthorizationDataSourceImpl.kt", l = {120}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super RecoverPasswordResponse>, Object> {
        public int d;
        public final /* synthetic */ C3224cm e;
        public final /* synthetic */ ForgotPasswordRequest g;
        public final /* synthetic */ C2042Sy h;
        public final /* synthetic */ C7698xq0 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3224cm c3224cm, ForgotPasswordRequest forgotPasswordRequest, C2042Sy c2042Sy, C7698xq0 c7698xq0, JM<? super a> jm) {
            super(1, jm);
            this.e = c3224cm;
            this.g = forgotPasswordRequest;
            this.h = c2042Sy;
            this.i = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, this.g, this.h, this.i, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super RecoverPasswordResponse> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
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
            C3224cm c3224cm = this.e;
            InterfaceC7864ye1 interfaceC7864ye1 = c3224cm.c;
            String strD = c3224cm.d.d();
            String email = this.g.getEmail();
            C2042Sy c2042Sy = this.h;
            String str = c2042Sy.a;
            String str2 = c2042Sy.b;
            this.d = 1;
            Object objD = interfaceC7864ye1.d(strD, email, str, str2, 1, this.i, this);
            return objD == mn ? mn : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2159Ul(C3224cm c3224cm, ForgotPasswordRequest forgotPasswordRequest, C7698xq0 c7698xq0, JM<? super C2159Ul> jm) {
        super(1, jm);
        this.e = c3224cm;
        this.g = forgotPasswordRequest;
        this.h = c7698xq0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2159Ul(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super RecoverPasswordResponse> jm) {
        return ((C2159Ul) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
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
        C2042Sy c2042SyA = C3224cm.a(this.e, this.g.getCaptchaToken(), "forgot_password");
        C7698xq0 c7698xq0 = this.h;
        a aVar = new a(this.e, this.g, c2042SyA, c7698xq0, null);
        this.d = 1;
        Object objA = c7698xq0.a(aVar, this);
        return objA == mn ? mn : objA;
    }
}

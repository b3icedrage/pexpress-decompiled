package defpackage;

import com.api.core.backend.repositories.user.models.requests.LoginDuoAuthRequest;
import com.impl.core.backend.responseModels.AuthorizationResponseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Wl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$loginDuoAuth$2", f = "AuthorizationDataSourceImpl.kt", l = {95}, m = "invokeSuspend")
public final class C2319Wl extends AW1 implements Function1<JM<? super AuthorizationResponseImpl>, Object> {
    public int d;
    public final /* synthetic */ C3224cm e;
    public final /* synthetic */ LoginDuoAuthRequest g;
    public final /* synthetic */ C7698xq0 h;

    /* JADX INFO: renamed from: Wl$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$loginDuoAuth$2$1", f = "AuthorizationDataSourceImpl.kt", l = {96}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super AuthorizationResponseImpl>, Object> {
        public C3224cm d;
        public int e;
        public final /* synthetic */ C3224cm g;
        public final /* synthetic */ LoginDuoAuthRequest h;
        public final /* synthetic */ C2042Sy i;
        public final /* synthetic */ C7698xq0 j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3224cm c3224cm, LoginDuoAuthRequest loginDuoAuthRequest, C2042Sy c2042Sy, C7698xq0 c7698xq0, JM<? super a> jm) {
            super(1, jm);
            this.g = c3224cm;
            this.h = loginDuoAuthRequest;
            this.i = c2042Sy;
            this.j = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.g, this.h, this.i, this.j, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super AuthorizationResponseImpl> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            C3224cm c3224cm;
            MN mn = MN.d;
            int i = this.e;
            C7698xq0 c7698xq0 = this.j;
            if (i == 0) {
                C1795Pt1.b(obj);
                C3224cm c3224cm2 = this.g;
                InterfaceC7864ye1 interfaceC7864ye1 = c3224cm2.c;
                String strJ = c3224cm2.d.j();
                LoginDuoAuthRequest loginDuoAuthRequest = this.h;
                String email = loginDuoAuthRequest.getEmail();
                if (email == null) {
                    email = "";
                }
                String password = loginDuoAuthRequest.getPassword();
                String str = password != null ? password : "";
                String code = loginDuoAuthRequest.getCode();
                C2042Sy c2042Sy = this.i;
                String str2 = c2042Sy.a;
                String str3 = c2042Sy.b;
                this.d = c3224cm2;
                this.e = 1;
                Object objG = interfaceC7864ye1.g(strJ, email, str, 1, str2, str3, code, 1, c7698xq0, this);
                if (objG == mn) {
                    return mn;
                }
                c3224cm = c3224cm2;
                obj = objG;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3224cm = this.d;
                C1795Pt1.b(obj);
            }
            return C3224cm.b(c3224cm, (C0935Et1) obj, c7698xq0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2319Wl(C3224cm c3224cm, LoginDuoAuthRequest loginDuoAuthRequest, C7698xq0 c7698xq0, JM<? super C2319Wl> jm) {
        super(1, jm);
        this.e = c3224cm;
        this.g = loginDuoAuthRequest;
        this.h = c7698xq0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2319Wl(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super AuthorizationResponseImpl> jm) {
        return ((C2319Wl) create(jm)).invokeSuspend(Unit.a);
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
        C2042Sy c2042SyA = C3224cm.a(this.e, this.g.getToken(), "login");
        C7698xq0 c7698xq0 = this.h;
        a aVar = new a(this.e, this.g, c2042SyA, c7698xq0, null);
        this.d = 1;
        Object objA = c7698xq0.a(aVar, this);
        return objA == mn ? mn : objA;
    }
}

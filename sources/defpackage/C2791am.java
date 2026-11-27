package defpackage;

import com.api.core.backend.repositories.user.models.requests.RegisterRequest;
import com.impl.core.backend.responseModels.AuthorizationResponseImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$registerUser$2", f = "AuthorizationDataSourceImpl.kt", l = {45}, m = "invokeSuspend")
public final class C2791am extends AW1 implements Function1<JM<? super AuthorizationResponseImpl>, Object> {
    public int d;
    public final /* synthetic */ C7698xq0 e;
    public final /* synthetic */ C3224cm g;
    public final /* synthetic */ RegisterRequest h;

    /* JADX INFO: renamed from: am$a */
    @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AuthorizationDataSourceImpl$registerUser$2$1", f = "AuthorizationDataSourceImpl.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super AuthorizationResponseImpl>, Object> {
        public int d;
        public final /* synthetic */ C3224cm e;
        public final /* synthetic */ RegisterRequest g;
        public final /* synthetic */ C7698xq0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3224cm c3224cm, JM jm, C7698xq0 c7698xq0, RegisterRequest registerRequest) {
            super(1, jm);
            this.e = c3224cm;
            this.g = registerRequest;
            this.h = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            RegisterRequest registerRequest = this.g;
            return new a(this.e, jm, this.h, registerRequest);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super AuthorizationResponseImpl> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            C3224cm c3224cm;
            Object objA;
            MN mn = MN.d;
            int i = this.d;
            C7698xq0 c7698xq0 = this.h;
            C3224cm c3224cm2 = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7864ye1 interfaceC7864ye1 = c3224cm2.c;
                RegisterRequest registerRequest = this.g;
                String email = registerRequest.getEmail();
                String str = email == null ? "" : email;
                String password = registerRequest.getPassword();
                String str2 = password == null ? "" : password;
                String strC = c3224cm2.d.c();
                this.d = 1;
                c3224cm = c3224cm2;
                objA = interfaceC7864ye1.a(strC, "59298", "affiliate", "sr", "8Yknv5LjoSNyA4", "install_robot_app", "50START", str, str2, str2, 1, 1, c7698xq0, this);
                if (objA == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                objA = obj;
                c3224cm = c3224cm2;
            }
            return C3224cm.b(c3224cm, (C0935Et1) objA, c7698xq0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2791am(C3224cm c3224cm, JM jm, C7698xq0 c7698xq0, RegisterRequest registerRequest) {
        super(1, jm);
        this.e = c7698xq0;
        this.g = c3224cm;
        this.h = registerRequest;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2791am(this.g, jm, this.e, this.h);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super AuthorizationResponseImpl> jm) {
        return ((C2791am) create(jm)).invokeSuspend(Unit.a);
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
        C7698xq0 c7698xq0 = this.e;
        a aVar = new a(this.g, null, c7698xq0, this.h);
        this.d = 1;
        Object objA = c7698xq0.a(aVar, this);
        return objA == mn ? mn : objA;
    }
}

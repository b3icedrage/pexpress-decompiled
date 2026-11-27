package defpackage;

import com.api.core.backend.domain.models.responseModels.DefaultResponse;
import com.api.core.backend.repositories.user.models.requests.AddUserRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$addUser$2", f = "UserRepositoryBase.kt", l = {83}, m = "invokeSuspend")
public final class C7433wb2 extends AW1 implements Function1<JM<? super DefaultResponse>, Object> {
    public int d;
    public final /* synthetic */ C7698xq0 e;
    public final /* synthetic */ Ib2 g;
    public final /* synthetic */ C6732tF h;

    /* JADX INFO: renamed from: wb2$a */
    @InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$addUser$2$1", f = "UserRepositoryBase.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super DefaultResponse>, Object> {
        public int d;
        public final /* synthetic */ Ib2 e;
        public final /* synthetic */ C6732tF g;
        public final /* synthetic */ C7698xq0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6732tF c6732tF, JM jm, C7698xq0 c7698xq0, Ib2 ib2) {
            super(1, jm);
            this.e = ib2;
            this.g = c6732tF;
            this.h = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.g, jm, this.h, this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super DefaultResponse> jm) {
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
            Ya2 ya2 = this.e.a;
            AddUserRequest.INSTANCE.getClass();
            C6732tF common = this.g;
            Intrinsics.checkNotNullParameter(common, "common");
            AddUserRequest addUserRequest = new AddUserRequest(Long.valueOf(common.a), common.b, common.c, common.d, 1);
            this.d = 1;
            Object objD = ya2.d(addUserRequest, this.h, this);
            return objD == mn ? mn : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7433wb2(C6732tF c6732tF, JM jm, C7698xq0 c7698xq0, Ib2 ib2) {
        super(1, jm);
        this.e = c7698xq0;
        this.g = ib2;
        this.h = c6732tF;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C7433wb2(this.h, jm, this.e, this.g);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super DefaultResponse> jm) {
        return ((C7433wb2) create(jm)).invokeSuspend(Unit.a);
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
        a aVar = new a(this.h, null, c7698xq0, this.g);
        this.d = 1;
        Object objA = c7698xq0.a(aVar, this);
        return objA == mn ? mn : objA;
    }
}

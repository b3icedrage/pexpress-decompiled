package defpackage;

import com.api.core.backend.repositories.user.models.requests.GetUserDataRequest;
import com.api.core.backend.repositories.user.models.responses.CommonShortUserResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$getUserData$2", f = "UserRepositoryBase.kt", l = {52}, m = "invokeSuspend")
public final class Bb2 extends AW1 implements Function1<JM<? super CommonShortUserResponse>, Object> {
    public int d;
    public final /* synthetic */ C7698xq0 e;
    public final /* synthetic */ Ib2 g;
    public final /* synthetic */ ZF h;

    @InterfaceC3368dU(c = "com.base.core.backend.repositories.UserRepositoryBase$getUserData$2$1", f = "UserRepositoryBase.kt", l = {53}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super CommonShortUserResponse>, Object> {
        public int d;
        public final /* synthetic */ Ib2 e;
        public final /* synthetic */ ZF g;
        public final /* synthetic */ C7698xq0 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ZF zf, JM jm, C7698xq0 c7698xq0, Ib2 ib2) {
            super(1, jm);
            this.e = ib2;
            this.g = zf;
            this.h = c7698xq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.g, jm, this.h, this.e);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super CommonShortUserResponse> jm) {
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
            GetUserDataRequest.INSTANCE.getClass();
            ZF common = this.g;
            Intrinsics.checkNotNullParameter(common, "common");
            GetUserDataRequest getUserDataRequest = new GetUserDataRequest(common.b, common.c, common.a, common.d);
            this.d = 1;
            Object objI = ya2.i(getUserDataRequest, this.h, this);
            return objI == mn ? mn : objI;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bb2(ZF zf, JM jm, C7698xq0 c7698xq0, Ib2 ib2) {
        super(1, jm);
        this.e = c7698xq0;
        this.g = ib2;
        this.h = zf;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new Bb2(this.h, jm, this.e, this.g);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super CommonShortUserResponse> jm) {
        return ((Bb2) create(jm)).invokeSuspend(Unit.a);
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

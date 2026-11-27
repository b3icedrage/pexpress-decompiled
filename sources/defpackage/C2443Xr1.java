package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Xr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.ReplySubscriptionKt$subscribeThenSend$2", f = "ReplySubscription.kt", l = {31}, m = "invokeSuspend")
public final class C2443Xr1 extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public final /* synthetic */ AW1 e;
    public final /* synthetic */ InterfaceC6396rf0<Object> g;

    /* JADX INFO: renamed from: Xr1$a */
    @InterfaceC3368dU(c = "com.base.core.backend.ReplySubscriptionKt$subscribeThenSend$2$1", f = "ReplySubscription.kt", l = {33, 34}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<Object>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ AW1 g;
        public final /* synthetic */ InterfaceC6396rf0<Object> h;

        /* JADX INFO: renamed from: Xr1$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.ReplySubscriptionKt$subscribeThenSend$2$1$first$1", f = "ReplySubscription.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION}, m = "invokeSuspend")
        public static final class C0198a extends AW1 implements Function2<KN, JM<Object>, Object> {
            public int d;
            public final /* synthetic */ InterfaceC6396rf0<Object> e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0198a(InterfaceC6396rf0<Object> interfaceC6396rf0, JM<? super C0198a> jm) {
                super(2, jm);
                this.e = interfaceC6396rf0;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0198a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<Object> jm) {
                return ((C0198a) create(kn, jm)).invokeSuspend(Unit.a);
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
                this.d = 1;
                Object objO = C4466ii.o(this.e, this);
                return objO == mn ? mn : objO;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(JM jm, InterfaceC6396rf0 interfaceC6396rf0, Function1 function1) {
            super(2, jm);
            this.g = (AW1) function1;
            this.h = interfaceC6396rf0;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(jm, this.h, this.g);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<Object> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            InterfaceC7414wW interfaceC7414wWD;
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                interfaceC7414wWD = C5189lv.d((KN) this.e, C6266r20.b, ON.h, new C0198a(this.h, null));
                this.e = interfaceC7414wWD;
                this.d = 1;
                if (this.g.invoke(this) != mn) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            interfaceC7414wWD = (InterfaceC7414wW) this.e;
            C1795Pt1.b(obj);
            this.e = null;
            this.d = 2;
            Object objK0 = interfaceC7414wWD.K0(this);
            return objK0 == mn ? mn : objK0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2443Xr1(JM jm, InterfaceC6396rf0 interfaceC6396rf0, Function1 function1) {
        super(2, jm);
        this.e = (AW1) function1;
        this.g = interfaceC6396rf0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2443Xr1(jm, this.g, this.e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((C2443Xr1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [AW1, kotlin.jvm.functions.Function1] */
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
        a aVar = new a(null, this.g, this.e);
        this.d = 1;
        Object objD = LN.d(aVar, this);
        return objD == mn ? mn : objD;
    }
}

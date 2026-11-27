package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager$onTryAgainClicked$retrying$1", f = "NetworkManager.kt", l = {307}, m = "invokeSuspend")
public final class E31 extends AW1 implements Function1<JM<? super Boolean>, Object> {
    public int d;
    public final /* synthetic */ C6062q31 e;

    @InterfaceC3368dU(c = "com.base.app.services.NetworkManager$onTryAgainClicked$retrying$1$1", f = "NetworkManager.kt", l = {307}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C6062q31 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6062q31 c6062q31, JM<? super a> jm) {
            super(1, jm);
            this.e = c6062q31;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (C6062q31.b(this.e, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E31(C6062q31 c6062q31, JM<? super E31> jm) {
        super(1, jm);
        this.e = c6062q31;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new E31(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Boolean> jm) {
        return ((E31) create(jm)).invokeSuspend(Unit.a);
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
        C6062q31 c6062q31 = this.e;
        GP1 gp1 = c6062q31.e.s;
        a aVar = new a(c6062q31, null);
        this.d = 1;
        Object objA = PN1.a(gp1, aVar, this);
        return objA == mn ? mn : objA;
    }
}

package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.SocketReadinessKt$reconnectUntilReady$outcome$1", f = "SocketReadiness.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
public final class ON1 extends AW1 implements Function2<KN, JM<? super MN1>, Object> {
    public int d;
    public final /* synthetic */ FP1<MN1> e;

    @InterfaceC3368dU(c = "com.base.core.backend.SocketReadinessKt$reconnectUntilReady$outcome$1$1", f = "SocketReadiness.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<MN1, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MN1 mn1, JM<? super Boolean> jm) {
            return ((a) create(mn1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(((MN1) this.d) != MN1.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ON1(FP1<? extends MN1> fp1, JM<? super ON1> jm) {
        super(2, jm);
        this.e = fp1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new ON1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super MN1> jm) {
        return ((ON1) create(kn, jm)).invokeSuspend(Unit.a);
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
        a aVar = new a(2, null);
        this.d = 1;
        Object objP = C4466ii.p(this.e, aVar, this);
        return objP == mn ? mn : objP;
    }
}

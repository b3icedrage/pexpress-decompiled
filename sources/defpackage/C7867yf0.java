package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.FlowKt$firstWithTimeoutOrNull$3", f = "Flow.kt", l = {135}, m = "invokeSuspend")
public final class C7867yf0 extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC6396rf0<Object> e;
    public final /* synthetic */ Function1<Object, Boolean> g;

    /* JADX INFO: renamed from: yf0$a */
    @InterfaceC3368dU(c = "com.api.utils.FlowKt$firstWithTimeoutOrNull$3$1", f = "Flow.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Object, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ Function1<Object, Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1<Object, Boolean> function1, JM<? super a> jm) {
            super(2, jm);
            this.e = function1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.e, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, JM<? super Boolean> jm) {
            return ((a) create(obj, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return this.e.invoke(this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7867yf0(JM jm, InterfaceC6396rf0 interfaceC6396rf0, Function1 function1) {
        super(2, jm);
        this.e = interfaceC6396rf0;
        this.g = function1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7867yf0(jm, this.e, this.g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((C7867yf0) create(kn, jm)).invokeSuspend(Unit.a);
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
        a aVar = new a(this.g, null);
        this.d = 1;
        Object objR = C4466ii.r(this.e, aVar, this);
        return objR == mn ? mn : objR;
    }
}

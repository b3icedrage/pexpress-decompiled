package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordViewModelBase$sendResetRequest$1", f = "ForgetPasswordViewModelBase.kt", l = {80, 88, 88, 103}, m = "invokeSuspend")
public final class C7875yh0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public InterfaceC3220cl d;
    public InterfaceC3220cl e;
    public InterfaceC5790ol g;
    public int h;
    public final /* synthetic */ C7455wh0 i;

    /* JADX INFO: renamed from: yh0$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordViewModelBase$sendResetRequest$1$response$1$1$1", f = "ForgetPasswordViewModelBase.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super CommonResult<? extends WF>>, Object> {
        public int d;
        public final /* synthetic */ C7455wh0 e;
        public final /* synthetic */ VF g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7455wh0 c7455wh0, VF vf, JM<? super a> jm) {
            super(1, jm);
            this.e = c7455wh0;
            this.g = vf;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super CommonResult<? extends WF>> jm) {
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
            InterfaceC7012ub2 interfaceC7012ub2 = this.e.s;
            this.d = 1;
            Object objS = interfaceC7012ub2.s(this.g, this);
            return objS == mn ? mn : objS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7875yh0(C7455wh0 c7455wh0, JM<? super C7875yh0> jm) {
        super(2, jm);
        this.i = c7455wh0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7875yh0(this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7875yh0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:96:0x020d  */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
    
        if (r2.a(r16) == r0) goto L99;
     */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00ca: MOVE (r3 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:203), block:B:41:0x00ca */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00ce: MOVE (r3 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:207), block:B:43:0x00ce */
    /* JADX WARN: Type inference failed for: r3v0, types: [cl, int] */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7875yh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

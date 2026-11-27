package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: vz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorsManualConfigViewModel$onSaveClick$1", f = "IndicatorsManualConfigViewModel.kt", l = {109}, m = "invokeSuspend")
public final class C7304vz0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public C6674sz0 d;
    public int e;
    public final /* synthetic */ C6674sz0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7304vz0(C6674sz0 c6674sz0, JM<? super C7304vz0> jm) {
        super(2, jm);
        this.g = c6674sz0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7304vz0(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7304vz0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        C6674sz0 c6674sz0;
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C6674sz0 c6674sz1 = this.g;
            c6674sz1.s();
            InterfaceC7722xy0 interfaceC7722xy0 = (InterfaceC7722xy0) c6674sz1.j.getValue();
            if (interfaceC7722xy0 != null) {
                this.d = c6674sz1;
                this.e = 1;
                if (c6674sz1.f.b(interfaceC7722xy0, this) == mn) {
                    return mn;
                }
                c6674sz0 = c6674sz1;
            }
            return Unit.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c6674sz0 = this.d;
        C1795Pt1.b(obj);
        c6674sz0.e.b();
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;

/* JADX INFO: renamed from: rZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionViewModelBase$onTimeClicked$2", f = "TimeSelectionViewModelBase.kt", l = {54}, m = "invokeSuspend")
public final class C6374rZ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5955pZ1 e;
    public final /* synthetic */ C1709Or g;

    /* JADX INFO: renamed from: rZ1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.timeselection.screens.TimeSelectionViewModelBase$onTimeClicked$2$1", f = "TimeSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super b>, Object> {
        public final /* synthetic */ C1709Or d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1709Or c1709Or, JM<? super a> jm) {
            super(1, jm);
            this.d = c1709Or;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super b> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return new b(this.d.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6374rZ1(C5955pZ1 c5955pZ1, C1709Or c1709Or, JM<? super C6374rZ1> jm) {
        super(2, jm);
        this.e = c5955pZ1;
        this.g = c1709Or;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6374rZ1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6374rZ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C5955pZ1 c5955pZ1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC1787Pr abstractC1787Pr = c5955pZ1.h;
            a aVar = new a(this.g, null);
            this.d = 1;
            C1943Rr c1943Rr = (C1943Rr) abstractC1787Pr;
            c1943Rr.getClass();
            if (c1943Rr.j(c1943Rr.c, new C1865Qr(aVar, null), this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        c5955pZ1.e.b();
        return Unit.a;
    }
}

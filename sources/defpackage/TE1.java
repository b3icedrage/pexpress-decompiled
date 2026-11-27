package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountViewModelBase$setSelectAccountScreenPassed$1", f = "SelectHaveAccountViewModelBase.kt", l = {29}, m = "invokeSuspend")
public final class TE1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ UE1 e;

    @InterfaceC3368dU(c = "com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountViewModelBase$setSelectAccountScreenPassed$1$1", f = "SelectHaveAccountViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(1, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            ((a) create(jm)).invokeSuspend(Unit.a);
            return Boolean.TRUE;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TE1(UE1 ue1, JM<? super TE1> jm) {
        super(2, jm);
        this.e = ue1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new TE1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((TE1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            CE1 ce1 = this.e.e;
            a aVar = new a(1, null);
            this.d = 1;
            if (ce1.m(aVar, this) == mn) {
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

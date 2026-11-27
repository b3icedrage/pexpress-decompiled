package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetViewModelBase$setOneClickStop$1", f = "StopConfirmBottomSheetViewModelBase.kt", l = {27}, m = "invokeSuspend")
public final class BQ1 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ DQ1 e;
    public final /* synthetic */ boolean g;

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.screens.stop_cofirm.StopConfirmBottomSheetViewModelBase$setOneClickStop$1$1", f = "StopConfirmBottomSheetViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, JM<? super a> jm) {
            super(1, jm);
            this.d = z;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BQ1(DQ1 dq1, boolean z, JM<? super BQ1> jm) {
        super(1, jm);
        this.e = dq1;
        this.g = z;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new BQ1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((BQ1) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC6925u91 abstractC6925u91 = this.e.f;
            a aVar = new a(this.g, null);
            this.d = 1;
            if (abstractC6925u91.m(aVar, this) == mn) {
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

package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ju1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$4", f = "RobotAccountSelectionPart.kt", l = {48}, m = "invokeSuspend")
public final class C1328Ju1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ C7717xw1 h;

    /* JADX INFO: renamed from: Ju1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart$initFlowCollectors$$inlined$launchAndCollectIn$default$4$1", f = "RobotAccountSelectionPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ C7717xw1 h;

        /* JADX INFO: renamed from: Ju1$a$a, reason: collision with other inner class name */
        public static final class C0067a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C7717xw1 e;

            public C0067a(KN kn, C7717xw1 c7717xw1) {
                this.e = c7717xw1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C7717xw1 c7717xw1 = this.e;
                c7717xw1.m.e.setEnabled(zBooleanValue);
                c7717xw1.i.e.setEnabled(zBooleanValue);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, C7717xw1 c7717xw1) {
            super(2, jm);
            this.g = fp1;
            this.h = c7717xw1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0067a c0067a = new C0067a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0067a, this) == mn) {
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
    public C1328Ju1(FP0 fp0, FP1 fp1, JM jm, C7717xw1 c7717xw1) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = c7717xw1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C1328Ju1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1328Ju1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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

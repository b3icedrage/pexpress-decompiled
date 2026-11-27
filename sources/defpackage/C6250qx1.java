package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.investment.screens.RobotInvestmentPart;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initChartFlowCollectors$$inlined$launchAndCollectIn$1", f = "RobotInvestmentPart.kt", l = {48}, m = "invokeSuspend")
public final class C6250qx1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ RobotInvestmentPart h;

    /* JADX INFO: renamed from: qx1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.screens.RobotInvestmentPart$initChartFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "RobotInvestmentPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ RobotInvestmentPart h;

        /* JADX INFO: renamed from: qx1$a$a, reason: collision with other inner class name */
        public static final class C0480a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ RobotInvestmentPart e;

            public C0480a(KN kn, RobotInvestmentPart robotInvestmentPart) {
                this.e = robotInvestmentPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                AbstractC7721xy abstractC7721xy = (AbstractC7721xy) obj;
                if (abstractC7721xy instanceof AbstractC7721xy.b) {
                    RobotInvestmentPart robotInvestmentPart = this.e;
                    InterfaceC2124Tz0 interfaceC2124Tz0 = robotInvestmentPart.n;
                    ArrayList arrayList = ((AbstractC7721xy.b) abstractC7721xy).a;
                    Object obj2 = robotInvestmentPart.i;
                    Intrinsics.checkNotNull(obj2);
                    C1259Ix1 c1259Ix1 = (C1259Ix1) obj2;
                    List<SZ1> listA = c1259Ix1.o.a();
                    C1804Pw1 c1804Pw1 = c1259Ix1.h;
                    C5653o60 c5653o60 = c1804Pw1.c.l;
                    if (((Boolean) c1804Pw1.d.getValue()).booleanValue()) {
                        listA = c5653o60;
                    }
                    interfaceC2124Tz0.c(arrayList, listA);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, RobotInvestmentPart robotInvestmentPart) {
            super(2, jm);
            this.g = fp1;
            this.h = robotInvestmentPart;
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
                C0480a c0480a = new C0480a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0480a, this) == mn) {
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
    public C6250qx1(FP0 fp0, FP1 fp1, JM jm, RobotInvestmentPart robotInvestmentPart) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = robotInvestmentPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6250qx1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6250qx1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

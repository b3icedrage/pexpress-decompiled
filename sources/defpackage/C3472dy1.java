package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsPart$initObservers$lambda$11$$inlined$launchAndCollectIn$default$3", f = "RobotOptionsPart.kt", l = {48}, m = "invokeSuspend")
public final class C3472dy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ C1334Jw1 h;
    public final /* synthetic */ RobotOptionsPart i;

    /* JADX INFO: renamed from: dy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsPart$initObservers$lambda$11$$inlined$launchAndCollectIn$default$3$1", f = "RobotOptionsPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ C1334Jw1 h;
        public final /* synthetic */ RobotOptionsPart i;

        /* JADX INFO: renamed from: dy1$a$a, reason: collision with other inner class name */
        public static final class C0343a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C1334Jw1 e;
            public final /* synthetic */ RobotOptionsPart g;

            public C0343a(KN kn, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
                this.e = c1334Jw1;
                this.g = robotOptionsPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C1334Jw1 c1334Jw1 = this.e;
                c1334Jw1.g.setStrokeWidth(zBooleanValue ? (int) this.g.getResources().getDimension(R.dimen.card_stroke_width) : 0);
                c1334Jw1.g.requestLayout();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = c1334Jw1;
            this.i = robotOptionsPart;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i);
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
                C0343a c0343a = new C0343a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0343a, this) == mn) {
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
    public C3472dy1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = c1334Jw1;
        this.i = robotOptionsPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3472dy1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3472dy1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i);
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

package defpackage;

import android.content.Context;
import android.widget.EditText;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.robot.robot.options.screens.RobotOptionsPart;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsPart$initObservers$lambda$11$$inlined$launchAndCollectIn$default$6", f = "RobotOptionsPart.kt", l = {48}, m = "invokeSuspend")
public final class C4102gy1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C5561ng0 g;
    public final /* synthetic */ C1334Jw1 h;
    public final /* synthetic */ RobotOptionsPart i;

    /* JADX INFO: renamed from: gy1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.options.screens.RobotOptionsPart$initObservers$lambda$11$$inlined$launchAndCollectIn$default$6$1", f = "RobotOptionsPart.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C5561ng0 g;
        public final /* synthetic */ C1334Jw1 h;
        public final /* synthetic */ RobotOptionsPart i;

        /* JADX INFO: renamed from: gy1$a$a, reason: collision with other inner class name */
        public static final class C0365a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ C1334Jw1 e;
            public final /* synthetic */ RobotOptionsPart g;

            public C0365a(KN kn, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
                this.e = c1334Jw1;
                this.g = robotOptionsPart;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                int iOrdinal = ((E32) obj).ordinal();
                EditText amountValueEditText = this.e.h;
                if (iOrdinal == 0) {
                    Intrinsics.checkNotNullExpressionValue(amountValueEditText, "amountValueEditText");
                    Context contextRequireContext = this.g.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    C1874Qu.t(amountValueEditText, contextRequireContext);
                } else if (iOrdinal == 3) {
                    Intrinsics.checkNotNullExpressionValue(amountValueEditText, "amountValueEditText");
                    Intrinsics.checkNotNullParameter(amountValueEditText, "<this>");
                    amountValueEditText.clearFocus();
                    amountValueEditText.setClickable(true);
                    amountValueEditText.setFocusable(false);
                    amountValueEditText.setFocusableInTouchMode(false);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5561ng0 c5561ng0, JM jm, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
            super(2, jm);
            this.g = c5561ng0;
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
                C0365a c0365a = new C0365a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0365a, this) == mn) {
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
    public C4102gy1(FP0 fp0, C5561ng0 c5561ng0, JM jm, C1334Jw1 c1334Jw1, RobotOptionsPart robotOptionsPart) {
        super(2, jm);
        this.e = fp0;
        this.g = c5561ng0;
        this.h = c1334Jw1;
        this.i = robotOptionsPart;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4102gy1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4102gy1) create(kn, jm)).invokeSuspend(Unit.a);
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

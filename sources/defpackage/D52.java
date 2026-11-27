package defpackage;

import android.widget.ImageView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "TutorialFragment.kt", l = {48}, m = "invokeSuspend")
public final class D52 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C1912Rg1 g;
    public final /* synthetic */ TutorialFragment h;

    @InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "TutorialFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1912Rg1 g;
        public final /* synthetic */ TutorialFragment h;

        /* JADX INFO: renamed from: D52$a$a, reason: collision with other inner class name */
        public static final class C0014a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ TutorialFragment e;

            public C0014a(KN kn, TutorialFragment tutorialFragment) {
                this.e = tutorialFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                G52 g52 = (G52) obj;
                TutorialFragment tutorialFragment = this.e;
                C1839Qi0 c1839Qi0K = tutorialFragment.k();
                c1839Qi0K.i.setCurrentItem(g52.a);
                if (g52.c) {
                    ImageView tutorialBackButton = tutorialFragment.k().g;
                    Intrinsics.checkNotNullExpressionValue(tutorialBackButton, "tutorialBackButton");
                    C7644xc.e(tutorialBackButton, TutorialFragment.l);
                } else {
                    ImageView tutorialBackButton2 = tutorialFragment.k().g;
                    Intrinsics.checkNotNullExpressionValue(tutorialBackButton2, "tutorialBackButton");
                    C7644xc.c(4, TutorialFragment.l, tutorialBackButton2);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1912Rg1 c1912Rg1, JM jm, TutorialFragment tutorialFragment) {
            super(2, jm);
            this.g = c1912Rg1;
            this.h = tutorialFragment;
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
                C0014a c0014a = new C0014a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0014a, this) == mn) {
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
    public D52(FP0 fp0, C1912Rg1 c1912Rg1, JM jm, TutorialFragment tutorialFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = c1912Rg1;
        this.h = tutorialFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new D52(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((D52) create(kn, jm)).invokeSuspend(Unit.a);
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

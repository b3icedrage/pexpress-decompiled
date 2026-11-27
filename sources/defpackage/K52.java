package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.airbnb.lottie.LottieAnimationView;
import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase$initObservers$$inlined$launchAndCollectIn$default$2", f = "TutorialPageFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class K52 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C6400rg0 g;
    public final /* synthetic */ TutorialPageFragmentBase h;

    @InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase$initObservers$$inlined$launchAndCollectIn$default$2$1", f = "TutorialPageFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C6400rg0 g;
        public final /* synthetic */ TutorialPageFragmentBase h;

        /* JADX INFO: renamed from: K52$a$a, reason: collision with other inner class name */
        public static final class C0073a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ TutorialPageFragmentBase e;

            public C0073a(KN kn, TutorialPageFragmentBase tutorialPageFragmentBase) {
                this.e = tutorialPageFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                LottieAnimationView lottieAnimationView = this.e.k().e;
                lottieAnimationView.p = false;
                lottieAnimationView.l.k();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6400rg0 c6400rg0, JM jm, TutorialPageFragmentBase tutorialPageFragmentBase) {
            super(2, jm);
            this.g = c6400rg0;
            this.h = tutorialPageFragmentBase;
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
                C0073a c0073a = new C0073a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0073a, this) == mn) {
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
    public K52(FP0 fp0, C6400rg0 c6400rg0, JM jm, TutorialPageFragmentBase tutorialPageFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = c6400rg0;
        this.h = tutorialPageFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new K52(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((K52) create(kn, jm)).invokeSuspend(Unit.a);
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

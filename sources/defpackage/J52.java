package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.airbnb.lottie.LottieAnimationView;
import com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase$initObservers$$inlined$launchAndCollectIn$default$1", f = "TutorialPageFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class J52 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C5981pg0 g;
    public final /* synthetic */ TutorialPageFragmentBase h;

    @InterfaceC3368dU(c = "com.base.feature.onboarding.screens.tutorial.TutorialPageFragmentBase$initObservers$$inlined$launchAndCollectIn$default$1$1", f = "TutorialPageFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C5981pg0 g;
        public final /* synthetic */ TutorialPageFragmentBase h;

        /* JADX INFO: renamed from: J52$a$a, reason: collision with other inner class name */
        public static final class C0058a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ TutorialPageFragmentBase e;

            public C0058a(KN kn, TutorialPageFragmentBase tutorialPageFragmentBase) {
                this.e = tutorialPageFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                G52 g52 = (G52) obj;
                C1917Ri0 c1917Ri0K = this.e.k();
                boolean z = g52.b;
                LottieAnimationView tutorialImage = c1917Ri0K.e;
                LottieAnimationView.c cVar = LottieAnimationView.c.j;
                DU0 du0 = tutorialImage.l;
                HashSet hashSet = tutorialImage.r;
                int i = g52.d;
                if (z) {
                    Intrinsics.checkNotNullExpressionValue(tutorialImage, "tutorialImage");
                    tutorialImage.setAnimation(i);
                    tutorialImage.setRepeatCount(-1);
                    hashSet.add(cVar);
                    du0.n();
                } else {
                    Intrinsics.checkNotNullExpressionValue(tutorialImage, "tutorialImage");
                    tutorialImage.setAnimation(i);
                    hashSet.add(cVar);
                    du0.n();
                }
                c1917Ri0K.h.setText(g52.e);
                c1917Ri0K.g.setText("");
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5981pg0 c5981pg0, JM jm, TutorialPageFragmentBase tutorialPageFragmentBase) {
            super(2, jm);
            this.g = c5981pg0;
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
                C0058a c0058a = new C0058a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0058a, this) == mn) {
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
    public J52(FP0 fp0, C5981pg0 c5981pg0, JM jm, TutorialPageFragmentBase tutorialPageFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = c5981pg0;
        this.h = tutorialPageFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new J52(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((J52) create(kn, jm)).invokeSuspend(Unit.a);
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

package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.activation.screens.action_button.ActivationActionButtonFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.action_button.ActivationActionButtonFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "ActivationActionButtonFragment.kt", l = {48}, m = "invokeSuspend")
public final class E5 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ I5.a g;
    public final /* synthetic */ ActivationActionButtonFragment h;

    @InterfaceC3368dU(c = "com.base.feature.activation.screens.action_button.ActivationActionButtonFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "ActivationActionButtonFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ I5.a g;
        public final /* synthetic */ ActivationActionButtonFragment h;

        /* JADX INFO: renamed from: E5$a$a, reason: collision with other inner class name */
        public static final class C0020a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ActivationActionButtonFragment e;

            public C0020a(KN kn, ActivationActionButtonFragment activationActionButtonFragment) {
                this.e = activationActionButtonFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ActivationActionButtonFragment activationActionButtonFragment = this.e;
                G5 g5 = (G5) activationActionButtonFragment.k();
                g5.d.setText(activationActionButtonFragment.getString(((C1643Nv) obj).a));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I5.a aVar, JM jm, ActivationActionButtonFragment activationActionButtonFragment) {
            super(2, jm);
            this.g = aVar;
            this.h = activationActionButtonFragment;
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
                C0020a c0020a = new C0020a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0020a, this) == mn) {
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
    public E5(FP0 fp0, I5.a aVar, JM jm, ActivationActionButtonFragment activationActionButtonFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = aVar;
        this.h = activationActionButtonFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new E5(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((E5) create(kn, jm)).invokeSuspend(Unit.a);
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

package defpackage;

import android.content.res.ColorStateList;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.activation.screens.reregister.ReRegistrationFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$1", f = "ReRegistrationFragment.kt", l = {48}, m = "invokeSuspend")
public final class C3440dn1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ ReRegistrationFragment h;

    /* JADX INFO: renamed from: dn1$a */
    @InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$1$1", f = "ReRegistrationFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ ReRegistrationFragment h;

        /* JADX INFO: renamed from: dn1$a$a, reason: collision with other inner class name */
        public static final class C0341a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ReRegistrationFragment e;

            public C0341a(KN kn, ReRegistrationFragment reRegistrationFragment) {
                this.e = reRegistrationFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zA = Intrinsics.a((AbstractC0961Fc0) obj, Jc2.a);
                ReRegistrationFragment reRegistrationFragment = this.e;
                if (zA) {
                    reRegistrationFragment.getClass();
                    ((ReRegistrationFragmentImpl) reRegistrationFragment).t.t().setButtonTintList(null);
                } else {
                    reRegistrationFragment.o.getClass();
                    ((ReRegistrationFragmentImpl) reRegistrationFragment).t.t().setButtonTintList(ColorStateList.valueOf(C8056za.i(reRegistrationFragment, R.color.error)));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, ReRegistrationFragment reRegistrationFragment) {
            super(2, jm);
            this.g = fp1;
            this.h = reRegistrationFragment;
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
                C0341a c0341a = new C0341a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0341a, this) == mn) {
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
    public C3440dn1(FP0 fp0, FP1 fp1, JM jm, ReRegistrationFragment reRegistrationFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = reRegistrationFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3440dn1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3440dn1) create(kn, jm)).invokeSuspend(Unit.a);
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

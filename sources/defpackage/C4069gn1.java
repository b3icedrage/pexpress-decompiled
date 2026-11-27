package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.activation.screens.reregister.ReRegistrationFragment;
import com.google.android.material.button.MaterialButton;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$4", f = "ReRegistrationFragment.kt", l = {48}, m = "invokeSuspend")
public final class C4069gn1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C6610sg0 g;
    public final /* synthetic */ ReRegistrationFragment h;

    /* JADX INFO: renamed from: gn1$a */
    @InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$4$1", f = "ReRegistrationFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C6610sg0 g;
        public final /* synthetic */ ReRegistrationFragment h;

        /* JADX INFO: renamed from: gn1$a$a, reason: collision with other inner class name */
        public static final class C0363a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ReRegistrationFragment e;

            public C0363a(KN kn, ReRegistrationFragment reRegistrationFragment) {
                this.e = reRegistrationFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MaterialButton materialButtonM = ((ReRegistrationFragmentImpl) this.e).t.M();
                boolean z = !zBooleanValue;
                Intrinsics.checkNotNullParameter(materialButtonM, "<this>");
                Intrinsics.checkNotNullParameter(materialButtonM, "<this>");
                materialButtonM.setAlpha(!zBooleanValue ? 1.0f : 0.5f);
                materialButtonM.setEnabled(z);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6610sg0 c6610sg0, JM jm, ReRegistrationFragment reRegistrationFragment) {
            super(2, jm);
            this.g = c6610sg0;
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
                C0363a c0363a = new C0363a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0363a, this) == mn) {
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
    public C4069gn1(FP0 fp0, C6610sg0 c6610sg0, JM jm, ReRegistrationFragment reRegistrationFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = c6610sg0;
        this.h = reRegistrationFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4069gn1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4069gn1) create(kn, jm)).invokeSuspend(Unit.a);
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

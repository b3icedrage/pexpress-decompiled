package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.activation.screens.reregister.ReRegistrationFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$3", f = "ReRegistrationFragment.kt", l = {48}, m = "invokeSuspend")
public final class C3859fn1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ ReRegistrationFragment h;

    /* JADX INFO: renamed from: fn1$a */
    @InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationFragment$initFlowCollectors$lambda$10$$inlined$launchAndCollectIn$default$3$1", f = "ReRegistrationFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ ReRegistrationFragment h;

        /* JADX INFO: renamed from: fn1$a$a, reason: collision with other inner class name */
        public static final class C0353a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ReRegistrationFragment e;

            public C0353a(KN kn, ReRegistrationFragment reRegistrationFragment) {
                this.e = reRegistrationFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ReRegistrationFragment reRegistrationFragment = this.e;
                String string = reRegistrationFragment.getString(R.string.banner_successful_registration, reRegistrationFragment.o.d());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C8056za.s(reRegistrationFragment, string, null, 60);
                C3296d7 c3296d7 = reRegistrationFragment.p;
                c3296d7.a = null;
                c3296d7.a();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, ReRegistrationFragment reRegistrationFragment) {
            super(2, jm);
            this.g = interfaceC5910pK1;
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
                C0353a c0353a = new C0353a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0353a, this) == mn) {
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
    public C3859fn1(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, ReRegistrationFragment reRegistrationFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = reRegistrationFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3859fn1(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3859fn1) create(kn, jm)).invokeSuspend(Unit.a);
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

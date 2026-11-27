package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.library.registration.screens.email.EmailFieldFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.library.registration.screens.email.EmailFieldFragment$initFlowCollectors$lambda$7$$inlined$launchAndCollectIn$default$1", f = "EmailFieldFragment.kt", l = {48}, m = "invokeSuspend")
public final class C50 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ EmailFieldFragment h;

    @InterfaceC3368dU(c = "com.api.library.registration.screens.email.EmailFieldFragment$initFlowCollectors$lambda$7$$inlined$launchAndCollectIn$default$1$1", f = "EmailFieldFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ EmailFieldFragment h;

        /* JADX INFO: renamed from: C50$a$a, reason: collision with other inner class name */
        public static final class C0008a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ EmailFieldFragment e;

            public C0008a(KN kn, EmailFieldFragment emailFieldFragment) {
                this.e = emailFieldFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                AbstractC0961Fc0 abstractC0961Fc0 = (AbstractC0961Fc0) obj;
                boolean zA = Intrinsics.a(abstractC0961Fc0, Jc2.a);
                EmailFieldFragment emailFieldFragment = this.e;
                if (zA) {
                    A50 a50 = emailFieldFragment.j;
                    emailFieldFragment.l(a50.X(), a50.U());
                } else {
                    if (!(abstractC0961Fc0 instanceof L51)) {
                        throw new C6489s51();
                    }
                    emailFieldFragment.s(((L51) abstractC0961Fc0).a);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, EmailFieldFragment emailFieldFragment) {
            super(2, jm);
            this.g = fp1;
            this.h = emailFieldFragment;
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
                C0008a c0008a = new C0008a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0008a, this) == mn) {
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
    public C50(FP0 fp0, FP1 fp1, JM jm, EmailFieldFragment emailFieldFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = emailFieldFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C50(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C50) create(kn, jm)).invokeSuspend(Unit.a);
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

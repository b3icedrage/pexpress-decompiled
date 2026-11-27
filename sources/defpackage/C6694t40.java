package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: t40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$1", f = "DuoAuthFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C6694t40 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ DuoAuthFragmentBase h;

    /* JADX INFO: renamed from: t40$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$1$1", f = "DuoAuthFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ DuoAuthFragmentBase h;

        /* JADX INFO: renamed from: t40$a$a, reason: collision with other inner class name */
        public static final class C0493a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ DuoAuthFragmentBase e;

            public C0493a(KN kn, DuoAuthFragmentBase duoAuthFragmentBase) {
                this.e = duoAuthFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C1874Qu.s(this.e.j.R(), (String) obj);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
            super(2, jm);
            this.g = fp1;
            this.h = duoAuthFragmentBase;
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
                C0493a c0493a = new C0493a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0493a, this) == mn) {
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
    public C6694t40(FP0 fp0, FP1 fp1, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = duoAuthFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6694t40(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6694t40) create(kn, jm)).invokeSuspend(Unit.a);
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

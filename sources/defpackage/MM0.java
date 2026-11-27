package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase$initObservers$lambda$4$$inlined$launchAndCollectIn$1", f = "LaunchAppFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class MM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC3487e21 g;
    public final /* synthetic */ LaunchAppFragmentImpl h;

    @InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase$initObservers$lambda$4$$inlined$launchAndCollectIn$1$1", f = "LaunchAppFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC3487e21 g;
        public final /* synthetic */ LaunchAppFragmentImpl h;

        /* JADX INFO: renamed from: MM0$a$a, reason: collision with other inner class name */
        public static final class C0094a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ LaunchAppFragmentImpl e;

            public C0094a(KN kn, LaunchAppFragmentImpl launchAppFragmentImpl) {
                this.e = launchAppFragmentImpl;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                int iOrdinal = ((I41) obj).ordinal();
                InterfaceC2394Xb0 interfaceC2394Xb0 = this.e.k;
                if (iOrdinal == 0) {
                    interfaceC2394Xb0.a();
                } else if (iOrdinal == 1) {
                    interfaceC2394Xb0.d();
                } else if (iOrdinal == 2) {
                    interfaceC2394Xb0.c();
                } else if (iOrdinal == 3) {
                    interfaceC2394Xb0.e();
                } else if (iOrdinal == 4) {
                    interfaceC2394Xb0.b();
                } else {
                    if (iOrdinal != 5) {
                        throw new C6489s51();
                    }
                    interfaceC2394Xb0.f();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3487e21 interfaceC3487e21, JM jm, LaunchAppFragmentImpl launchAppFragmentImpl) {
            super(2, jm);
            this.g = interfaceC3487e21;
            this.h = launchAppFragmentImpl;
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
                C0094a c0094a = new C0094a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0094a, this) == mn) {
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
    public MM0(FP0 fp0, InterfaceC3487e21 interfaceC3487e21, JM jm, LaunchAppFragmentImpl launchAppFragmentImpl) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC3487e21;
        this.h = launchAppFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new MM0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((MM0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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

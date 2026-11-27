package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl$initObservers$$inlined$launchAndCollectIn$default$2", f = "LaunchAppFragmentImpl.kt", l = {48}, m = "invokeSuspend")
public final class QM0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ LaunchAppFragmentImpl h;

    @InterfaceC3368dU(c = "com.impl.feature.launchapp.screens.launchapp.LaunchAppFragmentImpl$initObservers$$inlined$launchAndCollectIn$default$2$1", f = "LaunchAppFragmentImpl.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ LaunchAppFragmentImpl h;

        /* JADX INFO: renamed from: QM0$a$a, reason: collision with other inner class name */
        public static final class C0131a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ LaunchAppFragmentImpl e;

            public C0131a(KN kn, LaunchAppFragmentImpl launchAppFragmentImpl) {
                this.e = launchAppFragmentImpl;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                this.e.o.Q().setText(((Number) obj).intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, LaunchAppFragmentImpl launchAppFragmentImpl) {
            super(2, jm);
            this.g = interfaceC5910pK1;
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
                C0131a c0131a = new C0131a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0131a, this) == mn) {
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
    public QM0(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, LaunchAppFragmentImpl launchAppFragmentImpl) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = launchAppFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new QM0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((QM0) create(kn, jm)).invokeSuspend(Unit.a);
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

package defpackage;

import android.widget.FrameLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.stub.screens.stubgame.StubGameFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$2", f = "StubGameFragment.kt", l = {48}, m = "invokeSuspend")
public final class C2724aT1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ StubGameFragment h;
    public final /* synthetic */ C3576eT1 i;

    /* JADX INFO: renamed from: aT1$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$2$1", f = "StubGameFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ StubGameFragment h;
        public final /* synthetic */ C3576eT1 i;

        /* JADX INFO: renamed from: aT1$a$a, reason: collision with other inner class name */
        public static final class C0215a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ StubGameFragment e;
            public final /* synthetic */ C3576eT1 g;

            public C0215a(KN kn, StubGameFragment stubGameFragment, C3576eT1 c3576eT1) {
                this.e = stubGameFragment;
                this.g = c3576eT1;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                TS1 ts1 = (TS1) obj;
                boolean z = ts1 instanceof TS1.b;
                FrameLayout stubGameSnackbarAnchor = this.g.j;
                StubGameFragment stubGameFragment = this.e;
                if (z) {
                    InterfaceC7172vL1 interfaceC7172vL1 = stubGameFragment.n;
                    Intrinsics.checkNotNullExpressionValue(stubGameSnackbarAnchor, "stubGameSnackbarAnchor");
                    interfaceC7172vL1.a(stubGameSnackbarAnchor, StubGameFragment.l(stubGameFragment, Math.abs(ts1.a)));
                } else {
                    InterfaceC7172vL1 interfaceC7172vL2 = stubGameFragment.n;
                    Intrinsics.checkNotNullExpressionValue(stubGameSnackbarAnchor, "stubGameSnackbarAnchor");
                    interfaceC7172vL2.b(stubGameSnackbarAnchor, StubGameFragment.l(stubGameFragment, Math.abs(ts1.a)));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, StubGameFragment stubGameFragment, C3576eT1 c3576eT1) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = stubGameFragment;
            this.i = c3576eT1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h, this.i);
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
                C0215a c0215a = new C0215a((KN) this.e, this.h, this.i);
                this.d = 1;
                if (this.g.c(c0215a, this) == mn) {
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
    public C2724aT1(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, StubGameFragment stubGameFragment, C3576eT1 c3576eT1) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = stubGameFragment;
        this.i = c3576eT1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2724aT1(this.e, this.g, jm, this.h, this.i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2724aT1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h, this.i);
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

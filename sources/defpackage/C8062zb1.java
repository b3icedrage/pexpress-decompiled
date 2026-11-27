package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: zb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8062zb1 extends OP1<C0881Eb1> implements InterfaceC7011ub1 {

    @NotNull
    public final Handler f;

    @NotNull
    public final RunnableC7221vb1 g;
    public int h;

    /* JADX INFO: renamed from: zb1$a */
    public static final class a extends ML0 implements Function1<OP1.a<C0881Eb1>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C0881Eb1> aVar) {
            OP1.a<C0881Eb1> updateStateInDispatchingThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInDispatchingThread, "$this$updateStateInDispatchingThread");
            updateStateInDispatchingThread.getClass();
            C7432wb1 call = C7432wb1.d;
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInDispatchingThread.b = call;
            updateStateInDispatchingThread.a(C7642xb1.d);
            C7852yb1 call2 = new C7852yb1(C8062zb1.this);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInDispatchingThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: zb1$b */
    public static final class b extends ML0 implements Function1<OP1.a<C0881Eb1>, Unit> {
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C0881Eb1> aVar) {
            OP1.a<C0881Eb1> updateStateInDispatchingThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInDispatchingThread, "$this$updateStateInDispatchingThread");
            boolean z = this.d;
            C0569Ab1 call = new C0569Ab1(z);
            updateStateInDispatchingThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInDispatchingThread.b = call;
            C0647Bb1 call2 = new C0647Bb1(z);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInDispatchingThread.c = call2;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8062zb1(@NotNull InterfaceC5889pD1 schedulers) {
        super(schedulers, "Pagination", new C0881Eb1(false, false));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.f = new Handler(Looper.getMainLooper());
        this.g = new RunnableC7221vb1(this, 0);
    }

    @Override // defpackage.InterfaceC7011ub1
    public final void D(boolean z) {
        P(new b(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC7011ub1
    @NotNull
    public final C0881Eb1 getState() {
        return (C0881Eb1) this.d;
    }

    @Override // defpackage.InterfaceC7011ub1
    public final void j() {
        P(new a());
    }

    @Override // defpackage.InterfaceC7011ub1
    public final void s() {
        RunnableC3237cq runnable = new RunnableC3237cq(this, 1);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.c.execute(runnable);
    }
}

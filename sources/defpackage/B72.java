package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class B72 extends OP1<F72> implements InterfaceC7759y72 {

    @NotNull
    public final HashMap f;

    public static final class a extends ML0 implements Function1<OP1.a<F72>, Unit> {
        public final /* synthetic */ long e;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, String str) {
            super(1);
            this.e = j;
            this.g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<F72> aVar) {
            OP1.a<F72> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            String str = this.g;
            B72 b72 = B72.this;
            long j = this.e;
            C7969z72 call = new C7969z72(b72, j, str);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            A72 call2 = new A72(b72, j);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function1<OP1.a<F72>, Unit> {
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(1);
            this.e = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<F72> aVar) {
            OP1.a<F72> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C72 call = new C72(B72.this, this.e);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B72(@NotNull InterfaceC5889pD1 schedulers) {
        super(schedulers, "Typing", new F72(0));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.f = new HashMap();
    }

    @Override // defpackage.InterfaceC7759y72
    @NotNull
    public final KP1<F72> a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC7759y72
    public final void p(@NotNull String insight, long j) {
        Intrinsics.checkNotNullParameter(insight, "insight");
        Q(0L, new a(j, insight));
    }

    @Override // defpackage.InterfaceC7759y72
    public final void v(long j) {
        Q(0L, new b(j));
    }
}

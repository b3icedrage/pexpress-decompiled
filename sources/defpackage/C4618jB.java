package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4618jB extends OP1<C3730fB> implements InterfaceC3940gB {

    @NotNull
    public final EK1 f;

    /* JADX INFO: renamed from: jB$a */
    public static final class a extends ML0 implements Function1<OP1.a<C3730fB>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3730fB> aVar) {
            OP1.a<C3730fB> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            updateStateInRepositoryThread.a(C4150hB.d);
            C4360iB call = new C4360iB(C4618jB.this);
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.d = call;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: jB$b */
    public static final class b extends ML0 implements Function1<OP1.a<C3730fB>, Unit> {
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C3730fB> aVar) {
            OP1.a<C3730fB> updateStateInDispatchingThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInDispatchingThread, "$this$updateStateInDispatchingThread");
            C4828kB call = new C4828kB(this.d);
            updateStateInDispatchingThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInDispatchingThread.c = call;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4618jB(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage) {
        super(schedulers, "ChatState", new C3730fB(1, C0957Fb.e(storage.a()), C0957Fb.e(storage.a())));
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.f = storage;
    }

    @Override // defpackage.InterfaceC3940gB
    public final void E() {
        Q(0L, new a());
    }

    @Override // defpackage.InterfaceC3940gB
    @NotNull
    public final KP1<C3730fB> a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC3940gB
    @NotNull
    public final C3730fB getState() {
        return (C3730fB) this.d;
    }

    @Override // defpackage.InterfaceC3940gB
    public final void x(boolean z) {
        P(new b(z));
    }
}

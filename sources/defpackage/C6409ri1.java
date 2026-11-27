package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ri1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6409ri1 extends OP1<C6619si1> implements InterfaceC5570ni1 {

    @NotNull
    public final EK1 f;

    /* JADX INFO: renamed from: ri1$a */
    public static final class a extends ML0 implements Function1<OP1.a<C6619si1>, Unit> {
        public final /* synthetic */ String d;
        public final /* synthetic */ C6409ri1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, C6409ri1 c6409ri1) {
            super(1);
            this.d = str;
            this.e = c6409ri1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C6619si1> aVar) {
            OP1.a<C6619si1> updateStateInDispatchingThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInDispatchingThread, "$this$updateStateInDispatchingThread");
            String str = this.d;
            C5780oi1 call = new C5780oi1(str);
            updateStateInDispatchingThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInDispatchingThread.b = call;
            C5990pi1 call2 = new C5990pi1(str);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInDispatchingThread.c = call2;
            C6200qi1 call3 = new C6200qi1(this.e);
            Intrinsics.checkNotNullParameter(call3, "call");
            updateStateInDispatchingThread.d = call3;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6409ri1(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage) {
        super(schedulers, "Profile", new C6619si1((String) storage.b.a(EK1.z[1], storage)));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        storage.getClass();
        this.f = storage;
    }

    @Override // defpackage.InterfaceC5570ni1
    @NotNull
    public final KP1<C6619si1> a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5570ni1
    @NotNull
    public final String getId() {
        return ((C6619si1) this.d).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5570ni1
    public final boolean l(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Intrinsics.a(((C6619si1) this.d).a, id);
    }

    @Override // defpackage.InterfaceC5570ni1
    public final void setId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        P(new a(id, this));
    }
}

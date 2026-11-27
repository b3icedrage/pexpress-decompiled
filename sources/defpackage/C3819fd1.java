package defpackage;

import com.jivosite.sdk.model.pojo.message.ClientMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3819fd1 extends OP1<C4449id1> implements InterfaceC3190cd1 {

    @NotNull
    public final EK1 f;

    @NotNull
    public final C3903g11 g;

    /* JADX INFO: renamed from: fd1$a */
    public static final class a extends ML0 implements Function1<OP1.a<C4449id1>, Unit> {
        public final /* synthetic */ ClientMessage d;
        public final /* synthetic */ C3819fd1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3819fd1 c3819fd1, ClientMessage clientMessage) {
            super(1);
            this.d = clientMessage;
            this.e = c3819fd1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C4449id1> aVar) {
            OP1.a<C4449id1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            ClientMessage clientMessage = this.d;
            C3400dd1 call = new C3400dd1(clientMessage);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            C3609ed1 call2 = new C3609ed1(this.e, clientMessage);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: fd1$b */
    public static final class b extends ML0 implements Function1<OP1.a<C4449id1>, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<C4449id1> aVar) {
            OP1.a<C4449id1> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            updateStateInRepositoryThread.a(C4029gd1.d);
            C4239hd1 call = new C4239hd1(C3819fd1.this);
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.d = call;
            return Unit.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3819fd1(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        storage.getClass();
        String str = (String) storage.q.a(EK1.z[19], storage);
        super(schedulers, "Pending", new C4449id1((ClientMessage) (!StringsKt.I(str) ? moshi.a(ClientMessage.class).b(str) : null)));
        this.f = storage;
        this.g = moshi;
    }

    @Override // defpackage.InterfaceC3190cd1
    @NotNull
    public final KP1<C4449id1> a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC3190cd1
    public final void b(@NotNull ClientMessage clientMessage) {
        Intrinsics.checkNotNullParameter(clientMessage, "clientMessage");
        Q(0L, new a(this, clientMessage));
    }

    @Override // defpackage.InterfaceC3190cd1
    public final void z() {
        Q(0L, new b());
    }
}

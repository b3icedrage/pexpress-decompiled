package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class KM implements InterfaceC1727Ox, Function1<Throwable, Unit> {
    public final InterfaceC1023Fx d;
    public final C6251qy e;

    public KM(@NotNull InterfaceC1023Fx call, @NotNull C6251qy continuation) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.d = call;
        this.e = continuation;
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void a(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        C1717Ot1.a aVar = C1717Ot1.e;
        this.e.resumeWith(response);
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void b(@NotNull InterfaceC1023Fx call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        if (call.q()) {
            return;
        }
        C1717Ot1.a aVar = C1717Ot1.e;
        this.e.resumeWith(C1795Pt1.a(e));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        try {
            this.d.cancel();
        } catch (Throwable unused) {
        }
        return Unit.a;
    }
}

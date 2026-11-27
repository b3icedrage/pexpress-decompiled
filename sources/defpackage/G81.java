package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class G81 extends G1 {
    public final C2915bI1 e;

    public G81() {
        C2915bI1 c2915bI1 = new C2915bI1(new C2158Uk1());
        Intrinsics.checkNotNullExpressionValue(c2915bI1, "PublishProcessor.create<…t.Event>().toSerialized()");
        this.e = c2915bI1;
    }

    @Override // defpackage.G1
    public final void l(@NotNull C7483wo1 webSocket, int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.e.d(new Pf2.a.C0116a(new FL1(i, reason)));
    }

    @Override // defpackage.G1
    public final void m(@NotNull C7483wo1 webSocket, int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.e.d(new Pf2.a.b(new FL1(i, reason)));
    }

    @Override // defpackage.G1
    public final void n(@NotNull C7483wo1 webSocket, @NotNull Exception t, @Nullable C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
        this.e.d(new Pf2.a.c(t));
    }

    @Override // defpackage.G1
    public final void q(@NotNull C7483wo1 webSocket, @NotNull C1802Pw bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.e.d(new Pf2.a.e(new AbstractC6583sZ0.a(bytes.p())));
    }

    @Override // defpackage.G1
    public final void r(@NotNull C7483wo1 webSocket, @NotNull String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        this.e.d(new Pf2.a.e(new AbstractC6583sZ0.b(text)));
    }

    @Override // defpackage.G1
    public final void s(@NotNull Qf2 webSocket, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.e.d(new Pf2.a.d(webSocket));
    }
}

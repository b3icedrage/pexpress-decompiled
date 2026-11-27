package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: s81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6501s81 implements InterfaceC1727Ox {

    @NotNull
    public final C3241cr0 d;

    @NotNull
    public final C6251qy e;

    public C6501s81(@NotNull C3241cr0 requestData, @NotNull C6251qy continuation) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.d = requestData;
        this.e = continuation;
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void a(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (call.q()) {
            return;
        }
        C1717Ot1.a aVar = C1717Ot1.e;
        this.e.resumeWith(response);
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void b(@NotNull InterfaceC1023Fx call, @NotNull IOException e) {
        Throwable c6324rJ;
        Object obj;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        C6251qy c6251qy = this.e;
        c6251qy.getClass();
        if (C6251qy.k.get(c6251qy) instanceof C7511wy) {
            return;
        }
        C1717Ot1.a aVar = C1717Ot1.e;
        if (e instanceof VR1) {
            c6324rJ = e.getCause();
            if (c6324rJ != null) {
                e = c6324rJ;
            }
        } else if (e instanceof SocketTimeoutException) {
            String message = e.getMessage();
            C3241cr0 request = this.d;
            if (message == null || !StringsKt.C(message, "connect", true)) {
                e = C1162Hr0.a(request, e);
            } else {
                FS0 fs0 = C1162Hr0.a;
                Intrinsics.checkNotNullParameter(request, "request");
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append(request.a);
                sb.append(", connect_timeout=");
                C1006Fr0.b bVar = C1006Fr0.d;
                C1006Fr0.a aVar2 = (C1006Fr0.a) request.a();
                if (aVar2 == null || (obj = aVar2.b) == null) {
                    obj = "unknown";
                }
                c6324rJ = new C6324rJ(K1.a(sb, obj, " ms]"), e);
                e = c6324rJ;
            }
        }
        c6251qy.resumeWith(C1795Pt1.a(e));
    }
}

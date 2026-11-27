package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class GC1 extends C2250Vp0 {

    @NotNull
    public final byte[] j;
    public final boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GC1(@NotNull C1782Pp0 client, @NotNull InterfaceC2595Zq0 request, @NotNull AbstractC5391mr0 response, @NotNull byte[] responseBody) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.j = responseBody;
        HC1 hc1 = new HC1(this, request);
        Intrinsics.checkNotNullParameter(hc1, "<set-?>");
        this.e = hc1;
        IC1 ic1 = new IC1(this, responseBody, response);
        Intrinsics.checkNotNullParameter(ic1, "<set-?>");
        this.g = ic1;
        this.k = true;
    }

    @Override // defpackage.C2250Vp0
    public final boolean b() {
        return this.k;
    }

    @Override // defpackage.C2250Vp0
    @Nullable
    public final Object e() {
        return C7652xe.a(this.j);
    }
}

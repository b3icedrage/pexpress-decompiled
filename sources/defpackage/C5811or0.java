package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: or0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5811or0 {

    @NotNull
    public final C0850Dr0 a;

    @NotNull
    public final C4944kk0 b;

    @NotNull
    public final I81 c;

    @NotNull
    public final C2097Tq0 d;

    @NotNull
    public final Object e;

    @NotNull
    public final CoroutineContext f;

    @NotNull
    public final C4944kk0 g;

    public C5811or0(@NotNull C0850Dr0 statusCode, @NotNull C4944kk0 requestTime, @NotNull I81 headers, @NotNull C2097Tq0 version, @NotNull Object body, @NotNull CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(requestTime, "requestTime");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.a = statusCode;
        this.b = requestTime;
        this.c = headers;
        this.d = version;
        this.e = body;
        this.f = callContext;
        this.g = C6564sT.a(null);
    }

    @NotNull
    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.a + ')';
    }
}

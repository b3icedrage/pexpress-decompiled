package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5408mx {

    @Nullable
    public final C4543is1 a;

    @Nullable
    public final C0857Dt1 b;

    /* JADX INFO: renamed from: mx$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:24:0x0038  */
        public static boolean a(@NotNull C4543is1 request, @NotNull C0857Dt1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int i = response.h;
            if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
                if (i == 307) {
                    if (C0857Dt1.f(response, "Expires") == null && response.c().c == -1 && !response.c().f && !response.c().e) {
                        return false;
                    }
                } else if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (C0857Dt1.f(response, "Expires") == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (response.c().b) {
                return false;
            }
            C4307hx c4307hxA = request.f;
            if (c4307hxA == null) {
                C4307hx c4307hx = C4307hx.n;
                c4307hxA = C4307hx.b.a(request.c);
                request.f = c4307hxA;
            }
            return !c4307hxA.b;
        }
    }

    public C5408mx(@Nullable C4543is1 c4543is1, @Nullable C0857Dt1 c0857Dt1) {
        this.a = c4543is1;
        this.b = c0857Dt1;
    }
}

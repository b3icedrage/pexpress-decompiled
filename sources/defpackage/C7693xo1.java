package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7693xo1 implements InterfaceC1727Ox {
    public final /* synthetic */ C7483wo1 d;
    public final /* synthetic */ C4543is1 e;

    public C7693xo1(C7483wo1 c7483wo1, C4543is1 c4543is1) {
        this.d = c7483wo1;
        this.e = c4543is1;
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void a(@NotNull InterfaceC1023Fx call, @NotNull C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        K90 k90 = response.q;
        try {
            this.d.d(response, k90);
            Intrinsics.checkNotNull(k90);
            C3862fo1 c3862fo1B = k90.b();
            C2813ao0 responseHeaders = response.j;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            Integer intOrNull = null;
            Integer intOrNull2 = null;
            while (i2 < size) {
                if (d.i(responseHeaders.c(i2), "Sec-WebSocket-Extensions")) {
                    String strF = responseHeaders.f(i2);
                    int i3 = i;
                    while (i3 < strF.length()) {
                        C2813ao0 c2813ao0 = responseHeaders;
                        int iH = C6806tc2.h(strF, ',', i3, i, 4);
                        int iG = C6806tc2.g(strF, ';', i3, iH);
                        String strA = C6806tc2.A(i3, iG, strF);
                        int i4 = iG + 1;
                        if (d.i(strA, "permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            i3 = i4;
                            while (i3 < iH) {
                                int iG2 = C6806tc2.g(strF, ';', i3, iH);
                                int iG3 = C6806tc2.g(strF, '=', i3, iG2);
                                String strA2 = C6806tc2.A(i3, iG3, strF);
                                String strO = iG3 < iG2 ? StringsKt.O(C6806tc2.A(iG3 + 1, iG2, strF)) : null;
                                i3 = iG2 + 1;
                                if (d.i(strA2, "client_max_window_bits")) {
                                    if (intOrNull != null) {
                                        z4 = true;
                                    }
                                    intOrNull = strO != null ? StringsKt.toIntOrNull(strO) : null;
                                    if (intOrNull == null) {
                                        z4 = true;
                                    }
                                } else if (d.i(strA2, "client_no_context_takeover")) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strO != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else {
                                    if (d.i(strA2, "server_max_window_bits")) {
                                        if (intOrNull2 != null) {
                                            z4 = true;
                                        }
                                        intOrNull2 = strO != null ? StringsKt.toIntOrNull(strO) : null;
                                        if (intOrNull2 == null) {
                                        }
                                    } else if (d.i(strA2, "server_no_context_takeover")) {
                                        if (z3) {
                                            z4 = true;
                                        }
                                        if (strO != null) {
                                            z4 = true;
                                        }
                                        z3 = true;
                                    }
                                    z4 = true;
                                }
                            }
                            z = true;
                        } else {
                            i3 = i4;
                            z4 = true;
                        }
                        responseHeaders = c2813ao0;
                        i = 0;
                    }
                }
                i2++;
                responseHeaders = responseHeaders;
                i = 0;
            }
            this.d.d = new C6612sg2(z, intOrNull, z2, intOrNull2, z3, z4);
            if (z4 || intOrNull != null || (intOrNull2 != null && !new IntRange(8, 15, 1).e(intOrNull2.intValue()))) {
                C7483wo1 c7483wo1 = this.d;
                synchronized (c7483wo1) {
                    c7483wo1.o.clear();
                    c7483wo1.c(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.d.f(C6806tc2.g + " WebSocket " + this.e.a.h(), c3862fo1B);
                C7483wo1 c7483wo2 = this.d;
                c7483wo2.a.s(c7483wo2, response);
                this.d.g();
            } catch (Exception e) {
                this.d.e(e, null);
            }
        } catch (IOException e2) {
            this.d.e(e2, response);
            C6806tc2.d(response);
            if (k90 != null) {
                k90.a(-1L, true, true, null);
            }
        }
    }

    @Override // defpackage.InterfaceC1727Ox
    public final void b(@NotNull InterfaceC1023Fx call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.d.e(e, null);
    }
}

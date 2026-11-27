package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7903yo1 extends AbstractC6578sX1 {
    public final /* synthetic */ C7483wo1 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7903yo1(String str, C7483wo1 c7483wo1, long j) {
        super(str, true);
        this.e = c7483wo1;
        this.f = j;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C7667xh2 c7667xh2;
        C7483wo1 c7483wo1 = this.e;
        synchronized (c7483wo1) {
            try {
                if (!c7483wo1.t && (c7667xh2 = c7483wo1.j) != null) {
                    int i = c7483wo1.v ? c7483wo1.u : -1;
                    c7483wo1.u++;
                    c7483wo1.v = true;
                    Unit unit = Unit.a;
                    if (i != -1) {
                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(c7483wo1.c);
                        sb.append("ms (after ");
                        c7483wo1.e(new SocketTimeoutException(SK.b(sb, i - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            C1802Pw payload = C1802Pw.h;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            c7667xh2.c(9, payload);
                        } catch (IOException e) {
                            c7483wo1.e(e, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f;
    }
}

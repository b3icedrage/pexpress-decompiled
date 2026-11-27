package defpackage;

import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: go1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4072go1 extends AbstractC6578sX1 {
    public final /* synthetic */ C4282ho1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4072go1(C4282ho1 c4282ho1, String str) {
        super(str, true);
        this.e = c4282ho1;
    }

    @Override // defpackage.AbstractC6578sX1
    public final long a() {
        C4282ho1 c4282ho1 = this.e;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        C3442do1 c3442do1 = null;
        int i2 = 0;
        for (C3442do1 connection : c4282ho1.d) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (c4282ho1.b(connection, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - connection.q;
                    if (j2 > j) {
                        c3442do1 = connection;
                        j = j2;
                    }
                    Unit unit = Unit.a;
                }
            }
        }
        long j3 = c4282ho1.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(c3442do1);
        synchronized (c3442do1) {
            if (!c3442do1.p.isEmpty()) {
                return 0L;
            }
            if (c3442do1.q + j != jNanoTime) {
                return 0L;
            }
            c3442do1.j = true;
            c4282ho1.d.remove(c3442do1);
            Socket socket = c3442do1.d;
            Intrinsics.checkNotNull(socket);
            C6806tc2.e(socket);
            if (c4282ho1.d.isEmpty()) {
                c4282ho1.b.a();
            }
            return 0L;
        }
    }
}

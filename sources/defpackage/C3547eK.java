package defpackage;

import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: eK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3547eK {

    @NotNull
    public final C4282ho1 a;

    public C3547eK() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        C4282ho1 delegate = new C4282ho1(C8049zX1.h);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
    }

    public final void a() {
        Socket socket;
        C4282ho1 c4282ho1 = this.a;
        Iterator<C3442do1> it = c4282ho1.d.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "connections.iterator()");
        while (it.hasNext()) {
            C3442do1 connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (connection.p.isEmpty()) {
                    it.remove();
                    connection.j = true;
                    socket = connection.d;
                    Intrinsics.checkNotNull(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                C6806tc2.e(socket);
            }
        }
        if (c4282ho1.d.isEmpty()) {
            c4282ho1.b.a();
        }
    }
}

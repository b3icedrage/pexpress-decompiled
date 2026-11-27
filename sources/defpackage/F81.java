package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class F81 implements Pf2 {
    public final H81 a;
    public final G81 b;
    public final C6921u81 c;

    public static final class a {
        public final C6921u81 a;

        public a(@NotNull C6921u81 connectionEstablisher) {
            Intrinsics.checkNotNullParameter(connectionEstablisher, "connectionEstablisher");
            this.a = connectionEstablisher;
        }
    }

    public F81(@NotNull H81 okHttpWebSocketHolder, @NotNull G81 okHttpWebSocketEventObserver, @NotNull C6921u81 connectionEstablisher) {
        Intrinsics.checkNotNullParameter(okHttpWebSocketHolder, "okHttpWebSocketHolder");
        Intrinsics.checkNotNullParameter(okHttpWebSocketEventObserver, "okHttpWebSocketEventObserver");
        Intrinsics.checkNotNullParameter(connectionEstablisher, "connectionEstablisher");
        this.a = okHttpWebSocketHolder;
        this.b = okHttpWebSocketEventObserver;
        this.c = connectionEstablisher;
    }

    @Override // defpackage.Pf2
    public final synchronized boolean a(@NotNull AbstractC6583sZ0 message) {
        boolean zB;
        try {
            Intrinsics.checkNotNullParameter(message, "message");
            if (message instanceof AbstractC6583sZ0.b) {
                zB = this.a.a(((AbstractC6583sZ0.b) message).a);
            } else {
                if (!(message instanceof AbstractC6583sZ0.a)) {
                    throw new C6489s51();
                }
                byte[] bArr = ((AbstractC6583sZ0.a) message).a;
                C1802Pw c1802Pw = C1802Pw.h;
                zB = this.a.b(C1802Pw.a.d(bArr.length, bArr));
            }
        } catch (Throwable th) {
            throw th;
        }
        return zB;
    }

    @Override // defpackage.Pf2
    public final synchronized boolean b(@NotNull FL1 shutdownReason) {
        Intrinsics.checkNotNullParameter(shutdownReason, "shutdownReason");
        return this.a.c(shutdownReason.a, shutdownReason.b);
    }

    @Override // defpackage.Pf2
    public final synchronized void cancel() {
        this.a.cancel();
    }
}

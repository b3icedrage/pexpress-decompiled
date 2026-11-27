package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class KX1 implements UB0 {
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws IOException {
        String strL;
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4543is1 c4543is1 = chain.e;
        String str = c4543is1.b;
        String strB = c4543is1.a.b();
        String strA = c4543is1.a("X-Request-Id");
        long jNanoTime = System.nanoTime();
        try {
            C0857Dt1 c0857Dt1B = chain.b(c4543is1);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            int i = c0857Dt1B.h;
            if (400 <= i && i < 600) {
                try {
                    strL = c0857Dt1B.l(4096L).l();
                } catch (IOException unused) {
                    strL = null;
                }
                C2771ah c2771ah = U0.U;
                if (c2771ah != null) {
                    c2771ah.q(str, strB, Integer.valueOf(i), Long.valueOf(millis), strL, strA);
                }
            }
            return c0857Dt1B;
        } catch (IOException e) {
            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            C2995bh c2995bh = U0.V;
            if (c2995bh == null) {
                throw e;
            }
            c2995bh.c(str, strB, e, Long.valueOf(millis2), strA);
            throw e;
        }
    }
}

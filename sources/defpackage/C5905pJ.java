package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5905pJ implements UB0 {

    @NotNull
    public static final C5905pJ a = new C5905pJ();

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C3233co1 c3233co1 = chain.a;
        c3233co1.getClass();
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (c3233co1) {
            if (!c3233co1.s) {
                throw new IllegalStateException("released");
            }
            if (c3233co1.r) {
                throw new IllegalStateException("Check failed.");
            }
            if (c3233co1.q) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.a;
        }
        M90 m90 = c3233co1.m;
        Intrinsics.checkNotNull(m90);
        C6711t81 client = c3233co1.d;
        m90.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            K90 k90 = new K90(c3233co1, c3233co1.i, m90, m90.a(chain.f, chain.g, chain.h, client.D, client.j, !Intrinsics.a(chain.e.b, "GET")).k(client, chain));
            c3233co1.p = k90;
            c3233co1.u = k90;
            synchronized (c3233co1) {
                c3233co1.q = true;
                c3233co1.r = true;
            }
            if (c3233co1.t) {
                throw new IOException("Canceled");
            }
            return C5593no1.a(chain, 0, k90, null, 0, 0, 0, 61).b(chain.e);
        } catch (IOException e) {
            m90.c(e);
            throw new C4830kB1(e);
        } catch (C4830kB1 e2) {
            m90.c(e2.e);
            throw e2;
        }
    }
}

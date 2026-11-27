package defpackage;

import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AX1 implements Runnable {
    public final /* synthetic */ C8049zX1 d;

    public AX1(C8049zX1 c8049zX1) {
        this.d = c8049zX1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6578sX1 abstractC6578sX1C;
        long jNanoTime;
        while (true) {
            C8049zX1 c8049zX1 = this.d;
            synchronized (c8049zX1) {
                abstractC6578sX1C = c8049zX1.c();
            }
            if (abstractC6578sX1C == null) {
                return;
            }
            C7839yX1 c7839yX1 = abstractC6578sX1C.c;
            Intrinsics.checkNotNull(c7839yX1);
            C8049zX1 c8049zX2 = this.d;
            boolean zIsLoggable = C8049zX1.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                C8049zX1.a aVar = c7839yX1.a.a;
                jNanoTime = System.nanoTime();
                Cm2.b(abstractC6578sX1C, c7839yX1, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                C8049zX1.a(c8049zX2, abstractC6578sX1C);
                try {
                    Unit unit = Unit.a;
                    if (zIsLoggable) {
                        C8049zX1.a aVar2 = c7839yX1.a.a;
                        Cm2.b(abstractC6578sX1C, c7839yX1, "finished run in ".concat(Cm2.g(System.nanoTime() - jNanoTime)));
                    }
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        C8049zX1.a aVar3 = c7839yX1.a.a;
                        Cm2.b(abstractC6578sX1C, c7839yX1, "failed a run in ".concat(Cm2.g(System.nanoTime() - jNanoTime)));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c8049zX2.a.a(this);
                throw th2;
            }
        }
    }
}

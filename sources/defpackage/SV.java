package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class SV implements InterfaceC4626jD1 {
    public static final Logger f = Logger.getLogger(C3081c52.class.getName());
    public final Ak2 a;
    public final Executor b;
    public final InterfaceC0921Ep c;
    public final T80 d;
    public final JW1 e;

    public SV(Executor executor, InterfaceC0921Ep interfaceC0921Ep, Ak2 ak2, T80 t80, JW1 jw1) {
        this.b = executor;
        this.c = interfaceC0921Ep;
        this.a = ak2;
        this.d = t80;
        this.e = jw1;
    }

    @Override // defpackage.InterfaceC4626jD1
    public final void a(final C1778Po c1778Po, final C7060uo c7060uo, final InterfaceC3710f52 interfaceC3710f52) {
        this.b.execute(new Runnable() { // from class: PV
            @Override // java.lang.Runnable
            public final void run() {
                final C1778Po c1778Po2 = c1778Po;
                String str = c1778Po2.a;
                InterfaceC3710f52 interfaceC3710f53 = interfaceC3710f52;
                C7060uo c7060uo2 = c7060uo;
                final SV sv = this.d;
                sv.getClass();
                Logger logger = SV.f;
                try {
                    U42 u42 = sv.c.get(str);
                    if (u42 != null) {
                        final C7060uo c7060uoB = u42.b(c7060uo2);
                        sv.e.g(new JW1.a() { // from class: QV
                            @Override // JW1.a
                            public final Object c() {
                                SV sv2 = sv;
                                T80 t80 = sv2.d;
                                C1778Po c1778Po3 = c1778Po2;
                                t80.V(c1778Po3, c7060uoB);
                                sv2.a.a(c1778Po3, 1);
                                return null;
                            }
                        });
                        interfaceC3710f53.a(null);
                    } else {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        interfaceC3710f53.a(new IllegalArgumentException(str2));
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC3710f53.a(e);
                }
            }
        });
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SX {

    @NotNull
    public final C4923kf a;

    public SX(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void a(UX ux, LM lm) throws Throwable {
        QX qx;
        if (lm instanceof QX) {
            qx = (QX) lm;
            int i = qx.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx.g = i - Integer.MIN_VALUE;
            } else {
                qx = new QX(ux, lm);
            }
        } else {
            qx = new QX(ux, lm);
        }
        Object obj = qx.d;
        MN mn = MN.d;
        int i2 = qx.g;
        if (i2 != 0) {
            if (i2 == 1) {
                throw EK.c(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1795Pt1.b(obj);
        C6120qK1 c6120qK1 = ux.a.n;
        RX rx = new RX(ux);
        qx.g = 1;
        c6120qK1.getClass();
        C6120qK1.o(c6120qK1, rx, qx);
    }
}

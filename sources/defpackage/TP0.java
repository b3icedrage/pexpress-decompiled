package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TP0 extends G1 {
    public static volatile int f;

    @NotNull
    public static final TP0 h = new TP0();
    public static final File e = new File("/proc/self/fd");
    public static volatile boolean g = true;

    @Override // defpackage.G1
    public final boolean b(@NotNull LM1 size) {
        boolean z;
        Intrinsics.checkNotNullParameter(size, "size");
        if (size instanceof C1433Ld1) {
            C1433Ld1 c1433Ld1 = (C1433Ld1) size;
            if (c1433Ld1.d < 75 || c1433Ld1.e < 75) {
                return false;
            }
        }
        synchronized (this) {
            try {
                int i = f;
                f = i + 1;
                if (i >= 50) {
                    f = 0;
                    String[] list = e.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    g = list.length < 750;
                }
                z = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}

package io.sentry.android.core.internal.util;

import io.sentry.util.C4527a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final h c = new h();

    @NotNull
    public final C4527a a = new C4527a();

    @NotNull
    public final ArrayList b = new ArrayList();

    @NotNull
    public final ArrayList a() {
        C4527a.C0404a c0404aA = this.a.a();
        ArrayList arrayList = this.b;
        try {
            if (!arrayList.isEmpty()) {
                c0404aA.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                c0404aA.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strC = io.sentry.util.f.c(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strC != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            c0404aA.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

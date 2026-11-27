package io.sentry.util;

import defpackage.C1039Gc0;
import defpackage.C2688aH1;
import defpackage.C4682jW0;
import defpackage.C51;
import defpackage.NG1;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static String a(@NotNull C2688aH1 c2688aH1) {
        String profilingTracesDirPath = c2688aH1.getProfilingTracesDirPath();
        if (profilingTracesDirPath != null) {
            return profilingTracesDirPath;
        }
        File file = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
        if (file.mkdirs() || file.exists()) {
            String absolutePath = file.getAbsolutePath();
            c2688aH1.setProfilingTracesDirPath(absolutePath);
            return absolutePath;
        }
        throw new IllegalArgumentException("Creating a fallback directory for profiling failed in " + file.getAbsolutePath());
    }

    public static boolean b(@Nullable C2688aH1 c2688aH1, @NotNull C2688aH1 c2688aH2, boolean z) {
        boolean z2 = r.a;
        if (!z2 && (c2688aH2.getVersionDetector() instanceof C51)) {
            c2688aH2.setVersionDetector(new C4682jW0(c2688aH2));
        }
        if (!c2688aH2.getVersionDetector().a()) {
            return !z || c2688aH1 == null || c2688aH2.isForceInit() || c2688aH1.getInitPriority().ordinal() <= c2688aH2.getInitPriority().ordinal();
        }
        c2688aH2.getLogger().a(NG1.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(C1039Gc0.d("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", z2 ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }
}

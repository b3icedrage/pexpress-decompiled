package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class P51 {
    public static final void a(@NotNull ReporterApi reporterApi, @NotNull L80 from, @NotNull EnumC6841tl1 type) {
        Intrinsics.checkNotNullParameter(reporterApi, "<this>");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(type, "type");
        ReporterApi.a.b(reporterApi, EnumC5028l80.G0, new C6631sl1(from.d, type.d), null, 12);
    }

    public static final void b(@NotNull ReporterApi reporterApi, @NotNull EnumC6421rl1 type) {
        Intrinsics.checkNotNullParameter(reporterApi, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        ReporterApi.a.c(reporterApi, EnumC5113la.PUSH_ALLOWED, type.d);
    }

    @NotNull
    public static final EnumC6841tl1 c(@NotNull W61 w61) {
        Intrinsics.checkNotNullParameter(w61, "<this>");
        int iOrdinal = w61.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Pushes denied property should not be sent when all type of notifications available");
        }
        if (iOrdinal == 1) {
            return EnumC6841tl1.PARTIALLY;
        }
        if (iOrdinal == 2) {
            return EnumC6841tl1.TOTALLY;
        }
        throw new C6489s51();
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Wv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2350Wv0 {

    @NotNull
    public final C1821Qc0 a;

    @NotNull
    public final C1821Qc0 b;

    @NotNull
    public final DS0 c;

    public C2350Wv0(@NotNull C1821Qc0 source, @NotNull C1821Qc0 destination, @NotNull DS0 logger) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = source;
        this.b = destination;
        this.c = logger;
    }

    public final void a() {
        DS0 ds0 = this.c;
        try {
            C1252Iv0 c1252Iv0A = this.a.a();
            ds0.a("Loaded old identity: " + c1252Iv0A);
            String str = c1252Iv0A.a;
            C1821Qc0 c1821Qc0 = this.b;
            if (str != null) {
                c1821Qc0.c(str);
            }
            String str2 = c1252Iv0A.b;
            if (str2 != null) {
                c1821Qc0.b(str2);
            }
        } catch (Exception e) {
            ds0.error("Unable to migrate file identity storage: " + e.getMessage());
        }
    }
}

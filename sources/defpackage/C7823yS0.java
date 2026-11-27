package defpackage;

import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7823yS0 implements DS0 {

    @NotNull
    public static final C7823yS0 a = new C7823yS0();

    @Override // defpackage.DS0
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        DS0.a.e.compareTo(DS0.a.d);
    }

    @Override // defpackage.DS0
    public final void error(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (DS0.a.e.compareTo(DS0.a.h) <= 0) {
            b0.c("Amplitude", message);
        }
    }

    @Override // defpackage.DS0
    public final void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        DS0.a aVar = DS0.a.e;
        aVar.compareTo(aVar);
    }

    @Override // defpackage.DS0
    public final void warn(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (DS0.a.e.compareTo(DS0.a.g) <= 0) {
            b0.e("Amplitude", message);
        }
    }
}

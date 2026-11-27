package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7378wK implements DS0 {
    public static void b(DS0.a aVar, String str) {
        if (DS0.a.e.compareTo(aVar) <= 0) {
            System.out.println((Object) str);
        }
    }

    @Override // defpackage.DS0
    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        b(DS0.a.d, message);
    }

    @Override // defpackage.DS0
    public final void error(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        b(DS0.a.h, message);
    }

    @Override // defpackage.DS0
    public final void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        b(DS0.a.e, message);
    }

    @Override // defpackage.DS0
    public final void warn(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        b(DS0.a.g, message);
    }
}

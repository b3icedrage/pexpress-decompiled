package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703Op extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703Op(@NotNull String value) {
        super("Bad Content-Type format: ".concat(value));
        Intrinsics.checkNotNullParameter(value, "value");
    }
}

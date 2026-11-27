package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class DL0 implements CL0 {
    @Override // defpackage.CL0
    @Nullable
    public final IL0 a(@NotNull UH1 format) {
        Intrinsics.checkNotNullParameter(format, "format");
        if (format instanceof AbstractC5267mG0) {
            return new IL0((AbstractC5267mG0) format);
        }
        return null;
    }
}

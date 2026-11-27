package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Hw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1177Hw0 extends G1 {
    public final boolean e;

    public C1177Hw0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.G1
    public final boolean b(@NotNull LM1 size) {
        Intrinsics.checkNotNullParameter(size, "size");
        return this.e;
    }
}

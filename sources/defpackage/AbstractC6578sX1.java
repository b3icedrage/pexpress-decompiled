package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6578sX1 {

    @NotNull
    public final String a;
    public final boolean b;

    @Nullable
    public C7839yX1 c;
    public long d;

    public AbstractC6578sX1(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
        this.d = -1L;
    }

    public abstract long a();

    @NotNull
    public final String toString() {
        return this.a;
    }
}

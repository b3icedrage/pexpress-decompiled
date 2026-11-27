package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: af2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2766af2 {

    @NotNull
    public final String a;
    public final boolean b;

    public AbstractC2766af2(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = z;
    }

    @Nullable
    public Integer a(@NotNull AbstractC2766af2 second) {
        Intrinsics.checkNotNullParameter(second, "visibility");
        C5315mW0 c5315mW0 = Xe2.a;
        Intrinsics.checkNotNullParameter(this, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (this == second) {
            return 0;
        }
        C5315mW0 c5315mW1 = Xe2.a;
        Integer num = (Integer) c5315mW1.get(this);
        Integer num2 = (Integer) c5315mW1.get(second);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    @NotNull
    public String b() {
        return this.a;
    }

    @NotNull
    public final String toString() {
        return b();
    }

    @NotNull
    public AbstractC2766af2 c() {
        return this;
    }
}

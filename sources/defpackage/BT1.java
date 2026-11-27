package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class BT1 {
    public final int a;
    public final int b;

    @NotNull
    public final EnumC7778yD0 c;

    public BT1(int i, int i2, @NotNull EnumC7778yD0 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.a = i;
        this.b = i2;
        this.c = style;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BT1)) {
            return false;
        }
        BT1 bt1 = (BT1) obj;
        return this.a == bt1.a && this.b == bt1.b && this.c == bt1.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "StubOnboardingItemData(imageRes=" + this.a + ", textRes=" + this.b + ", style=" + this.c + ")";
    }

    public /* synthetic */ BT1(int i, int i2) {
        this(i, i2, EnumC7778yD0.d);
    }
}

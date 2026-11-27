package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class BS {
    public final int a;
    public final int b;

    public BS(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BS)) {
            return false;
        }
        BS bs = (BS) obj;
        return this.a == bs.a && this.b == bs.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @NotNull
    public final String toString() {
        return "DataSetIndices(betUpDataSetIndex=" + this.a + ", betDownDataSetIndex=" + this.b + ")";
    }
}

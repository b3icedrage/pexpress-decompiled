package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class L02 {

    @NotNull
    public final Boolean a;

    @Nullable
    public final Double b;

    @Nullable
    public final Double c;

    @NotNull
    public final Boolean d;

    @Nullable
    public final Double e;

    public L02(@NotNull Boolean bool, @Nullable Double d) {
        this(bool, d, null, Boolean.FALSE, null);
    }

    public L02(@NotNull Boolean bool, @Nullable Double d, @Nullable Double d2, @NotNull Boolean bool2, @Nullable Double d3) {
        this.a = bool;
        this.b = d;
        this.c = d2;
        this.d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.e = d3;
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6456rw1 {
    public final int a;
    public final int b;

    @NotNull
    public final List<Object> c;

    public C6456rw1(int i, int i2, @NotNull List<? extends Object> additionalTexts) {
        Intrinsics.checkNotNullParameter(additionalTexts, "additionalTexts");
        this.a = i;
        this.b = i2;
        this.c = additionalTexts;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6456rw1)) {
            return false;
        }
        C6456rw1 c6456rw1 = (C6456rw1) obj;
        return this.a == c6456rw1.a && this.b == c6456rw1.b && Intrinsics.a(this.c, c6456rw1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "RobotFooterItem(iconRes=" + this.a + ", descriptionRes=" + this.b + ", additionalTexts=" + this.c + ")";
    }
}

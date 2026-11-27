package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3731fB0 {
    public final int a;
    public final int b;

    @Nullable
    public final List<String> c;

    public C3731fB0(int i, int i2, @Nullable List<String> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3731fB0)) {
            return false;
        }
        C3731fB0 c3731fB0 = (C3731fB0) obj;
        return this.a == c3731fB0.a && this.b == c3731fB0.b && Intrinsics.a(this.c, c3731fB0.c);
    }

    public final int hashCode() {
        int iA = EF0.a(this.b, Integer.hashCode(this.a) * 31, 31);
        List<String> list = this.c;
        return iA + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "InstructionItem(title=" + this.a + ", description=" + this.b + ", descriptionResStrings=" + this.c + ")";
    }
}

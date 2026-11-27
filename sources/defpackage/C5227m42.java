package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5227m42 {

    @NotNull
    public final String a;

    @NotNull
    public final a b;

    /* JADX INFO: renamed from: m42$a */
    public enum a {
        ADD('+'),
        REPLACE('-');

        public final char d;

        a(char c) {
            this.d = c;
        }
    }

    public C5227m42(@NotNull String screenKey, @NotNull a aVar) {
        Intrinsics.d(screenKey, "screenKey");
        this.a = screenKey;
        this.b = aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5227m42)) {
            return false;
        }
        C5227m42 c5227m42 = (C5227m42) obj;
        return Intrinsics.a(this.a, c5227m42.a) && Intrinsics.a(this.b, c5227m42.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return this.a + this.b.d;
    }
}

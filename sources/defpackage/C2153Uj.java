package defpackage;

import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2153Uj {

    @Nullable
    public final Integer a;

    @Nullable
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    public C2153Uj() {
        this(15, null, null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2153Uj)) {
            return false;
        }
        C2153Uj c2153Uj = (C2153Uj) obj;
        return Intrinsics.a(this.a, c2153Uj.a) && Intrinsics.a(this.b, c2153Uj.b) && Intrinsics.a(this.c, c2153Uj.c) && Intrinsics.a(this.d, c2153Uj.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return this.d.hashCode() + C1039Gc0.b((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c);
    }

    @NotNull
    public final String toString() {
        return "AssetInvestment(iconResId=" + this.a + ", iconResUrl=" + this.b + ", title=" + this.c + ", percentText=" + this.d + ")";
    }

    public C2153Uj(int i, String str, String title, String percentText) {
        Integer numValueOf = (i & 1) != 0 ? null : Integer.valueOf(R.drawable.ic_eurusd);
        str = (i & 2) != 0 ? null : str;
        title = (i & 4) != 0 ? "" : title;
        percentText = (i & 8) != 0 ? "" : percentText;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(percentText, "percentText");
        this.a = numValueOf;
        this.b = str;
        this.c = title;
        this.d = percentText;
    }
}

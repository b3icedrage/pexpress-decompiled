package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021Fw0 {

    @NotNull
    public final List<String> a;

    @NotNull
    public final List<Integer> b;

    public C1021Fw0() {
        this(null, null, 3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1021Fw0)) {
            return false;
        }
        C1021Fw0 c1021Fw0 = (C1021Fw0) obj;
        return Intrinsics.a(this.a, c1021Fw0.a) && Intrinsics.a(this.b, c1021Fw0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ImagesReferencesEntity(urls=" + this.a + ", resIds=" + this.b + ")";
    }

    public C1021Fw0(List urls, List resIds, int i) {
        urls = (i & 1) != 0 ? C5653o60.d : urls;
        resIds = (i & 2) != 0 ? C5653o60.d : resIds;
        Intrinsics.checkNotNullParameter(urls, "urls");
        Intrinsics.checkNotNullParameter(resIds, "resIds");
        this.a = urls;
        this.b = resIds;
    }
}

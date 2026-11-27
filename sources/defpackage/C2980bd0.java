package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2980bd0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final long c;

    @NotNull
    public final String d;
    public final long e;

    @NotNull
    public final AbstractC5539na2 f;

    @NotNull
    public final String g;

    public C2980bd0(@NotNull String name, @NotNull String type, long j, @NotNull String uri, long j2, @NotNull AbstractC5539na2 uploadState, @NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uploadState, "uploadState");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.a = name;
        this.b = type;
        this.c = j;
        this.d = uri;
        this.e = j2;
        this.f = uploadState;
        this.g = mimeType;
    }

    public static C2980bd0 a(C2980bd0 c2980bd0, AbstractC5539na2 uploadState) {
        String name = c2980bd0.a;
        String type = c2980bd0.b;
        long j = c2980bd0.c;
        String uri = c2980bd0.d;
        long j2 = c2980bd0.e;
        String mimeType = c2980bd0.g;
        c2980bd0.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uploadState, "uploadState");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new C2980bd0(name, type, j, uri, j2, uploadState, mimeType);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2980bd0)) {
            return false;
        }
        C2980bd0 c2980bd0 = (C2980bd0) obj;
        return Intrinsics.a(this.a, c2980bd0.a) && Intrinsics.a(this.b, c2980bd0.b) && this.c == c2980bd0.c && Intrinsics.a(this.d, c2980bd0.d) && this.e == c2980bd0.e && Intrinsics.a(this.f, c2980bd0.f) && Intrinsics.a(this.g, c2980bd0.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + C5491nL.a(C1039Gc0.b(C5491nL.a(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FileState(name=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", uri=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", uploadState=");
        sb.append(this.f);
        sb.append(", mimeType=");
        return C1039Gc0.e(sb, this.g, ')');
    }
}

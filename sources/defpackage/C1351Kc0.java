package defpackage;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1351Kc0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @Nullable
    public final InputStream e;

    @NotNull
    public final String f;
    public final long g;

    public C1351Kc0(@NotNull String name, @NotNull String type, @NotNull String extension, @NotNull String mimeType, @Nullable InputStream inputStream, @NotNull String uri, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.a = name;
        this.b = type;
        this.c = extension;
        this.d = mimeType;
        this.e = inputStream;
        this.f = uri;
        this.g = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1351Kc0)) {
            return false;
        }
        C1351Kc0 c1351Kc0 = (C1351Kc0) obj;
        return Intrinsics.a(this.a, c1351Kc0.a) && Intrinsics.a(this.b, c1351Kc0.b) && Intrinsics.a(this.c, c1351Kc0.c) && Intrinsics.a(this.d, c1351Kc0.d) && Intrinsics.a(this.e, c1351Kc0.e) && Intrinsics.a(this.f, c1351Kc0.f) && this.g == c1351Kc0.g;
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        InputStream inputStream = this.e;
        return Long.hashCode(this.g) + C1039Gc0.b((iB + (inputStream == null ? 0 : inputStream.hashCode())) * 31, 31, this.f);
    }

    @NotNull
    public final String toString() {
        return "File(name=" + this.a + ", type=" + this.b + ", extension=" + this.c + ", mimeType=" + this.d + ", inputStream=" + this.e + ", uri=" + this.f + ", size=" + this.g + ')';
    }
}

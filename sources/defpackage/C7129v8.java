package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7129v8 {

    @NotNull
    public final String a;

    @NotNull
    public final AbstractC3723f9 b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final String e;
    public final boolean f;

    public C7129v8(@NotNull String id, @NotNull AbstractC3723f9 status, @NotNull String name, @NotNull String title, @NotNull String photo, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.a = id;
        this.b = status;
        this.c = name;
        this.d = title;
        this.e = photo;
        this.f = z;
    }

    public static C7129v8 a(C7129v8 c7129v8, AbstractC3723f9 abstractC3723f9, String name, String title, String photo, boolean z, int i) {
        AbstractC3723f9 status = abstractC3723f9;
        String id = c7129v8.a;
        if ((i & 2) != 0) {
            status = c7129v8.b;
        }
        if ((i & 4) != 0) {
            name = c7129v8.c;
        }
        if ((i & 8) != 0) {
            title = c7129v8.d;
        }
        if ((i & 16) != 0) {
            photo = c7129v8.e;
        }
        if ((i & 32) != 0) {
            z = c7129v8.f;
        }
        boolean z2 = z;
        c7129v8.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(photo, "photo");
        String str = photo;
        String str2 = title;
        return new C7129v8(id, status, name, str2, str, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7129v8)) {
            return false;
        }
        C7129v8 c7129v8 = (C7129v8) obj;
        return Intrinsics.a(this.a, c7129v8.a) && Intrinsics.a(this.b, c7129v8.b) && Intrinsics.a(this.c, c7129v8.c) && Intrinsics.a(this.d, c7129v8.d) && Intrinsics.a(this.e, c7129v8.e) && this.f == c7129v8.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iB = C1039Gc0.b(C1039Gc0.b(C1039Gc0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        boolean z = this.f;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iB + r1;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Agent(id=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", hasOnlineInChat=");
        return C4564j.f(sb, this.f, ')');
    }

    public /* synthetic */ C7129v8(String str, AbstractC3723f9 abstractC3723f9, String str2, String str3, String str4, boolean z, int i) {
        this(str, (i & 2) != 0 ? AbstractC3723f9.d.a : abstractC3723f9, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z);
    }
}

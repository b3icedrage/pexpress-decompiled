package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Fo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0997Fo0 {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    @NotNull
    public final String d;

    @NotNull
    public final TZ0 e;
    public final long f;
    public final long g;

    public C0997Fo0(@NotNull String id, @NotNull String type, @NotNull String from, @NotNull String data, @NotNull TZ0 status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(status, "status");
        this.a = id;
        this.b = type;
        this.c = from;
        this.d = data;
        this.e = status;
        Pair pairE = C3481e1.e(id);
        this.f = ((Number) pairE.d).longValue();
        this.g = ((Number) pairE.e).longValue();
    }

    public static C0997Fo0 a(C0997Fo0 c0997Fo0, String str, String str2, String str3, TZ0 tz0, int i) {
        if ((i & 1) != 0) {
            str = c0997Fo0.a;
        }
        String id = str;
        if ((i & 2) != 0) {
            str2 = c0997Fo0.b;
        }
        String type = str2;
        String from = c0997Fo0.c;
        if ((i & 8) != 0) {
            str3 = c0997Fo0.d;
        }
        String data = str3;
        if ((i & 16) != 0) {
            tz0 = c0997Fo0.e;
        }
        TZ0 status = tz0;
        c0997Fo0.getClass();
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(status, "status");
        return new C0997Fo0(id, type, from, data, status);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0997Fo0)) {
            return false;
        }
        C0997Fo0 c0997Fo0 = (C0997Fo0) obj;
        return Intrinsics.a(this.a, c0997Fo0.a) && Intrinsics.a(this.b, c0997Fo0.b) && Intrinsics.a(this.c, c0997Fo0.c) && Intrinsics.a(this.d, c0997Fo0.d) && Intrinsics.a(this.e, c0997Fo0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryMessage{");
        sb.append(this.f);
        sb.append("-\"");
        return C5807oq.b(sb, this.d, "\"}");
    }
}

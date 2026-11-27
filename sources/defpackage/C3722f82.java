package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: f82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3722f82 {

    @NotNull
    public static final C3722f82 c;

    @NotNull
    public static final LinkedHashMap d;

    @NotNull
    public final String a;
    public final int b;

    static {
        C3722f82 c3722f82 = new C3722f82("http", 80);
        c = c3722f82;
        List listF = WE.f(c3722f82, new C3722f82("https", 443), new C3722f82("ws", 80), new C3722f82("wss", 443), new C3722f82("socks", 1080));
        int iA = OW0.a(XE.m(listF, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : listF) {
            linkedHashMap.put(((C3722f82) obj).a, obj);
        }
        d = linkedHashMap;
    }

    public C3722f82(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.b = i;
        for (int i2 = 0; i2 < name.length(); i2++) {
            char cCharAt = name.charAt(i2);
            if (Character.toLowerCase(cCharAt) != cCharAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3722f82)) {
            return false;
        }
        C3722f82 c3722f82 = (C3722f82) obj;
        return Intrinsics.a(this.a, c3722f82.a) && this.b == c3722f82.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "URLProtocol(name=" + this.a + ", defaultPort=" + this.b + ')';
    }
}

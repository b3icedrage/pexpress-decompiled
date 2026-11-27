package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1413Kx {

    @NotNull
    public final C1758Ph0 a;

    @NotNull
    public final C5638o21 b;

    static {
        Intrinsics.checkNotNullExpressionValue(C1758Ph0.j(C6761tO1.f), "topLevel(...)");
    }

    public C1413Kx(@NotNull C1758Ph0 packageName, @NotNull C5638o21 callableName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.a = packageName;
        this.b = callableName;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1413Kx)) {
            return false;
        }
        C1413Kx c1413Kx = (C1413Kx) obj;
        return Intrinsics.a(this.a, c1413Kx.a) && this.b.equals(c1413Kx.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 961);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String strB = this.a.b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        sb.append(d.l(strB, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append("/");
        sb.append(this.b);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

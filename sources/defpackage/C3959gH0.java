package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3959gH0 extends JsonPrimitive {
    public final boolean d;

    @NotNull
    public final String e;

    public C3959gH0(boolean z, Object body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.d = z;
        this.e = body.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public final String b() {
        return this.e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3959gH0.class != obj.getClass()) {
            return false;
        }
        C3959gH0 c3959gH0 = (C3959gH0) obj;
        return this.d == c3959gH0.d && Intrinsics.a(this.e, c3959gH0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Boolean.hashCode(this.d) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public final String toString() {
        boolean z = this.d;
        String str = this.e;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        C5934pS1.a(str, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

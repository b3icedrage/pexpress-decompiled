package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class La2 {

    @NotNull
    public final C3722f82 a;

    @NotNull
    public final String b;
    public final int c;

    @NotNull
    public final ArrayList d;

    @NotNull
    public final InterfaceC2131Ub1 e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;

    @NotNull
    public final String h;

    @NotNull
    public final KW1 i;

    @NotNull
    public final KW1 j;

    public La2(@NotNull C3722f82 protocol, @NotNull String host, int i, @NotNull ArrayList pathSegments, @NotNull InterfaceC2131Ub1 parameters, @NotNull String fragment, @Nullable String str, @Nullable String str2, @NotNull String urlString) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.a = protocol;
        this.b = host;
        this.c = i;
        this.d = pathSegments;
        this.e = parameters;
        this.f = str;
        this.g = str2;
        this.h = urlString;
        if ((i < 0 || i >= 65536) && i != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        int i2 = 5;
        XO0.b(new C5220m3(this, i2));
        XO0.b(new C3399dd0(this, i2));
        XO0.b(new C5430n3(this, i2));
        this.i = XO0.b(new C3265cz0(this, 12));
        this.j = XO0.b(new N5(this, 2));
        XO0.b(new C7323w4(this, 4));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && La2.class == obj.getClass() && Intrinsics.a(this.h, ((La2) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.h;
    }
}

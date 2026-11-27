package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: br0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3032br0 implements InterfaceC1471Lq0 {

    @NotNull
    public final Z72 a = new Z72(0);

    @NotNull
    public C1629Nq0 b = C1629Nq0.b;

    @NotNull
    public final C3441do0 c = new C3441do0();

    @NotNull
    public Object d = C4132h60.a;

    @NotNull
    public C4002gV1 e = C0564Aa.a();

    @NotNull
    public final YH f = new YH();

    @Override // defpackage.InterfaceC1471Lq0
    @NotNull
    public final C3441do0 a() {
        return this.c;
    }

    public final void b(@Nullable A62 a62) {
        YH yh = this.f;
        if (a62 != null) {
            yh.b(C5815os1.a, a62);
            return;
        }
        C2498Yk<A62> key = C5815os1.a;
        yh.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        yh.g().remove(key);
    }

    @NotNull
    public final void c(@NotNull C3032br0 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.e = builder.e;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.b = builder.b;
        this.d = builder.d;
        C2498Yk<A62> c2498Yk = C5815os1.a;
        YH other = builder.f;
        b((A62) other.e(c2498Yk));
        Z72 url = builder.a;
        Z72 z72 = this.a;
        Intrinsics.checkNotNullParameter(z72, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        C3722f82 c3722f82 = url.a;
        z72.getClass();
        Intrinsics.checkNotNullParameter(c3722f82, "<set-?>");
        z72.a = c3722f82;
        String str = url.b;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        z72.b = str;
        z72.c = url.c;
        List<String> list = url.h;
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        z72.h = list;
        z72.e = url.e;
        z72.f = url.f;
        C2291Wb1 value = new C2291Wb1();
        BS1.a(value, url.i);
        Intrinsics.checkNotNullParameter(value, "value");
        z72.i = value;
        z72.j = new Ma2(value);
        String str2 = url.g;
        Intrinsics.checkNotNullParameter(str2, "<set-?>");
        z72.g = str2;
        z72.d = url.d;
        List<String> list2 = z72.h;
        Intrinsics.checkNotNullParameter(list2, "<set-?>");
        z72.h = list2;
        BS1.a(this.c, builder.c);
        YH yh = this.f;
        Intrinsics.checkNotNullParameter(yh, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        for (C2498Yk c2498Yk2 : other.c()) {
            Intrinsics.c(c2498Yk2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            yh.b(c2498Yk2, other.f(c2498Yk2));
        }
    }
}

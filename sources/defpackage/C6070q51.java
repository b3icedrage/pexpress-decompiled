package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: q51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6070q51 extends UnsupportedOperationException {

    @Nullable
    public final String d;

    public C6070q51(@NotNull AbstractC5391mr0 response, @NotNull RI0<?> from, @NotNull RI0<?> to) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        StringBuilder sb = new StringBuilder("\n        Expected response body of the type '");
        sb.append(to);
        sb.append("' but was '");
        sb.append(from);
        sb.append("'\n        In response from `");
        Intrinsics.checkNotNullParameter(response, "<this>");
        sb.append(response.b().c().getUrl());
        sb.append("`\n        Response status `");
        sb.append(response.g());
        sb.append("`\n        Response header `ContentType: ");
        InterfaceC2586Zn0 interfaceC2586Zn0A = response.a();
        List<String> list = C1159Hq0.a;
        sb.append(interfaceC2586Zn0A.get("Content-Type"));
        sb.append("` \n        Request header `Accept: ");
        Intrinsics.checkNotNullParameter(response, "<this>");
        sb.append(response.b().c().a().get("Accept"));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.d = DS1.b(sb.toString());
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        return this.d;
    }
}

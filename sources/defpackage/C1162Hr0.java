package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1162Hr0 {

    @NotNull
    public static final FS0 a = C6561sS.f("io.ktor.client.plugins.HttpTimeout");

    @NotNull
    public static final QN1 a(@NotNull C3241cr0 request, @Nullable IOException iOException) {
        Object obj;
        Intrinsics.checkNotNullParameter(request, "request");
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(request.a);
        sb.append(", socket_timeout=");
        C1006Fr0.b bVar = C1006Fr0.d;
        C1006Fr0.a aVar = (C1006Fr0.a) request.a();
        if (aVar == null || (obj = aVar.c) == null) {
            obj = "unknown";
        }
        return new QN1(K1.a(sb, obj, "] ms"), iOException);
    }
}

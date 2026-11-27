package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5391mr0 implements InterfaceC1393Kq0, KN {
    @NotNull
    public abstract C2250Vp0 b();

    @NotNull
    public abstract InterfaceC0942Ew c();

    @NotNull
    public abstract C4944kk0 d();

    @NotNull
    public abstract C4944kk0 e();

    @NotNull
    public abstract C0850Dr0 g();

    @NotNull
    public abstract C2097Tq0 h();

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse[");
        Intrinsics.checkNotNullParameter(this, "<this>");
        sb.append(b().c().getUrl());
        sb.append(", ");
        sb.append(g());
        sb.append(']');
        return sb.toString();
    }
}

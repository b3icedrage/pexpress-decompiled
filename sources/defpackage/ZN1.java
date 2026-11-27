package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ZN1 extends AbstractC4912kc0 {

    @NotNull
    public final InterfaceC2833av a;

    @Nullable
    public final String b;

    @NotNull
    public final DS c;

    public ZN1(@NotNull InterfaceC2833av source, @Nullable String str, @NotNull DS dataSource) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.a = source;
        this.b = str;
        this.c = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZN1)) {
            return false;
        }
        ZN1 zn1 = (ZN1) obj;
        return Intrinsics.a(this.a, zn1.a) && Intrinsics.a(this.b, zn1.b) && Intrinsics.a(this.c, zn1.c);
    }

    public final int hashCode() {
        InterfaceC2833av interfaceC2833av = this.a;
        int iHashCode = (interfaceC2833av != null ? interfaceC2833av.hashCode() : 0) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        DS ds = this.c;
        return iHashCode2 + (ds != null ? ds.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SourceResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}

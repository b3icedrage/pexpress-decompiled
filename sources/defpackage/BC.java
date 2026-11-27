package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class BC {

    @NotNull
    public final InterfaceC5848p21 a;

    @NotNull
    public final C2077Tj1 b;

    @NotNull
    public final AbstractC5393ms c;

    @NotNull
    public final VN1 d;

    public BC(@NotNull InterfaceC5848p21 nameResolver, @NotNull C2077Tj1 classProto, @NotNull AbstractC5393ms metadataVersion, @NotNull VN1 sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.a = nameResolver;
        this.b = classProto;
        this.c = metadataVersion;
        this.d = sourceElement;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BC)) {
            return false;
        }
        BC bc = (BC) obj;
        return Intrinsics.a(this.a, bc.a) && Intrinsics.a(this.b, bc.b) && Intrinsics.a(this.c, bc.c) && Intrinsics.a(this.d, bc.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}

package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3740fE0 {

    @NotNull
    public final QC a;

    @Nullable
    public final byte[] b;

    @Nullable
    public final InterfaceC2902bE0 c;

    public C3740fE0(QC classId, InterfaceC2902bE0 interfaceC2902bE0, int i) {
        interfaceC2902bE0 = (i & 4) != 0 ? null : interfaceC2902bE0;
        Intrinsics.checkNotNullParameter(classId, "classId");
        this.a = classId;
        this.b = null;
        this.c = interfaceC2902bE0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3740fE0)) {
            return false;
        }
        C3740fE0 c3740fE0 = (C3740fE0) obj;
        return Intrinsics.a(this.a, c3740fE0.a) && Intrinsics.a(this.b, c3740fE0.b) && Intrinsics.a(this.c, c3740fE0.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        InterfaceC2902bE0 interfaceC2902bE0 = this.c;
        return iHashCode2 + (interfaceC2902bE0 != null ? interfaceC2902bE0.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Request(classId=" + this.a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.b) + ", outerClass=" + this.c + ')';
    }
}

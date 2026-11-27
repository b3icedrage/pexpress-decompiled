package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1411Kw0 implements InterfaceC1232Io1, AY1 {

    @NotNull
    public final FC a;

    @NotNull
    public final FC b;

    public C1411Kw0(@NotNull FC classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.a = classDescriptor;
        this.b = classDescriptor;
    }

    public final boolean equals(@Nullable Object obj) {
        C1411Kw0 c1411Kw0 = obj instanceof C1411Kw0 ? (C1411Kw0) obj : null;
        return Intrinsics.a(this.a, c1411Kw0 != null ? c1411Kw0.a : null);
    }

    @Override // defpackage.InterfaceC1232Io1
    public final AbstractC4649jL0 getType() {
        AbstractC5706oM1 abstractC5706oM1Y = this.a.y();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
        return abstractC5706oM1Y;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        AbstractC5706oM1 abstractC5706oM1Y = this.a.y();
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Y, "getDefaultType(...)");
        sb.append(abstractC5706oM1Y);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.AY1
    @NotNull
    public final FC x() {
        return this.a;
    }
}

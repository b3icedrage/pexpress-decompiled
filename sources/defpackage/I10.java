package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class I10 {

    @NotNull
    public final C3279d22 a;
    public final long b;

    @Nullable
    public final InterfaceC2441Xr c;

    @Nullable
    public final H32.a d;
    public final boolean e;

    @Nullable
    public final BF f;
    public final boolean g;

    public I10(C3279d22 asset, long j, InterfaceC2441Xr interfaceC2441Xr, H32.a aVar, boolean z, BF bf, boolean z2) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.a = asset;
        this.b = j;
        this.c = interfaceC2441Xr;
        this.d = aVar;
        this.e = z;
        this.f = bf;
        this.g = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I10)) {
            return false;
        }
        I10 i10 = (I10) obj;
        return Intrinsics.a(this.a, i10.a) && b.k(this.b, i10.b) && Intrinsics.a(this.c, i10.c) && this.d == i10.d && this.e == i10.e && Intrinsics.a(this.f, i10.f) && this.g == i10.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b.a aVar = b.e;
        int iA = C5491nL.a(iHashCode, 31, this.b);
        InterfaceC2441Xr interfaceC2441Xr = this.c;
        int iHashCode2 = (iA + (interfaceC2441Xr == null ? 0 : interfaceC2441Xr.hashCode())) * 31;
        H32.a aVar2 = this.d;
        int iA2 = C2983be.a((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, this.e, 31);
        BF bf = this.f;
        return Boolean.hashCode(this.g) + ((iA2 + (bf != null ? bf.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        String strS = b.s(this.b);
        StringBuilder sb = new StringBuilder("DirectionCalculatorParams(asset=");
        sb.append(this.a);
        sb.append(", betDuration=");
        sb.append(strS);
        sb.append(", previousBetResult=");
        sb.append(this.c);
        sb.append(", previousBetDirection=");
        sb.append(this.d);
        sb.append(", isBinaryAsset=");
        sb.append(this.e);
        sb.append(", newPoint=");
        sb.append(this.f);
        sb.append(", needWaitIndicatorSignal=");
        return C2983be.b(sb, this.g, ")");
    }

    public /* synthetic */ I10(C3279d22 c3279d22, long j, InterfaceC2441Xr interfaceC2441Xr, H32.a aVar, boolean z, boolean z2, int i) {
        this(c3279d22, j, (i & 4) != 0 ? null : interfaceC2441Xr, (i & 8) != 0 ? null : aVar, z, (BF) null, (i & 64) != 0 ? false : z2);
    }
}

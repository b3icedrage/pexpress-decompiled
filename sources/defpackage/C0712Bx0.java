package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Bx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0712Bx0 implements Sb2, InterfaceC2928bN<C0712Bx0> {

    @Nullable
    public Boolean a;

    @Nullable
    public Integer b;

    @Nullable
    public Integer c;

    @Nullable
    public Integer d;

    public C0712Bx0() {
        this(null, null, null, null);
    }

    @Override // defpackage.Sb2
    public final void B(@Nullable Integer num) {
        this.b = num;
    }

    @Override // defpackage.Sb2
    public final void C(@Nullable Integer num) {
        this.d = num;
    }

    @Override // defpackage.InterfaceC2928bN
    public final C0712Bx0 a() {
        return new C0712Bx0(this.a, this.b, this.c, this.d);
    }

    @NotNull
    public final Rb2 b() {
        int i = Intrinsics.a(this.a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = this.c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = this.d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i) : null;
        KW1 kw1 = C4446ic2.a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new Rb2(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                Intrinsics.checkNotNullExpressionValue(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new Rb2(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            Intrinsics.checkNotNullExpressionValue(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new Rb2(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer d() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0712Bx0)) {
            return false;
        }
        C0712Bx0 c0712Bx0 = (C0712Bx0) obj;
        return Intrinsics.a(this.a, c0712Bx0.a) && Intrinsics.a(this.b, c0712Bx0.b) && Intrinsics.a(this.c, c0712Bx0.c) && Intrinsics.a(this.d, c0712Bx0.d);
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer g() {
        return this.d;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Integer q() {
        return this.c;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        if (bool != null) {
            str = bool.booleanValue() ? "-" : "+";
        } else {
            str = " ";
        }
        sb.append(str);
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.Sb2
    @Nullable
    public final Boolean w() {
        return this.a;
    }

    @Override // defpackage.Sb2
    public final void x(@Nullable Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.Sb2
    public final void z(@Nullable Integer num) {
        this.c = num;
    }

    public C0712Bx0(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }
}

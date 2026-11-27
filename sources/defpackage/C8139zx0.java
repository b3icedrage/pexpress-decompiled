package defpackage;

import io.jsonwebtoken.JwtParser;
import j$.time.DateTimeException;
import j$.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8139zx0 implements InterfaceC2966bZ1, InterfaceC2928bN<C8139zx0> {

    @Nullable
    public Integer a;

    @Nullable
    public Integer b;

    @Nullable
    public Q9 c;

    @Nullable
    public Integer d;

    @Nullable
    public Integer e;

    @Nullable
    public Integer f;

    public C8139zx0() {
        this(0);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void A(@Nullable Integer num) {
        this.e = num;
    }

    @Override // defpackage.InterfaceC2928bN
    public final C8139zx0 a() {
        return new C8139zx0(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void b(@Nullable C3997gU c3997gU) {
        this.f = c3997gU != null ? Integer.valueOf(c3997gU.b(9)) : null;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Q9 c() {
        return this.c;
    }

    @NotNull
    public final FR0 d() {
        int iIntValue;
        int iIntValue2;
        Integer num = this.a;
        if (num != null) {
            iIntValue = num.intValue();
            Integer num2 = this.b;
            if (num2 != null && ((iIntValue + 11) % 12) + 1 != (iIntValue2 = num2.intValue())) {
                throw new IllegalArgumentException(C4564j.c(iIntValue, iIntValue2, "Inconsistent hour and hour-of-am-pm: hour is ", ", but hour-of-am-pm is ").toString());
            }
            Q9 q9 = this.c;
            if (q9 != null) {
                if ((q9 == Q9.d) != (iIntValue >= 12)) {
                    throw new IllegalArgumentException(("Inconsistent hour and the AM/PM marker: hour is " + iIntValue + ", but the AM/PM marker is " + q9).toString());
                }
            }
        } else {
            Integer num3 = this.b;
            Integer numValueOf = null;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                Q9 q10 = this.c;
                if (q10 != null) {
                    if (iIntValue3 == 12) {
                        iIntValue3 = 0;
                    }
                    numValueOf = Integer.valueOf(iIntValue3 + (q10 != Q9.d ? 0 : 12));
                }
            }
            if (numValueOf == null) {
                Intrinsics.checkNotNullParameter("Incomplete time: missing hour", "message");
                throw new NT("Incomplete time: missing hour");
            }
            iIntValue = numValueOf.intValue();
        }
        Integer num4 = this.d;
        C7820yR0.a(num4, "minute");
        int iIntValue4 = num4.intValue();
        Integer num5 = this.e;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        Integer num6 = this.f;
        try {
            LocalTime localTimeOf = LocalTime.of(iIntValue, iIntValue4, iIntValue5, num6 != null ? num6.intValue() : 0);
            Intrinsics.checkNotNull(localTimeOf);
            return new FR0(localTimeOf);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void e(@Nullable Integer num) {
        this.b = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C8139zx0)) {
            return false;
        }
        C8139zx0 c8139zx0 = (C8139zx0) obj;
        return Intrinsics.a(this.a, c8139zx0.a) && Intrinsics.a(this.b, c8139zx0.b) && this.c == c8139zx0.c && Intrinsics.a(this.d, c8139zx0.d) && Intrinsics.a(this.e, c8139zx0.e) && Intrinsics.a(this.f, c8139zx0.f);
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer h() {
        return this.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        Integer num2 = this.b;
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 31) + iIntValue;
        Q9 q9 = this.c;
        int iHashCode = ((q9 != null ? q9.hashCode() : 0) * 31) + iIntValue2;
        Integer num3 = this.d;
        int iIntValue3 = ((num3 != null ? num3.intValue() : 0) * 31) + iHashCode;
        Integer num4 = this.e;
        int iIntValue4 = ((num4 != null ? num4.intValue() : 0) * 31) + iIntValue3;
        Integer num5 = this.f;
        return iIntValue4 + (num5 != null ? num5.intValue() : 0);
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void i(@Nullable Integer num) {
        this.d = num;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final C3997gU l() {
        Integer num = this.f;
        if (num != null) {
            return new C3997gU(num.intValue(), 9);
        }
        return null;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer m() {
        return this.b;
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void o(@Nullable Q9 q9) {
        this.c = q9;
    }

    @Override // defpackage.InterfaceC2966bZ1
    public final void t(@Nullable Integer num) {
        this.a = num;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    @NotNull
    public final String toString() {
        String strL;
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.d;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.e;
        sb.append(num != null ? num : "??");
        sb.append(JwtParser.SEPARATOR_CHAR);
        Integer num2 = this.f;
        if (num2 != null) {
            String strValueOf = String.valueOf(num2.intValue());
            strL = StringsKt.L(9 - strValueOf.length(), strValueOf);
            if (strL == null) {
                strL = "???";
            }
        } else {
            strL = "???";
        }
        sb.append(strL);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer v() {
        return this.a;
    }

    @Override // defpackage.InterfaceC2966bZ1
    @Nullable
    public final Integer y() {
        return this.e;
    }

    public /* synthetic */ C8139zx0(int i) {
        this(null, null, null, null, null, null);
    }

    public C8139zx0(@Nullable Integer num, @Nullable Integer num2, @Nullable Q9 q9, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.a = num;
        this.b = num2;
        this.c = q9;
        this.d = num3;
        this.e = num4;
        this.f = num5;
    }
}

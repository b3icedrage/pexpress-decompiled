package defpackage;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7929yx0 implements InterfaceC6145qT, InterfaceC2928bN<C7929yx0> {

    @Nullable
    public Integer a;

    @Nullable
    public Integer b;

    @Nullable
    public Integer c;

    @Nullable
    public Integer d;

    public C7929yx0() {
        this(null, null, null, null);
    }

    @Override // defpackage.InterfaceC2928bN
    public final C7929yx0 a() {
        return new C7929yx0(this.a, this.b, this.c, this.d);
    }

    @NotNull
    public final C7189vR0 b() {
        Integer num = this.a;
        C7820yR0.a(num, "year");
        int iIntValue = num.intValue();
        Integer num2 = this.b;
        C7820yR0.a(num2, "monthNumber");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.c;
        C7820yR0.a(num3, "dayOfMonth");
        try {
            LocalDate localDateOf = LocalDate.of(iIntValue, iIntValue2, num3.intValue());
            Intrinsics.checkNotNull(localDateOf);
            C7189vR0 c7189vR0 = new C7189vR0(localDateOf);
            Integer num4 = this.d;
            if (num4 != null) {
                int iIntValue3 = num4.intValue();
                DayOfWeek dayOfWeek = localDateOf.getDayOfWeek();
                Intrinsics.checkNotNullExpressionValue(dayOfWeek, "getDayOfWeek(...)");
                Intrinsics.checkNotNullParameter(dayOfWeek, "<this>");
                if (iIntValue3 != dayOfWeek.ordinal() + 1) {
                    StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                    if (1 > iIntValue3 || iIntValue3 >= 8) {
                        throw new IllegalArgumentException(EK.e(iIntValue3, "Expected ISO day-of-week number in 1..7, got ").toString());
                    }
                    sb.append((DayOfWeek) TT.a.get(iIntValue3 - 1));
                    sb.append(" but the date is ");
                    sb.append(c7189vR0);
                    sb.append(", which is a ");
                    DayOfWeek dayOfWeek2 = localDateOf.getDayOfWeek();
                    Intrinsics.checkNotNullExpressionValue(dayOfWeek2, "getDayOfWeek(...)");
                    sb.append(dayOfWeek2);
                    throw new NT(sb.toString());
                }
            }
            return c7189vR0;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C7929yx0)) {
            return false;
        }
        C7929yx0 c7929yx0 = (C7929yx0) obj;
        return Intrinsics.a(this.a, c7929yx0.a) && Intrinsics.a(this.b, c7929yx0.b) && Intrinsics.a(this.c, c7929yx0.c) && Intrinsics.a(this.d, c7929yx0.d);
    }

    @Override // defpackage.InterfaceC6145qT
    public final void f(@Nullable Integer num) {
        this.b = num;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        int iHashCode2 = ((num2 != null ? num2.hashCode() : 0) * 31) + iHashCode;
        Integer num3 = this.c;
        int iHashCode3 = ((num3 != null ? num3.hashCode() : 0) * 31) + iHashCode2;
        Integer num4 = this.d;
        return ((num4 != null ? num4.hashCode() : 0) * 31) + iHashCode3;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer j() {
        return this.a;
    }

    @Override // defpackage.InterfaceC6145qT
    public final void k(@Nullable Integer num) {
        this.c = num;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer n() {
        return this.d;
    }

    @Override // defpackage.InterfaceC6145qT
    public final void p(@Nullable Integer num) {
        this.a = num;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer r() {
        return this.c;
    }

    @Override // defpackage.InterfaceC6145qT
    @Nullable
    public final Integer s() {
        return this.b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Object obj2 = this.b;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append('-');
        Object obj3 = this.c;
        if (obj3 == null) {
            obj3 = "??";
        }
        sb.append(obj3);
        sb.append(" (day of week is ");
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC6145qT
    public final void u(@Nullable Integer num) {
        this.d = num;
    }

    public C7929yx0(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }
}

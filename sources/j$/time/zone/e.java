package j$.time.zone;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C1575Mz0;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final j$.time.j a;
    private final byte b;
    private final DayOfWeek c;
    private final LocalTime d;
    private final boolean e;
    private final d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    e(j$.time.j jVar, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = jVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        int iQ;
        LocalTime localTime = this.d;
        boolean z = this.e;
        int secondOfDay = z ? 86400 : localTime.toSecondOfDay();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (secondOfDay % 3600 == 0) {
            iQ = z ? 24 : localTime.Q();
        } else {
            iQ = 31;
        }
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + UserVerificationMethods.USER_VERIFY_PATTERN : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.p() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.p()) << 19) + (iQ << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (iQ == 31) {
            objectOutput.writeInt(secondOfDay);
        }
        if (i == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    static e b(ObjectInput objectInput) {
        int totalSeconds;
        ZoneOffset zoneOffsetOfTotalSeconds;
        int i = objectInput.readInt();
        j$.time.j jVarQ = j$.time.j.Q(i >>> 28);
        int i2 = ((264241152 & i) >>> 22) - 32;
        int i3 = (3670016 & i) >>> 19;
        DayOfWeek dayOfWeekR = i3 == 0 ? null : DayOfWeek.r(i3);
        int i4 = (507904 & i) >>> 14;
        d dVar = d.values()[(i & 12288) >>> 12];
        int i5 = (i & 4080) >>> 4;
        int i6 = (i & 12) >>> 2;
        int i7 = i & 3;
        LocalTime localTimeY = i4 == 31 ? LocalTime.Y(objectInput.readInt()) : LocalTime.W(i4 % 24);
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i5 == 255 ? objectInput.readInt() : (i5 - 128) * 900);
        if (i6 == 3) {
            totalSeconds = objectInput.readInt();
        } else {
            totalSeconds = (i6 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds();
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(totalSeconds);
        if (i7 == 3) {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(objectInput.readInt());
        } else {
            zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds((i7 * 1800) + zoneOffsetOfTotalSeconds2.getTotalSeconds());
        }
        ZoneOffset zoneOffset = zoneOffsetOfTotalSeconds;
        boolean z = i4 == 24;
        Objects.requireNonNull(jVarQ, "month");
        Objects.requireNonNull(localTimeY, C1575Mz0.TIME);
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetBefore");
        Objects.requireNonNull(zoneOffset, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTimeY.equals(LocalTime.e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeY.R() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(jVarQ, i2, dayOfWeekR, localTimeY, z, dVar, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3, zoneOffset);
    }

    public final b a(int i) {
        LocalDate localDateB0;
        j$.time.j jVar = this.a;
        DayOfWeek dayOfWeek = this.c;
        byte b = this.b;
        if (b < 0) {
            s.d.getClass();
            localDateB0 = LocalDate.b0(i, jVar, jVar.A(s.W(i)) + 1 + b);
            if (dayOfWeek != null) {
                localDateB0 = localDateB0.g(new o(dayOfWeek.p(), 1));
            }
        } else {
            localDateB0 = LocalDate.b0(i, jVar, b);
            if (dayOfWeek != null) {
                localDateB0 = localDateB0.g(new o(dayOfWeek.p(), 0));
            }
        }
        if (this.e) {
            localDateB0 = localDateB0.f0(1L);
        }
        LocalDateTime localDateTimeZ = LocalDateTime.Z(localDateB0, this.d);
        int i2 = c.a[this.f.ordinal()];
        ZoneOffset zoneOffset = this.h;
        if (i2 == 1) {
            localDateTimeZ = localDateTimeZ.d0(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        } else if (i2 == 2) {
            localDateTimeZ = localDateTimeZ.d0(zoneOffset.getTotalSeconds() - this.g.getTotalSeconds());
        }
        return new b(localDateTimeZ, zoneOffset, this.i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int secondOfDay = ((this.d.toSecondOfDay() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (secondOfDay + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        j$.time.j jVar = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(jVar.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(jVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}

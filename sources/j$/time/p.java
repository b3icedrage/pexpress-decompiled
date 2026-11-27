package j$.time;

import defpackage.V31;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class p implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public p() {
    }

    p(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).R(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).o0(objectOutput);
                return;
            case 4:
                ((LocalTime) obj).i0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).j0(objectOutput);
                return;
            case 6:
                ((w) obj).X(objectOutput);
                return;
            case 7:
                ((u) obj).X(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).a0(objectOutput);
                return;
            case 9:
                ((n) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((r) obj).R(objectOutput);
                return;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((t) obj).X(objectOutput);
                return;
            case 13:
                ((l) obj).A(objectOutput);
                return;
            case 14:
                ((o) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = b(b, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.R(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.e0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.Z(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.e0(objectInput));
            case 6:
                return w.R(objectInput);
            case 7:
                int i = u.d;
                return ZoneId.H(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.Z(objectInput);
            case 9:
                return n.A(objectInput);
            case 10:
                return OffsetDateTime.Q(objectInput);
            case 11:
                int i2 = r.b;
                return r.r(objectInput.readInt());
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return t.R(objectInput);
            case 13:
                return l.r(objectInput);
            case 14:
                return o.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}

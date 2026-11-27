package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: wj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC7465wj2 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC1646Nw.e),
    ENUM(null),
    MESSAGE(null);

    public final Serializable d;

    EnumC7465wj2(Serializable serializable) {
        this.d = serializable;
    }
}

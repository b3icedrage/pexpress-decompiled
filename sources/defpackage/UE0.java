package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum UE0 {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1565Mw.class, AbstractC1565Mw.e),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Serializable d;

    UE0(Class cls, Serializable serializable) {
        this.d = serializable;
    }
}

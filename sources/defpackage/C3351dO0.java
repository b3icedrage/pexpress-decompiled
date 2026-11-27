package defpackage;

import java.math.BigDecimal;

/* JADX INFO: renamed from: dO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3351dO0 extends Number {
    public final String d;

    public C3351dO0(String str) {
        this.d = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3351dO0)) {
            return false;
        }
        Object obj2 = ((C3351dO0) obj).d;
        String str = this.d;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.d;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.d;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.d;
    }
}

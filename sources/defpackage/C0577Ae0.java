package defpackage;

/* JADX INFO: renamed from: Ae0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0577Ae0 implements InterfaceC8073ze0 {
    public final String a;
    public final int b;

    public C0577Ae0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.InterfaceC8073ze0
    public final long a() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = c().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(C1039Gc0.d("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    @Override // defpackage.InterfaceC8073ze0
    public final double b() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = c().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(C1039Gc0.d("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    @Override // defpackage.InterfaceC8073ze0
    public final String c() {
        return this.b == 0 ? "" : this.a;
    }

    @Override // defpackage.InterfaceC8073ze0
    public final boolean d() {
        if (this.b == 0) {
            return false;
        }
        String strTrim = c().trim();
        if (C7161vI.e.matcher(strTrim).matches()) {
            return true;
        }
        if (C7161vI.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(C1039Gc0.d("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    @Override // defpackage.InterfaceC8073ze0
    public final int i() {
        return this.b;
    }
}

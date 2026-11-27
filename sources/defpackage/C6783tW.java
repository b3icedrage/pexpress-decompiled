package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: renamed from: tW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6783tW extends Vc2 {
    public DecimalFormat a;

    public C6783tW(int i) {
        b(i);
    }

    @Override // defpackage.Vc2
    public final String a(float f) {
        return this.a.format(f);
    }

    public final void b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }
}

package defpackage;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public final class QU extends Vc2 {
    public final DecimalFormat a;
    public final int b;

    public QU(int i) {
        this.b = i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.a = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    @Override // defpackage.Vc2
    public final String a(float f) {
        return this.a.format(f);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2537Yx extends AbstractC3946gD {
    public int h;
    public int i;
    public ArrayList j;
    public int k;

    public C2537Yx() {
        super(0);
        this.h = 0;
        this.i = 5;
        this.j = null;
        this.k = 0;
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        StringBuilder sb = new StringBuilder();
        if (this.j != null) {
            for (int i = 0; i < this.j.size(); i++) {
                InterfaceC5451n80 interfaceC5451n80 = (InterfaceC5451n80) this.j.get(i);
                try {
                    if (!interfaceC5451n80.e(qs0)) {
                    }
                } catch (U70 e) {
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 < 4) {
                        c("Exception thrown for evaluator named [" + interfaceC5451n80.getName() + "]", e);
                    } else if (i2 == 4) {
                        N70 n70 = new N70("Exception thrown for evaluator named [" + interfaceC5451n80.getName() + "].", e, 2, this);
                        n70.e(new N70("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        this.d.o(n70);
                    }
                }
            }
            return "";
        }
        StackTraceElement[] stackTraceElementArrA = qs0.a();
        if (stackTraceElementArrA != null) {
            int length = stackTraceElementArrA.length;
            int i3 = this.h;
            if (length > i3) {
                int length2 = this.i;
                if (length2 >= stackTraceElementArrA.length) {
                    length2 = stackTraceElementArrA.length;
                }
                while (i3 < length2) {
                    sb.append("Caller+");
                    sb.append(i3);
                    sb.append("\t at ");
                    sb.append(stackTraceElementArrA[i3]);
                    sb.append(C3766fN.a);
                    i3++;
                }
                return sb.toString();
            }
        }
        return C2459Xx.a;
    }

    public final void m() {
        int i;
        int i2 = this.h;
        if (i2 < 0 || (i = this.i) < 0) {
            a("Invalid depthStart/depthEnd range [" + this.h + ", " + this.i + "] (negative values are not allowed)");
            return;
        }
        if (i2 >= i) {
            a("Invalid depthEnd range [" + this.h + ", " + this.i + "] (start greater or equal to end)");
        }
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        if (strH == null) {
            return;
        }
        try {
            if (strH.contains("..")) {
                String[] strArrSplit = strH.split(Pattern.quote(".."), 2);
                if (strArrSplit.length == 2) {
                    this.h = Integer.parseInt(strArrSplit[0]);
                    this.i = Integer.parseInt(strArrSplit[1]);
                    m();
                } else {
                    a("Failed to parse depth option as range [" + strH + "]");
                }
            } else {
                this.i = Integer.parseInt(strH);
            }
        } catch (NumberFormatException e) {
            c("Failed to parse depth option [" + strH + "]", e);
        }
    }
}

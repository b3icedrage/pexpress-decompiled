package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class QY1 extends OY1 {
    public int h;
    public ArrayList i;
    public ArrayList j;
    public int k;

    public QY1() {
        super(0);
        this.i = null;
        this.j = null;
        this.k = 0;
    }

    @Override // defpackage.AbstractC3946gD
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final String d(InterfaceC6237qt0 interfaceC6237qt0) {
        InterfaceC3882fv0 interfaceC3882fv0H = interfaceC6237qt0.h();
        if (interfaceC3882fv0H == null) {
            return "";
        }
        if (this.i != null) {
            for (int i = 0; i < this.i.size(); i++) {
                InterfaceC5451n80 interfaceC5451n80 = (InterfaceC5451n80) this.i.get(i);
                try {
                    if (interfaceC5451n80.e(interfaceC6237qt0)) {
                        return "";
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
        }
        return q(interfaceC3882fv0H);
    }

    public final void o(StringBuilder sb, String str, int i, InterfaceC3882fv0 interfaceC3882fv0) {
        if (interfaceC3882fv0 == null) {
            return;
        }
        C0957Fb.q(i - 1, sb);
        if (str != null) {
            sb.append(str);
        }
        sb.append(interfaceC3882fv0.b());
        sb.append(": ");
        sb.append(interfaceC3882fv0.getMessage());
        sb.append(C3766fN.a);
        p(sb, i, interfaceC3882fv0);
        InterfaceC3882fv0[] interfaceC3882fv0ArrC = interfaceC3882fv0.c();
        if (interfaceC3882fv0ArrC != null) {
            for (InterfaceC3882fv0 interfaceC3882fv1 : interfaceC3882fv0ArrC) {
                o(sb, "Suppressed: ", i + 1, interfaceC3882fv1);
            }
        }
        o(sb, "Caused by: ", i, interfaceC3882fv0.getCause());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    public final void p(StringBuilder sb, int i, InterfaceC3882fv0 interfaceC3882fv0) {
        UO1[] uo1ArrD = interfaceC3882fv0.d();
        int iA = interfaceC3882fv0.a();
        int length = this.h;
        boolean z = length > uo1ArrD.length;
        if (z) {
            length = uo1ArrD.length;
        }
        if (iA > 0 && z) {
            length -= iA;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            UO1 uo1 = uo1ArrD[i3];
            String string = uo1.toString();
            ArrayList arrayList = this.j;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        C0957Fb.q(i, sb);
                        sb.append(uo1);
                        n(sb, uo1);
                        if (i2 > 0) {
                            sb.append(" [");
                            sb.append(i2);
                            sb.append(" skipped]");
                        }
                        sb.append(C3766fN.a);
                        i2 = 0;
                    } else if (string.contains((String) it.next())) {
                        i2++;
                        if (length < uo1ArrD.length) {
                            length++;
                        }
                    }
                }
            } else {
                C0957Fb.q(i, sb);
                sb.append(uo1);
                n(sb, uo1);
                if (i2 > 0) {
                    sb.append(" [");
                    sb.append(i2);
                    sb.append(" skipped]");
                }
                sb.append(C3766fN.a);
                i2 = 0;
            }
        }
        if (i2 > 0) {
            sb.append(" [");
            sb.append(i2);
            sb.append(" skipped]");
            sb.append(C3766fN.a);
        }
        if (iA <= 0 || !z) {
            return;
        }
        C0957Fb.q(i, sb);
        sb.append("... ");
        sb.append(interfaceC3882fv0.a());
        sb.append(" common frames omitted");
        sb.append(C3766fN.a);
    }

    public String q(InterfaceC3882fv0 interfaceC3882fv0) {
        StringBuilder sb = new StringBuilder(2048);
        o(sb, null, 1, interfaceC3882fv0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        if (strH == null) {
            this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        } else {
            String lowerCase = strH.toLowerCase();
            if ("full".equals(lowerCase)) {
                this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else if ("short".equals(lowerCase)) {
                this.h = 1;
            } else {
                try {
                    this.h = Integer.parseInt(lowerCase);
                } catch (NumberFormatException unused) {
                    a("Could not parse [" + lowerCase + "] as an integer");
                    this.h = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                }
            }
        }
        this.e = true;
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void stop() {
        this.i = null;
        this.e = false;
    }

    public void n(StringBuilder sb, UO1 uo1) {
    }
}

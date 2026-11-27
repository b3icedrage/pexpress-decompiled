package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: cV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3162cV0 extends AbstractC3946gD {
    public String h;
    public String i;

    public C3162cV0() {
        super(0);
        this.i = "";
    }

    @Override // defpackage.AbstractC3946gD
    public final String d(QS0 qs0) {
        Map<String, String> mapK = qs0.k();
        if (mapK == null) {
            return this.i;
        }
        String str = this.h;
        if (str != null) {
            String str2 = mapK.get(str);
            return str2 != null ? str2 : this.i;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : mapK.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void start() {
        String strH = h();
        String[] strArr = new String[2];
        if (strH != null) {
            strArr[0] = strH;
            int iIndexOf = strH.indexOf(":-");
            if (iIndexOf != -1) {
                strArr[0] = strH.substring(0, iIndexOf);
                strArr[1] = strH.substring(iIndexOf + 2);
            }
        }
        this.h = strArr[0];
        String str = strArr[1];
        if (str != null) {
            this.i = str;
        }
        this.e = true;
    }

    @Override // defpackage.AbstractC3946gD, defpackage.InterfaceC7183vP0
    public final void stop() {
        this.h = null;
        this.e = false;
    }
}

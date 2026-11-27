package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.jivosite.sdk.model.pojo.rate.RateSettings;

/* JADX INFO: renamed from: be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2983be implements InterfaceC1608Nj0, InterfaceC5056lH {
    public final /* synthetic */ int d;

    public static int a(int i, boolean z, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static String b(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 1:
                return Boolean.valueOf(((C3970gL) obj).a.a);
            default:
                RateSettings rateSettings = ((C1774Pm1) obj).a;
                if (rateSettings != null) {
                    return rateSettings.e;
                }
                return null;
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return ExecutorsRegistrar.a.get();
    }
}

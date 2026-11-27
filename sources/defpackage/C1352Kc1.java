package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;

/* JADX INFO: renamed from: Kc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1352Kc1 extends AbstractC1430Lc1<InterfaceC6237qt0> {
    public static final HashMap i;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        i = map2;
        map.putAll(C5546nc1.h);
        map.put("d", C5935pT.class.getName());
        map.put("date", C5935pT.class.getName());
        map2.put(C5935pT.class.getName(), "date");
        map.put("r", C3661er1.class.getName());
        map.put("relative", C3661er1.class.getName());
        map2.put(C3661er1.class.getName(), "relative");
        map.put("level", C6134qP0.class.getName());
        map.put("le", C6134qP0.class.getName());
        map.put(R51.PUSH_MINIFIED_BUTTON_ICON, C6134qP0.class.getName());
        map2.put(C6134qP0.class.getName(), "level");
        map.put("t", DY1.class.getName());
        map.put("thread", DY1.class.getName());
        map2.put(DY1.class.getName(), "thread");
        map.put("lo", LS0.class.getName());
        map.put("logger", LS0.class.getName());
        map.put("c", LS0.class.getName());
        map2.put(LS0.class.getName(), "logger");
        map.put("m", C7213vZ0.class.getName());
        map.put("msg", C7213vZ0.class.getName());
        map.put("message", C7213vZ0.class.getName());
        map2.put(C7213vZ0.class.getName(), "message");
        map.put("C", VC.class.getName());
        map.put("class", VC.class.getName());
        map2.put(VC.class.getName(), "class");
        map.put("M", C3479e01.class.getName());
        map.put("method", C3479e01.class.getName());
        map2.put(C3479e01.class.getName(), "method");
        map.put("L", C3357dQ0.class.getName());
        map.put("line", C3357dQ0.class.getName());
        map2.put(C3357dQ0.class.getName(), "line");
        map.put("F", C2211Vc0.class.getName());
        map.put("file", C2211Vc0.class.getName());
        map2.put(C2211Vc0.class.getName(), "file");
        map.put("X", C3162cV0.class.getName());
        map.put("mdc", C3162cV0.class.getName());
        map.put("ex", QY1.class.getName());
        map.put("exception", QY1.class.getName());
        map.put("rEx", TA1.class.getName());
        map.put("rootException", TA1.class.getName());
        map.put("throwable", QY1.class.getName());
        map.put("xEx", C1111Ha0.class.getName());
        map.put("xException", C1111Ha0.class.getName());
        map.put("xThrowable", C1111Ha0.class.getName());
        map.put("nopex", E51.class.getName());
        map.put("nopexception", E51.class.getName());
        map.put("cn", BM.class.getName());
        map.put("contextName", BM.class.getName());
        map2.put(BM.class.getName(), "contextName");
        map.put("caller", C2537Yx.class.getName());
        map2.put(C2537Yx.class.getName(), "caller");
        map.put("marker", WW0.class.getName());
        map2.put(WW0.class.getName(), "marker");
        map.put("property", C8094zj1.class.getName());
        map.put(R51.PUSH_MINIFIED_BUTTON_TEXT, C4196hQ0.class.getName());
        map.put("black", C1320Js.class.getName());
        map.put("red", C2330Wo1.class.getName());
        map.put("green", C2323Wm0.class.getName());
        map.put("yellow", Ol2.class.getName());
        map.put("blue", C4763jt.class.getName());
        map.put("magenta", C4001gV0.class.getName());
        map.put("cyan", WR.class.getName());
        map.put("white", Ci2.class.getName());
        map.put("gray", C2085Tm0.class.getName());
        map.put("boldRed", C7496wt.class.getName());
        map.put("boldGreen", C7075ut.class.getName());
        map.put("boldYellow", C7916yt.class.getName());
        map.put("boldBlue", C6655st.class.getName());
        map.put("boldMagenta", C7285vt.class.getName());
        map.put("boldCyan", C6865tt.class.getName());
        map.put("boldWhite", C7706xt.class.getName());
        map.put("highlight", C0763Co0.class.getName());
        map.put("lsn", ER0.class.getName());
        map2.put(ER0.class.getName(), "lsn");
        map.put("prefix", C2488Yg1.class.getName());
    }

    public C1352Kc1() {
        new HashMap();
    }

    @Override // defpackage.AbstractC2932bO0
    public final String q(QS0 qs0) {
        return !this.h ? "" : new StringBuilder(UserVerificationMethods.USER_VERIFY_HANDPRINT).toString();
    }
}

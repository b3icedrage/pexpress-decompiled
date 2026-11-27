package defpackage;

import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: xK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7588xK extends AbstractC5858p5 {
    public final /* synthetic */ int h;

    public /* synthetic */ C7588xK(int i) {
        this.h = i;
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        Integer numValueOf;
        switch (this.h) {
            case 0:
                String value = attributesImpl.getValue("port");
                if (value == null) {
                    numValueOf = 4321;
                } else {
                    try {
                        numValueOf = Integer.valueOf(value);
                    } catch (NumberFormatException unused) {
                        l("Port " + value + " in ConsolePlugin config is not a correct number");
                        numValueOf = null;
                    }
                }
                HS0 hs0 = c3315dC0.e;
                C8019zN1 c8019zN1 = new C8019zN1();
                c8019zN1.B = false;
                c8019zN1.j(hs0);
                c8019zN1.B = true;
                c8019zN1.p = "localhost";
                c8019zN1.q = numValueOf.intValue();
                c8019zN1.start();
                hs0.d("ROOT").b(c8019zN1);
                n("Sending LoggingEvents to the plugin using port " + numValueOf);
                break;
        }
    }

    @Override // defpackage.AbstractC5858p5
    public void r(C3315dC0 c3315dC0, String str) {
        switch (this.h) {
            case 1:
                String strU = c3315dC0.u(str);
                n("Setting logger context name as [" + strU + "]");
                try {
                    this.e.b(strU);
                } catch (IllegalStateException e) {
                    m("Failed to rename context [" + this.e.e + "] as [" + strU + "]", e);
                    return;
                }
                break;
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        int i = this.h;
    }

    private final void w(C3315dC0 c3315dC0, String str) {
    }

    private final void x(C3315dC0 c3315dC0, String str) {
    }

    private final void v(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
    }
}

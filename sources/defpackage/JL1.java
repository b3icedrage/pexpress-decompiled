package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public final class JL1 extends AbstractC5858p5 implements InterfaceC6668sx0 {
    public ArrayList h;

    @Override // defpackage.InterfaceC6668sx0
    public final void d(VC1 vc1) {
        this.h.add(vc1);
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        this.h = new ArrayList();
        c3315dC0.q(this);
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        c3315dC0.l.remove(this);
        Object objPeek = c3315dC0.h.peek();
        if (objPeek instanceof KL1) {
            HashMap map = new HashMap(c3315dC0.j);
            ArrayList arrayList = this.h;
            ((KL1) objPeek).getClass();
            new C2207Vb(arrayList, map);
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: Zv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2610Zv0 extends AbstractC5858p5 {
    public final Stack<C2837aw0> h = new Stack<>();

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        ZH zhQ;
        C2837aw0 c2837aw0 = new C2837aw0();
        Stack<C2837aw0> stack = this.h;
        boolean zIsEmpty = stack.isEmpty();
        stack.push(c2837aw0);
        if (zIsEmpty) {
            c3315dC0.t(this);
            try {
                if (C6496s70.class.getClassLoader().loadClass("org.codehaus.janino.ScriptEvaluator") != null) {
                    c2837aw0.d = true;
                    String value = attributesImpl.getValue("condition");
                    if (C8056za.m(value)) {
                        return;
                    }
                    String strT = C8056za.t(value, c3315dC0, this.e);
                    C0827Dj1 c0827Dj1 = new C0827Dj1(c3315dC0);
                    c0827Dj1.j(this.e);
                    try {
                        zhQ = c0827Dj1.q(strT);
                    } catch (Exception e) {
                        m("Failed to parse condition [" + strT + "]", e);
                        zhQ = null;
                    }
                    if (zhQ != null) {
                        c2837aw0.a = Boolean.valueOf(zhQ.b());
                        return;
                    }
                    return;
                }
            } catch (ClassNotFoundException unused) {
            }
            l("Could not find Janino library on the class path. Skipping conditional processing.");
            l("See also http://logback.qos.ch/codes.html#ifJanino");
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        C2837aw0 c2837aw0Pop = this.h.pop();
        if (c2837aw0Pop.d) {
            Object objPeek = c3315dC0.h.peek();
            if (objPeek == null) {
                throw new IllegalStateException("Unexpected null object on stack");
            }
            if (!(objPeek instanceof C2610Zv0)) {
                throw new IllegalStateException("Unexpected object of type [" + objPeek.getClass() + "] on stack");
            }
            if (objPeek != this) {
                throw new IllegalStateException("IfAction different then current one on stack");
            }
            c3315dC0.s();
            Boolean bool = c2837aw0Pop.a;
            if (bool == null) {
                l("Failed to determine \"if then else\" result");
                return;
            }
            ArrayList arrayList = c2837aw0Pop.b;
            if (!bool.booleanValue()) {
                arrayList = c2837aw0Pop.c;
            }
            if (arrayList != null) {
                C7247vi c7247vi = c3315dC0.k.g;
                ((List) c7247vi.c).addAll(c7247vi.a + 1, arrayList);
            }
        }
    }
}

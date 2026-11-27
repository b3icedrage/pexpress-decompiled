package defpackage;

import java.util.ArrayList;
import java.util.Stack;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: zY1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8052zY1 extends AbstractC5858p5 {
    public final Stack<C7842yY1> h = new Stack<>();

    public static boolean w(C3315dC0 c3315dC0) {
        Stack<C2837aw0> stack;
        Object objPeek = c3315dC0.h.peek();
        if (!(objPeek instanceof C2610Zv0) || (stack = ((C2610Zv0) objPeek).h) == null || stack.isEmpty()) {
            return false;
        }
        return stack.peek().d;
    }

    @Override // defpackage.AbstractC5858p5
    public final void q(C3315dC0 c3315dC0, String str, AttributesImpl attributesImpl) {
        if (w(c3315dC0)) {
            C7842yY1 c7842yY1 = new C7842yY1();
            if (c3315dC0.l.isEmpty()) {
                c3315dC0.q(c7842yY1);
                c7842yY1.e = true;
            }
            this.h.push(c7842yY1);
        }
    }

    @Override // defpackage.AbstractC5858p5
    public final void s(C3315dC0 c3315dC0, String str) {
        if (w(c3315dC0)) {
            C7842yY1 c7842yY1Pop = this.h.pop();
            if (c7842yY1Pop.e) {
                c3315dC0.l.remove(c7842yY1Pop);
                Object objPeek = c3315dC0.h.peek();
                if (!(objPeek instanceof C2610Zv0)) {
                    throw new IllegalStateException("Missing IfAction on top of stack");
                }
                ArrayList arrayList = c7842yY1Pop.d;
                arrayList.remove(0);
                arrayList.remove(arrayList.size() - 1);
                v((C2610Zv0) objPeek, arrayList);
            }
        }
    }

    public abstract void v(C2610Zv0 c2610Zv0, ArrayList arrayList);
}

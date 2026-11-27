package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: mM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5286mM1 extends C5494nM {
    public HashMap<C5439n50, List<AbstractC5858p5>> h;

    public final void q(C5439n50 c5439n50, AbstractC5858p5 abstractC5858p5) {
        abstractC5858p5.j(this.e);
        HashMap<C5439n50, List<AbstractC5858p5>> map = this.h;
        List<AbstractC5858p5> arrayList = map.get(c5439n50);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(c5439n50, arrayList);
        }
        arrayList.add(abstractC5858p5);
    }

    public final String toString() {
        return "SimpleRuleStore ( rules = " + this.h + "   )";
    }
}

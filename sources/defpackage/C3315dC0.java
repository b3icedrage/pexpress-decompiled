package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: dC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3315dC0 extends C5494nM implements InterfaceC7884yj1 {
    public final Stack<Object> h;
    public final HashMap i;
    public final HashMap j;
    public final C3524eC0 k;
    public final ArrayList l = new ArrayList();
    public final C7377wJ1 m;

    public C3315dC0(HS0 hs0, C3524eC0 c3524eC0) {
        C7377wJ1 c7377wJ1 = new C7377wJ1();
        c7377wJ1.d = new HashMap();
        this.m = c7377wJ1;
        this.e = hs0;
        this.k = c3524eC0;
        this.h = new Stack<>();
        this.i = new HashMap(5);
        this.j = new HashMap(5);
    }

    @Override // defpackage.InterfaceC7884yj1
    public final String a(String str) {
        String str2 = (String) this.j.get(str);
        return str2 != null ? str2 : this.e.a(str);
    }

    public final void q(InterfaceC6668sx0 interfaceC6668sx0) {
        ArrayList arrayList = this.l;
        if (!arrayList.contains(interfaceC6668sx0)) {
            arrayList.add(interfaceC6668sx0);
            return;
        }
        p("InPlayListener " + interfaceC6668sx0 + " has been already registered");
    }

    public final void r(VC1 vc1) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((InterfaceC6668sx0) it.next()).d(vc1);
        }
    }

    public final void s() {
        this.h.pop();
    }

    public final void t(Object obj) {
        this.h.push(obj);
    }

    public final String u(String str) {
        if (str == null) {
            return null;
        }
        return C8056za.t(str, this, this.e);
    }
}

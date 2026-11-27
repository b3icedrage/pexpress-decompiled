package defpackage;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: in0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4487in0 {
    public final P90 a = P90.g;
    public final FT0.a b = FT0.d;
    public final EnumC7645xc0.a c = EnumC7645xc0.d;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public boolean g = false;
    public final int h = 2;
    public final int i = 2;
    public final boolean j = true;
    public final boolean k = true;
    public final EnumC2852b02.a l = EnumC2852b02.d;
    public final EnumC2852b02.b m = EnumC2852b02.e;
    public final LinkedList<InterfaceC2095Tp1> n = new LinkedList<>();

    public final Gson a() {
        int i;
        Y52 y52;
        Y52 y53;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = QO1.a;
        C3161cV.a.C0263a c0263a = C3161cV.a.b;
        int i2 = this.h;
        if (i2 != 2 && (i = this.i) != 2) {
            C3161cV c3161cV = new C3161cV(c0263a, i2, i);
            Y52 y54 = W52.a;
            Y52 y55 = new Y52(Date.class, c3161cV);
            if (z) {
                QO1.b bVar = QO1.c;
                bVar.getClass();
                y52 = new Y52(bVar.a, new C3161cV(bVar, i2, i));
                QO1.a aVar = QO1.b;
                aVar.getClass();
                y53 = new Y52(aVar.a, new C3161cV(aVar, i2, i));
            } else {
                y52 = null;
                y53 = null;
            }
            arrayList3.add(y55);
            if (z) {
                arrayList3.add(y52);
                arrayList3.add(y53);
            }
        }
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.j, this.k, this.b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.l, this.m, new ArrayList(this.n));
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DX implements InterfaceC7206vX {
    public final Fi2 d;
    public int f;
    public int g;
    public Fi2 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.d;
    public int h = 1;
    public C7312w10 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final /* synthetic */ a[] m;

        static {
            a aVar = new a("UNKNOWN", 0);
            d = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            e = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            g = aVar3;
            a aVar4 = new a("LEFT", 3);
            h = aVar4;
            a aVar5 = new a("RIGHT", 4);
            i = aVar5;
            a aVar6 = new a("TOP", 5);
            j = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            k = aVar7;
            a aVar8 = new a("BASELINE", 7);
            l = aVar8;
            m = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) m.clone();
        }
    }

    public DX(Fi2 fi2) {
        this.d = fi2;
    }

    @Override // defpackage.InterfaceC7206vX
    public final void a(InterfaceC7206vX interfaceC7206vX) {
        ArrayList<DX> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DX) it.next()).j) {
                return;
            }
        }
        this.c = true;
        Fi2 fi2 = this.a;
        if (fi2 != null) {
            fi2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        DX dx = null;
        int i = 0;
        for (DX dx2 : arrayList) {
            if (!(dx2 instanceof C7312w10)) {
                i++;
                dx = dx2;
            }
        }
        if (dx != null && i == 1 && dx.j) {
            C7312w10 c7312w10 = this.i;
            if (c7312w10 != null) {
                if (!c7312w10.j) {
                    return;
                } else {
                    this.f = this.h * c7312w10.g;
                }
            }
            d(dx.g + this.f);
        }
        Fi2 fi3 = this.a;
        if (fi3 != null) {
            fi3.a(this);
        }
    }

    public final void b(Fi2 fi2) {
        this.k.add(fi2);
        if (this.j) {
            fi2.a(fi2);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC7206vX interfaceC7206vX : this.k) {
            interfaceC7206vX.a(interfaceC7206vX);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.k0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}

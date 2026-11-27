package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class IK {
    public int b;
    public boolean c;
    public final TK d;
    public final a e;
    public IK f;
    public TN1 i;
    public HashSet<IK> a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

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

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("NONE", 0);
            a aVar2 = new a("LEFT", 1);
            d = aVar2;
            a aVar3 = new a("TOP", 2);
            e = aVar3;
            a aVar4 = new a("RIGHT", 3);
            g = aVar4;
            a aVar5 = new a("BOTTOM", 4);
            h = aVar5;
            a aVar6 = new a("BASELINE", 5);
            i = aVar6;
            a aVar7 = new a("CENTER", 6);
            j = aVar7;
            a aVar8 = new a("CENTER_X", 7);
            k = aVar8;
            a aVar9 = new a("CENTER_Y", 8);
            l = aVar9;
            m = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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

    public IK(TK tk, a aVar) {
        this.d = tk;
        this.e = aVar;
    }

    public final void a(IK ik, int i) {
        b(ik, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(IK ik, int i, int i2, boolean z) {
        if (ik == null) {
            j();
            return true;
        }
        if (!z && !i(ik)) {
            return false;
        }
        this.f = ik;
        if (ik.a == null) {
            ik.a = new HashSet<>();
        }
        HashSet<IK> hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, Ei2 ei2, ArrayList arrayList) {
        HashSet<IK> hashSet = this.a;
        if (hashSet != null) {
            Iterator<IK> it = hashSet.iterator();
            while (it.hasNext()) {
                C3229cn0.a(it.next().d, i, arrayList, ei2);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        IK ik;
        if (this.d.i0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (ik = this.f) == null || ik.d.i0 != 8) ? this.g : i;
    }

    public final IK f() {
        a aVar = this.e;
        int iOrdinal = aVar.ordinal();
        TK tk = this.d;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return tk.L;
            case 2:
                return tk.M;
            case 3:
                return tk.J;
            case 4:
                return tk.K;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public final boolean g() {
        HashSet<IK> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<IK> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(IK ik) {
        if (ik == null) {
            return false;
        }
        a aVar = a.i;
        a aVar2 = this.e;
        TK tk = ik.d;
        a aVar3 = ik.e;
        if (aVar3 == aVar2) {
            return aVar2 != aVar || (tk.E && this.d.E);
        }
        int iOrdinal = aVar2.ordinal();
        a aVar4 = a.k;
        a aVar5 = a.l;
        a aVar6 = a.g;
        a aVar7 = a.d;
        switch (iOrdinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = aVar3 == aVar7 || aVar3 == aVar6;
                if (tk instanceof C5589nn0) {
                    return z || aVar3 == aVar4;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = aVar3 == a.e || aVar3 == a.h;
                if (tk instanceof C5589nn0) {
                    return z2 || aVar3 == aVar5;
                }
                return z2;
            case 5:
                return (aVar3 == aVar7 || aVar3 == aVar6) ? false : true;
            case 6:
                return (aVar3 == aVar || aVar3 == aVar4 || aVar3 == aVar5) ? false : true;
            default:
                throw new AssertionError(aVar2.name());
        }
    }

    public final void j() {
        HashSet<IK> hashSet;
        IK ik = this.f;
        if (ik != null && (hashSet = ik.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        TN1 tn1 = this.i;
        if (tn1 == null) {
            this.i = new TN1(TN1.a.d);
        } else {
            tn1.f();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.k0 + ":" + this.e.toString();
    }
}

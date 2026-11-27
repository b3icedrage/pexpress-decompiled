package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class N20 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(C2180Us.class, C4071go0.class, C2752ac0.class, C5595np0.class, C6162qY1.class, AQ0.class, C0946Ex0.class));
    public static final Map<Class<? extends AbstractC1634Ns>, InterfaceC2102Ts> q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final C4913kc1 j;
    public final ArrayList k;
    public final K20 l;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();
    public final ArrayList n = new ArrayList();
    public final LinkedHashSet o = new LinkedHashSet();

    public static class a {
        public final InterfaceC2024Ss a;

        public a(InterfaceC2024Ss interfaceC2024Ss) {
            this.a = interfaceC2024Ss;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(C2180Us.class, new C2258Vs.a());
        map.put(C4071go0.class, new C4281ho0.a());
        map.put(C2752ac0.class, new C2976bc0.a());
        map.put(C5595np0.class, new C5805op0.a());
        map.put(C6162qY1.class, new C6371rY1.a());
        map.put(AQ0.class, new BQ0.a());
        map.put(C0946Ex0.class, new C1024Fx0.a());
        q = Collections.unmodifiableMap(map);
    }

    public N20(ArrayList arrayList, C4913kc1 c4913kc1, ArrayList arrayList2) {
        this.i = arrayList;
        this.j = c4913kc1;
        this.k = arrayList2;
        K20 k20 = new K20();
        this.l = k20;
        this.n.add(k20);
        this.o.add(k20);
    }

    public final void a(InterfaceC2024Ss interfaceC2024Ss) {
        while (!h().e(interfaceC2024Ss.f())) {
            e(h());
        }
        h().f().b(interfaceC2024Ss.f());
        this.n.add(interfaceC2024Ss);
        this.o.add(interfaceC2024Ss);
    }

    public final void b(C1427Lb1 c1427Lb1) {
        C6137qQ0 c6137qQ0 = c1427Lb1.b;
        c6137qQ0.a();
        for (C5927pQ0 c5927pQ0 : c6137qQ0.c) {
            C1349Kb1 c1349Kb1 = c1427Lb1.a;
            c1349Kb1.getClass();
            c5927pQ0.f();
            AbstractC6909u51 abstractC6909u51 = c1349Kb1.d;
            c5927pQ0.d = abstractC6909u51;
            if (abstractC6909u51 != null) {
                abstractC6909u51.e = c5927pQ0;
            }
            c5927pQ0.e = c1349Kb1;
            c1349Kb1.d = c5927pQ0;
            AbstractC6909u51 abstractC6909u52 = c1349Kb1.a;
            c5927pQ0.a = abstractC6909u52;
            if (c5927pQ0.d == null) {
                abstractC6909u52.b = c5927pQ0;
            }
            LinkedHashMap linkedHashMap = this.m;
            String str = c5927pQ0.f;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, c5927pQ0);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.a;
            charSequenceSubSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().h(charSequenceSubSequence);
    }

    public final void d() {
        if (this.a.charAt(this.b) != '\t') {
            this.b++;
            this.c++;
        } else {
            this.b++;
            int i = this.c;
            this.c = (4 - (i % 4)) + i;
        }
    }

    public final void e(InterfaceC2024Ss interfaceC2024Ss) {
        if (h() == interfaceC2024Ss) {
            ArrayList arrayList = this.n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (interfaceC2024Ss instanceof C1427Lb1) {
            b((C1427Lb1) interfaceC2024Ss);
        }
        interfaceC2024Ss.b();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((InterfaceC2024Ss) arrayList.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (i < length) {
            char cCharAt = this.a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final InterfaceC2024Ss h() {
        return (InterfaceC2024Ss) C1742Pc.c(1, this.n);
    }

    public final void i(String str) {
        C3037bt c3037btA;
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append((CharSequence) str, 0, i);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(cCharAt);
            }
        }
        if (sb != null) {
            str = sb.toString();
        }
        this.a = str;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i2 = 1;
        for (InterfaceC2024Ss interfaceC2024Ss : arrayList.subList(1, arrayList.size())) {
            g();
            C1946Rs c1946RsC = interfaceC2024Ss.c(this);
            if (c1946RsC == null) {
                break;
            }
            if (c1946RsC.c) {
                e(interfaceC2024Ss);
                return;
            }
            int i3 = c1946RsC.a;
            if (i3 != -1) {
                k(i3);
            } else {
                int i4 = c1946RsC.b;
                if (i4 != -1) {
                    j(i4);
                }
            }
            i2++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i2, arrayList.size()));
        interfaceC2024Ss = (InterfaceC2024Ss) arrayList.get(i2 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zA = (interfaceC2024Ss.f() instanceof C1349Kb1) || interfaceC2024Ss.a();
        while (zA) {
            g();
            if (this.h || (this.g < 4 && Character.isLetter(Character.codePointAt(this.a, this.e)))) {
                k(this.e);
                break;
            }
            a aVar = new a(interfaceC2024Ss);
            Iterator it = this.i.iterator();
            do {
                if (!it.hasNext()) {
                    c3037btA = null;
                    break;
                }
                c3037btA = ((InterfaceC2102Ts) it.next()).a(this, aVar);
            } while (c3037btA == null);
            if (c3037btA == null) {
                k(this.e);
                break;
            }
            if (!zIsEmpty) {
                f(arrayList2);
                zIsEmpty = true;
            }
            int i5 = c3037btA.b;
            if (i5 != -1) {
                k(i5);
            } else {
                int i6 = c3037btA.c;
                if (i6 != -1) {
                    j(i6);
                }
            }
            if (c3037btA.d) {
                InterfaceC2024Ss interfaceC2024SsH = h();
                ArrayList arrayList3 = this.n;
                arrayList3.remove(arrayList3.size() - 1);
                this.o.remove(interfaceC2024SsH);
                if (interfaceC2024SsH instanceof C1427Lb1) {
                    b((C1427Lb1) interfaceC2024SsH);
                }
                interfaceC2024SsH.f().f();
            }
            InterfaceC2024Ss[] interfaceC2024SsArr = c3037btA.a;
            for (InterfaceC2024Ss interfaceC2024Ss2 : interfaceC2024SsArr) {
                a(interfaceC2024Ss2);
                zA = interfaceC2024Ss2.a();
            }
        }
        if (!zIsEmpty && !this.h && h().d()) {
            c();
            return;
        }
        if (!zIsEmpty) {
            f(arrayList2);
        }
        if (!interfaceC2024Ss2.a()) {
            c();
        } else {
            if (this.h) {
                return;
            }
            a(new C1427Lb1());
            c();
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}

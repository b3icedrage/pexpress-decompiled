package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: renamed from: vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7247vi {
    public int a;
    public final Object b;
    public Object c;

    public C7247vi(C3524eC0 c3524eC0) {
        this.b = c3524eC0;
    }

    public void a(Object obj) {
        int i = this.a;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.c)[4] = objArr;
            this.c = objArr;
            i = 0;
        }
        ((Object[]) this.c)[i] = obj;
        this.a = i + 1;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bf A[LOOP:5: B:130:0x02a7->B:134:0x02bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x032f  */
    /* JADX WARN: Code duplicated, block: B:206:0x044d  */
    /* JADX WARN: Code duplicated, block: B:229:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x032f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void b(List list) {
        VC1 vc1;
        String str;
        ArrayList<String> arrayList;
        List<AbstractC5858p5> list2;
        String str2;
        VC1 vc2;
        String str3;
        ?? arrayList2;
        String str4;
        Iterator<C5439n50> it;
        ArrayList<String> arrayList3;
        int i;
        int i2;
        C2114Tw c2114Tw;
        Iterator it2;
        String str5;
        ArrayList<AbstractC1333Jw0> arrayList4;
        int size;
        int i3;
        AbstractC1333Jw0 abstractC1333Jw0;
        Iterator<C5439n50> it3;
        C7247vi c7247vi = this;
        c7247vi.c = list;
        c7247vi.a = 0;
        while (c7247vi.a < ((List) c7247vi.c).size()) {
            VC1 vc3 = (VC1) ((List) c7247vi.c).get(c7247vi.a);
            boolean z = vc3 instanceof C5505nP1;
            String str6 = "ActionException in Action for tag [";
            C3524eC0 c3524eC0 = (C3524eC0) c7247vi.b;
            if (z) {
                C5505nP1 c5505nP1 = (C5505nP1) vc3;
                c3524eC0.getClass();
                c3524eC0.f = c5505nP1.c;
                AttributesImpl attributesImpl = c5505nP1.d;
                String str7 = c5505nP1.a;
                if (str7 == null || str7.length() < 1) {
                    str7 = c5505nP1.b;
                }
                C5229m50 c5229m50 = c3524eC0.e;
                c5229m50.a.add(str7);
                C5229m50 c5229m51 = c3524eC0.i;
                C3315dC0 c3315dC0 = c3524eC0.b;
                if (c5229m51 != null) {
                    c3524eC0.h.add(C3524eC0.j);
                    vc1 = vc3;
                    str = "ActionException in Action for tag [";
                } else {
                    HashMap<C5439n50, List<AbstractC5858p5>> map = c3524eC0.a.h;
                    Iterator<C5439n50> it4 = map.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it4.hasNext();
                        arrayList = c5229m50.a;
                        if (!zHasNext) {
                            list2 = null;
                            break;
                        }
                        C5439n50 next = it4.next();
                        next.getClass();
                        int size2 = arrayList.size();
                        ArrayList<String> arrayList5 = next.a;
                        if (size2 == arrayList5.size()) {
                            int size3 = arrayList5.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size3) {
                                    list2 = map.get(next);
                                    break;
                                }
                                int i5 = size3;
                                it3 = it4;
                                if (!next.a(i4).equalsIgnoreCase(c5229m50.a(i4))) {
                                    break;
                                }
                                i4++;
                                size3 = i5;
                                it4 = it3;
                            }
                        } else {
                            it3 = it4;
                        }
                        it4 = it3;
                    }
                    if (list2 != null) {
                        vc2 = vc3;
                        arrayList2 = list2;
                    } else {
                        Iterator<C5439n50> it5 = map.keySet().iterator();
                        int i6 = 0;
                        C5439n50 c5439n50 = null;
                        while (true) {
                            boolean zHasNext2 = it5.hasNext();
                            Iterator<C5439n50> it6 = it5;
                            str2 = "*";
                            if (!zHasNext2) {
                                break;
                            }
                            C5439n50 next2 = it6.next();
                            VC1 vc4 = vc3;
                            if (next2.a.size() > 1 && next2.a(0).equals("*")) {
                                ArrayList<String> arrayList6 = next2.a;
                                int size4 = arrayList6.size();
                                int size5 = arrayList.size();
                                if (size4 == 0 || size5 == 0) {
                                    i2 = 0;
                                } else {
                                    if (size4 > size5) {
                                        size4 = size5;
                                    }
                                    int i7 = 1;
                                    int i8 = 0;
                                    while (i7 <= size4) {
                                        int i9 = size4;
                                        ArrayList<String> arrayList7 = arrayList6;
                                        if (!arrayList6.get(size4 - i7).equalsIgnoreCase(arrayList.get(size5 - i7))) {
                                            break;
                                        }
                                        i8++;
                                        i7++;
                                        size4 = i9;
                                        arrayList6 = arrayList7;
                                    }
                                    i2 = i8;
                                }
                                if (i2 > i6) {
                                    i6 = i2;
                                    c5439n50 = next2;
                                }
                            }
                            it5 = it6;
                            vc3 = vc4;
                        }
                        vc2 = vc3;
                        List<AbstractC5858p5> list3 = c5439n50 != null ? map.get(c5439n50) : null;
                        if (list3 == null) {
                            Iterator<C5439n50> it7 = map.keySet().iterator();
                            int i10 = 0;
                            C5439n50 c5439n51 = null;
                            while (it7.hasNext()) {
                                C5439n50 next3 = it7.next();
                                if ("*".equals(next3.b())) {
                                    ArrayList<String> arrayList8 = next3.a;
                                    it = it7;
                                    int size6 = arrayList8.size();
                                    int size7 = arrayList.size();
                                    if (size6 == 0 || size7 == 0) {
                                        arrayList3 = arrayList;
                                        i = 0;
                                    } else {
                                        if (size6 > size7) {
                                            size6 = size7;
                                        }
                                        int i11 = 0;
                                        int i12 = 0;
                                        while (true) {
                                            if (i11 >= size6) {
                                                arrayList3 = arrayList;
                                                break;
                                            }
                                            int i13 = size6;
                                            arrayList3 = arrayList;
                                            if (!arrayList8.get(i11).equalsIgnoreCase(arrayList.get(i11))) {
                                                break;
                                            }
                                            i12++;
                                            i11++;
                                            size6 = i13;
                                            arrayList = arrayList3;
                                        }
                                        i = i12;
                                    }
                                    if (i == arrayList8.size() - 1 && i > i10) {
                                        i10 = i;
                                        c5439n51 = next3;
                                    }
                                } else {
                                    it = it7;
                                    arrayList3 = arrayList;
                                }
                                it7 = it;
                                arrayList = arrayList3;
                            }
                            list3 = c5439n51 != null ? map.get(c5439n51) : null;
                            if (list3 == null) {
                                Iterator<C5439n50> it8 = map.keySet().iterator();
                                int i14 = 0;
                                C5439n50 c5439n52 = null;
                                while (it8.hasNext()) {
                                    C5439n50 next4 = it8.next();
                                    String strB = next4.b();
                                    ArrayList<String> arrayList9 = next4.a;
                                    Iterator<C5439n50> it9 = it8;
                                    String str8 = str6;
                                    String strA = arrayList9.size() > 1 ? next4.a(0) : null;
                                    if (str2.equals(strB) && str2.equals(strA)) {
                                        ArrayList arrayList10 = new ArrayList(arrayList9);
                                        if (arrayList10.size() > 2) {
                                            arrayList10.remove(0);
                                            arrayList10.remove(arrayList10.size() - 1);
                                        }
                                        ArrayList<String> arrayList11 = new ArrayList();
                                        arrayList11.addAll(arrayList10);
                                        String strC = c5229m50.c();
                                        StringBuilder sb = new StringBuilder();
                                        for (String str9 : arrayList11) {
                                            sb.append("[");
                                            sb.append(str9);
                                            sb.append("]");
                                            str2 = str2;
                                        }
                                        str4 = str2;
                                        int size8 = strC.contains(sb.toString()) ? arrayList11.size() : 0;
                                        if (size8 > i14) {
                                            i14 = size8;
                                            c5439n52 = next4;
                                        }
                                    } else {
                                        str4 = str2;
                                    }
                                    it8 = it9;
                                    str6 = str8;
                                    str2 = str4;
                                }
                                str3 = str6;
                                arrayList2 = c5439n52 != null ? map.get(c5439n52) : 0;
                                if (arrayList2 == 0) {
                                    arrayList2 = 0;
                                }
                            }
                            if (arrayList2 == 0) {
                                arrayList4 = c3524eC0.c;
                                size = arrayList4.size();
                                i3 = 0;
                                while (true) {
                                    if (i3 < size) {
                                        arrayList2 = 0;
                                        break;
                                    }
                                    abstractC1333Jw0 = arrayList4.get(i3);
                                    if (abstractC1333Jw0.v(c5229m50, c3315dC0)) {
                                        arrayList2 = new ArrayList(1);
                                        arrayList2.add(abstractC1333Jw0);
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            c2114Tw = c3524eC0.d;
                            if (arrayList2 != 0) {
                                c3524eC0.h.add((List<AbstractC5858p5>) arrayList2);
                                it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        ((AbstractC5858p5) it2.next()).q(c3315dC0, str7, attributesImpl);
                                    } catch (RuntimeException e) {
                                        C5229m50 c5229m52 = new C5229m50();
                                        c5229m52.a.addAll(c5229m50.a);
                                        c3524eC0.i = c5229m52;
                                        c2114Tw.c("RuntimeException in Action for tag [" + str7 + "]", e);
                                    } catch (C6487s5 e2) {
                                        C5229m50 c5229m53 = new C5229m50();
                                        c5229m53.a.addAll(c5229m50.a);
                                        c3524eC0.i = c5229m53;
                                        str5 = str3;
                                        c2114Tw.c(str5 + str7 + "]", e2);
                                    }
                                    str5 = str3;
                                    str3 = str5;
                                }
                                str = str3;
                            } else {
                                str = str3;
                                c3524eC0.h.add(C3524eC0.j);
                                c2114Tw.a("no applicable action for [" + str7 + "], current ElementPath  is [" + c5229m50 + "]");
                            }
                            vc1 = vc2;
                        }
                        arrayList2 = list3;
                    }
                    str3 = "ActionException in Action for tag [";
                    if (arrayList2 == 0) {
                        arrayList4 = c3524eC0.c;
                        size = arrayList4.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                arrayList2 = 0;
                                break;
                            }
                            abstractC1333Jw0 = arrayList4.get(i3);
                            if (abstractC1333Jw0.v(c5229m50, c3315dC0)) {
                                arrayList2 = new ArrayList(1);
                                arrayList2.add(abstractC1333Jw0);
                                break;
                            }
                            i3++;
                        }
                    }
                    c2114Tw = c3524eC0.d;
                    if (arrayList2 != 0) {
                        c3524eC0.h.add((List<AbstractC5858p5>) arrayList2);
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((AbstractC5858p5) it2.next()).q(c3315dC0, str7, attributesImpl);
                            str5 = str3;
                            str3 = str5;
                        }
                        str = str3;
                    } else {
                        str = str3;
                        c3524eC0.h.add(C3524eC0.j);
                        c2114Tw.a("no applicable action for [" + str7 + "], current ElementPath  is [" + c5229m50 + "]");
                    }
                    vc1 = vc2;
                }
                c3315dC0.r(vc1);
            } else {
                vc1 = vc3;
                str = "ActionException in Action for tag [";
            }
            if (vc1 instanceof C5606nt) {
                c3524eC0.b.r(vc1);
                C5606nt c5606nt = (C5606nt) vc1;
                c3524eC0.f = c5606nt.c;
                String strTrim = c5606nt.d;
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
                List<AbstractC5858p5> listPeek = c3524eC0.h.peek();
                if (strTrim != null) {
                    String strTrim2 = strTrim.trim();
                    if (strTrim2.length() > 0 && listPeek != null) {
                        for (AbstractC5858p5 abstractC5858p5 : listPeek) {
                            try {
                                abstractC5858p5.r(c3524eC0.b, strTrim2);
                            } catch (C6487s5 e3) {
                                c3524eC0.d.c("Exception in end() methd for action [" + abstractC5858p5 + "]", e3);
                            }
                        }
                    }
                }
            }
            if (vc1 instanceof J60) {
                c3524eC0.b.r(vc1);
                J60 j60 = (J60) vc1;
                c3524eC0.f = j60.c;
                List<AbstractC5858p5> listPop = c3524eC0.h.pop();
                C5229m50 c5229m54 = c3524eC0.i;
                C5229m50 c5229m55 = c3524eC0.e;
                if (c5229m54 != null) {
                    if (c5229m54.equals(c5229m55)) {
                        c3524eC0.i = null;
                    }
                } else if (listPop != C3524eC0.j) {
                    String str10 = j60.a;
                    if (str10 == null || str10.length() < 1) {
                        str10 = j60.b;
                    }
                    C2114Tw c2114Tw2 = c3524eC0.d;
                    if (listPop != null) {
                        Iterator<AbstractC5858p5> it10 = listPop.iterator();
                        while (it10.hasNext()) {
                            try {
                                it10.next().s(c3524eC0.b, str10);
                            } catch (RuntimeException e4) {
                                c2114Tw2.c("RuntimeException in Action for tag [" + str10 + "]", e4);
                            } catch (C6487s5 e5) {
                                c2114Tw2.c(str + str10 + "]", e5);
                            }
                        }
                    }
                }
                ArrayList<String> arrayList12 = c5229m55.a;
                if (!arrayList12.isEmpty()) {
                    arrayList12.remove(arrayList12.size() - 1);
                }
            }
            c7247vi = this;
            c7247vi.a++;
        }
    }

    public C7247vi() {
        Object[] objArr = new Object[5];
        this.b = objArr;
        this.c = objArr;
    }
}

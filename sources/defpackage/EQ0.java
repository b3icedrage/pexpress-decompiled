package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class EQ0 {
    public static final a a = new a();
    public static final b b = new b();

    public static final class a extends EQ0 {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        @Override // defpackage.EQ0
        public final void a(long j, Object obj) {
            Object objUnmodifiableList;
            List list = (List) C4356i92.c.i(j, obj);
            if (list instanceof InterfaceC3563eP0) {
                objUnmodifiableList = ((InterfaceC3563eP0) list).t();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof InterfaceC5566nh1) && (list instanceof XB0.c)) {
                    XB0.c cVar = (XB0.c) list;
                    if (cVar.v()) {
                        cVar.k();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            C4356i92.p(obj, j, objUnmodifiableList);
        }

        @Override // defpackage.EQ0
        public final void b(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, long j) {
            List list;
            List list2;
            List listL;
            List list3 = (List) C4356i92.c.i(j, abstractC0595Ak1);
            int size = list3.size();
            List list4 = (List) C4356i92.c.i(j, abstractC0595Ak0);
            if (list4.isEmpty()) {
                if (list4 instanceof InterfaceC3563eP0) {
                    listL = new C3354dP0(size);
                } else {
                    listL = ((list4 instanceof InterfaceC5566nh1) && (list4 instanceof XB0.c)) ? ((XB0.c) list4).l(size) : new ArrayList(size);
                }
                C4356i92.p(abstractC0595Ak0, j, listL);
                list2 = listL;
            } else {
                if (c.isAssignableFrom(list4.getClass())) {
                    ArrayList arrayList = new ArrayList(list4.size() + size);
                    arrayList.addAll(list4);
                    C4356i92.p(abstractC0595Ak0, j, arrayList);
                    list = arrayList;
                } else if (list4 instanceof Y82) {
                    C3354dP0 c3354dP0 = new C3354dP0(list4.size() + size);
                    c3354dP0.addAll((Y82) list4);
                    C4356i92.p(abstractC0595Ak0, j, c3354dP0);
                    list = c3354dP0;
                } else {
                    boolean z = list4 instanceof InterfaceC5566nh1;
                    list2 = list4;
                    if (z) {
                        boolean z2 = list4 instanceof XB0.c;
                        list2 = list4;
                        if (z2) {
                            XB0.c cVar = (XB0.c) list4;
                            list2 = list4;
                            if (!cVar.v()) {
                                XB0.c cVarL = cVar.l(list4.size() + size);
                                C4356i92.p(abstractC0595Ak0, j, cVarL);
                                list2 = cVarL;
                            }
                        }
                    }
                }
                list2 = list;
            }
            int size2 = list2.size();
            int size3 = list3.size();
            if (size2 > 0 && size3 > 0) {
                list2.addAll(list3);
            }
            if (size2 > 0) {
                list3 = list2;
            }
            C4356i92.p(abstractC0595Ak0, j, list3);
        }
    }

    public static final class b extends EQ0 {
        @Override // defpackage.EQ0
        public final void a(long j, Object obj) {
            ((XB0.c) C4356i92.c.i(j, obj)).k();
        }

        @Override // defpackage.EQ0
        public final void b(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, long j) {
            C4356i92.e eVar = C4356i92.c;
            XB0.c cVarL = (XB0.c) eVar.i(j, abstractC0595Ak0);
            XB0.c cVar = (XB0.c) eVar.i(j, abstractC0595Ak1);
            int size = cVarL.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarL.v()) {
                    cVarL = cVarL.l(size2 + size);
                }
                cVarL.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarL;
            }
            C4356i92.p(abstractC0595Ak0, j, cVar);
        }
    }

    public abstract void a(long j, Object obj);

    public abstract void b(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1, long j);
}

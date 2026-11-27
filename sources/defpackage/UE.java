package defpackage;

import android.database.Cursor;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class UE {

    @NotNull
    public static final UE b = new UE(1);

    @NotNull
    public static final GW1 c = new GW1("UNDEFINED");

    @NotNull
    public static final GW1 d = new GW1("REUSABLE_CLAIMED");

    @NotNull
    public static final UE e = new UE(5);
    public final /* synthetic */ int a;

    public /* synthetic */ UE(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(@NotNull AbstractCollection abstractCollection, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(abstractCollection, "<this>");
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static void c(@NonNull String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static void d(Object obj) {
        e(obj, "Argument must not be null");
    }

    @NonNull
    public static void e(Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    @NotNull
    public static final List f(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C5653o60.d;
        }
        if (size == 1) {
            return VE.c(CollectionsKt.F(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final InterfaceC5702oL0 g(InterfaceC5702oL0 receiver, HashSet hashSet) {
        InterfaceC5702oL0 interfaceC5702oL0G;
        C3136cM1 c3136cM1 = C3136cM1.a;
        InterfaceC6494s62 interfaceC6494s62X = c3136cM1.X(receiver);
        if (!hashSet.add(interfaceC6494s62X)) {
            return null;
        }
        H62 receiver2 = InterfaceC4366iD.a.q(interfaceC6494s62X);
        if (receiver2 == null) {
            if (InterfaceC4366iD.a.B(interfaceC6494s62X)) {
                Intrinsics.checkNotNullParameter(receiver, "$receiver");
                if (!(receiver instanceof AbstractC4649jL0)) {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(receiver);
                    sb.append(", ");
                    throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver.getClass(), sb).toString());
                }
                AbstractC5706oM1 abstractC5706oM1I = C7138vA0.i((AbstractC4649jL0) receiver);
                if (abstractC5706oM1I == null || (interfaceC5702oL0G = g(abstractC5706oM1I, hashSet)) == null) {
                    return null;
                }
                if (!InterfaceC4366iD.a.G(receiver)) {
                    return interfaceC5702oL0G;
                }
                if (!InterfaceC4366iD.a.G(interfaceC5702oL0G) && (!(interfaceC5702oL0G instanceof InterfaceC6126qM1) || !InterfaceC4366iD.a.H((InterfaceC6126qM1) interfaceC5702oL0G))) {
                    return c3136cM1.n0(interfaceC5702oL0G);
                }
            }
            return receiver;
        }
        Intrinsics.checkNotNullParameter(receiver2, "$receiver");
        if (!(receiver2 instanceof H62)) {
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(receiver2);
            sb2.append(", ");
            throw new IllegalArgumentException(BX.b(C2017Sp1.a, receiver2.getClass(), sb2).toString());
        }
        InterfaceC5702oL0 interfaceC5702oL0N = C0564Aa.n(receiver2);
        InterfaceC5702oL0 interfaceC5702oL0G2 = g(interfaceC5702oL0N, hashSet);
        if (interfaceC5702oL0G2 == null) {
            return null;
        }
        boolean z = InterfaceC4366iD.a.B(c3136cM1.X(interfaceC5702oL0N)) || ((interfaceC5702oL0N instanceof InterfaceC6126qM1) && InterfaceC4366iD.a.H((InterfaceC6126qM1) interfaceC5702oL0N));
        if ((interfaceC5702oL0G2 instanceof InterfaceC6126qM1) && InterfaceC4366iD.a.H((InterfaceC6126qM1) interfaceC5702oL0G2) && InterfaceC4366iD.a.G(receiver) && z) {
            return c3136cM1.n0(interfaceC5702oL0N);
        }
        if (!InterfaceC4366iD.a.G(interfaceC5702oL0G2)) {
            Intrinsics.checkNotNullParameter(receiver, "<this>");
            if ((receiver instanceof InterfaceC6126qM1) && InterfaceC4366iD.a.E((InterfaceC6126qM1) receiver)) {
                return c3136cM1.n0(interfaceC5702oL0G2);
            }
        }
        return interfaceC5702oL0G2;
    }

    @NotNull
    public static final C7436wc1 h(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C5653o60 c5653o60 = C5653o60.d;
        C7436wc1 c7436wc1 = new C7436wc1(c5653o60, c5653o60);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c7436wc1 = i((C7436wc1) listIterator.previous(), c7436wc1);
            }
        }
        return j(c7436wc1, C5653o60.d);
    }

    public static final C7436wc1 i(C7436wc1 c7436wc1, C7436wc1 c7436wc2) {
        boolean zIsEmpty = c7436wc1.b.isEmpty();
        List<InterfaceC7015uc1<Output>> list = c7436wc1.a;
        if (zIsEmpty) {
            return new C7436wc1(CollectionsKt.Q(list, c7436wc2.a), c7436wc2.b);
        }
        Collection collection = c7436wc1.b;
        ArrayList arrayList = new ArrayList(XE.m(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(i((C7436wc1) it.next(), c7436wc2));
        }
        return new C7436wc1(list, arrayList);
    }

    public static final C7436wc1 j(C7436wc1 c7436wc1, List list) {
        Collection collectionC;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListF0 = CollectionsKt.f0(list);
        Iterator it = c7436wc1.a.iterator();
        ArrayList arrayListF1 = null;
        while (it.hasNext()) {
            InterfaceC7015uc1 interfaceC7015uc1 = (InterfaceC7015uc1) it.next();
            if (interfaceC7015uc1 instanceof C7758y71) {
                if (arrayListF1 != null) {
                    arrayListF1.addAll(((C7758y71) interfaceC7015uc1).a);
                } else {
                    arrayListF1 = CollectionsKt.f0(((C7758y71) interfaceC7015uc1).a);
                }
            } else if (interfaceC7015uc1 instanceof C7132v82) {
                arrayListF0.add(interfaceC7015uc1);
            } else {
                if (arrayListF1 != null) {
                    arrayList.add(new C7758y71(arrayListF1));
                    arrayListF1 = null;
                }
                arrayList.add(interfaceC7015uc1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c7436wc1.b.iterator();
        while (it2.hasNext()) {
            C7436wc1 c7436wc1J = j((C7436wc1) it2.next(), arrayListF0);
            if (c7436wc1J.a.isEmpty()) {
                collectionC = c7436wc1J.b;
                if (collectionC.isEmpty()) {
                    collectionC = VE.c(c7436wc1J);
                }
            } else {
                collectionC = VE.c(c7436wc1J);
            }
            C2904bF.o(arrayList2, collectionC);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List<C7436wc1> listC = arrayList2;
        if (zIsEmpty) {
            listC = VE.c(new C7436wc1(arrayListF0, C5653o60.d));
        }
        if (arrayListF1 == null) {
            return new C7436wc1(arrayList, listC);
        }
        if (listC == null || !listC.isEmpty()) {
            Iterator it3 = listC.iterator();
            while (it3.hasNext()) {
                InterfaceC7015uc1 interfaceC7015uc2 = (InterfaceC7015uc1) CollectionsKt.firstOrNull(((C7436wc1) it3.next()).a);
                if (interfaceC7015uc2 != null && (interfaceC7015uc2 instanceof C7758y71)) {
                    ArrayList arrayList3 = new ArrayList(XE.m(listC, 10));
                    for (C7436wc1 c7436wc2 : listC) {
                        InterfaceC7015uc1 interfaceC7015uc3 = (InterfaceC7015uc1) CollectionsKt.firstOrNull(c7436wc2.a);
                        boolean z = interfaceC7015uc3 instanceof C7758y71;
                        Collection collection = c7436wc2.a;
                        List<C7436wc1<Output>> list2 = c7436wc2.b;
                        arrayList3.add(z ? new C7436wc1(CollectionsKt.Q(VE.c(new C7758y71(CollectionsKt.Q(arrayListF1, ((C7758y71) interfaceC7015uc3).a))), CollectionsKt.A(collection, 1)), list2) : interfaceC7015uc3 == null ? new C7436wc1(VE.c(new C7758y71(arrayListF1)), list2) : new C7436wc1(CollectionsKt.Q(VE.c(new C7758y71(arrayListF1)), collection), list2));
                    }
                    return new C7436wc1(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new C7758y71(arrayListF1));
        return new C7436wc1(arrayList, listC);
    }

    @Nullable
    public static Xc2 m(@NotNull C5638o21 c5638o21, @NotNull FC fc) {
        if (c5638o21 == null) {
            a(19);
            throw null;
        }
        if (fc == null) {
            a(20);
            throw null;
        }
        Collection<InterfaceC7984zC> collectionR = fc.r();
        if (collectionR.size() != 1) {
            return null;
        }
        for (Xc2 xc2 : collectionR.iterator().next().j()) {
            if (xc2.getName().equals(c5638o21)) {
                return xc2;
            }
        }
        return null;
    }

    public static final int n(@NotNull Cursor c2, @NotNull String name) {
        String strX;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c2.getColumnIndex(name);
        if (columnIndex < 0) {
            columnIndex = c2.getColumnIndex("`" + name + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && name.length() != 0) {
                    String[] columnNames = c2.getColumnNames();
                    Intrinsics.checkNotNullExpressionValue(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(columnNames, "columnNames");
                    Intrinsics.checkNotNullParameter(name, "name");
                    String strConcat = ".".concat(name);
                    String strD = C1742Pc.d('`', ".", name);
                    int length = columnNames.length;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str = columnNames[i2];
                            int i3 = i + 1;
                            if (str.length() < name.length() + 2 || !(d.h(str, strConcat, false) || (str.charAt(0) == '`' && d.h(str, strD, false)))) {
                                i2++;
                                i = i3;
                            } else {
                                columnIndex = i;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c2.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames2, "c.columnNames");
            strX = C1526Mj.x(columnNames2, null, null, null, null, 63);
        } catch (Exception unused) {
            strX = "unknown";
        }
        throw new IllegalArgumentException(BX.c("column '", name, "' does not exist. Available columns: ", strX));
    }

    public static final int o(int i, @NotNull String name) {
        String property;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            property = System.getProperty("io.ktor.utils.io.".concat(name));
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (intOrNull = StringsKt.toIntOrNull(property)) == null) ? i : intOrNull.intValue();
    }

    @NotNull
    public static LinkedHashSet p(@NotNull C5638o21 c5638o21, @NotNull Collection collection, @NotNull Collection collection2, @NotNull FC fc, @NotNull G70 g70, @NotNull C1346Ka1 c1346Ka1, boolean z) {
        if (c5638o21 == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (fc == null) {
            a(15);
            throw null;
        }
        if (g70 == null) {
            a(16);
            throw null;
        }
        if (c1346Ka1 == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c1346Ka1.h(c5638o21, collection, collection2, fc, new C4012gZ(g70, linkedHashSet, z));
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet q(@NotNull C5638o21 c5638o21, @NotNull AbstractCollection abstractCollection, @NotNull Collection collection, @NotNull FC fc, @NotNull G70 g70, @NotNull C1346Ka1 c1346Ka1) {
        if (c5638o21 == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (fc == null) {
            a(3);
            throw null;
        }
        if (g70 == null) {
            a(4);
            throw null;
        }
        if (c1346Ka1 != null) {
            return p(c5638o21, abstractCollection, collection, fc, g70, c1346Ka1, false);
        }
        a(5);
        throw null;
    }

    @NotNull
    public static LinkedHashSet r(@NotNull C5638o21 c5638o21, @NotNull Collection collection, @NotNull AbstractCollection abstractCollection, @NotNull C7180vO0 c7180vO0, @NotNull QO qo, @NotNull C1346Ka1 c1346Ka1) {
        if (c5638o21 == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (c7180vO0 == null) {
            a(9);
            throw null;
        }
        if (qo == null) {
            a(10);
            throw null;
        }
        if (c1346Ka1 != null) {
            return p(c5638o21, collection, abstractCollection, c7180vO0, qo, c1346Ka1, true);
        }
        a(11);
        throw null;
    }

    public static final void s(@NotNull JM jm, @NotNull Object obj) {
        if (!(jm instanceof C5004l20)) {
            jm.resumeWith(obj);
            return;
        }
        C5004l20 c5004l20 = (C5004l20) jm;
        Throwable thA = C1717Ot1.a(obj);
        Object og = thA == null ? obj : new OG(thA, false);
        DN dn = c5004l20.h;
        LM lm = c5004l20.i;
        if (dn.k1(lm.getContext())) {
            c5004l20.j = og;
            c5004l20.g = 1;
            c5004l20.h.c1(lm.getContext(), c5004l20);
            return;
        }
        A80 a80A = EY1.a();
        if (a80A.g >= 4294967296L) {
            c5004l20.j = og;
            c5004l20.g = 1;
            a80A.t1(c5004l20);
            return;
        }
        a80A.u1(true);
        try {
            XF0 xf0 = (XF0) lm.getContext().p(XF0.a.d);
            if (xf0 == null || xf0.g()) {
                Object obj2 = c5004l20.k;
                CoroutineContext context = lm.getContext();
                Object objC = CY1.c(context, obj2);
                C7973z82<?> c7973z82C = objC != CY1.a ? AN.c(lm, context, objC) : null;
                try {
                    lm.resumeWith(obj);
                    Unit unit = Unit.a;
                    if (c7973z82C == null || c7973z82C.t0()) {
                        CY1.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (c7973z82C == null || c7973z82C.t0()) {
                        CY1.a(context, objC);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionC = xf0.C();
                c5004l20.a(og, cancellationExceptionC);
                c5004l20.resumeWith(C1795Pt1.a(cancellationExceptionC));
            }
            while (a80A.w1()) {
            }
        } catch (Throwable th2) {
            try {
                c5004l20.g(th2, null);
            } finally {
                a80A.s1(true);
            }
        }
    }

    @NotNull
    public static final A62 u(@NotNull RI0 kClass, @Nullable SJ0 sj0, @NotNull Type reifiedType) {
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new A62(kClass, sj0, reifiedType);
    }

    public static final void v(@NotNull C0864Dw c0864Dw, @NotNull byte[] src, int i) {
        Intrinsics.checkNotNullParameter(c0864Dw, "<this>");
        Intrinsics.checkNotNullParameter(src, "src");
        C2895bC c2895bCN = C5189lv.n(c0864Dw, 1, null);
        int i2 = 0;
        while (true) {
            try {
                int iMin = Math.min(i, c2895bCN.e - c2895bCN.c);
                C1874Qu.w(c2895bCN, src, i2, iMin);
                i2 += iMin;
                i -= iMin;
                if (i <= 0) {
                    c0864Dw.c();
                    return;
                }
                c2895bCN = C5189lv.n(c0864Dw, 1, c2895bCN);
            } catch (Throwable th) {
                c0864Dw.c();
                throw th;
            }
        }
    }

    public C1059Gj k(List list, T01 t01, EnumC6405rh1 enumC6405rh1) {
        List listE0 = CollectionsKt.e0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            CK ckL = l(it.next(), null);
            if (ckL != null) {
                arrayList.add(ckL);
            }
        }
        if (t01 == null) {
            return new C1059Gj(arrayList, new DK(enumC6405rh1, 0));
        }
        AbstractC5706oM1 abstractC5706oM1Q = t01.h.q(enumC6405rh1);
        Intrinsics.checkNotNullExpressionValue(abstractC5706oM1Q, "getPrimitiveArrayKotlinType(...)");
        return new C4348i72(arrayList, abstractC5706oM1Q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v30, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v35, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v41, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v46, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v51, types: [o60] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [UE] */
    @Nullable
    public CK l(@Nullable Object obj, @Nullable T01 t01) {
        ?? C;
        ?? C2;
        ?? C3;
        ?? C4;
        ?? C5;
        ?? C6;
        ?? C7;
        if (obj instanceof Byte) {
            return new C1880Qw(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new QK1(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new FB0(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new IT0(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            ch.getClass();
            return new C6717tA(ch);
        }
        if (obj instanceof Float) {
            return new C4924kf0(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C3490e30(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return new C1011Ft(bool);
        }
        if (obj instanceof String) {
            return new C7193vS1((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                C7 = C5653o60.d;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                C7 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    C7.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                C7 = VE.c(Byte.valueOf(bArr[0]));
            }
            return k(C7, t01, EnumC6405rh1.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                C6 = C5653o60.d;
            } else if (length3 != 1) {
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                C6 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    C6.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                C6 = VE.c(Short.valueOf(sArr[0]));
            }
            return k(C6, t01, EnumC6405rh1.SHORT);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                C5 = C5653o60.d;
            } else if (length5 != 1) {
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                C5 = new ArrayList(iArr.length);
                int length6 = iArr.length;
                while (i < length6) {
                    C5.add(Integer.valueOf(iArr[i]));
                    i++;
                }
            } else {
                C5 = VE.c(Integer.valueOf(iArr[0]));
            }
            return k(C5, t01, EnumC6405rh1.INT);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            int length7 = jArr.length;
            if (length7 == 0) {
                C4 = C5653o60.d;
            } else if (length7 != 1) {
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                C4 = new ArrayList(jArr.length);
                int length8 = jArr.length;
                while (i < length8) {
                    C4.add(Long.valueOf(jArr[i]));
                    i++;
                }
            } else {
                C4 = VE.c(Long.valueOf(jArr[0]));
            }
            return k(C4, t01, EnumC6405rh1.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            int length9 = cArr.length;
            if (length9 == 0) {
                C3 = C5653o60.d;
            } else if (length9 != 1) {
                Intrinsics.checkNotNullParameter(cArr, "<this>");
                C3 = new ArrayList(cArr.length);
                int length10 = cArr.length;
                while (i < length10) {
                    C3.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                C3 = VE.c(Character.valueOf(cArr[0]));
            }
            return k(C3, t01, EnumC6405rh1.CHAR);
        }
        if (obj instanceof float[]) {
            return k(C1526Mj.E((float[]) obj), t01, EnumC6405rh1.FLOAT);
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            Intrinsics.checkNotNullParameter(dArr, "<this>");
            int length11 = dArr.length;
            if (length11 == 0) {
                C2 = C5653o60.d;
            } else if (length11 != 1) {
                Intrinsics.checkNotNullParameter(dArr, "<this>");
                C2 = new ArrayList(dArr.length);
                int length12 = dArr.length;
                while (i < length12) {
                    C2.add(Double.valueOf(dArr[i]));
                    i++;
                }
            } else {
                C2 = VE.c(Double.valueOf(dArr[0]));
            }
            return k(C2, t01, EnumC6405rh1.DOUBLE);
        }
        if (!(obj instanceof boolean[])) {
            if (obj == null) {
                return new C4347i71(null);
            }
            return null;
        }
        boolean[] zArr = (boolean[]) obj;
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length13 = zArr.length;
        if (length13 == 0) {
            C = C5653o60.d;
        } else if (length13 != 1) {
            Intrinsics.checkNotNullParameter(zArr, "<this>");
            C = new ArrayList(zArr.length);
            int length14 = zArr.length;
            while (i < length14) {
                C.add(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else {
            C = VE.c(Boolean.valueOf(zArr[0]));
        }
        return k(C, t01, EnumC6405rh1.BOOLEAN);
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "coil.request.NullRequestData";
            default:
                return super.toString();
        }
    }
}

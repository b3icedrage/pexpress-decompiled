package kotlin.collections;

import defpackage.C1332Jw;
import defpackage.C1336Jx0;
import defpackage.C1371Kj;
import defpackage.C2680aF;
import defpackage.C2767ag;
import defpackage.C2904bF;
import defpackage.C5487nJ1;
import defpackage.C5653o60;
import defpackage.C6702t60;
import defpackage.EH0;
import defpackage.OW0;
import defpackage.VE;
import defpackage.WE;
import defpackage.XE;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"VE", "WE", "XE", "YE", "ZE", "aF", "bF", "cF", "dF", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    @NotNull
    public static List A(@NotNull Iterable iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return e0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return C5653o60.d;
            }
            if (size == 1) {
                return VE.c(K(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return WE.i(arrayList);
    }

    @NotNull
    public static List B(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return a0(size, list);
    }

    @NotNull
    public static ArrayList C(@NotNull Collection collection, @NotNull Function1 predicate) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static ArrayList D(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : collection) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object E(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return F((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object F(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @Nullable
    public static Object G(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @Nullable
    public static Object H(int i, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static /* synthetic */ void I(Iterable iterable, StringBuilder sb, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.v(iterable, sb, str, str2, str3, function1);
    }

    public static String J(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i & 2) != 0 ? "" : str2;
        String postfix = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        CollectionsKt___CollectionsKt.v(iterable, sb, separator, prefix, postfix, function1);
        return sb.toString();
    }

    public static Object K(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return L((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object L(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(WE.e(list));
    }

    @Nullable
    public static Object M(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @Nullable
    public static Object N(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @NotNull
    public static ArrayList O(@NotNull Iterable iterable, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return Q((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        C2904bF.o(arrayList, iterable);
        C2904bF.o(arrayList, elements);
        return arrayList;
    }

    @NotNull
    public static ArrayList P(@NotNull Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return R((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        C2904bF.o(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    @NotNull
    public static ArrayList Q(@NotNull Collection collection, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C2904bF.o(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @NotNull
    public static ArrayList R(@NotNull Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    @NotNull
    public static List S(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return e0(iterable);
        }
        List listX = CollectionsKt___CollectionsKt.x(iterable);
        Intrinsics.checkNotNullParameter(listX, "<this>");
        Collections.reverse(listX);
        return listX;
    }

    public static Object T(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return U((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object U(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @Nullable
    public static Object V(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @Nullable
    public static Object W(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @NotNull
    public static List X(@NotNull List list, @NotNull IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        if (indices.isEmpty()) {
            return C5653o60.d;
        }
        return e0(list.subList(indices.d, indices.e + 1));
    }

    @NotNull
    public static List Y(@NotNull AbstractList abstractList) {
        Intrinsics.checkNotNullParameter(abstractList, "<this>");
        if (abstractList == null) {
            List listX = CollectionsKt___CollectionsKt.x(abstractList);
            Intrinsics.checkNotNullParameter(listX, "<this>");
            if (((ArrayList) listX).size() > 1) {
                Collections.sort(listX);
            }
            return listX;
        }
        if (abstractList.size() <= 1) {
            return e0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C1371Kj.b(array);
    }

    @NotNull
    public static List Z(@NotNull Collection collection, @NotNull Comparator comparator) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(collection instanceof Collection)) {
            List listX = CollectionsKt___CollectionsKt.x(collection);
            C2680aF.n(listX, comparator);
            return listX;
        }
        Collection collection2 = collection;
        if (collection2.size() <= 1) {
            return e0(collection);
        }
        Object[] array = collection2.toArray(new Object[0]);
        Intrinsics.checkNotNullParameter(array, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C1371Kj.b(array);
    }

    @NotNull
    public static List a0(int i, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C5653o60.d;
        }
        if (list != null) {
            if (i >= list.size()) {
                return e0(list);
            }
            if (i == 1) {
                return VE.c(E(list));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return WE.i(arrayList);
    }

    @NotNull
    public static List b0(int i, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(C1332Jw.a(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return C5653o60.d;
        }
        int size = list.size();
        if (i >= size) {
            return e0(list);
        }
        if (i == 1) {
            return VE.c(L(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @NotNull
    public static float[] c0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    @NotNull
    public static HashSet d0(@NotNull ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        HashSet hashSet = new HashSet(OW0.a(XE.m(arrayList, 12)));
        CollectionsKt___CollectionsKt.w(arrayList, hashSet);
        return hashSet;
    }

    @NotNull
    public static List e0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return WE.i(CollectionsKt___CollectionsKt.x(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C5653o60.d;
        }
        if (size != 1) {
            return f0(collection);
        }
        return VE.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    @NotNull
    public static ArrayList f0(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    @NotNull
    public static LinkedHashSet g0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.w(iterable, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static Set h0(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.w(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : C5487nJ1.b(linkedHashSet.iterator().next());
            }
            return C6702t60.d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return C6702t60.d;
        }
        if (size2 == 1) {
            return C5487nJ1.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(OW0.a(collection.size()));
        CollectionsKt___CollectionsKt.w(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    @NotNull
    public static C1336Jx0 i0(@NotNull List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new C1336Jx0(new C2767ag(list, 2));
    }

    @NotNull
    public static ArrayList j0(@NotNull Collection collection, @NotNull Iterable other) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = collection.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(XE.m(collection, 10), XE.m(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public static EH0 y(@NotNull Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new EH0(iterable, 1);
    }

    public static boolean z(@NotNull Iterable iterable, Object obj) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    WE.l();
                    throw null;
                }
                if (Intrinsics.a(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }
}

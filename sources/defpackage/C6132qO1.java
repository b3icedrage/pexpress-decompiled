package defpackage;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6132qO1 {

    @NotNull
    public static final ArrayList a;

    @NotNull
    public static final ArrayList b;

    @NotNull
    public static final Object c;

    @NotNull
    public static final LinkedHashMap d;

    @NotNull
    public static final Set<C5638o21> e;

    @NotNull
    public static final Set<String> f;

    @NotNull
    public static final a.C0475a g;

    @NotNull
    public static final Object h;

    @NotNull
    public static final LinkedHashMap i;

    @NotNull
    public static final HashSet j;

    @NotNull
    public static final LinkedHashMap k;

    /* JADX INFO: renamed from: qO1$a */
    public static final class a {

        /* JADX INFO: renamed from: qO1$a$a, reason: collision with other inner class name */
        public static final class C0475a {

            @NotNull
            public final String a;

            @NotNull
            public final C5638o21 b;

            @NotNull
            public final String c;

            @NotNull
            public final String d;

            @NotNull
            public final String e;

            public C0475a(@NotNull String internalName, @NotNull C5638o21 name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(internalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.a = internalName;
                this.b = name;
                this.c = parameters;
                this.d = returnType;
                String jvmDescriptor = name + '(' + parameters + ')' + returnType;
                Intrinsics.checkNotNullParameter(internalName, "internalName");
                Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
                this.e = internalName + JwtParser.SEPARATOR_CHAR + jvmDescriptor;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0475a)) {
                    return false;
                }
                C0475a c0475a = (C0475a) obj;
                return Intrinsics.a(this.a, c0475a.a) && Intrinsics.a(this.b, c0475a.b) && Intrinsics.a(this.c, c0475a.c) && Intrinsics.a(this.d, c0475a.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + C1039Gc0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
                sb.append(this.a);
                sb.append(", name=");
                sb.append(this.b);
                sb.append(", parameters=");
                sb.append(this.c);
                sb.append(", returnType=");
                return C1039Gc0.e(sb, this.d, ')');
            }
        }

        public static final C0475a a(String str, String str2, String str3, String str4) {
            ArrayList arrayList = C6132qO1.a;
            C5638o21 c5638o21K = C5638o21.k(str2);
            Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
            return new C0475a(str, c5638o21K, str3, str4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: qO1$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("ONE_COLLECTION_PARAMETER", 0);
            d = bVar;
            b bVar2 = new b("OBJECT_PARAMETER_NON_GENERIC", 1);
            e = bVar2;
            b bVar3 = new b("OBJECT_PARAMETER_GENERIC", 2);
            g = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            h = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: qO1$c */
    public static final class c {
        public static final c e;
        public static final c g;
        public static final c h;
        public static final a i;
        public static final /* synthetic */ c[] j;

        @Nullable
        public final Object d;

        /* JADX INFO: renamed from: qO1$c$a */
        public static final class a extends c {
        }

        static {
            c cVar = new c("NULL", 0, null);
            e = cVar;
            c cVar2 = new c("INDEX", 1, -1);
            g = cVar2;
            c cVar3 = new c("FALSE", 2, Boolean.FALSE);
            h = cVar3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3, null);
            i = aVar;
            c[] cVarArr = {cVar, cVar2, cVar3, aVar};
            j = cVarArr;
            C1952Ru.i(cVarArr);
        }

        public c(String str, int i2, Object obj) {
            super(str, i2);
            this.d = obj;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) j.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.Map] */
    static {
        String[] elements = {"containsAll", "removeAll", "retainAll"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> setH = C1526Mj.H(elements);
        ArrayList arrayList = new ArrayList(XE.m(setH, 10));
        for (String str : setH) {
            String strF = DI0.BOOLEAN.f();
            Intrinsics.checkNotNullExpressionValue(strF, "getDesc(...)");
            arrayList.add(a.a("java/util/Collection", str, "Ljava/util/Collection;", strF));
        }
        a = arrayList;
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0475a) it.next()).e);
        }
        b = arrayList2;
        ArrayList arrayList3 = a;
        ArrayList arrayList4 = new ArrayList(XE.m(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((a.C0475a) it2.next()).b.e());
        }
        String strL = C3787fU.l("Collection");
        DI0 di0 = DI0.BOOLEAN;
        String strF2 = di0.f();
        Intrinsics.checkNotNullExpressionValue(strF2, "getDesc(...)");
        a.C0475a c0475aA = a.a(strL, "contains", "Ljava/lang/Object;", strF2);
        c cVar = c.h;
        Pair pair = new Pair(c0475aA, cVar);
        String strL2 = C3787fU.l("Collection");
        String strF3 = di0.f();
        Intrinsics.checkNotNullExpressionValue(strF3, "getDesc(...)");
        Pair pair2 = new Pair(a.a(strL2, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", strF3), cVar);
        String strL3 = C3787fU.l("Map");
        String strF4 = di0.f();
        Intrinsics.checkNotNullExpressionValue(strF4, "getDesc(...)");
        Pair pair3 = new Pair(a.a(strL3, "containsKey", "Ljava/lang/Object;", strF4), cVar);
        String strL4 = C3787fU.l("Map");
        String strF5 = di0.f();
        Intrinsics.checkNotNullExpressionValue(strF5, "getDesc(...)");
        Pair pair4 = new Pair(a.a(strL4, "containsValue", "Ljava/lang/Object;", strF5), cVar);
        String strL5 = C3787fU.l("Map");
        String strF6 = di0.f();
        Intrinsics.checkNotNullExpressionValue(strF6, "getDesc(...)");
        Pair pair5 = new Pair(a.a(strL5, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;Ljava/lang/Object;", strF6), cVar);
        Pair pair6 = new Pair(a.a(C3787fU.l("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.i);
        a.C0475a c0475aA2 = a.a(C3787fU.l("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.e;
        Pair pair7 = new Pair(c0475aA2, cVar2);
        Pair pair8 = new Pair(a.a(C3787fU.l("Map"), ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strL6 = C3787fU.l("List");
        DI0 di1 = DI0.INT;
        String strF7 = di1.f();
        Intrinsics.checkNotNullExpressionValue(strF7, "getDesc(...)");
        a.C0475a c0475aA3 = a.a(strL6, "indexOf", "Ljava/lang/Object;", strF7);
        c cVar3 = c.g;
        Pair pair9 = new Pair(c0475aA3, cVar3);
        String strL7 = C3787fU.l("List");
        String strF8 = di1.f();
        Intrinsics.checkNotNullExpressionValue(strF8, "getDesc(...)");
        Map mapE = PW0.e(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(a.a(strL7, "lastIndexOf", "Ljava/lang/Object;", strF8), cVar3));
        c = mapE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(OW0.a(mapE.size()));
        for (Map.Entry entry : mapE.entrySet()) {
            linkedHashMap.put(((a.C0475a) entry.getKey()).e, entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetD = C5907pJ1.d(c.keySet(), a);
        ArrayList arrayList5 = new ArrayList(XE.m(linkedHashSetD, 10));
        Iterator it3 = linkedHashSetD.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((a.C0475a) it3.next()).b);
        }
        e = CollectionsKt.h0(arrayList5);
        ArrayList arrayList6 = new ArrayList(XE.m(linkedHashSetD, 10));
        Iterator it4 = linkedHashSetD.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((a.C0475a) it4.next()).e);
        }
        f = CollectionsKt.h0(arrayList6);
        DI0 di2 = DI0.INT;
        String strF9 = di2.f();
        Intrinsics.checkNotNullExpressionValue(strF9, "getDesc(...)");
        a.C0475a c0475aA4 = a.a("java/util/List", "removeAt", strF9, "Ljava/lang/Object;");
        g = c0475aA4;
        String strK = C3787fU.k("Number");
        String strF10 = DI0.BYTE.f();
        Intrinsics.checkNotNullExpressionValue(strF10, "getDesc(...)");
        Pair pair10 = new Pair(a.a(strK, "toByte", "", strF10), C5638o21.k("byteValue"));
        String strK2 = C3787fU.k("Number");
        String strF11 = DI0.SHORT.f();
        Intrinsics.checkNotNullExpressionValue(strF11, "getDesc(...)");
        Pair pair11 = new Pair(a.a(strK2, "toShort", "", strF11), C5638o21.k("shortValue"));
        String strK3 = C3787fU.k("Number");
        String strF12 = di2.f();
        Intrinsics.checkNotNullExpressionValue(strF12, "getDesc(...)");
        Pair pair12 = new Pair(a.a(strK3, "toInt", "", strF12), C5638o21.k("intValue"));
        String strK4 = C3787fU.k("Number");
        String strF13 = DI0.LONG.f();
        Intrinsics.checkNotNullExpressionValue(strF13, "getDesc(...)");
        Pair pair13 = new Pair(a.a(strK4, "toLong", "", strF13), C5638o21.k("longValue"));
        String strK5 = C3787fU.k("Number");
        String strF14 = DI0.FLOAT.f();
        Intrinsics.checkNotNullExpressionValue(strF14, "getDesc(...)");
        Pair pair14 = new Pair(a.a(strK5, "toFloat", "", strF14), C5638o21.k("floatValue"));
        String strK6 = C3787fU.k("Number");
        String strF15 = DI0.DOUBLE.f();
        Intrinsics.checkNotNullExpressionValue(strF15, "getDesc(...)");
        Pair pair15 = new Pair(a.a(strK6, "toDouble", "", strF15), C5638o21.k("doubleValue"));
        Pair pair16 = new Pair(c0475aA4, C5638o21.k(ProductAction.ACTION_REMOVE));
        String strK7 = C3787fU.k("CharSequence");
        String strF16 = di2.f();
        Intrinsics.checkNotNullExpressionValue(strF16, "getDesc(...)");
        String strF17 = DI0.CHAR.f();
        Intrinsics.checkNotNullExpressionValue(strF17, "getDesc(...)");
        Map mapE2 = PW0.e(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(a.a(strK7, "get", strF16, strF17), C5638o21.k("charAt")));
        h = mapE2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(mapE2.size()));
        for (Map.Entry entry2 : mapE2.entrySet()) {
            linkedHashMap2.put(((a.C0475a) entry2.getKey()).e, entry2.getValue());
        }
        i = linkedHashMap2;
        ?? r0 = h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r0.entrySet()) {
            a.C0475a c0475a = (a.C0475a) entry3.getKey();
            C5638o21 name = (C5638o21) entry3.getValue();
            String internalName = c0475a.a;
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            String parameters = c0475a.c;
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String returnType = c0475a.d;
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            String jvmDescriptor = name + '(' + parameters + ')' + returnType;
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(internalName + JwtParser.SEPARATOR_CHAR + jvmDescriptor);
        }
        Set setKeySet = h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((a.C0475a) it5.next()).b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = h.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(XE.m(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((a.C0475a) entry4.getKey()).b, entry4.getValue()));
        }
        int iA = OW0.a(XE.m(arrayList7, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((C5638o21) pair17.e, (C5638o21) pair17.d);
        }
        k = linkedHashMap3;
    }
}

package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class AI0 implements InterfaceC5848p21 {

    @NotNull
    public static final List<String> d;

    @NotNull
    public final String[] a;

    @NotNull
    public final Set<Integer> b;

    @NotNull
    public final ArrayList c;

    static {
        String strJ = CollectionsKt.J(WE.f('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> listF = WE.f(Z0.c(strJ, "/Any"), Z0.c(strJ, "/Nothing"), Z0.c(strJ, "/Unit"), Z0.c(strJ, "/Throwable"), Z0.c(strJ, "/Number"), Z0.c(strJ, "/Byte"), Z0.c(strJ, "/Double"), Z0.c(strJ, "/Float"), Z0.c(strJ, "/Int"), Z0.c(strJ, "/Long"), Z0.c(strJ, "/Short"), Z0.c(strJ, "/Boolean"), Z0.c(strJ, "/Char"), Z0.c(strJ, "/CharSequence"), Z0.c(strJ, "/String"), Z0.c(strJ, "/Comparable"), Z0.c(strJ, "/Enum"), Z0.c(strJ, "/Array"), Z0.c(strJ, "/ByteArray"), Z0.c(strJ, "/DoubleArray"), Z0.c(strJ, "/FloatArray"), Z0.c(strJ, "/IntArray"), Z0.c(strJ, "/LongArray"), Z0.c(strJ, "/ShortArray"), Z0.c(strJ, "/BooleanArray"), Z0.c(strJ, "/CharArray"), Z0.c(strJ, "/Cloneable"), Z0.c(strJ, "/Annotation"), Z0.c(strJ, "/collections/Iterable"), Z0.c(strJ, "/collections/MutableIterable"), Z0.c(strJ, "/collections/Collection"), Z0.c(strJ, "/collections/MutableCollection"), Z0.c(strJ, "/collections/List"), Z0.c(strJ, "/collections/MutableList"), Z0.c(strJ, "/collections/Set"), Z0.c(strJ, "/collections/MutableSet"), Z0.c(strJ, "/collections/Map"), Z0.c(strJ, "/collections/MutableMap"), Z0.c(strJ, "/collections/Map.Entry"), Z0.c(strJ, "/collections/MutableMap.MutableEntry"), Z0.c(strJ, "/collections/Iterator"), Z0.c(strJ, "/collections/MutableIterator"), Z0.c(strJ, "/collections/ListIterator"), Z0.c(strJ, "/collections/MutableListIterator"));
        d = listF;
        C1336Jx0 c1336Jx0I0 = CollectionsKt.i0(listF);
        int iA = OW0.a(XE.m(c1336Jx0I0, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = c1336Jx0I0.iterator();
        while (true) {
            C1414Kx0 c1414Kx0 = (C1414Kx0) it;
            if (!c1414Kx0.d.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) c1414Kx0.next();
            linkedHashMap.put((String) indexedValue.b, Integer.valueOf(indexedValue.a));
        }
    }

    public AI0(@NotNull String[] strings, @NotNull Set localNameIndices, @NotNull ArrayList records) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(localNameIndices, "localNameIndices");
        Intrinsics.checkNotNullParameter(records, "records");
        this.a = strings;
        this.b = localNameIndices;
        this.c = records;
    }

    @Override // defpackage.InterfaceC5848p21
    @NotNull
    public final String a(int i) {
        return getString(i);
    }

    @Override // defpackage.InterfaceC5848p21
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // defpackage.InterfaceC5848p21
    @NotNull
    public final String getString(int i) {
        String strL;
        FI0.d.c cVar = (FI0.d.c) this.c.get(i);
        int i2 = cVar.e;
        if ((i2 & 4) == 4) {
            Object obj = cVar.i;
            if (obj instanceof String) {
                strL = (String) obj;
            } else {
                AbstractC1724Ow abstractC1724Ow = (AbstractC1724Ow) obj;
                String strR = abstractC1724Ow.r();
                if (abstractC1724Ow.h()) {
                    cVar.i = strR;
                }
                strL = strR;
            }
        } else if ((i2 & 2) == 2) {
            List<String> list = d;
            int size = list.size();
            int i3 = cVar.h;
            if (i3 < 0 || i3 >= size) {
                strL = this.a[i];
            } else {
                strL = list.get(i3);
            }
        } else {
            strL = this.a[i];
        }
        if (cVar.k.size() >= 2) {
            List<Integer> list2 = cVar.k;
            Intrinsics.checkNotNull(list2);
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strL.length()) {
                Intrinsics.checkNotNull(strL);
                Intrinsics.checkNotNull(num);
                int iIntValue = num.intValue();
                Intrinsics.checkNotNull(num2);
                strL = strL.substring(iIntValue, num2.intValue());
                Intrinsics.checkNotNullExpressionValue(strL, "substring(...)");
            }
        }
        if (cVar.m.size() >= 2) {
            List<Integer> list3 = cVar.m;
            Intrinsics.checkNotNull(list3);
            Integer num3 = list3.get(0);
            Integer num4 = list3.get(1);
            Intrinsics.checkNotNull(strL);
            strL = d.l(strL, (char) num3.intValue(), (char) num4.intValue());
        }
        FI0.d.c.EnumC0033c enumC0033c = cVar.j;
        if (enumC0033c == null) {
            enumC0033c = FI0.d.c.EnumC0033c.NONE;
        }
        int iOrdinal = enumC0033c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Intrinsics.checkNotNull(strL);
                strL = d.l(strL, '$', JwtParser.SEPARATOR_CHAR);
            } else {
                if (iOrdinal != 2) {
                    throw new C6489s51();
                }
                if (strL.length() >= 2) {
                    Intrinsics.checkNotNull(strL);
                    strL = strL.substring(1, strL.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strL, "substring(...)");
                }
                Intrinsics.checkNotNull(strL);
                strL = d.l(strL, '$', JwtParser.SEPARATOR_CHAR);
            }
        }
        Intrinsics.checkNotNull(strL);
        return strL;
    }
}

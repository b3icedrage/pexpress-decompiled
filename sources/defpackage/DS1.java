package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class DS1 extends CS1 {
    @NotNull
    public static String b(@NotNull String str) {
        int length;
        Comparable comparable;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listP = JH1.p(new JS1(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (!StringsKt.I((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.c(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listP.size();
        int iE = WE.e(listP);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listP) {
            int i = length + 1;
            if (length < 0) {
                WE.l();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iE) && StringsKt.I(str3)) {
                str3 = null;
            } else {
                String line = KS1.y(iIntValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                    str3 = line;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        CollectionsKt.I(arrayList3, sb, "\n", null, null, null, 124);
        return sb.toString();
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (StringsKt.I("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listP = JH1.p(new JS1(str));
        int length = str.length();
        listP.size();
        int iE = WE.e(listP);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listP) {
            int i2 = i + 1;
            String line = null;
            if (i < 0) {
                WE.l();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != iE) || !StringsKt.I(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.c(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && d.n(str2, i3, "|", false)) {
                    line = str2.substring("|".length() + i3);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        CollectionsKt.I(arrayList, sb, "\n", null, null, null, 124);
        return sb.toString();
    }
}

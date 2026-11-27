package kotlin.text;

import defpackage.C1371Kj;
import defpackage.C1526Mj;
import defpackage.C5317mX;
import defpackage.EK;
import defpackage.HH1;
import defpackage.VE;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends d {
    public static boolean p(String str, String suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return str != null ? d.h(str, suffix, false) : t(str, str.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    public static final int q(int i, @NotNull CharSequence charSequence, @NotNull String string, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z || !(charSequence instanceof String)) ? r(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int r(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        kotlin.ranges.c cVar;
        if (z2) {
            int iE = StringsKt.E(charSequence);
            if (i > iE) {
                i = iE;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            kotlin.ranges.c.h.getClass();
            cVar = new kotlin.ranges.c(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            cVar = new IntRange(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = cVar.g;
        int i4 = cVar.e;
        int i5 = cVar.d;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (t(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        return i5;
                    }
                    if (i5 != i4) {
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (d.j(0, i6, str.length(), str, (String) charSequence, z6)) {
                    return i6;
                }
                if (i6 != i4) {
                    i6 += i3;
                    z = z6;
                }
            }
        }
        return -1;
    }

    public static final int s(@NotNull CharSequence charSequence, @NotNull char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C1526Mj.z(chars), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iE = StringsKt.E(charSequence);
        if (i > iE) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : chars) {
                if (c.a(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iE) {
                return -1;
            }
            i++;
        }
    }

    public static List split$default(CharSequence charSequence, String[] delimiters, final boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return v(i, charSequence, str, z);
            }
        }
        u(i);
        final List listB = C1371Kj.b(delimiters);
        C5317mX c5317mX = new C5317mX(charSequence, i, new Function2() { // from class: kotlin.text.f
            /* JADX WARN: Code duplicated, block: B:8:0x002f A[EDGE_INSN: B:8:0x002f->B:49:0x00d2 BREAK  A[LOOP:0: B:20:0x005a->B:31:0x008c]] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i3;
                int i4;
                Object next;
                Pair pair;
                Object next2;
                String str2;
                CharSequence DelimitedRangesSequence = (CharSequence) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = listB;
                boolean z2 = z;
                if (z2 || list.size() != 1) {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    IntRange intRange = new IntRange(iIntValue, DelimitedRangesSequence.length(), 1);
                    boolean z3 = DelimitedRangesSequence instanceof String;
                    int i5 = intRange.g;
                    int i6 = intRange.e;
                    if (!z3) {
                        if ((i5 > 0 && iIntValue <= i6) || (i5 < 0 && i6 <= iIntValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i3 = i6;
                                        i4 = iIntValue;
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                    int i7 = i6;
                                    i4 = iIntValue;
                                    String str3 = (String) next;
                                    i3 = i7;
                                    if (StringsKt__StringsKt.t(str3, 0, DelimitedRangesSequence, i4, str3.length(), z2)) {
                                        break;
                                    }
                                    iIntValue = i4;
                                    i6 = i3;
                                }
                                String str4 = (String) next;
                                if (str4 == null) {
                                    if (i4 == i3) {
                                        pair = null;
                                        break;
                                    }
                                    iIntValue = i4 + i5;
                                    i6 = i3;
                                } else {
                                    pair = new Pair(Integer.valueOf(i4), str4);
                                    break;
                                }
                            }
                        } else {
                            pair = null;
                            break;
                        }
                    } else if ((i5 > 0 && iIntValue <= i6) || (i5 < 0 && i6 <= iIntValue)) {
                        int i8 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                str2 = (String) next2;
                            } while (!d.j(0, i8, str2.length(), str2, (String) DelimitedRangesSequence, z2));
                            String str5 = (String) next2;
                            if (str5 == null) {
                                if (i8 == i6) {
                                    pair = null;
                                    break;
                                }
                                i8 += i5;
                            } else {
                                pair = new Pair(Integer.valueOf(i8), str5);
                                break;
                            }
                        }
                    } else {
                        pair = null;
                        break;
                    }
                } else {
                    String str6 = (String) CollectionsKt.T(list);
                    int iG = StringsKt.G(DelimitedRangesSequence, str6, iIntValue, false, 4);
                    if (iG < 0) {
                        pair = null;
                        break;
                    }
                    pair = new Pair(Integer.valueOf(iG), str6);
                }
                if (pair == null) {
                    return null;
                }
                return new Pair(pair.d, Integer.valueOf(((String) pair.e).length()));
            }
        });
        Intrinsics.checkNotNullParameter(c5317mX, "<this>");
        ArrayList arrayList = new ArrayList(XE.m(new HH1(c5317mX), 10));
        for (IntRange range : c5317mX) {
            Intrinsics.checkNotNullParameter(charSequence, "<this>");
            Intrinsics.checkNotNullParameter(range, "range");
            arrayList.add(charSequence.subSequence(range.d, range.e + 1).toString());
        }
        return arrayList;
    }

    public static final boolean t(@NotNull CharSequence charSequence, int i, @NotNull CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!c.a(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void u(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(EK.e(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List v(int i, CharSequence charSequence, String str, boolean z) {
        u(i);
        int length = 0;
        int iQ = q(0, charSequence, str, z);
        if (iQ == -1 || i == 1) {
            return VE.c(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i2 = 10;
        if (z2 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        do {
            arrayList.add(charSequence.subSequence(length, iQ).toString());
            length = str.length() + iQ;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iQ = q(length, charSequence, str, z);
        } while (iQ != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean w(String str, String prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (str == null || prefix == null) ? t(str, 0, prefix, 0, prefix.length(), false) : d.o(str, prefix, false);
    }
}

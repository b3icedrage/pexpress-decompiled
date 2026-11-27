package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ia1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4437ia1 extends AbstractC5838p0<C1802Pw> implements RandomAccess {
    public static final /* synthetic */ int h = 0;

    @NotNull
    public final C1802Pw[] e;

    @NotNull
    public final int[] g;

    /* JADX INFO: renamed from: ia1$a */
    public static final class a {
        public static void a(long j, C1481Lu c1481Lu, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((C1802Pw) arrayList4.get(i8)).f() < i7) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C1802Pw c1802Pw = (C1802Pw) arrayList.get(i2);
            C1802Pw c1802Pw2 = (C1802Pw) arrayList4.get(i3 - 1);
            if (i7 == c1802Pw.f()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                C1802Pw c1802Pw3 = (C1802Pw) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                c1802Pw = c1802Pw3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (c1802Pw.l(i7) == c1802Pw2.l(i7)) {
                int iMin = Math.min(c1802Pw.f(), c1802Pw2.f());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && c1802Pw.l(i11) == c1802Pw2.l(i11); i11++) {
                    i10++;
                }
                long j3 = 4;
                long j4 = (c1481Lu.e / j3) + j + ((long) 2) + ((long) i10) + 1;
                c1481Lu.t1(-i10);
                c1481Lu.t1(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    c1481Lu.t1(c1802Pw.l(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 != ((C1802Pw) arrayList4.get(i4)).f()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c1481Lu.t1(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C1481Lu c1481Lu2 = new C1481Lu();
                    c1481Lu.t1(((int) ((c1481Lu2.e / j3) + j4)) * (-1));
                    a(j4, c1481Lu2, i12, arrayList4, i4, i3, arrayList5);
                    c1481Lu.l0(c1481Lu2);
                    return;
                }
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((C1802Pw) arrayList4.get(i14 - 1)).l(i7) != ((C1802Pw) arrayList4.get(i14)).l(i7)) {
                    i13++;
                }
            }
            long j5 = 4;
            long j6 = (c1481Lu.e / j5) + j + ((long) 2) + ((long) (i13 * 2));
            c1481Lu.t1(i13);
            c1481Lu.t1(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iL = ((C1802Pw) arrayList4.get(i15)).l(i7);
                if (i15 == i4 || iL != ((C1802Pw) arrayList4.get(i15 - 1)).l(i7)) {
                    c1481Lu.t1(iL & 255);
                }
            }
            C1481Lu c1481Lu3 = new C1481Lu();
            int i16 = i4;
            while (i16 < i3) {
                byte bL = ((C1802Pw) arrayList4.get(i16)).l(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bL != ((C1802Pw) arrayList4.get(i18)).l(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((C1802Pw) arrayList4.get(i16)).f()) {
                    c1481Lu.t1(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                } else {
                    c1481Lu.t1(((int) ((c1481Lu3.e / j5) + j6)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j6;
                    i6 = i18;
                    a(j2, c1481Lu3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j6 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            c1481Lu.l0(c1481Lu3);
        }

        @NotNull
        public static C4437ia1 b(@NotNull C1802Pw... byteStrings) {
            int i;
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i2 = 0;
            if (byteStrings.length == 0) {
                return new C4437ia1(new C1802Pw[0], new int[]{0, -1});
            }
            Intrinsics.checkNotNullParameter(byteStrings, "<this>");
            Intrinsics.checkNotNullParameter(byteStrings, "<this>");
            ArrayList arrayList = new ArrayList(new C5572nj(byteStrings, false));
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(byteStrings.length);
            for (C1802Pw c1802Pw : byteStrings) {
                arrayList2.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
            ArrayList arrayListH = WE.h(Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C1802Pw c1802Pw2 = byteStrings[i3];
                int i5 = i4 + 1;
                int size = arrayList.size();
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                WE.j(arrayList.size(), size);
                int i6 = size - 1;
                int i7 = 0;
                while (true) {
                    if (i7 > i6) {
                        i = -(i7 + 1);
                        break;
                    }
                    i = (i7 + i6) >>> 1;
                    int iA = BG.a((Comparable) arrayList.get(i), c1802Pw2);
                    if (iA >= 0) {
                        if (iA <= 0) {
                            break;
                        }
                        i6 = i - 1;
                    } else {
                        i7 = i + 1;
                    }
                }
                arrayListH.set(i, Integer.valueOf(i4));
                i3++;
                i4 = i5;
            }
            if (((C1802Pw) arrayList.get(0)).f() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i8 = 0;
            while (i8 < arrayList.size()) {
                C1802Pw prefix = (C1802Pw) arrayList.get(i8);
                int i9 = i8 + 1;
                int i10 = i9;
                while (i10 < arrayList.size()) {
                    C1802Pw c1802Pw3 = (C1802Pw) arrayList.get(i10);
                    c1802Pw3.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!c1802Pw3.m(prefix.f(), prefix)) {
                        break;
                    }
                    if (c1802Pw3.f() == prefix.f()) {
                        throw new IllegalArgumentException(("duplicate option: " + c1802Pw3).toString());
                    }
                    if (((Number) arrayListH.get(i10)).intValue() > ((Number) arrayListH.get(i8)).intValue()) {
                        arrayList.remove(i10);
                        arrayListH.remove(i10);
                    } else {
                        i10++;
                    }
                }
                i8 = i9;
            }
            C1481Lu c1481Lu = new C1481Lu();
            a(0L, c1481Lu, 0, arrayList, 0, arrayList.size(), arrayListH);
            int[] iArr = new int[(int) (c1481Lu.e / ((long) 4))];
            while (!c1481Lu.t()) {
                iArr[i2] = c1481Lu.K0();
                i2++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new C4437ia1((C1802Pw[]) objArrCopyOf, iArr);
        }
    }

    public C4437ia1(C1802Pw[] c1802PwArr, int[] iArr) {
        this.e = c1802PwArr;
        this.g = iArr;
    }

    @Override // defpackage.Y
    public final int b() {
        return this.e.length;
    }

    @Override // defpackage.Y, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1802Pw) {
            return super.contains((C1802Pw) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.e[i];
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1802Pw) {
            return super.indexOf((C1802Pw) obj);
        }
        return -1;
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1802Pw) {
            return super.lastIndexOf((C1802Pw) obj);
        }
        return -1;
    }
}

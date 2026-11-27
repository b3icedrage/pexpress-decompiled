package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import defpackage.C5177lr;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final a a = new a();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public static class d {
        public final ArrayList a;
        public final int[] b;
        public final int[] c;
        public final b d;
        public final int e;
        public final int f;
        public final boolean g;

        public d(b bVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
            int[] iArr3;
            int[] iArr4;
            b bVar2;
            int i;
            int i2;
            this.a = arrayList;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            int iE = bVar.e();
            this.e = iE;
            int iD = bVar.d();
            this.f = iD;
            this.g = true;
            c cVar = arrayList.isEmpty() ? null : (c) arrayList.get(0);
            if (cVar == null || cVar.a != 0 || cVar.b != 0) {
                arrayList.add(0, new c(0, 0, 0));
            }
            arrayList.add(new c(iE, iD, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                iArr3 = this.c;
                iArr4 = this.b;
                bVar2 = this.d;
                if (!zHasNext) {
                    break;
                }
                c cVar2 = (c) it.next();
                for (int i3 = 0; i3 < cVar2.c; i3++) {
                    int i4 = cVar2.a + i3;
                    int i5 = cVar2.b + i3;
                    int i6 = bVar2.a(i4, i5) ? 1 : 2;
                    iArr4[i4] = (i5 << 4) | i6;
                    iArr3[i5] = (i4 << 4) | i6;
                }
            }
            if (this.g) {
                Iterator it2 = arrayList.iterator();
                int i7 = 0;
                while (it2.hasNext()) {
                    c cVar3 = (c) it2.next();
                    while (true) {
                        i = cVar3.a;
                        if (i7 < i) {
                            if (iArr4[i7] == 0) {
                                int size = arrayList.size();
                                int i8 = 0;
                                for (int i9 = 0; i9 < size; i9++) {
                                    c cVar4 = (c) arrayList.get(i9);
                                    while (true) {
                                        i2 = cVar4.b;
                                        if (i8 < i2) {
                                            if (iArr3[i8] == 0 && bVar2.b(i7, i8)) {
                                                int i10 = bVar2.a(i7, i8) ? 8 : 4;
                                                iArr4[i7] = (i8 << 4) | i10;
                                                iArr3[i8] = i10 | (i7 << 4);
                                                break;
                                            }
                                            i8++;
                                        }
                                    }
                                    i8 = cVar4.c + i2;
                                }
                            }
                            i7++;
                        }
                    }
                    i7 = cVar3.c + i;
                }
            }
        }

        public static f b(ArrayDeque arrayDeque, int i, boolean z) {
            f fVar;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = (f) it.next();
                if (fVar.a == i && fVar.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (z) {
                    fVar2.b--;
                } else {
                    fVar2.b++;
                }
            }
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
        public final void a(@NonNull C2803b c2803b) {
            int[] iArr;
            b bVar;
            int i;
            int i2;
            int i3;
            ArrayList arrayList;
            int i4;
            d dVar = this;
            C5177lr c5177lr = new C5177lr(c2803b);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList2 = dVar.a;
            boolean z = true;
            int size = arrayList2.size() - 1;
            int i5 = dVar.e;
            int i6 = dVar.f;
            int i7 = i5;
            while (size >= 0) {
                c cVar = (c) arrayList2.get(size);
                int i8 = cVar.a;
                int i9 = cVar.c;
                int i10 = i8 + i9;
                int i11 = cVar.b;
                int i12 = i11 + i9;
                while (true) {
                    iArr = dVar.b;
                    bVar = dVar.d;
                    boolean z2 = z;
                    i = 0;
                    if (i7 <= i10) {
                        break;
                    }
                    i7--;
                    int i13 = iArr[i7];
                    if ((i13 & 12) != 0) {
                        arrayList = arrayList2;
                        int i14 = i13 >> 4;
                        f fVarB = b(arrayDeque, i14, false);
                        if (fVarB != null) {
                            int i15 = (i5 - fVarB.b) - 1;
                            c5177lr.c(i7, i15);
                            if ((i13 & 4) != 0) {
                                c5177lr.b(bVar.c(i7, i14), i15, z2 ? 1 : 0);
                            }
                        } else {
                            arrayDeque.add(new f(i7, z2, (i5 - i7) - (z2 ? 1 : 0)));
                        }
                    } else {
                        arrayList = arrayList2;
                        if (c5177lr.b != 2 || (i4 = c5177lr.c) < i7 || i4 > i7 + 1) {
                            c5177lr.a();
                            c5177lr.c = i7;
                            c5177lr.d = z2 ? 1 : 0;
                            c5177lr.b = 2;
                        } else {
                            c5177lr.d += z2 ? 1 : 0;
                            c5177lr.c = i7;
                        }
                        i5--;
                    }
                    arrayList2 = arrayList;
                    z = true;
                }
                ArrayList arrayList3 = arrayList2;
                while (i6 > i12) {
                    i6--;
                    int i16 = dVar.c[i6];
                    if ((i16 & 12) != 0) {
                        int i17 = i16 >> 4;
                        f fVarB2 = b(arrayDeque, i17, true);
                        if (fVarB2 == null) {
                            arrayDeque.add(new f(i6, false, i5 - i7));
                            i2 = 0;
                        } else {
                            i2 = 0;
                            c5177lr.c((i5 - fVarB2.b) - 1, i7);
                            if ((i16 & 4) != 0) {
                                c5177lr.b(bVar.c(i17, i6), i7, 1);
                            }
                        }
                    } else {
                        i2 = i;
                        if (c5177lr.b != 1 || i7 < (i3 = c5177lr.c)) {
                            c5177lr.a();
                            c5177lr.c = i7;
                            c5177lr.d = 1;
                            c5177lr.b = 1;
                        } else {
                            int i18 = c5177lr.d;
                            if (i7 <= i3 + i18) {
                                c5177lr.d = i18 + 1;
                                c5177lr.c = Math.min(i7, i3);
                            } else {
                                c5177lr.a();
                                c5177lr.c = i7;
                                c5177lr.d = 1;
                                c5177lr.b = 1;
                            }
                        }
                        i5++;
                    }
                    dVar = this;
                    i = i2;
                }
                i7 = cVar.a;
                int i19 = i7;
                int i20 = i11;
                while (i < i9) {
                    if ((iArr[i19] & 15) == 2) {
                        c5177lr.b(bVar.c(i19, i20), i19, 1);
                    }
                    i19++;
                    i20++;
                    i++;
                }
                size--;
                dVar = this;
                z = true;
                i6 = i11;
                arrayList2 = arrayList3;
            }
            c5177lr.a();
        }
    }

    public static abstract class e<T> {
        public abstract boolean a(@NonNull T t, @NonNull T t2);

        public abstract boolean b(@NonNull T t, @NonNull T t2);

        public Object c(@NonNull T t, @NonNull T t2) {
            return null;
        }
    }

    public static class f {
        public final int a;
        public int b;
        public final boolean c;

        public f(int i, boolean z, int i2) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static class g {
        public int a;
        public int b;
        public int c;
        public int d;

        public final int a() {
            return this.d - this.c;
        }

        public final int b() {
            return this.b - this.a;
        }
    }

    public static class h {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public final int a() {
            return Math.min(this.c - this.a, this.d - this.b);
        }
    }

    @NonNull
    public static d a(@NonNull b bVar) {
        int i;
        h hVar;
        int i2;
        g gVar;
        c cVar;
        int i3;
        int i4;
        h hVar2;
        h hVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g gVar2 = new g();
        int i12 = 0;
        gVar2.a = 0;
        gVar2.b = iE;
        gVar2.c = 0;
        gVar2.d = iD;
        arrayList2.add(gVar2);
        int i13 = iE + iD;
        int i14 = 1;
        int i15 = (((i13 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i15];
        int i16 = i15 / 2;
        int[] iArr2 = new int[i15];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            g gVar3 = (g) arrayList2.remove(arrayList2.size() - i14);
            if (gVar3.b() >= i14 && gVar3.a() >= i14) {
                int iA = ((gVar3.a() + gVar3.b()) + i14) / 2;
                int i17 = i14 + i16;
                iArr[i17] = gVar3.a;
                iArr2[i17] = gVar3.b;
                int i18 = i12;
                while (true) {
                    if (i18 >= iA) {
                        i = i16;
                        hVar = null;
                        break;
                    }
                    int i19 = Math.abs(gVar3.b() - gVar3.a()) % 2 == i14 ? i14 : i12;
                    int iB = gVar3.b() - gVar3.a();
                    int i20 = -i18;
                    int i21 = i20;
                    while (true) {
                        if (i21 > i18) {
                            i3 = i12;
                            i = i16;
                            i4 = iA;
                            hVar2 = null;
                            break;
                        }
                        if (i21 == i20 || (i21 != i18 && iArr[i21 + 1 + i16] > iArr[(i21 - 1) + i16])) {
                            i9 = iArr[i21 + 1 + i16];
                            i10 = i9;
                        } else {
                            i9 = iArr[(i21 - 1) + i16];
                            i10 = i9 + 1;
                        }
                        i = i16;
                        int i22 = ((i10 - gVar3.a) + gVar3.c) - i21;
                        int i23 = (i18 == 0 || i10 != i9) ? i22 : i22 - 1;
                        int i24 = i21;
                        int i25 = i22;
                        int i26 = i10;
                        i4 = iA;
                        while (i26 < gVar3.b && i25 < gVar3.d && bVar.b(i26, i25)) {
                            i26++;
                            i25++;
                        }
                        iArr[i24 + i] = i26;
                        if (i19 != 0) {
                            int i27 = iB - i24;
                            i11 = i19;
                            if (i27 >= i20 + 1 && i27 <= i18 - 1 && iArr2[i27 + i] <= i26) {
                                hVar2 = new h();
                                hVar2.a = i9;
                                hVar2.b = i23;
                                hVar2.c = i26;
                                hVar2.d = i25;
                                i3 = 0;
                                hVar2.e = false;
                                break;
                            }
                        } else {
                            i11 = i19;
                        }
                        i21 = i24 + 2;
                        i12 = 0;
                        i16 = i;
                        iA = i4;
                        i19 = i11;
                    }
                    if (hVar2 != null) {
                        hVar = hVar2;
                        break;
                    }
                    int i28 = (gVar3.b() - gVar3.a()) % 2 == 0 ? 1 : i3;
                    int iB2 = gVar3.b() - gVar3.a();
                    int i29 = i20;
                    while (true) {
                        if (i29 > i18) {
                            hVar3 = null;
                            break;
                        }
                        if (i29 == i20 || (i29 != i18 && iArr2[i29 + 1 + i] < iArr2[(i29 - 1) + i])) {
                            i5 = iArr2[i29 + 1 + i];
                            i6 = i5;
                        } else {
                            i5 = iArr2[(i29 - 1) + i];
                            i6 = i5 - 1;
                        }
                        int i30 = gVar3.d - ((gVar3.b - i6) - i29);
                        int i31 = (i18 == 0 || i6 != i5) ? i30 : i30 + 1;
                        int i32 = i28;
                        while (true) {
                            if (i6 > gVar3.a && i30 > gVar3.c) {
                                i7 = iB2;
                                if (!bVar.b(i6 - 1, i30 - 1)) {
                                    break;
                                }
                                i6--;
                                i30--;
                                iB2 = i7;
                            } else {
                                i7 = iB2;
                                break;
                            }
                        }
                        iArr2[i29 + i] = i6;
                        if (i32 != 0 && (i8 = i7 - i29) >= i20 && i8 <= i18 && iArr[i8 + i] >= i6) {
                            hVar3 = new h();
                            hVar3.a = i6;
                            hVar3.b = i30;
                            hVar3.c = i5;
                            hVar3.d = i31;
                            hVar3.e = true;
                            break;
                        }
                        i29 += 2;
                        i28 = i32;
                        iB2 = i7;
                    }
                    if (hVar3 != null) {
                        hVar = hVar3;
                        break;
                    }
                    i18++;
                    i16 = i;
                    iA = i4;
                    i14 = 1;
                    i12 = 0;
                }
            } else {
                i = i16;
                hVar = null;
                break;
            }
            if (hVar != null) {
                if (hVar.a() > 0) {
                    int i33 = hVar.d;
                    int i34 = hVar.b;
                    int i35 = i33 - i34;
                    int i36 = hVar.c;
                    int i37 = hVar.a;
                    int i38 = i36 - i37;
                    if (i35 == i38) {
                        cVar = new c(i37, i34, i38);
                    } else if (hVar.e) {
                        cVar = new c(i37, i34, hVar.a());
                    } else {
                        cVar = i35 > i38 ? new c(i37, i34 + 1, hVar.a()) : new c(i37 + 1, i34, hVar.a());
                    }
                    arrayList.add(cVar);
                }
                if (arrayList3.isEmpty()) {
                    gVar = new g();
                    i2 = 1;
                } else {
                    i2 = 1;
                    gVar = (g) arrayList3.remove(arrayList3.size() - 1);
                }
                gVar.a = gVar3.a;
                gVar.c = gVar3.c;
                gVar.b = hVar.a;
                gVar.d = hVar.b;
                arrayList2.add(gVar);
                gVar3.b = gVar3.b;
                gVar3.d = gVar3.d;
                gVar3.a = hVar.c;
                gVar3.c = hVar.d;
                arrayList2.add(gVar3);
            } else {
                i2 = 1;
                arrayList3.add(gVar3);
            }
            i16 = i;
            i14 = i2;
            i12 = 0;
        }
        Collections.sort(arrayList, a);
        return new d(bVar, arrayList, iArr, iArr2);
    }
}

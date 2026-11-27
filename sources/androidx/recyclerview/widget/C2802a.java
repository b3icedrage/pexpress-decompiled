package androidx.recyclerview.widget;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import defpackage.C1361Kf1;
import defpackage.K1;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2802a {
    public final D d;
    public final C1361Kf1 a = new C1361Kf1(30);
    public final ArrayList<C0239a> b = new ArrayList<>();
    public final ArrayList<C0239a> c = new ArrayList<>();
    public int f = 0;
    public final w e = new w(this);

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public static final class C0239a {
        public int a;
        public int b;
        public Object c;
        public int d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof C0239a)) {
                    return false;
                }
                C0239a c0239a = (C0239a) obj;
                int i = this.a;
                if (i != c0239a.a) {
                    return false;
                }
                if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != c0239a.b || this.b != c0239a.d) {
                    if (this.d != c0239a.d || this.b != c0239a.b) {
                        return false;
                    }
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(c0239a.c)) {
                            return false;
                        }
                    } else if (c0239a.c != null) {
                        return false;
                    }
                }
            }
            return true;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i == 1) {
                str = ProductAction.ACTION_ADD;
            } else if (i == 2) {
                str = "rm";
            } else if (i != 4) {
                str = i != 8 ? "??" : "mv";
            } else {
                str = "up";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            return K1.a(sb, this.c, "]");
        }
    }

    public C2802a(D d) {
        this.d = d;
    }

    public final boolean a(int i) {
        ArrayList<C0239a> arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0239a c0239a = arrayList.get(i2);
            int i3 = c0239a.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = c0239a.b;
                    int i5 = c0239a.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (f(c0239a.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<C0239a> arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.d.a(arrayList.get(i));
        }
        k(arrayList);
        this.f = 0;
    }

    public final void c() {
        b();
        ArrayList<C0239a> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0239a c0239a = arrayList.get(i);
            int i2 = c0239a.a;
            D d = this.d;
            if (i2 == 1) {
                d.a(c0239a);
                d.d(c0239a.b, c0239a.d);
            } else if (i2 == 2) {
                d.a(c0239a);
                int i3 = c0239a.b;
                int i4 = c0239a.d;
                RecyclerView recyclerView = d.a;
                recyclerView.R(i3, true, i4);
                recyclerView.p0 = true;
                recyclerView.m0.c += i4;
            } else if (i2 == 4) {
                d.a(c0239a);
                d.c(c0239a.c, c0239a.b, c0239a.d);
            } else if (i2 == 8) {
                d.a(c0239a);
                d.e(c0239a.b, c0239a.d);
            }
        }
        k(arrayList);
        this.f = 0;
    }

    public final void d(C0239a c0239a) {
        int i;
        int i2 = c0239a.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL = l(c0239a.b, i2);
        int i3 = c0239a.b;
        int i4 = c0239a.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0239a);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c0239a.d; i6++) {
            int iL2 = l((i * i6) + c0239a.b, c0239a.a);
            int i7 = c0239a.a;
            if (i7 == 2 ? iL2 != iL : !(i7 == 4 && iL2 == iL + 1)) {
                C0239a c0239aH = h(c0239a.c, i7, iL, i5);
                e(c0239aH, i3);
                c0239aH.c = null;
                this.a.b(c0239aH);
                if (c0239a.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iL = iL2;
            } else {
                i5++;
            }
        }
        Object obj = c0239a.c;
        c0239a.c = null;
        this.a.b(c0239a);
        if (i5 > 0) {
            C0239a c0239aH2 = h(obj, c0239a.a, iL, i5);
            e(c0239aH2, i3);
            c0239aH2.c = null;
            this.a.b(c0239aH2);
        }
    }

    public final void e(C0239a c0239a, int i) {
        D d = this.d;
        d.a(c0239a);
        int i2 = c0239a.a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            d.c(c0239a.c, i, c0239a.d);
            return;
        }
        int i3 = c0239a.d;
        RecyclerView recyclerView = d.a;
        recyclerView.R(i, true, i3);
        recyclerView.p0 = true;
        recyclerView.m0.c += i3;
    }

    public final int f(int i, int i2) {
        ArrayList<C0239a> arrayList = this.c;
        int size = arrayList.size();
        while (i2 < size) {
            C0239a c0239a = arrayList.get(i2);
            int i3 = c0239a.a;
            if (i3 == 8) {
                int i4 = c0239a.b;
                if (i4 == i) {
                    i = c0239a.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0239a.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0239a.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0239a.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0239a.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final C0239a h(Object obj, int i, int i2, int i3) {
        C0239a c0239a = (C0239a) this.a.a();
        if (c0239a != null) {
            c0239a.a = i;
            c0239a.b = i2;
            c0239a.d = i3;
            c0239a.c = obj;
            return c0239a;
        }
        C0239a c0239a2 = new C0239a();
        c0239a2.a = i;
        c0239a2.b = i2;
        c0239a2.d = i3;
        c0239a2.c = obj;
        return c0239a2;
    }

    public final void i(C0239a c0239a) {
        this.c.add(c0239a);
        int i = c0239a.a;
        D d = this.d;
        if (i == 1) {
            d.d(c0239a.b, c0239a.d);
            return;
        }
        if (i == 2) {
            int i2 = c0239a.b;
            int i3 = c0239a.d;
            RecyclerView recyclerView = d.a;
            recyclerView.R(i2, false, i3);
            recyclerView.p0 = true;
            return;
        }
        if (i == 4) {
            d.c(c0239a.c, c0239a.b, c0239a.d);
        } else if (i == 8) {
            d.e(c0239a.b, c0239a.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0239a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:105:0x018c  */
    /* JADX WARN: Code duplicated, block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:85:0x0140  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x016f  */
    public final void j() {
        byte b;
        boolean z;
        byte b2;
        C0239a c0239aH;
        int i;
        int i2;
        int i3;
        C0239a c0239aH2;
        boolean z2;
        boolean z3;
        C0239a c0239aH3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        ArrayList<C0239a> arrayList = this.b;
        w wVar = this.e;
        wVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                b = -1;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (arrayList.get(size).a != 8) {
                    z4 = true;
                } else if (z4) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            C0239a c0239a = arrayList.get(size);
            C0239a c0239a2 = arrayList.get(i12);
            int i13 = c0239a2.a;
            if (i13 != 1) {
                C2802a c2802a = wVar.a;
                if (i13 == 2) {
                    int i14 = c0239a.b;
                    int i15 = c0239a.d;
                    if (i14 < i15) {
                        z3 = c0239a2.b == i14 && c0239a2.d == i15 - i14;
                        z2 = false;
                    } else if (c0239a2.b == i15 + 1 && c0239a2.d == i14 - i15) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    int i16 = c0239a2.b;
                    if (i15 < i16) {
                        c0239a2.b = i16 - 1;
                    } else {
                        int i17 = c0239a2.d;
                        if (i15 < i16 + i17) {
                            c0239a2.d = i17 - 1;
                            c0239a.a = 2;
                            c0239a.d = 1;
                            if (c0239a2.d == 0) {
                                arrayList.remove(i12);
                                c0239a2.c = null;
                                c2802a.a.b(c0239a2);
                            }
                        }
                    }
                    int i18 = c0239a.b;
                    int i19 = c0239a2.b;
                    if (i18 <= i19) {
                        c0239a2.b = i19 + 1;
                    } else {
                        int i20 = i19 + c0239a2.d;
                        if (i18 < i20) {
                            c0239aH3 = c2802a.h(null, 2, i18 + 1, i20 - i18);
                            c0239a2.d = c0239a.b - c0239a2.b;
                        }
                        if (z3) {
                            arrayList.set(size, c0239a2);
                            arrayList.remove(i12);
                            c0239a.c = null;
                            c2802a.a.b(c0239a);
                        } else {
                            if (z2) {
                                if (c0239aH3 != null) {
                                    i10 = c0239a.b;
                                    if (i10 > c0239aH3.b) {
                                        c0239a.b = i10 - c0239aH3.d;
                                    }
                                    i11 = c0239a.d;
                                    if (i11 > c0239aH3.b) {
                                        c0239a.d = i11 - c0239aH3.d;
                                    }
                                }
                                i8 = c0239a.b;
                                if (i8 > c0239a2.b) {
                                    c0239a.b = i8 - c0239a2.d;
                                }
                                i9 = c0239a.d;
                                if (i9 > c0239a2.b) {
                                    c0239a.d = i9 - c0239a2.d;
                                }
                            } else {
                                if (c0239aH3 != null) {
                                    i6 = c0239a.b;
                                    if (i6 >= c0239aH3.b) {
                                        c0239a.b = i6 - c0239aH3.d;
                                    }
                                    i7 = c0239a.d;
                                    if (i7 >= c0239aH3.b) {
                                        c0239a.d = i7 - c0239aH3.d;
                                    }
                                }
                                i4 = c0239a.b;
                                if (i4 >= c0239a2.b) {
                                    c0239a.b = i4 - c0239a2.d;
                                }
                                i5 = c0239a.d;
                                if (i5 >= c0239a2.b) {
                                    c0239a.d = i5 - c0239a2.d;
                                }
                            }
                            arrayList.set(size, c0239a2);
                            if (c0239a.b != c0239a.d) {
                                arrayList.set(i12, c0239a);
                            } else {
                                arrayList.remove(i12);
                            }
                            if (c0239aH3 != null) {
                                arrayList.add(size, c0239aH3);
                            }
                        }
                    }
                    c0239aH3 = null;
                    if (z3) {
                        arrayList.set(size, c0239a2);
                        arrayList.remove(i12);
                        c0239a.c = null;
                        c2802a.a.b(c0239a);
                    } else {
                        if (z2) {
                            if (c0239aH3 != null) {
                                i10 = c0239a.b;
                                if (i10 > c0239aH3.b) {
                                    c0239a.b = i10 - c0239aH3.d;
                                }
                                i11 = c0239a.d;
                                if (i11 > c0239aH3.b) {
                                    c0239a.d = i11 - c0239aH3.d;
                                }
                            }
                            i8 = c0239a.b;
                            if (i8 > c0239a2.b) {
                                c0239a.b = i8 - c0239a2.d;
                            }
                            i9 = c0239a.d;
                            if (i9 > c0239a2.b) {
                                c0239a.d = i9 - c0239a2.d;
                            }
                        } else {
                            if (c0239aH3 != null) {
                                i6 = c0239a.b;
                                if (i6 >= c0239aH3.b) {
                                    c0239a.b = i6 - c0239aH3.d;
                                }
                                i7 = c0239a.d;
                                if (i7 >= c0239aH3.b) {
                                    c0239a.d = i7 - c0239aH3.d;
                                }
                            }
                            i4 = c0239a.b;
                            if (i4 >= c0239a2.b) {
                                c0239a.b = i4 - c0239a2.d;
                            }
                            i5 = c0239a.d;
                            if (i5 >= c0239a2.b) {
                                c0239a.d = i5 - c0239a2.d;
                            }
                        }
                        arrayList.set(size, c0239a2);
                        if (c0239a.b != c0239a.d) {
                            arrayList.set(i12, c0239a);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (c0239aH3 != null) {
                            arrayList.add(size, c0239aH3);
                        }
                    }
                } else if (i13 == 4) {
                    int i21 = c0239a.d;
                    int i22 = c0239a2.b;
                    if (i21 < i22) {
                        c0239a2.b = i22 - 1;
                    } else {
                        int i23 = c0239a2.d;
                        if (i21 < i22 + i23) {
                            c0239a2.d = i23 - 1;
                            c0239aH = c2802a.h(c0239a2.c, 4, c0239a.b, 1);
                        }
                        i = c0239a.b;
                        i2 = c0239a2.b;
                        if (i <= i2) {
                            c0239a2.b = i2 + 1;
                        } else {
                            i3 = i2 + c0239a2.d;
                            if (i < i3) {
                                int i24 = i3 - i;
                                c0239aH2 = c2802a.h(c0239a2.c, 4, i + 1, i24);
                                c0239a2.d -= i24;
                            }
                            arrayList.set(i12, c0239a);
                            if (c0239a2.d > 0) {
                                arrayList.set(size, c0239a2);
                            } else {
                                arrayList.remove(size);
                                c0239a2.c = null;
                                c2802a.a.b(c0239a2);
                            }
                            if (c0239aH != null) {
                                arrayList.add(size, c0239aH);
                            }
                            if (c0239aH2 != null) {
                                arrayList.add(size, c0239aH2);
                            }
                        }
                        c0239aH2 = null;
                        arrayList.set(i12, c0239a);
                        if (c0239a2.d > 0) {
                            arrayList.set(size, c0239a2);
                        } else {
                            arrayList.remove(size);
                            c0239a2.c = null;
                            c2802a.a.b(c0239a2);
                        }
                        if (c0239aH != null) {
                            arrayList.add(size, c0239aH);
                        }
                        if (c0239aH2 != null) {
                            arrayList.add(size, c0239aH2);
                        }
                    }
                    c0239aH = null;
                    i = c0239a.b;
                    i2 = c0239a2.b;
                    if (i <= i2) {
                        c0239a2.b = i2 + 1;
                    } else {
                        i3 = i2 + c0239a2.d;
                        if (i < i3) {
                            int i25 = i3 - i;
                            c0239aH2 = c2802a.h(c0239a2.c, 4, i + 1, i25);
                            c0239a2.d -= i25;
                        }
                        arrayList.set(i12, c0239a);
                        if (c0239a2.d > 0) {
                            arrayList.set(size, c0239a2);
                        } else {
                            arrayList.remove(size);
                            c0239a2.c = null;
                            c2802a.a.b(c0239a2);
                        }
                        if (c0239aH != null) {
                            arrayList.add(size, c0239aH);
                        }
                        if (c0239aH2 != null) {
                            arrayList.add(size, c0239aH2);
                        }
                    }
                    c0239aH2 = null;
                    arrayList.set(i12, c0239a);
                    if (c0239a2.d > 0) {
                        arrayList.set(size, c0239a2);
                    } else {
                        arrayList.remove(size);
                        c0239a2.c = null;
                        c2802a.a.b(c0239a2);
                    }
                    if (c0239aH != null) {
                        arrayList.add(size, c0239aH);
                    }
                    if (c0239aH2 != null) {
                        arrayList.add(size, c0239aH2);
                    }
                }
            } else {
                int i26 = c0239a.d;
                int i27 = c0239a2.b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = c0239a.b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    c0239a.b = i29 + c0239a2.d;
                }
                int i30 = c0239a2.b;
                if (i30 <= i26) {
                    c0239a.d = i26 + c0239a2.d;
                }
                c0239a2.b = i30 + i28;
                arrayList.set(size, c0239a2);
                arrayList.set(i12, c0239a);
            }
        }
        int size2 = arrayList.size();
        int i31 = 0;
        while (i31 < size2) {
            C0239a c0239aH4 = arrayList.get(i31);
            int i32 = c0239aH4.a;
            if (i32 != 1) {
                D d = this.d;
                if (i32 == 2) {
                    int i33 = c0239aH4.b;
                    int i34 = c0239aH4.d + i33;
                    int i35 = i33;
                    int i36 = 0;
                    byte b3 = -1;
                    while (i35 < i34) {
                        if (d.b(i35) != null || a(i35)) {
                            if (b3 == 0) {
                                d(h(null, 2, i33, i36));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 1;
                        } else {
                            if (b3 == 1) {
                                i(h(null, 2, i33, i36));
                                z = true;
                            } else {
                                z = false;
                            }
                            b2 = 0;
                        }
                        if (z) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        b3 = b2;
                    }
                    if (i36 != c0239aH4.d) {
                        c0239aH4.c = null;
                        this.a.b(c0239aH4);
                        c0239aH4 = h(null, 2, i33, i36);
                    }
                    if (b3 == 0) {
                        d(c0239aH4);
                    } else {
                        i(c0239aH4);
                    }
                } else if (i32 == 4) {
                    int i37 = c0239aH4.b;
                    int i38 = c0239aH4.d + i37;
                    int i39 = i37;
                    int i40 = 0;
                    while (i37 < i38) {
                        if (d.b(i37) != null || a(i37)) {
                            if (b == 0) {
                                d(h(c0239aH4.c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            b = 1;
                        } else {
                            if (b == 1) {
                                i(h(c0239aH4.c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            b = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != c0239aH4.d) {
                        Object obj = c0239aH4.c;
                        c0239aH4.c = null;
                        this.a.b(c0239aH4);
                        c0239aH4 = h(obj, 4, i39, i40);
                    }
                    if (b == 0) {
                        d(c0239aH4);
                    } else {
                        i(c0239aH4);
                    }
                } else if (i32 == 8) {
                    i(c0239aH4);
                }
            } else {
                i(c0239aH4);
            }
            i31++;
            b = -1;
        }
        arrayList.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0239a c0239a = (C0239a) arrayList.get(i);
            c0239a.c = null;
            this.a.b(c0239a);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        ArrayList<C0239a> arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0239a c0239a = arrayList.get(size);
            int i5 = c0239a.a;
            if (i5 == 8) {
                int i6 = c0239a.b;
                int i7 = c0239a.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0239a.b = i6 + 1;
                            c0239a.d = i7 + 1;
                        } else if (i2 == 2) {
                            c0239a.b = i6 - 1;
                            c0239a.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0239a.d = i7 + 1;
                    } else if (i2 == 2) {
                        c0239a.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0239a.b = i6 + 1;
                    } else if (i2 == 2) {
                        c0239a.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0239a.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0239a.d;
                    } else if (i5 == 2) {
                        i += c0239a.d;
                    }
                } else if (i2 == 1) {
                    c0239a.b = i8 + 1;
                } else if (i2 == 2) {
                    c0239a.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0239a c0239a2 = arrayList.get(size2);
            if (c0239a2.a == 8) {
                int i9 = c0239a2.d;
                if (i9 == c0239a2.b || i9 < 0) {
                    arrayList.remove(size2);
                    c0239a2.c = null;
                    this.a.b(c0239a2);
                }
            } else if (c0239a2.d <= 0) {
                arrayList.remove(size2);
                c0239a2.c = null;
                this.a.b(c0239a2);
            }
        }
        return i;
    }
}

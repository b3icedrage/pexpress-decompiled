package defpackage;

import TQ0.a;
import com.google.android.gms.common.api.Api;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class WA1 extends AbstractC1724Ow {
    public static final int[] l;
    public final int e;
    public final AbstractC1724Ow g;
    public final AbstractC1724Ow h;
    public final int i;
    public final int j;
    public int k = 0;

    public static class a {
        public final Stack<AbstractC1724Ow> a = new Stack<>();

        public final void a(AbstractC1724Ow abstractC1724Ow) {
            if (!abstractC1724Ow.f()) {
                if (!(abstractC1724Ow instanceof WA1)) {
                    String strValueOf = String.valueOf(abstractC1724Ow.getClass());
                    throw new IllegalArgumentException(C5807oq.b(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
                }
                WA1 wa1 = (WA1) abstractC1724Ow;
                a(wa1.g);
                a(wa1.h);
                return;
            }
            int size = abstractC1724Ow.size();
            int[] iArr = WA1.l;
            int iBinarySearch = Arrays.binarySearch(iArr, size);
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int i = iArr[iBinarySearch + 1];
            Stack<AbstractC1724Ow> stack = this.a;
            if (stack.isEmpty() || stack.peek().size() >= i) {
                stack.push(abstractC1724Ow);
                return;
            }
            int i2 = iArr[iBinarySearch];
            AbstractC1724Ow abstractC1724OwPop = stack.pop();
            while (!stack.isEmpty() && stack.peek().size() < i2) {
                abstractC1724OwPop = new WA1(stack.pop(), abstractC1724OwPop);
            }
            WA1 wa2 = new WA1(abstractC1724OwPop, abstractC1724Ow);
            while (!stack.isEmpty()) {
                int[] iArr2 = WA1.l;
                int iBinarySearch2 = Arrays.binarySearch(iArr2, wa2.e);
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                }
                if (stack.peek().size() >= iArr2[iBinarySearch2 + 1]) {
                    break;
                } else {
                    wa2 = new WA1(stack.pop(), wa2);
                }
            }
            stack.push(wa2);
        }
    }

    public static class b implements Iterator<TQ0> {
        public final Stack<WA1> d = new Stack<>();
        public TQ0 e;

        public b(AbstractC1724Ow abstractC1724Ow) {
            while (abstractC1724Ow instanceof WA1) {
                WA1 wa1 = (WA1) abstractC1724Ow;
                this.d.push(wa1);
                abstractC1724Ow = wa1.g;
            }
            this.e = (TQ0) abstractC1724Ow;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TQ0 next() {
            TQ0 tq0;
            TQ0 tq1 = this.e;
            if (tq1 == null) {
                throw new NoSuchElementException();
            }
            do {
                Stack<WA1> stack = this.d;
                if (stack.isEmpty()) {
                    tq0 = null;
                    break;
                }
                AbstractC1724Ow abstractC1724Ow = stack.pop().h;
                while (abstractC1724Ow instanceof WA1) {
                    WA1 wa1 = (WA1) abstractC1724Ow;
                    stack.push(wa1);
                    abstractC1724Ow = wa1.g;
                }
                tq0 = (TQ0) abstractC1724Ow;
            } while (tq0.e.length == 0);
            this.e = tq0;
            return tq1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class c implements AbstractC1724Ow.a {
        public final b d;
        public TQ0.a e;
        public int g;

        public c(WA1 wa1) {
            b bVar = new b(wa1);
            this.d = bVar;
            this.e = bVar.next().new a();
            this.g = wa1.e;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.g > 0;
        }

        @Override // java.util.Iterator
        public final Byte next() {
            if (!this.e.hasNext()) {
                this.e = this.d.next().new a();
            }
            this.g--;
            return Byte.valueOf(this.e.a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER));
        l = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = l;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public WA1(AbstractC1724Ow abstractC1724Ow, AbstractC1724Ow abstractC1724Ow2) {
        this.g = abstractC1724Ow;
        this.h = abstractC1724Ow2;
        int size = abstractC1724Ow.size();
        this.i = size;
        this.e = abstractC1724Ow2.size() + size;
        this.j = Math.max(abstractC1724Ow.e(), abstractC1724Ow2.e()) + 1;
    }

    @Override // defpackage.AbstractC1724Ow
    public final void d(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        AbstractC1724Ow abstractC1724Ow = this.g;
        int i5 = this.i;
        if (i4 <= i5) {
            abstractC1724Ow.d(i, bArr, i2, i3);
            return;
        }
        AbstractC1724Ow abstractC1724Ow2 = this.h;
        if (i >= i5) {
            abstractC1724Ow2.d(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC1724Ow.d(i, bArr, i2, i6);
        abstractC1724Ow2.d(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        int iO;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1724Ow) {
            AbstractC1724Ow abstractC1724Ow = (AbstractC1724Ow) obj;
            int size = abstractC1724Ow.size();
            int i = this.e;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.k == 0 || (iO = abstractC1724Ow.o()) == 0 || this.k == iO) {
                    b bVar = new b(this);
                    TQ0 next = bVar.next();
                    b bVar2 = new b(abstractC1724Ow);
                    TQ0 next2 = bVar2.next();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = next.e.length - i2;
                        int length2 = next2.e.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? next.u(next2, i3, iMin) : next2.u(next, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            next = bVar.next();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            next2 = bVar2.next();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC1724Ow
    public final boolean f() {
        return this.e >= l[this.j];
    }

    @Override // defpackage.AbstractC1724Ow
    public final boolean h() {
        int iN = this.g.n(0, 0, this.i);
        AbstractC1724Ow abstractC1724Ow = this.h;
        return abstractC1724Ow.n(iN, 0, abstractC1724Ow.size()) == 0;
    }

    public final int hashCode() {
        int iM = this.k;
        if (iM == 0) {
            int i = this.e;
            iM = m(i, 0, i);
            if (iM == 0) {
                iM = 1;
            }
            this.k = iM;
        }
        return iM;
    }

    @Override // defpackage.AbstractC1724Ow
    /* JADX INFO: renamed from: i */
    public final AbstractC1724Ow.a iterator() {
        return new c(this);
    }

    @Override // defpackage.AbstractC1724Ow, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new c(this);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int m(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1724Ow abstractC1724Ow = this.g;
        int i5 = this.i;
        if (i4 <= i5) {
            return abstractC1724Ow.m(i, i2, i3);
        }
        AbstractC1724Ow abstractC1724Ow2 = this.h;
        if (i2 >= i5) {
            return abstractC1724Ow2.m(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1724Ow2.m(abstractC1724Ow.m(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int n(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC1724Ow abstractC1724Ow = this.g;
        int i5 = this.i;
        if (i4 <= i5) {
            return abstractC1724Ow.n(i, i2, i3);
        }
        AbstractC1724Ow abstractC1724Ow2 = this.h;
        if (i2 >= i5) {
            return abstractC1724Ow2.n(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC1724Ow2.n(abstractC1724Ow.n(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int o() {
        return this.k;
    }

    @Override // defpackage.AbstractC1724Ow
    public final String q() {
        byte[] bArr;
        int i = this.e;
        if (i == 0) {
            bArr = YB0.a;
        } else {
            byte[] bArr2 = new byte[i];
            d(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // defpackage.AbstractC1724Ow
    public final void s(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC1724Ow abstractC1724Ow = this.g;
        int i4 = this.i;
        if (i3 <= i4) {
            abstractC1724Ow.s(outputStream, i, i2);
            return;
        }
        AbstractC1724Ow abstractC1724Ow2 = this.h;
        if (i >= i4) {
            abstractC1724Ow2.s(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC1724Ow.s(outputStream, i, i5);
        abstractC1724Ow2.s(outputStream, 0, i2 - i5);
    }

    @Override // defpackage.AbstractC1724Ow
    public final int size() {
        return this.e;
    }
}

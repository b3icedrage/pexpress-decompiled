package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: Ow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1724Ow implements Iterable<Byte> {
    public static final TQ0 d = new TQ0(new byte[0]);

    /* JADX INFO: renamed from: Ow$a */
    public interface a extends Iterator<Byte> {
    }

    public static AbstractC1724Ow a(Iterator<AbstractC1724Ow> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static b j() {
        return new b();
    }

    public final AbstractC1724Ow b(AbstractC1724Ow abstractC1724Ow) {
        int size = size();
        int size2 = abstractC1724Ow.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = WA1.l;
        WA1 wa1 = this instanceof WA1 ? (WA1) this : null;
        if (abstractC1724Ow.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return abstractC1724Ow;
        }
        int size3 = abstractC1724Ow.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = abstractC1724Ow.size();
            byte[] bArr = new byte[size4 + size5];
            c(0, bArr, 0, size4);
            abstractC1724Ow.c(0, bArr, size4, size5);
            return new TQ0(bArr);
        }
        if (wa1 != null) {
            AbstractC1724Ow abstractC1724Ow2 = wa1.h;
            if (abstractC1724Ow.size() + abstractC1724Ow2.size() < 128) {
                int size6 = abstractC1724Ow2.size();
                int size7 = abstractC1724Ow.size();
                byte[] bArr2 = new byte[size6 + size7];
                abstractC1724Ow2.c(0, bArr2, 0, size6);
                abstractC1724Ow.c(0, bArr2, size6, size7);
                return new WA1(wa1.g, new TQ0(bArr2));
            }
        }
        if (wa1 != null) {
            AbstractC1724Ow abstractC1724Ow3 = wa1.g;
            int iE = abstractC1724Ow3.e();
            AbstractC1724Ow abstractC1724Ow4 = wa1.h;
            if (iE > abstractC1724Ow4.e()) {
                if (wa1.j > abstractC1724Ow.e()) {
                    return new WA1(abstractC1724Ow3, new WA1(abstractC1724Ow4, abstractC1724Ow));
                }
            }
        }
        if (size3 >= WA1.l[Math.max(e(), abstractC1724Ow.e()) + 1]) {
            return new WA1(this, abstractC1724Ow);
        }
        WA1.a aVar = new WA1.a();
        aVar.a(this);
        aVar.a(abstractC1724Ow);
        Stack<AbstractC1724Ow> stack = aVar.a;
        AbstractC1724Ow abstractC1724OwPop = stack.pop();
        while (!stack.isEmpty()) {
            abstractC1724OwPop = new WA1(stack.pop(), abstractC1724OwPop);
        }
        return abstractC1724OwPop;
    }

    public final void c(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                d(i, bArr, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void d(int i, byte[] bArr, int i2, int i3);

    public abstract int e();

    public abstract boolean f();

    public abstract boolean h();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract a iterator();

    public abstract int m(int i, int i2, int i3);

    public abstract int n(int i, int i2, int i3);

    public abstract int o();

    public abstract String q();

    public final String r() {
        try {
            return q();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public abstract void s(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* JADX INFO: renamed from: Ow$b */
    public static final class b extends OutputStream {
        public static final byte[] j = new byte[0];
        public int g;
        public int i;
        public final int d = UserVerificationMethods.USER_VERIFY_PATTERN;
        public final ArrayList<AbstractC1724Ow> e = new ArrayList<>();
        public byte[] h = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];

        public final void c(int i) {
            this.e.add(new TQ0(this.h));
            int length = this.g + this.h.length;
            this.g = length;
            this.h = new byte[Math.max(this.d, Math.max(i, length >>> 1))];
            this.i = 0;
        }

        public final void f() {
            int i = this.i;
            byte[] bArr = this.h;
            int length = bArr.length;
            ArrayList<AbstractC1724Ow> arrayList = this.e;
            if (i >= length) {
                arrayList.add(new TQ0(this.h));
                this.h = j;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                arrayList.add(new TQ0(bArr2));
            }
            this.g += this.i;
            this.i = 0;
        }

        public final synchronized AbstractC1724Ow g() {
            ArrayList<AbstractC1724Ow> arrayList;
            f();
            arrayList = this.e;
            if (arrayList == null) {
                ArrayList<AbstractC1724Ow> arrayList2 = new ArrayList<>();
                Iterator<AbstractC1724Ow> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? AbstractC1724Ow.d : AbstractC1724Ow.a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i = this.g + this.i;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i) {
            try {
                if (this.i == this.h.length) {
                    c(1);
                }
                byte[] bArr = this.h;
                int i2 = this.i;
                this.i = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.h;
                int length = bArr2.length;
                int i3 = this.i;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.i += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    c(i4);
                    System.arraycopy(bArr, i + length2, this.h, 0, i4);
                    this.i = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: cP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3144cP0 extends AbstractList<String> implements RandomAccess, InterfaceC3773fP0 {
    public static final X82 e = new X82(new C3144cP0());
    public final ArrayList d;

    public C3144cP0() {
        this.d = new ArrayList();
    }

    @Override // defpackage.InterfaceC3773fP0
    public final AbstractC1724Ow S0(int i) {
        AbstractC1724Ow tq0;
        ArrayList arrayList = this.d;
        Object obj = arrayList.get(i);
        if (obj instanceof AbstractC1724Ow) {
            tq0 = (AbstractC1724Ow) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            TQ0 tq1 = AbstractC1724Ow.d;
            try {
                tq0 = new TQ0(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            TQ0 tq2 = AbstractC1724Ow.d;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tq0 = new TQ0(bArr2);
        }
        if (tq0 != obj) {
            arrayList.set(i, tq0);
        }
        return tq0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.d.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.d.size(), collection);
    }

    @Override // defpackage.InterfaceC3773fP0
    public final void c1(TQ0 tq0) {
        this.d.add(tq0);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC3773fP0
    public final List<?> g() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.d;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1724Ow) {
            AbstractC1724Ow abstractC1724Ow = (AbstractC1724Ow) obj;
            String strR = abstractC1724Ow.r();
            if (abstractC1724Ow.h()) {
                arrayList.set(i, strR);
            }
            return strR;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = YB0.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (C5207m.k(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        Object objRemove = this.d.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof AbstractC1724Ow) {
            return ((AbstractC1724Ow) objRemove).r();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = YB0.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.d.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC1724Ow) {
            return ((AbstractC1724Ow) obj2).r();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = YB0.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.InterfaceC3773fP0
    public final X82 t() {
        return new X82(this);
    }

    public C3144cP0(InterfaceC3773fP0 interfaceC3773fP0) {
        this.d = new ArrayList(interfaceC3773fP0.size());
        addAll(interfaceC3773fP0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC3773fP0) {
            collection = ((InterfaceC3773fP0) collection).g();
        }
        boolean zAddAll = this.d.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: dP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3354dP0 extends V0<String> implements InterfaceC3563eP0, RandomAccess {
    public final ArrayList e;

    static {
        new C3354dP0(10).d = false;
    }

    public C3354dP0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // defpackage.InterfaceC3563eP0
    public final void L0(AbstractC1646Nw abstractC1646Nw) {
        a();
        this.e.add(abstractC1646Nw);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.e.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.V0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.e.size(), collection);
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC3563eP0
    public final List<?> g() {
        return Collections.unmodifiableList(this.e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.e;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1646Nw) {
            AbstractC1646Nw abstractC1646Nw = (AbstractC1646Nw) obj;
            abstractC1646Nw.getClass();
            String strH = abstractC1646Nw.size() == 0 ? "" : abstractC1646Nw.h(XB0.a);
            if (abstractC1646Nw.d()) {
                arrayList.set(i, strH);
            }
            return strH;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, XB0.a);
        C5757oc2.a aVar = C5757oc2.a;
        if (C5757oc2.a.b(bArr, 0, bArr.length) == 0) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // defpackage.InterfaceC3563eP0
    public final Object k1(int i) {
        return this.e.get(i);
    }

    @Override // XB0.c
    public final XB0.c l(int i) {
        ArrayList arrayList = this.e;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new C3354dP0((ArrayList<Object>) arrayList2);
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.e.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof AbstractC1646Nw)) {
            return new String((byte[]) objRemove, XB0.a);
        }
        AbstractC1646Nw abstractC1646Nw = (AbstractC1646Nw) objRemove;
        abstractC1646Nw.getClass();
        return abstractC1646Nw.size() == 0 ? "" : abstractC1646Nw.h(XB0.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.e.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof AbstractC1646Nw)) {
            return new String((byte[]) obj2, XB0.a);
        }
        AbstractC1646Nw abstractC1646Nw = (AbstractC1646Nw) obj2;
        abstractC1646Nw.getClass();
        return abstractC1646Nw.size() == 0 ? "" : abstractC1646Nw.h(XB0.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e.size();
    }

    @Override // defpackage.InterfaceC3563eP0
    public final InterfaceC3563eP0 t() {
        return this.d ? new Y82(this) : this;
    }

    public C3354dP0(ArrayList<Object> arrayList) {
        this.e = arrayList;
    }

    @Override // defpackage.V0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof InterfaceC3563eP0) {
            collection = ((InterfaceC3563eP0) collection).g();
        }
        boolean zAddAll = this.e.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
